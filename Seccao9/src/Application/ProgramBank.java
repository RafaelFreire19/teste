package Application;
import Utilites.Bank;
import java.util.Locale;
import java.util.Scanner;

public class ProgramBank {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input=new Scanner(System.in);
        Bank bank;

        System.out.print("Enter account number: ");
        int numeroDaConta=input.nextInt();
        System.out.print("Enter account holder: ");
        input.nextLine();
        String name=input.nextLine();
        System.out.print("Is there initial deposit (y/n)?  ");
        char resp=input.next().charAt(0);
        if (resp=='y'){
            System.out.print("Enter initial deposit value : ");
            double depositoInicial= input.nextDouble();
            bank=new Bank( name ,numeroDaConta,depositoInicial);
        }
        else {
            bank= new Bank ( name,numeroDaConta);
        }
        System.out.println();
        System.out.println("Account data:");
        System.out.println(bank);

        System.out.println();
        System.out.print("Enter deposit value: ");
        double valor=input.nextDouble();
        bank.addSaldo(valor);
        System.out.println("Updated account data: ");
        System.out.println(bank);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double value=input.nextDouble();
        bank.removesaldo(value);
        System.out.println("Updated account data: ");
        System.out.println(bank);


        input.close();
    }
}
