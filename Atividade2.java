import java.util.Scanner;

public class Atividade2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero:");
       float numero1 = scan.nextFloat();

        System.out.println("Digite um numero:");
        float numero2 = scan.nextFloat();

        System.out.println(Math.max(numero1, numero2));
    }

}