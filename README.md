# Sequential Stack Applications

This project implements two applications using stacks based on the sequential allocation paradigm:

1. **Balanced Parenthesis Checker**
2. **String Inversion Tool**

Each application uses a basic stack implementation to solve its respective problem.

---

## Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [How to Run](#how-to-run)
- [Usage Examples](#usage-examples)
- [License](#license)

---

## Overview

This repository provides solutions for two classic problems using stacks:

1. **Balanced Parenthesis Checker**: Determines whether a given string containing parentheses (`()`, `{}`, `[]`) is balanced.
2. **String Inversion Tool**: Inverts a given string (including numbers, special characters, and letters) using a stack.

---

## Features

### Balanced Parenthesis Checker

- Accepts strings of up to 80 characters.
- Uses stack operations to verify if parentheses in the string are balanced.
- Example input/output:
  - Input: `{[()()]}`
  - Output: `Balanced`
  - Input: `{[(])}`
  - Output: `Not Balanced`

### String Inversion Tool

- Accepts strings of up to 80 characters.
- Uses a stack to reverse the input string.
- Example input/output:
  - Input: `Hello, World!`
  - Output: `!dlroW ,olleH`

---

## Technologies Used

- Programming Language: [Specify the language used, e.g., C++, Python, Java]
- Stack operations based on sequential allocation.

### Stack Operations Implemented

1. **Create**: Initializes an empty stack.
2. **Push**: Adds an element to the stack.
3. **Pop**: Removes and returns the top element of the stack.
4. **Is Empty**: Checks if the stack is empty.
5. **Is Full**: Checks if the stack is full.

---

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/stack-applications.git
   cd stack-applications
   ```
2. Compile the source code:
   ```bash
   # Example for C++
   g++ main.cpp -o stack_applications
   ```
3. Run the application:
   ```bash
   ./stack_applications
   ```

---

## Usage Examples

### Balanced Parenthesis Checker

```bash
Enter a string of parentheses: {[()]}
Result: Balanced
```

### String Inversion Tool

```bash
Enter a string to invert: Hello, World!
Inverted String: !dlroW ,olleH
```

---

## License

This project is licensed under the [MIT License](LICENSE).

