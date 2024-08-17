import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua nota: ");
        float nota1 = scan.nextFloat();

        System.out.println("Digite sua nota: ");
        float nota2 = scan.nextFloat();

        float media = (nota1 + nota2)/2;

        if(media == 10){
            System.out.println("APROVADO COM DISTINÇÃO");
        }
        else if(media >= 7){
            System.out.println("APROVADO");
        }
        else{
            System.out.println("REPROVADO");
        }
    }
}

