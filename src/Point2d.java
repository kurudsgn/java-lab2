public class Point2d {
    private double CoordX;
    private double CoordY;
    public Point2d(double x,double y){
        CoordX = x;
        CoordY = y;
    }
    public Point2d(){
        this(0,0);
    }
    public double getCoordX() {
        return CoordX;
    }

    public double getCoordY() {
        return CoordY;
    }
    public void setCoordX(double coordX) {
        CoordX = coordX;
    }

    public void setCoordY(double coordY) {
        CoordY = coordY;
    }
}
