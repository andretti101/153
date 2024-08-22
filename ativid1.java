import java.util.Scanner;

public class ativid1 {
    public static void main(String[] args) {
        System.out.println("Digite um número de 1 a 5: ");
        Scanner leia = new Scanner(System.in);
        int numero = leia.nextInt();

        switch (numero) {

            case 1:
                System.out.println("Número 1 foi digitado...");
                break;

            case 2:
                System.out.println("Número 2 foi digitado...");
                break;

            case 3:
                System.out.println("Número 3 foi digitado...");
                break;

            case 4:
                System.out.println("Número 4 foi digitado...");
                break;

            case 5:
                System.out.println("Número 5 foi digitado...");
                break;

            default:
                System.out.print("Número inválido");
                break;
        }
    }
}