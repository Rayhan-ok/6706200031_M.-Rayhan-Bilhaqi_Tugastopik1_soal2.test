public class Barang {
    private String idProduk;
    private String nama;
    private double harga;

    public Barang(String idProduk, String nama, double harga) {
        this.idProduk = idProduk;
        this.nama = nama;
        this.harga = harga;
    }

    public Barang(String idProduk, String nama) {
        this.idProduk = idProduk;
        this.nama = nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public double getHarga() {
        return this.harga;
    }

    public String getIdProduk() {
        return this.idProduk;
    }
}
