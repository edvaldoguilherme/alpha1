import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String time1,time2;
        int gol1, gol2;

        System.out.println("digite o nome do primeiro time:");
        time1=ent.nextLine();
        System.out.println("digite o nome do segundo time:");
        time2=ent.nextLine();
        System.out.println("quantos gols fez o "+time1);
        gol1=ent.nextInt();
        System.out.println("quantos gols fez o "+time2);
        gol2=ent.nextInt();
        if(gol1>gol2){
            System.out.println("o vencedor da partida foi o "+time1+" por um placar de "+gol1+"x"+gol2);
        }
        else if(gol2>gol1){
            System.out.println("o vencedor da partida foi o "+time2+" por um placar de "+gol2+"x"+gol1);

        }
        else if(gol1==gol2){
            System.out.println("o resultado da partida foi empate: "+gol1+"x"+gol2);
        }
        else{
            System.out.println("valores negativos não fazem parte do jogo de futebol.");
        }
        ent.close();
    }
    
}
