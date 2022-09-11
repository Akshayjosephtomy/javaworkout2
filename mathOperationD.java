import java.util.*;
class mathOperation {
int x,y;
double r;

    void init(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the value of x : ");
        x=s.nextInt();
        System.out.print("Enter the value of y : ");
        y=s.nextInt();
    }
    void add(){
        int r=x+y;
        System.out.println(x+" + "+y+" = "+r);
    }
    void multiply(){
        int r=x*y;
        System.out.println(x+" * "+y+" = "+r);
    }
    void power(){
        double r=Math.pow(x,y);
        System.out.println(x+"^"+y+" = "+r);
    }
    void display(){
        add();
        multiply();
        power();
    }   
}
class mathOperationD{
    public static void main(String args[]){
        mathOperation o=new mathOperation();
        o.init();
        o.display();
    }
}
