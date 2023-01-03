package temp;

public class Point3d {
    private double CoordX;
    private double CoordY;
    private double CoordZ;
    public Point3d(double x, double y, double z){
        CoordX = x;
        CoordY = y;
        CoordZ = z;
    }
    public Point3d(){
        this(0,0,0);
    }

    public double getCoordX() {
        return CoordX;
    }

    public double getCoordY() {
        return CoordY;
    }

    public double getCoordZ() {
        return CoordZ;
    }

    public void setCoordX(double coordX) {
        CoordX = coordX;
    }

    public void setCoordY(double coordY) {
        CoordY = coordY;
    }

    public void setCoordZ(double coordZ) {
        CoordZ = coordZ;
    }
    public void setAll(double coordX,double coordY, double coordZ){
        CoordX=coordX;
        CoordY=coordY;
        CoordZ=coordZ;
    }
    public boolean sameX(Point3d obj){
        return this.getCoordX() == obj.getCoordX();
    }
    public boolean sameY(Point3d obj){
        return this.getCoordY() == obj.getCoordY();
    }
    public boolean sameZ(Point3d obj){
        return this.getCoordZ()== obj.getCoordZ();
    }
    public boolean theSame(Point3d obj){
        return this.CoordX==obj.CoordX && this.getCoordY()== obj.getCoordY()&& this.CoordZ== obj.CoordZ;
    }
    public double distanceTo(Point3d b){
        double x1 = this.getCoordX();
        double y1 = this.getCoordY();
        double z1 = this.getCoordZ();
        double x2 = b.getCoordX();
        double y2 = b.getCoordY();
        double z2 = b.getCoordZ();
        double ans = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2)+ Math.pow(z2-z1,2));
        double scale = Math.pow(10,2);
        ans = Math.round(ans*scale)/scale;
        return ans;
    }
}
