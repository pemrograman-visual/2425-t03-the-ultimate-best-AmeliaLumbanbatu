// 12S24031 - Amelia Renata Lumbanbatu
// 12S24025 - Paula Gevriella Tambunan

import java.util.*;
import java.lang.Math;

public class T03 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String kodeisbn, judul, penulis, penerbit, formatBuku, jenisdiskon, conclusion;
        String kategori;
        int tahunterbit, stok;
        double hargapembelian, minimummargin, rating;

        kodeisbn = input.nextLine();
        while (!kodeisbn.equals("---")) {
            judul = input.nextLine();
            penulis = input.nextLine();
            tahunterbit = Integer.parseInt(input.nextLine());
            penerbit = input.nextLine();
            formatBuku = input.nextLine();
            hargapembelian = Double.parseDouble(input.nextLine());
            minimummargin = Double.parseDouble(input.nextLine());
            if (-(minimummargin / hargapembelian) > 0.4) {
                jenisdiskon = "Once in a lifetime";
            } else {
                if (0.2 < -(minimummargin / hargapembelian) && minimummargin / hargapembelian < 0.4) {
                    jenisdiskon = "never come twice";
                } else {
                    if (-minimummargin / hargapembelian <= 0.2 && -minimummargin / hargapembelian > 0) {
                        jenisdiskon = "No regret";
                    } else {
                        jenisdiskon = "---";
                    }
                }
            }
            stok = Integer.parseInt(input.nextLine());
            rating = Double.parseDouble(input.nextLine());
            if (rating >= 4.7) {
                kategori = "Best Pick";
            } else {
                if (rating >= 4.5) {
                    kategori = "Must Read";
                } else {
                    if (rating >= 4.0) {
                        kategori = "Recommended";
                    } else {
                        if (rating >= 3.0) {
                            kategori = "Average";
                        } else {
                            kategori = "Low";
                        }
                    }
                }
            }
            if (jenisdiskon.equals("Once in a lifetime") && kategori.equals("Best Pick")) {
                kategori = "The Ultimate Best";
            } else {
                kategori = "---";
            }
            kodeisbn = input.nextLine();
            System.out.println(kodeisbn + "|" + judul + "|" + penulis + "|" + tahunterbit + "|" + penerbit + "|" + formatBuku + "|" + hargapembelian + "|" + minimummargin + "|" + stok + "|" + rating + "|" + kategori + "|" + jenisdiskon);
        }
    }
}
