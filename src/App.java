import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tangentbord = new Scanner(System.in);
        int i=0;

        while(i==0){
        System.out.println("Meny: \n1. Slumptal \n2. Nedräkning \n3. Avsluta");
        int val = tangentbord.nextInt();

        if(val==1){
            Random slump = new Random();
            int slumptal1 = slump.nextInt(10);
            System.out.println("Slumptal1: "+slumptal1);
            Thread.sleep(100);
            int slumptal2 = slump.nextInt(10);
            System.out.println("Slumptal2: "+slumptal2);

            if(slumptal1>slumptal2){
                int slumptal = slumptal1-slumptal2;
                System.out.println("Skillnaden mellan slumptal1 och slumptal2 är: \""+slumptal+"\"");
                System.out.println("Slumptal1 är större än slumptal2");
            }else if(slumptal2>slumptal1){
                int slumptal = slumptal2-slumptal1;
                System.out.println("Skillnaden mellan slumptal1 och slumptal2 är: \""+slumptal+"\"");
                System.out.println("Slumptal2 är större än slumptal1");
            }else{
                System.out.println("Slumptal1 och slumptal2 är lika stora");
            }
            System.out.println("");
        }else if(val==2){
            

        }
        }
    }
}
