package Utilites;

public class Emplotees {

    private int id;
    private double salary;
    private String name;

    public Emplotees(int id,String name,double salary) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addSalary(double percentege){
         salary+=salary*percentege/100;
    }

    public String toString() {
        return id+","+name+String.format(",%.2f",salary);
    }
}
