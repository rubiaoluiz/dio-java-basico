import java.util.Scanner;

public class MinhaClasse {
public static void main (String[] args) {
    System.out.print ("Olá, Mundo!");

String nome = "Luiz";
int idade = 20;
int ano = 2025;
int anoNascimento = ano - idade;
// printf para interpolar
// os %s para string, %d para inteiro e %n para nova linha
// também existem %f para float e %b para boolean
System.out.printf("Seu nome é %s e você nasceu em %d.%n", nome, anoNascimento);


    Scanner scanner = new Scanner(System.in);
    try{
    System.out.print("Digite o primeiro número: ");
    int primeiroNumero = scanner.nextInt();
    System.out.print("Digite o segundo número: ");
    int segundoNumero = scanner.nextInt();
    int soma = primeiroNumero + segundoNumero;
    System.out.printf("O resultado da soma é %d.%n",soma);
} finally {
    scanner.close();

}
}
}