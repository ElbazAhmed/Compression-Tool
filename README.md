# Huffman Coding Compression Tool

This repository contains a Java implementation of a compression tool that utilizes the Huffman coding algorithm to compress and decompress text files.

## Overview

The tool takes a text file as input, builds a frequency table for the characters, constructs a Huffman tree based on the frequencies, generates Huffman codes, compresses the text data using these codes, and can also decompress the data back to its original form.

## Features

- **File Input**: Reads text file content to be compressed.
- **Frequency Table**: Generates a frequency table for the characters in the text.
- **Huffman Tree Construction**: Builds a Huffman tree from the character frequencies.
- **Huffman Codes Generation**: Generates Huffman codes for each character.
- **Compression**: Compresses the text data using the generated Huffman codes.
- **Decompression**: Decompresses the compressed data back to the original text.

## Project Structure

The directory structure of the project is as follows:

```bash
Compression-Tool/
├── .idea/                     
├── out/                       # Output directory for compiled classes
├── src/                       # Source directory containing the Java source files
│   ├── Ressources/            # Contains text files used for compression and decompression tests
│   │   ├── compressed.txt     # Stores compressed data
│   │   ├── decompressed.txt   # Stores decompressed data
│   │   ├── test.txt           # Sample input file for testing compression and decompression
│   ├── FileUtil.java          # Utility class to read file content
│   ├── FrequencyTable.java    # Contains methods to generate the frequency table
│   ├── HuffmanBaseNode.java   # Abstract base class for Huffman tree nodes
│   ├── HuffmanCoding.java     # The main class to run the compression and decompression process
│   ├── HuffmanDecoder.java    # Contains the method to decompress the text data
│   ├── HuffmanEncoder.java    # Contains the method to compress the text data
│   ├── HuffmanInternalNode.java # Represents internal nodes in the Huffman tree
│   ├── HuffmanLeafNode.java   # Represents leaf nodes in the Huffman tree
│   ├── HuffmanTree.java       # Contains methods to build the Huffman tree and generate codes
├── .gitignore                 
├── Compression-Tool.iml      
├── README.md                 
└── External Libraries/        
```

## How to Use

1. **Clone the repository**:  
 
   ```bash
   git clone https://github.com/ElbazAhmed/Compression-Tool.git
   ```
2. **Navigate to the project directory**:
 
   ```bash
   cd Compression-Tool
   ```
3. **Compile the Java files**:

   ```bash
   javac -d out src/*.java
   ```
4. **Run the tool**:

   ```bash
   java -cp out HuffmanCoding <File Path>
   ```
    Replace <code>File Path</code> with the path to the text file you want to compress.

## License

This project is licensed under the MIT License.
   


