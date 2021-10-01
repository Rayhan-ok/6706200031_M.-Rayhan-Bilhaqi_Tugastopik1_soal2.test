public class Buku {
    private String judul;
    private String pengarang;
    private double harga;

    public Buku(String judul, String pengarang, double harga) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.harga = harga;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPengarang(String pengarang){
        this.pengarang = pengarang;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getJudul() {
        return this.judul;
    }

    public String getPengarang() {
        return this.pengarang;
    }

    public double getHarga() {
        return this.harga;
    }
}
