import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Satır sayısı : ");
        int a = input.nextInt();
        System.out.print("Sütün sayısı : ");
        int b = input.nextInt();
        String[][] alan = MineSweeper.harita(a, b);
        String[][] bosAlan = MineSweeper.bosAlan(a, b);
        MineSweeper.print(bosAlan);

//        MineSweeper.print(alan);

        MineSweeper.kontrol(alan, bosAlan, a, b);
    }


    }

