import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();

        if(n1 > n2 && n1 > n3){
            System.out.println(n1);
        }
        else if(n2 > n1 && n2 > n3){
            System.out.println(n2);
        }
        else{
            System.out.println(n3);
        }
    }

}
