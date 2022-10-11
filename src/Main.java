import java.util.Scanner;
public class Main {
    public static int soma(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero para se somar: ");
        int a = sc.nextInt();
        System.out.println("Digite o segundo numero para se somar: ");
        int b = sc.nextInt();
        System.out.println("Digite o terceiro numero para se somar: ");
        int c = sc.nextInt();

        int resultado = soma(a, b, c);
        System.out.println("O resultado da soma foi: "+resultado);

    }
}