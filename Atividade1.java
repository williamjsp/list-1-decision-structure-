import java.util.Scanner;
public class Atividade1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um numero: ");

        int numero = scan.nextInt();

        if(numero % 2 == 0){
            System.out.println("Numero par");
        }
        else{
            System.out.println("Numero impar");
        }
    }
}
