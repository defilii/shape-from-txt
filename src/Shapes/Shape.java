package Shapes;

import java.util.Collection;

public class Shape {
    private int width;

    @Override
    public String toString() {
        return "Shape " +
                "\n\twidth =" + width +
                "\n\theight =" + height +
                "\n\tcolor ='" + color + '\n';
    }

    private int height;
    private Color color;

    public Shape(int width, int height, Color color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }


}
