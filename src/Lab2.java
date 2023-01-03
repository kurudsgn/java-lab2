
public class Lab2 {
    public static void main(String[]args){
        double[]args2 = new double[args.length];
        for (int i = 0; i< args.length; i++){
            args2[i]=Double.parseDouble(args[i]);
        }
        Point3d a = new Point3d(args2[0],args2[1],args2[2]);//создание новых объектов класса точек на основе аргументов
        Point3d b = new Point3d(args2[3],args2[4],args2[5]);
        Point3d c = new Point3d(args2[6],args2[7],args2[8]);
        System.out.println(computeArea(a,b,c)); //вывод результата функции
        a.setAll(1,2,3); // setAll - переопределение всех координат точки
        b.setAll(4,5,6.5);
        c.setAll(7.345,8.0,99);
        System.out.println(computeArea(a,b,c));
    }
    public static double computeArea(Point3d dot1, Point3d dot2, Point3d dot3){ // подсчет площади
        if (dot1.theSame(dot2) || dot1.theSame(dot3) || dot2.theSame(dot3)){ // если есть одинаковые точки выводим -1
            return -1;
        }
        double a = dot1.distanceTo(dot2);
        double b = dot1.distanceTo(dot3);
        double c = dot2.distanceTo(dot3);
        double p = (a+b+c)/2;
        double scale = Math.pow(10,2);
        double ans = Math.sqrt(p*(p-a)*(p-b)*(p-c)); //площадь по формуле Герона
        return Math.round(ans*scale)/scale; // округляем и возвращаем
    }
}
