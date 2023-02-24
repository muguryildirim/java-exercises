package OOPAtm;

import static java.lang.System.out;

public class Hesap
{
    //ozellikler
    private String kullanici_adi;
    private String parola;
    private int bakiye;
    //constructor

    public Hesap(String kullanici_adi, String parola, int bakiye)
    {
        this.setKullanici_adi(kullanici_adi);
        this.setParola(parola);
        this.setBakiye(bakiye);
    }

    public String getKullanici_adi() {
        return kullanici_adi;
    }

    public void setKullanici_adi(String kullanici_adi) {
        this.kullanici_adi = kullanici_adi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public void paraCek(int tutar) {
        if ((bakiye - tutar) < 0) {
            out.println("Yeterli bakiyen yok...");
        } else {
            bakiye -= tutar;
            out.println("Yeni bakiyeniz = " + bakiye);
        }
    }
    public void paraYatir(int tutar)
        {
            bakiye += tutar;
            out.println("Yeni bakiyeniz = " + bakiye);
        }
    }
