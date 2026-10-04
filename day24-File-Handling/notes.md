# Day 24 — File Handling in Java

## What is File Handling?

- > File handling in Java allows you to read from and write into files stored on your system. Java provides two types of streams for this:

## Types of Streams
## 1) Byte Streams

- > Used to read/write raw bytes — good for all types of files (text, images, audio, video)

## Class	          Purpose
FileInputStream	      Read from a file byte by byte
FileOutputStream	  Write into a file byte by byte

## 2) Character Streams

- > Used to read/write characters — good for text files only

## Class	       Purpose
FileReader	       Read characters from a file
FileWriter	       Write characters into a file
BufferedReader	   Reads entire line in a single shot — line by line