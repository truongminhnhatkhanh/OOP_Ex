package chuong5.bai1;

public class LineSub extends Point{
    // A line needs two points: begin and end.
    // The begin point is inherited from its superclass Point.
    // Private variables
    Point end;               // Ending point

    // Constructors
    public LineSub (int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);             // construct the begin Point
        this.end = new Point(endX, endY);  // construct the end Point
    }
    public LineSub (Point begin, Point end) {  // caller to construct the Points
        super(begin.getX(), begin.getY());      // need to reconstruct the begin Point
        this.end = end;
    }

    // Public methods
    // Inherits methods getX() and getY() from superclass Point
    @Override
    public String toString() {
        return "Begin: " + super.toString() + ", End: " + end.toString();
    }

    public Point getBegin() {
        return new Point(getX(), getY()); // Return a new Point for the begin point
    }

    public Point getEnd() {
        return end; // Return the end Point
    }

    public void setBegin(Point begin) {
        setX(begin.getX());
        setY(begin.getY());
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public int getBeginX() {
        return getX(); // X of the begin point
    }

    public int getBeginY() {
        return getY(); // Y of the begin point
    }

    public int getEndX() {
        return end.getX(); // X of the end point
    }

    public int getEndY() {
        return end.getY(); // Y of the end point
    }

    public void setBeginX(int beginX) {
        setX(beginX);
    }

    public void setBeginY(int beginY) {
        setY(beginY);
    }

    public void setBeginXY(int beginX, int beginY) {
        setX(beginX);
        setY(beginY);
    }

    public void setEndX(int endX) {
        end.setX(endX);
    }

    public void setEndY(int endY) {
        end.setY(endY);
    }

    public void setEndXY(int endX, int endY) {
        end.setX(endX);
        end.setY(endY);
    }

    public double getLength() {
        int xDiff = end.getX() - getX();
        int yDiff = end.getY() - getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double getGradient() {
        int xDiff = end.getX() - getX();
        int yDiff = end.getY() - getY();
        return Math.atan2(yDiff, xDiff);
    }
}

