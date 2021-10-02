#!/usr/bin/env ruby
# frozen_string_literal: true

require "pry"

puts "Watching..."

require 'listen'

def get_test(saved_file)
  saved_file.slice!('.java')
  saved_file =~ %r{/(\w+)/(\w+)\z}

  klass = ($2.include? 'Test') ?  $2 : "#{$2}Test"
  [$1, klass]
end

def test_file_exists?(saved_file)
  return true if saved_file.include? 'Test.java'
  File.exists? saved_file
    .gsub('main', 'test')
    .gsub('.java', 'Test.java')
end

watch = %w(./src/main/java ./src/test/java)

listener = Listen.to(*watch) do |modified, _added, _removed|
  return if modified.none?
  saved_file = modified.first

  if test_file_exists?(saved_file)
    package, klass = get_test(saved_file)

    system "clear"
    command = "mvn -Dtest=#{package}.#{klass} test"
    puts "#{command}\n\n"
    system command
  else
    puts "No test found for : #{saved_file}"
  end
end
listener.start
listener.only /\.java$/
sleep
