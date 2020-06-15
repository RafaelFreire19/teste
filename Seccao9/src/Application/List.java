package Application;

import java.util.ArrayList;


public class List {


    public static void main(String[] args) {

        java.util.List <String> list = new ArrayList<>();
        list.add("Maria");
        list.add("Alex");
        list.add("Bob");
        list.add("Ana");
        list.add(2, "marco");
        for (String x: list){
            System.out.println(x);

        }


    }

}
