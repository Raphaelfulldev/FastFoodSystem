package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("1 - X-Burguer\n2 - X-Salad\n3 - X-Bacon\n4 - Simple Toast\n5 - Soda");
        System.out.println();
        System.out.print("Enter with product code: ");
        int code = sc.nextInt();
        System.out.print("Qnt: ");
        double quantity = sc.nextDouble();
        double total;

        if (code == 1 ){
            total = quantity * 4;
            System.out.printf(code + " - X-Burguer\n");

        }
        else if (code == 2){
            total = quantity * 4.5;
            System.out.printf(code + " - X-Salad\n");

        } else if (code == 3){
            total = quantity * 5;
            System.out.printf(code + " - X-Bacon\n");

        }
        else if (code == 4){
            total = quantity * 2;
            System.out.printf(code + " - Simple toast\n");

        }
        else {
            total = quantity * 1.5;
            System.out.printf(code + " - Soda\n");

        }

        System.out.printf("Total: R$ %.2f\n", total);

        sc.close();
    }
}


