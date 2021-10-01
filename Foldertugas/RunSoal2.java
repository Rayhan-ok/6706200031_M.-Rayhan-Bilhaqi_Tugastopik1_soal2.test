public class RunSoal2 {
    public static void main(String[] args) {
        Buku jenis1 = new Buku("Harry Potter","J.K Rowling",300000);
        Buku jenis2 = new Buku("UML","Jacobson", 400000);

        jenis2.setJudul("UML");
        jenis2.setPengarang("Ivar Jacobson");
        jenis2.setHarga(400000);

        System.out.println("Judul: "+ jenis1.getJudul() + ", Pengarang: "+ jenis1.getPengarang() + ", Harga: "+ jenis1.getHarga());
        System.out.println("Judul: "+ jenis2.getJudul() + ", Pengarang: "+ jenis2.getPengarang() + ", Harga: "+ jenis2.getHarga());

    }
}
