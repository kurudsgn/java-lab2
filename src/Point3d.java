public class Point3d extends Point2d {
    private double CoordZ;
    public Point3d(double x, double y, double z){
        super(x,y);
        CoordZ = z;
    }
    public double getCoordZ() {
        return CoordZ;
    }
    public void setCoordZ(double coordZ){
        CoordZ = coordZ;
    }
    public void setAll(double x, double y, double z){
        this.setCoordX(x);
        this.setCoordY(y);
        this.setCoordZ(z);
    }
    public boolean theSame(Point3d obj){
        return this.getCoordX()==obj.getCoordX() && this.getCoordY()== obj.getCoordY()&& this.getCoordZ()== obj.getCoordZ();
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
