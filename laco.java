import java.util.Scanner;
public class laco{
public static void main (String[] args)
    {
        Scanner leia =new Scanner (System.in);
        String nome;
        int idade;
            for ( int i=0; i<5; i++)
        {
            System.out.print("Informe a sua idade: ");
            idade = leia.nextInt();
            System.out.print("Informe o seu nome: ");
            nome = leia.next();
            System.out.println("Olá " +nome+", voçê tem " +idade+ " anos de idade.");
        }

    }
}
