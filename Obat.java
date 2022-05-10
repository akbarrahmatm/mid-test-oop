// Akbar Rahmat Mulyatama (2112500851)

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Obat {

    static Boolean isTrue = true;
    static BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static String obat[][] = new String[3][4];

    static void showMenu() {
        try {
            System.out.println("\n\n");
            System.out.println("=============================================================");
            System.out.println("\t\t\tMenu Data Obat");
            System.out.println("\t\tAkbar Rahmat Mulyatama (2112500851)");
            System.out.println("=============================================================");
            System.out.println("1. Input data obat");
            System.out.println("2. Cetak data obat");
            System.out.println("3. Keluar");
            System.out.println("=============================================================");
            System.out.print("Masukkan pilihan anda [1/2/3] ? ");
            int menu = Integer.parseInt(input.readLine());
            System.out.println("\n\n");

            if (menu == 1) {
                input();
            } else if (menu == 2) {
                cetak();
            } else if (menu == 3) {
                isTrue = false;
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void input() {
        try {
            System.out.println("=============================================================");
            System.out.println("\t\t\tInput Data");
            System.out.println("=============================================================");
            BufferedReader input2 = new BufferedReader(new InputStreamReader(System.in));
            for (int i = 0; i < 3; i++) {
                int no = i + 1;
                System.out.print((no) + ".");

                for (int j = 0; j < 4; j++) {
                    if (j == 0) {
                        System.out.print("\tKD Obat\t\t: ");
                    } else if (j == 1) {
                        System.out.print("\tNama Obat\t: ");
                    } else if (j == 2) {
                        System.out.print("\tJenis Obat\t: ");
                    } else if (j == 3) {
                        System.out.print("\tHarga Obat\t: ");
                    }
                    System.out.print("");
                    obat[i][j] = input2.readLine();
                }
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static void cetak() {
        System.out.println("\n\n");
        System.out.println("=============================================================");
        System.out.println("\t\t\tCetak Data");
        System.out.println("=============================================================");
        System.out.println("No.\tKode\t\tNama Obat\tJenis Obat\tHarga");
        System.out.println("=============================================================");

        for (int i = 0; i < 3; i++) {
            System.out.print(i + 1 + ".\t");
            for (int j = 0; j < 4; j++) {
                if (j == 0) {
                    System.out.print(obat[i][j] + "\t\t");
                } else {
                    System.out.print(obat[i][j] + "\t\t");
                }
            }
            System.out.print("\n");
        }
        System.out.println("\n\n");
    }

    public static void main(String[] args) throws IOException {
        do {
            showMenu();
        } while (isTrue);
    }
}
