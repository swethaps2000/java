import java.util.*;
class Person{

    String name,gender,address;
    int age;

    Person(String name,String gender,String address,int age){

        this.name=name;
        this.gender=gender;
        this.address=address;
        this.age=age;

    }

    void display(){

        System.out.println("Person name: "+name+",Gender: "+gender+",Address: "+address+"and Age: "+age);

    }
}
class Employee extends Person{
    String Company_name,Qualification;
    int Salary,Empid;
    Employee(String name,String gender,String address,int age,String Company_name,String Qualification,int Salary,int Empid){

        super(Company_name, gender, address, age);
        this.Company_name=Company_name;
        this.Qualification=Qualification;
        this.Salary=Salary;
        this.Empid=Empid;

    
    }
    void display(){
        super.display();
        System.out.println("Employee Company Name: "+Company_name+", Qualification: "+Qualification+"Employee salary: "+Salary+"and Employee ID: "+Empid);

    }
}
class Teacher extends Employee{
    String Subject,Department;
    int Teacherid;

    Teacher(String name,String gender,String address,int age,String Company_name,String Qualification,int Salary,int Empid,String Subject,String Department,int Teacherid){

        super(name,gender,address,age,Company_name,Qualification,Salary,Empid);

        this.Subject=Subject;
        this.Department=Department;
        this.Teacherid=Teacherid;
    }
    void display(){
        super.display();
        System.out.println("Subject:"+Subject+",Department: "+Department+"Teacher ID: "+Teacherid);
    }


}

public class Inheritance{
    public static void main(String[] args){
        Scanner sn=new Scanner(System.in);

        System.out.println("Enter the number of Teachers: ");
        int n=sn.nextInt();
        Teacher[] obj=new Teacher[n];


        for(int i=0;i<n;i++){
            System.out.println("Enter the person Name:");
            String name=sn.next();

             System.out.println("Enter the Address Of the person: ");
             String address=sn.next();

              System.out.println("Enter the Gender of the Person:");
              String gender=sn.next();

               System.out.println("Enter the age of the person: ");
               int age=sn.nextInt();

                System.out.println("Enter the Company Name of the Employee: ");
                String Company_name=sn.next();

                 System.out.println("Enter the Employee Id");
                 int Empid=sn.nextInt();
                  
                 System.out.println("Enter the Qualification: ");
                 String Qualification=sn.next();

                  System.out.println("Enter the Salary: ");
                  int Salary=sn.nextInt();

                   System.out.println("Enter the Teacher id: ");
                   int Teacherid=sn.nextInt();

                    System.out.println("Enter the Subject:");
                    String Subject=sn.next();

                     System.out.println("Enter the Departmemnt: ");
                     String Departmemnt=sn.next();
                     obj[i]=new Teacher(name, gender, address, age, Company_name, Qualification, Salary, Empid, Subject, Departmemnt, Teacherid);


        }
        for(int i=0;i<n;i++){
            obj[i].display();
        }
    }
}