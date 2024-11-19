package chuong4.bai4;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point() {}
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY(){
        float[] result = new float[2];
        result[0] = getX();
        result[1] = getY();
        return result;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
