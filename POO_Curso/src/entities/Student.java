package entities;

public class Student {
    public String name;
    public double nota1;
    public  double nota2;
    public double nota3;
    public double notaFi;
    public double notaFalta;

    public double media(){
       return nota1+nota2+nota3;
    }

    public double resultado(){
        return 60-media();
    }
    public String result() {
         if (media()>=60){
            return "PASS";
        }
         else {
             return "FAILED"
                     +String.format("%nMISSING %.2f POINTS",resultado());

         }
    }

}
