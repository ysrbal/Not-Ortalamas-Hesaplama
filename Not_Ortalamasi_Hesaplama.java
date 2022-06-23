import java.util.Scanner;

public class Not_Ortalamasi_Hesaplama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mat, fzk, kimya, turkce, tarih, muzik;

        System.out.print("Matematik Notunu Girin:");
        mat=input.nextInt();

        System.out.print("Fizik Notunu Girin:");
        fzk=input.nextInt();

        System.out.print("Kimya Notunu Girin:");
        kimya=input.nextInt();

        System.out.print("Turkce Notunu Girin:");
        turkce=input.nextInt();

        System.out.print("Tarih Notunu Girin:");
        tarih=input.nextInt();

        System.out.print("Muzik Notunu Girin:");
        muzik=input.nextInt();

        int toplam = (mat+fzk+kimya+turkce+tarih+muzik);
        double sonuc = toplam/6.0;

        System.out.println("Ortalamaniz: " + sonuc);

        String not = sonuc>=60 ? "Sinifi Gecti" : "Sinifta Kaldi";
        System.out.print("Durumunuz:" + not );
    }
}
