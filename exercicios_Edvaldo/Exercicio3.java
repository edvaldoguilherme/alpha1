import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        Double salario,reajuste,novosalario;
        int percentual;
        System.out.println("digite seu nome:");
        String nome=ent.nextLine();
        System.out.println(nome+" digite seu salario atual para que a empresa faça seu reajuste:");
        salario=ent.nextDouble();
        if(salario<=1200){
            percentual=20;
            reajuste=salario*percentual/100;
            novosalario=salario+reajuste;
            System.out.println(nome+"seu salario anterior era no valor de: "+salario
            +"\n ele sofreu um reajuste de "+percentual+"% e no valor de "+reajuste+
            "R$ \n e o novo valor do seu salario é de "+novosalario+"R$");
        }
        else if(salario>1200 && salario<=2300){
            percentual=15;
            reajuste=salario*percentual/100;
            novosalario=salario+reajuste;
            System.out.println(nome+"seu salario anterior era no valor de: "+salario
            +"\n ele sofreu um reajuste de "+percentual+"% e no valor de "+reajuste+
            "R$ \n e o novo valor do seu salario é de "+novosalario+"R$");

        }
        else if(salario>2300 && salario<=3700){
            percentual=10;
            reajuste=salario*percentual/100;
            novosalario=salario+reajuste;
            System.out.println(nome+"seu salario anterior era no valor de: "+salario
            +"\n ele sofreu um reajuste de "+percentual+"% e no valor de "+reajuste+
            "R$ \n e o novo valor do seu salario é de "+novosalario+"R$");
        }
        else if(salario<0){
            System.out.println("valor não pode ser negativo");
        }
        else{
            percentual=5;
            reajuste=salario*percentual/100;
            novosalario=salario+reajuste;
            System.out.println(nome+"seu salario anterior era no valor de: "+salario
            +"\n ele sofreu um reajuste de "+percentual+"% e no valor de "+reajuste+
            "R$ \n e o novo valor do seu salario é de "+novosalario+"R$");
        }
        ent.close();

        
    }
    
}
