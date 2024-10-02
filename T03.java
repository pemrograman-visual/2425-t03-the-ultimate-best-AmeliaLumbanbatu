// 12S24031 - Amelia Renata Lumbanbatu
// 12S24025 - Paula Gevriella Tambunan

import java.util.*;
import java.lang.Math;

public class T03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] iSBN = new String[10], judukBuku = new String[10], penulis = new String[10], penerbit = new String[10], formatBuku = new String[10], kategori = new String[10];
        double[] tahunTerbit = new double[10], stok = new double[10];
        double[] hargaPembelian = new double[10], minimumMargin = new double[10], rating = new double[10];

        // do {
            iSBN = input.nextLine();
            judukBuku = input.nextLine();
            penulis = input.nextLine();
            tahunTerbit = Double.parseDouble(input.nextLine());
            penerbit = input.nextLine();
            formatBuku = input.nextLine();
            hargaPembelian = Double.parseDouble(input.nextLine());
            minimumMargin = Double.parseDouble(input.nextLine());
            stok = Double.parseDouble(input.nextLine());
            rating = Double.parseDouble(input.nextLine());
            if (rating >= 4.7 && rating <= 5) {
                kategori = "BestPick";
            } else {
                if (rating >= 4.5) {
                    kategori = "MustRead";
                } else {
                    if (rating >= 4.0) {
                        kategori = "Recommended";
                    } else {
                        if (rating >= 3.0) {
                            kategori = "Low";
                        } else {
                            kategori = "Error";
                        }
                    }
                }
            }
        // } while (Conditional);
        System.out.println(iSBN + "|" + JudulBuku + "|" + penulis + "|" + tahunTerbit + "|" + penerbit + "|" + formatBuku + "|" + hargaPembelian + "|" + minimumMargin + "|" + stok + "|" + rating + "|" + kategori);
    }
}

