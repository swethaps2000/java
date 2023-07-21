import java.util.*;
interface prototypee{
    void area();
    void perimeter();
}
class Circlee implements prototypee{
    int r;
    public Circlee(int r){
        this.r=r;
    }
    public void area(){
        System.out.println("area of the Circle:"+(3.14*r*r));

    }
    public void perimeter(){
        System.out.println("Perimeter of the circle: "+(2*3.14*r));
    }
}

class Rectanglee implements prototypee{
    int l,w;

    public Rectanglee(int l,int w){

        this.l=l;
        this.w=w;


    }

    public void area(){

        System.out.println("Area of Rectangle: "+l*w);
    }

    public void perimeter(){
        System.out.println("Perimeter of the Rectangle: "+(2*(l+w)));
    }
}

public class Interface10{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        boolean res=true;

        int rad,l,w;
        System.out.println("1.Circle Area Perimeter");
        System.out.println("2 Rectangle Area Perimeter");
        System.out.println("3.Exit");

        while(res){
            System.out.println("Enter your choice:");
            int ch=sc.nextInt();

            switch(ch){
                case 1:System.out.println("Enter the Radius of the circle: ");
                        rad=sc.nextInt();
                        prototypee c=new Circlee(rad);
                        c.area();
                         c.perimeter();
                        break;
                case 2:System.out.println("Enter the length of the rectangle: ");
                        l=sc.nextInt();
                        System.out.println("Enter the width of the rectangle: ");
                        w=sc.nextInt();
                        prototypee r=new Rectanglee(l,w);
                        r.area();
                        r.perimeter();
                        break;

                case 3:res=false;
                        break;
                default:System.out.println("Enter valid choice");
            }
        }
    }
}