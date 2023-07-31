import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class Main {
    public static void main(String[] args) {
        try {
            ShapeFromPathName shapeFromPathName = new ShapeFromPathName();
            System.out.printf(shapeFromPathName.readFromFile("shape.txt").toString());
            System.out.printf(shapeFromPathName.readFromFile("bogusShape.txt").toString());
        } catch (IllegalArgumentException e) {
            System.out.println("File has invalid parameters.");

        }
    }
}
