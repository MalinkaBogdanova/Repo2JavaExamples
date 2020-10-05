package PointCodingEx32;

public class Point {
    private int x;
    private int y;

    public Point() {

    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

//  Method named distance with two parameters x, y both of type int, it needs to return the distance between this Point and Point x,y as double.
// Method named distance with parameter another of type Point, it needs to return the distance between this Point and another Point as double.

    //  Method named distance without any parameters, it needs to return the distance between this Point and Point 0,0 as double.
    public double distance() {
        //Point (x=0,y=0)
        double distance = Math.sqrt((this.x - 0) * (this.x - 0) + (this.y - 0) * (this.y - 0));
        return distance;
    }

    public double distance(int x, int y) {
        double distance = Math.sqrt((this.x - x) * (this.y - y) + (this.y - y) * (this.y - y));
        return distance;

    }

    //Method named distance with parameter another of type Point,
    // it needs to return the distance between this Point and another Point as double.
    public double distance(Point point) {
        double distance = Math.sqrt((this.x - point.x) * (this.x - point.x) + (this.y - point.y) * (this.y - point.y));
        return distance;

    }

}
