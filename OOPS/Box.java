package Oops;

public class Box {
    private double width;
    private double height;
    private double depth;
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
    public double calculateVolume() {
        return width * height * depth;
    }
    public static void main(String[] args) {
        Box myBox = new Box(5.0, 4.0, 3.0);
        System.out.println("Volume of the box: " + myBox.calculateVolume());
    }
}
