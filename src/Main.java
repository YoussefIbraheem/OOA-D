import Board.Board;

public class Main {
    public static void main(String[] args) {

        // Create a new board with specified width and height
        Board board = new Board(20, 20);

        // Set the coordinates to a specific position
        board.setXCor(10.0f);
        board.setYCor(10.0f);
        // Display the current coordinates


        // Display the board dimensions
        System.out.println("Board Width: " + board.getWidth());
        System.out.println("Board Height: " + board.getHeight());

        // Display the board
        board.displayBoard();
    }
}