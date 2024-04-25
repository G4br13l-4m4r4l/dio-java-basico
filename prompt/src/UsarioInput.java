import java.util.Scanner;

public class UsarioInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.print("Digite a sua idade: ");
        int idade = input.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = input.nextDouble();

        System.out.println("Olá "+nome);
        System.out.println("Você tem "+idade+" anos de idade");
        System.out.println("Você tem "+altura+"m de altura");
        input.close();
    }
}
