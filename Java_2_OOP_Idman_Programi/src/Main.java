
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Hoş Geldiniz ");
        String idmanlar = "Geçerli Hareketler...\n"
                + "Burpee\n"
                + "Pushup\n"
                + "Situp\n"
                + "Squad\n";
        System.out.println(idmanlar);
        System.out.println(" Bir idman oluşturun");
        System.out.print(" Burpee Sayısı : ");
        int burpee = klavye.nextInt();
        System.out.print(" Pushup Sayısı : ");
        int pushup = klavye.nextInt();
        System.out.print(" Situp Sayısı  : ");
        int situp = klavye.nextInt();
        System.out.print(" Squad Sayısı  : ");
        int squad = klavye.nextInt();
        klavye.nextLine();

        Idman idman = new Idman(burpee, pushup, situp, squad);
        System.out.println("İdman Başlıyor ...");
        Thread.sleep(1200);

        while (idman.idmanbBittiMi() == false) { //idman bitmediyse
            System.out.println("");
            System.out.print("Hareket türü Seçiniz (burpee,pushup,situp,squad  :  ");
            String tur = klavye.nextLine();
            System.out.print("Kaç tane yapacaksınız  :  ");
            int sayi = klavye.nextInt();
            klavye.nextLine();
            idman.hareketYap(tur, sayi);
        }
    }
}
