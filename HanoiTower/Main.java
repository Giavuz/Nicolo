package HanoiTower;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quanti dischi vuoi usare? (Massimo 3)");
        int scelta = input.nextInt();

        switch(scelta){
            case 1:{
                
            }
            case 2:{

            }
            case 3:{
                
            }
            default:{
                System.out.println("Numero di dischi non disponible");
            }
        }

        input.close();
    } 
    
}
