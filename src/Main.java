import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // declarção das váriaveis
        Scanner sc = new Scanner(System.in);
        char operador;
        double num1, num2, resultado;

        System.out.println("CALCULADORA");
        System.out.println("-------------------------------");
        System.out.println("");
        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        num2 = sc.nextDouble();
        System.out.println("Digite o operador desejado");
        System.out.println("+, -, * ou /");
        operador = sc.next().charAt(0);

        sc.close();


        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Operador inválido");
                return;
        }

        System.out.println("Primeiro número escolhido: " + num1);
        System.out.println(" ");
        System.out.println("Segundo número escolhido: " + num2);
        System.out.println(" ");
        System.out.println("Operador escolhido: " + operador);
        System.out.println(" ");
        System.out.println("Resultado: " + resultado);
        System.out.println(" ");
        System.out.println("FIM");


    }
}