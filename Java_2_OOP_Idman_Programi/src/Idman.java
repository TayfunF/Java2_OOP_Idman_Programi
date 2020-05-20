
public class Idman {

    private int burpee_sayisi;
    private int pushup_sayisi;
    private int situp_sayisi;
    private int squad_sayisi;

    public Idman(int burpee_sayisi, int pushup_sayisi, int situp_sayisi, int squad_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
        this.pushup_sayisi = pushup_sayisi;
        this.situp_sayisi = situp_sayisi;
        this.squad_sayisi = squad_sayisi;
    }

    public int getBurpee_sayisi() {
        return burpee_sayisi;
    }

    public void setBurpee_sayisi(int burpee_sayisi) {
        this.burpee_sayisi = burpee_sayisi;
    }

    public int getPushup_sayisi() {
        return pushup_sayisi;
    }

    public void setPushup_sayisi(int pushup_sayisi) {
        this.pushup_sayisi = pushup_sayisi;
    }

    public int getSitup_sayisi() {
        return situp_sayisi;
    }

    public void setSitup_sayisi(int situp_sayisi) {
        this.situp_sayisi = situp_sayisi;
    }

    public int getSquad_sayisi() {
        return squad_sayisi;
    }

    public void setSquad_sayisi(int squad_sayisi) {
        this.squad_sayisi = squad_sayisi;
    }

    public void hareketYap(String hareketTuru, int sayi) {
        if (hareketTuru.equals("burpee")) {
            burpeeYap(sayi);
        } else if (hareketTuru.equals("pushup")) {
            pushupYap(sayi);
        } else if (hareketTuru.equals("situp")) {
            situpYap(sayi);
        } else if (hareketTuru.equals("squad")) {
            squadYap(sayi);
        } else {
            System.out.println("Geçersiz hareket");
        }
    }

    public void burpeeYap(int sayi) {
        if (burpee_sayisi == 0) {
            System.out.println("Yapacak Burpee Kalmadı");
        }
        if (burpee_sayisi - sayi < 0) {
            System.out.println("Burpee Tamamlandı !");
            burpee_sayisi = 0;
            System.out.print("Kalan : " + burpee_sayisi);
        } else {
            burpee_sayisi = burpee_sayisi - sayi;
            System.out.print("Kalan : " + burpee_sayisi);
        }
    }

    public void pushupYap(int sayi) {
        if (pushup_sayisi == 0) {
            System.out.println("Yapacak Pushup Kalmadı");
        }
        if (pushup_sayisi - sayi < 0) {
            System.out.println("Pushup Tamamlandı !");
            pushup_sayisi = 0;
            System.out.print("Kalan : " + pushup_sayisi);
        } else {
            pushup_sayisi = pushup_sayisi - sayi;
            System.out.print("Kalan : " + pushup_sayisi);
        }
    }

    public void situpYap(int sayi) {
        if (situp_sayisi == 0) {
            System.out.println("Yapacak Situp Kalmadı");
        }
        if (situp_sayisi - sayi < 0) {
            System.out.println("Situp Tamamlandı !");
            situp_sayisi = 0;
            System.out.print("Kalan : " + situp_sayisi);
        } else {
            situp_sayisi = situp_sayisi - sayi;
            System.out.print("Kalan : " + situp_sayisi);
        }
    }

    public void squadYap(int sayi) {
        if (squad_sayisi == 0) {
            System.out.println("Yapacak Squad Kalmadı");
        }
        if (squad_sayisi - sayi < 0) {
            System.out.println("Squad Tamamlandı !");
            squad_sayisi = 0;
            System.out.print("Kalan : " + squad_sayisi);
        } else {
            squad_sayisi = squad_sayisi - sayi;
            System.out.print("Kalan : " + squad_sayisi);
        }
    }

    public boolean idmanbBittiMi() {
        return ((burpee_sayisi == 0) && (pushup_sayisi == 0)
                && (situp_sayisi == 0) && (squad_sayisi == 0));

    }
}
