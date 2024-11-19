package chuong5.bai1;

public class Line {
    // A line composes of two points (as instance variables)
    private Point begin;    // beginning point
    private Point end;      // ending point

    // Constructors
    public Line (Point begin, Point end) {  // caller to construct the Points
        this.begin = begin;
        this.end = end;
    }
    public Line (int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY);   // construct the Points here
        end = new Point(endX, endY);
    }

    // Public methods
    public String toString() {
        return begin.toString() + " " + end.toString();
    }

    public Point getBegin() {
        return begin;
    }
    public Point getEnd() {
        return end;
    }
    public void setBegin(Point begin) {
        this.begin = begin;
    }
    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return begin.getX();
    }
    public int getBeginY() {
        return begin.getY();
    }
    public int getEndX() {
        return end.getX();
    }
    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int beginX) {
        this.begin.setX(beginX);
    }
    public void setBeginY(int beginY) {
        this.begin.setY(beginY);
    }
    public void setBeginXY(int beginX, int beginY) {
        this.begin.setX(beginX);
        this.begin.setY(beginY);
    }
    public void setEndX(int endX) {
        this.end.setX(endX);
    }
    public void setEndY(int endY) {
        this.end.setY(endY);
    }
    public void setEndXY(int endX, int endY) {
        this.end.setX(endX);
        this.end.setY(endY);
    }

    public double getLength() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    } // Length of the line
    // Math.sqrt(xDiff*xDiff + yDiff*yDiff)
    public double getGradient() {
        int xDiff = end.getX() - begin.getX();
        int yDiff = end.getY() - begin.getY();
        return Math.atan2(yDiff, xDiff);
    } // Gradient in radians
    // Math.atan2(yDiff, xDiff)
}

