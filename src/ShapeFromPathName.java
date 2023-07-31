import Shapes.AvailableColors;
import Shapes.Color;
import Shapes.Shape;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.security.InvalidParameterException;
import java.util.Optional;
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ShapeFromPathName {
    private static String RGBregex = "(\\d{1,3})(,\\s)(\\d{1,3})(,\\s)(\\d{1,3})(,\\s)?";

    public ShapeFromPathName() {
    }

    public Shape readFromFile(String pathName) {
        try {
            File myObj = new File(pathName);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                int x = Integer.parseInt(myReader.nextLine());
                int y = Integer.parseInt(myReader.nextLine());
                Color color = getColor(myReader);
                Shape shape = new Shape(x, y, color);
                return shape;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
        throw new IllegalArgumentException();
    }

    private static Color getColor(Scanner myReader) {
        String thirdLine = myReader.nextLine();
        Pattern pattern = Pattern.compile(RGBregex);
        Matcher matcher = pattern.matcher(thirdLine);
        if (matcher.matches()) {
            int r = Integer.parseInt(matcher.group(1));
            int g = Integer.parseInt(matcher.group(3));
            int b = Integer.parseInt(matcher.group(5));
            Color color = new Color(r, g, b);
            return color;
        } else {
            Color color = new Color(AvailableColors.valueOf(thirdLine));
            return color;
        }
    }
}
