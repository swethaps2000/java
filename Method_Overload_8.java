import java.util.*;
public class Method_Overload_8{
    void area(int a){
        System.out.println("Area of the square: "+a*a);
    }
    void area(float l,float w){
        System.out.println("Area of the Rectangle: "+l*w);
    }
    void area(double x){
        double z=3.14*x*x;
        System.out.println("Area of the circle: "+z);
    }
    public static void main(String[] args){

        int ch;
        Boolean res=true;
        Scanner sn=new Scanner(System.in);

        Method_Overload_8 obj=new Method_Overload_8();

        System.out.println("1.Area of Square");
        System.out.println("2.Area of Rectangle");
        System.out.println("3.Area of Circle");
        System.out.println("4.exit");

        while(res){
            System.out.println("Enter yoour choice");
            ch=sn.nextInt();

            switch(ch){

                case 1: System.out.println("Enter the len gth of the square: ");
                        int s1=sn.nextInt();
                        obj.area(s1);
                        break;
            
                case 2:System.out.println("Enter the length and width of the rectangle");
                    float le=sn.nextInt();
                    float wi=sn.nextInt();
                    obj.area(le,wi);
                    break;
                case 3:System.out.println("enter the radius of the Circle");
                    double c=sn.nextInt();
                    obj.area(c);
                    break;
                case 4:res=false;
                        break;
        }
    }
}}