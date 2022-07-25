import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Choose your option");
        System.out.println("1. Add Employee");
        System.out.println("2. Search Employee");
        System.out.println("3. Remove Employee");
        System.out.println("4. View Employee");

        ArrayList <String> employee= new ArrayList<>();

        int num=1;

        while(num==1){

            System.out.println("choose your option");
            int op= sc.nextInt();
            switch (op){
                case 1:{
                    System.out.println("Enter the name");
                    String name=sc.next();
                    employee.add(name);
                    System.out.println("added succesfully");
                    break;
                }
                case 2:{
                    System.out.println("Enter the name");
                    String name = sc.next();
                    if (employee.contains(name))
                    {
                        System.out.println("Employee present");
                    }
                    else
                    {
                        System.out.println("Employee not present");
                    }
                    break;
                }
                case 3:{
                    System.out.println("Enter the name of employee to remove");
                    String name=sc.next();
                    employee.remove(name);
                    System.out.println("removed successfully");
                    break;
                }
                case 4:{
                    System.out.println(employee);
                    break;
                }
                case 5:{
                    System.out.println("invalid option");
                }
            }
            System.out.println("enter 9 to continue?");
            int con=sc.nextInt();
            if(con==9){
                num=1;
            }else {
                num=0;
            }
        }

    }
}
