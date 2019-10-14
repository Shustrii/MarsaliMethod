public class Marsali {
    public static void main(String[] args) {
        double x;
        double y;
        do {

            x = 2.0*Math.random() - 1.0;
            y = 2.0*Math.random() - 1.0;
        } while (x*x+y*y>1.0);
        {
            System.out.println("x ="+x);// rand x point
            System.out.println("y ="+y);//rand y point
            System.out.println("a ="+2*x*Math.sqrt(1-Math.pow(x,2)-Math.pow(y,2)));//rand a point
            System.out.println("b ="+ 2*Math.sqrt(1-Math.pow(x,2)-Math.pow(y,2)));//rand b point
            System.out.println("c ="+ (1-2*(Math.pow(x,2)+Math.pow(y,2))));//rand c point
        }
    }
}
