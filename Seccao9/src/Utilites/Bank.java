package Utilites;

public class Bank {


    /*
    Atributos - início
     */
    private String name;
    private int numeroDaConta;
    private double deposito;

    /*
    Atributos- fim
     */

    /*
    Get e set- início
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getDeposito() {
        return deposito;
    }

    /*
    Get e set- fim
     */

    /*
    Construtor- início
     */
    public Bank(String name, int numeroDaConta, double depositoInicial) {
        this.name = name;
        this.numeroDaConta = numeroDaConta;
        addSaldo(depositoInicial);

    }

    public Bank(String name, int numeroDaConta) {
        this.name = name;
        this.numeroDaConta = numeroDaConta;
    }

    /*
    Construtor fim
     */

    /*
    Metódos-início
     */

    public void addSaldo(double valor){
        deposito+=valor;
    }
    public void removesaldo(double valor){
        deposito-=valor+5;
    }
    public String toString(){
        return "Account "+numeroDaConta+", "
                +"Holder : "+name
                + String.format(", Balance: $ %.2f",deposito);

    }
    /*
    Metódos-fim
     */

}
