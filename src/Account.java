
public class Account {
    private String KullanıcıAdı;
    private int Parola;
    private double Bakiye;
  
    public Account(String KullanıcıAdı, int Bakiye, Double Bakiye) {
        this.KullanıcıAdı = KullanıcıAdı;
        this.Bakiye = Bakiye;
        this.Parola = HesapNo;
    }
    public  void  ParaYatırma(int miktar){
        this.Bakiye+=miktar; //Bakiye+=miktar; bu kullanımda doğrudur
        System.out.println("Yeni Bakiyeniz: "+Bakiye);
    }
    public  void ParaÇekme(int miktar){
        if ((Bakiye - miktar )< 0 ) {
            System.out.println("Yetersiz Bakiye... Bakiyeniz: "+Bakiye);
        }
        if((Bakiye -miktar) >1500){
            System.out.println("Bir Günde 1500 Tl  Para Çekemezsiniz...");
        }
        else{
            this.Bakiye -= miktar;
            System.out.println("Yeni Bakiyeniz: "+Bakiye);
        }
    }
    public int getKullanıcıAdı() {
        return KullanıcıAdı;
    }

    public void setKullanıcıAdı(int KullanıcıAdı) {
        this.KullanıcıAdı = KullanıcıAdı;
    }

    public Double getBakiye() {
        return Bakiye;
    }

    public void setBakiye(int Bakiye) {
        this.Bakiye = Bakiye;
    }

    public String getHesapNo() {
        return Parola;
    }

    public void setHesapNo(String HesapNo) {
        this.Parola = HesapNo;
    }

  
}
