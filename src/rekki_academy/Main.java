package rekki_academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight , height , bmi ;
        System.out.print("can nang (in kg ):");
        weight = scanner.nextDouble();

        System.out.print("chieu cao(in cm):");
        height = scanner.nextDouble();
        bmi = weight/ Math.pow(height, 2);
        System.out.printf("%-20s%s" , "bmi", "Interperetation\n");
        if(bmi <18 )
            System.out.printf("%-20.2f%s", bmi , "coi qua");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s",bmi,"can doi");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s",bmi,"thua can");
        else
            System.out.printf("%-20.2f%s",bmi,"beo phi");

    }
}