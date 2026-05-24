import java.util.Scanner;

public class CalculadoraMedia {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        String nome;
        double nota1, nota2;

        System.out.print("Digite o nome do aluno: ");
        nome = leia.nextLine();

        System.out.print("Digite a primeira nota: ");
        nota1 = leia.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = leia.nextDouble();

        leia.close();
    }
}