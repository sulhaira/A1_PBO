package posttest6;

public class devisi extends relawan implements Interface {

    private int iddevisi;

    devisi(int iddevisi, String nama, String devisirelawan, String emailrelawan, String alamat) {
        super(nama, devisirelawan, emailrelawan, alamat);
        this.iddevisi = iddevisi;
    }

    @Override
    public void show() {
        System.out.println("ID devisi : " + this.iddevisi);
        System.out.println("Nama Devisi : " + getNama());
        System.out.println("Golongan Devisi : " + getDevisirelawan());
        System.out.println("Email : " + getEmailrelawan());
        System.out.println("Alamat : " + getAlamat());
    }

    public void show(String status) {
        System.out.println("ID devisi : " + this.iddevisi);
        System.out.println("Nama Staff : " + getNama());
        System.out.println("Devisi : " + getDevisirelawan());
        System.out.println("Email : " + getEmailrelawan());
        System.out.println("Alamat : " + getAlamat());
        System.out.println("Status Keaktifan : " + status);
    }

    @Override
    public void Keluar() {
        System.out.println("Keluar dari divisi : " + getNama());

    }
}
