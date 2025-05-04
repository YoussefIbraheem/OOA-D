# Board Game Project

This project is a simple Java-based board game simulation. It allows users to create a board with specified dimensions, set coordinates for a marker, and display the board with the marker's position.

## Features

- Create a board with customizable width and height.
- Set and validate X and Y coordinates for a marker on the board.
- Display the board with the marker's current position.

## Classes

### `Board`

The `Board` class represents the game board. It includes the following features:

- **Attributes**:
  - `width` (int): The width of the board.
  - `height` (int): The height of the board.
  - `xCor` (float): The X-coordinate of the marker.
  - `yCor` (float): The Y-coordinate of the marker.

- **Methods**:
  - `Board(int width, int height)`: Constructor to initialize the board with specified dimensions.
  - `int getWidth()`: Returns the width of the board.
  - `int getHeight()`: Returns the height of the board.
  - `float getXCor()`: Returns the current X-coordinate of the marker.
  - `float getYCor()`: Returns the current Y-coordinate of the marker.
  - `void setXCor(float xCor)`: Sets the X-coordinate of the marker (validates the input).
  - `void setYCor(float yCor)`: Sets the Y-coordinate of the marker (validates the input).
  - `void displayBoard()`: Displays the board with the marker's position.

### `Main`

The `Main` class contains the `main` method to demonstrate the functionality of the `Board` class.

- **Functionality**:
  - Creates a `Board` object with specified dimensions.
  - Sets the marker's coordinates.
  - Displays the board dimensions and the board itself.

## How to Run

1. Compile the project using a Java compiler:
   ```bash
   javac src/Main.java src/Board/Board.javaThe file `board/README.md` is empty, so there is no code to document. If you add content to the file, I can assist with documenting it.