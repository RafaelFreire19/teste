package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
         return grossSalary - tax;
    }
    public void increaseSalary(double percenture){
         grossSalary+=grossSalary*percenture/100;
    }
    public String toString(){
        return name+", $ "+ String.format("%.2f",netSalary());

    }

}
