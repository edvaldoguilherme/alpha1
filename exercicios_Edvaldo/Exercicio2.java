import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("digite uma letra");
        char letra = ent.nextLine().charAt(0);
        if(letra=='a'||letra=='e'||letra=='i'||letra=='o'||letra=='u'||letra=='A'||letra=='E'||letra=='I'||letra=='O'||letra=='U'){
            System.out.println("a letra digitada é vogal");
        }
        else{
            System.out.println("é consoante");
        }
        ent.close();
    }
    
}
