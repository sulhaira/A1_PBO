package posttest6;

public class staffklinis extends relawan implements Interface{

    private String jabatan;
    private int idstaff;

    public staffklinis(int idstaff, String nama, String jabatan, String devisirelawan, String emailrelawan, String alamat) {
        super(nama, devisirelawan, emailrelawan, alamat);
        this.idstaff = idstaff;
        this.jabatan = jabatan;
    }

    @Override
    public void show() {
        System.out.println("ID Staff : " + this.idstaff);
        System.out.println("Nama Staff : " + getNama());
        System.out.println("Jabatan : " + this.jabatan);
        System.out.println("Devisi : " + getDevisirelawan());
        System.out.println("Email : " + getEmailrelawan());
        System.out.println("Alamat : " + getAlamat());
    }

    //overloading
    public void show(String status) {
        System.out.println("ID Staff : " + this.idstaff);
        System.out.println("Nama Staff : " + getNama());
        System.out.println("Jabatan : " + this.jabatan);
        System.out.println("Devisi : " + getDevisirelawan());
        System.out.println("Email : " + getEmailrelawan());
        System.out.println("Alamat : " + getAlamat());
        System.out.println("Status Keaktifan : " + status);
    }
    
    @Override
    public void Keluar() {
        System.out.println("Keluar dari Staff dengan Jabatan : " + this.jabatan);

    }

}
