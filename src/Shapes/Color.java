package Shapes;

public class Color {

    private AvailableColors color;

    public Color(AvailableColors color) {
        this.color = color;
    }

    private int red;
    private int green;
    private int blue;

    public Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    @Override
    public String toString() {
        return properString();
    }

    private String properString() {
        if (this.color != null) {
            return String.valueOf(color);
        } else {
            return red + ", " + green + ", " + blue + ", ";
        }
    }


}
