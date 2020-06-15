package Application;

import Utilites.Emplotees;
import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ApplicationList {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int n = input.nextInt();
        List<Emplotees> list = new ArrayList<>();
        for (int i=1;i<=n;i++){
            System.out.println("Employee #"+i+":");
            System.out.print("Id: ");
            int id=input.nextInt();
            input.nextLine();
            System.out.print("Name: ");
            String name=input.nextLine();
            System.out.print("Salary: ");
            double salary=input.nextDouble();
            list.add(new Emplotees(id,name,salary)) ;
            
        }
        System.out.println();
        System.out.print("Enter the employee id that will have salary incremente? ");
        int indexID=input.nextInt();
        Emplotees emp = list.stream().filter(x->x.getId()==indexID).findFirst().orElse(null);
        if (emp==null){
            System.out.println("This  ID does not exist!");
        }
        else {
            System.out.print("Percentege: ");
            double percentage=input.nextDouble();
            emp.addSalary(percentage);
        }
        System.out.println();
        System.out.println("List of employee: ");
        for(Emplotees obj: list){
            System.out.println(obj);
        }







            input.close();
    }
}
