import java.util.Scanner;

public class Atividade7{
    public static void main(String[] args){
        String[] perguntas =  {"Telefonou para a vítima?", "Esteve no local do crime?",
                "Mora perto da vítima?", "Devia para a vítima?",
                "Já trabalhou com a vítima?"};
        Scanner scan = new Scanner(System.in);
        int contador = 0;
        for(int i = 0;i <= 4; i++){
            System.out.println(perguntas[i]);
            String resposta = scan.next().toLowerCase();
            if(resposta.equals("sim")){
                contador += 1;
            }else if(!resposta.equals("nao")){
                System.out.println("Resposta errada, pode apenas sim ou nao");
            }
        }
        if(contador == 2){
            System.out.println("Suspeita");
        }else if(contador == 3 || contador == 4){
            System.out.println("Cúmplice");
        }else if(contador == 5){
            System.out.println("Assasino");
        }else{
            System.out.println("Inocente");
        }
    }
}