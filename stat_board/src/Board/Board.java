package Board;

public class Board {
    private final int width;
    private final int height;
    private float xCor = 0;
    private float yCor = 0;

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        this.xCor = 0.0f;
        this.yCor = 0.0f;
        System.out.println("Board created with width: " + width + " and height: " + height);
    }

    public int getWidth() {
        return width;
    }

    public float getXCor() {
        return xCor;
    }

    public float getYCor() {
        return yCor;
    }

    public void setXCor(float xCor) {
        if(xCor >= 0 && xCor < width) {
            this.xCor = xCor;
        } else {
            System.out.println("Invalid X coordinate");
        }
    }

    public void setYCor(float yCor) {
        if(yCor >= 0 && yCor < height) {
            this.yCor = yCor;
        } else {
            System.out.println("Invalid Y coordinate");
        }
    }

    public int getHeight() {
        return height;
    }

    public void displayBoard() {
        for (int i = height; i >= 0  ; i--) {
            for (int j = 0; j < width; j++) {
                if (i == (int) yCor && j == (int) xCor) {
                    System.out.print("X "); // Mark the current position with 'X'
                } else {
                    System.out.print(". "); // Empty space
                }
            }
            System.out.println();
        }
    }
}