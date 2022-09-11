import java.util.Scanner;
class Employee{
    String name,result;
    int empid,ass1,ass2,ass3;
    Employee(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        name=s.nextLine();
        System.out.print("Enter Your Empid : ");
        empid=s.nextInt();
        System.out.print("Enter Your Assessment 1 : ");
        ass1=s.nextInt();
        System.out.print("Enter Your Assessment 2 : ");
        ass2=s.nextInt();
        System.out.print("Enter Your Assessment 3 : ");
        ass3=s.nextInt();
    }
    void cal(){
        float total=ass1+ass2+ass3;
        float per=(total/300)*100;
        System.out.println("The Total Marks is "+total);
        System.out.println("Percentage Obtained is "+per);
    }
    void res(){
        if(ass1>=75&&ass2>=75&&ass3>=75){
            result="Promoted";
            System.out.println(name+" is "+result);
        }
        else{
            result="Demoted";
            System.out.println(name+" is "+result);
        }
    }
}
    class employeeD{
    public static void main(String arg[]){
        Employee e1=new Employee();
        e1.cal();
        e1.res();
    }
}