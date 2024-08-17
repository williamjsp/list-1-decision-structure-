import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual turno você estuda?");
        char turno = scan.nextLine().toUpperCase().charAt(0);

        if(turno == 'M') {
            System.out.println("Bom Dia!");
        }
        else if(turno == 'V'){
            System.out.println("Boa Tarde!");
        }
        else if (turno == 'N') {
            System.out.println("Boa Noite!");
        }
        else{
            System.out.println("Valor invalído");
        }
    }
}