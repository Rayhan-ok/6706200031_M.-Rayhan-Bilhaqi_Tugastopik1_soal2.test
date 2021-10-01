public class Main {
    public static void main(String[] args){

        Barang brg1 = new Barang("BRG-001,","Tas Gucci," + " 1200");
        brg1.setHarga(1200);
        Barang brg2 = new Barang("BRG-002,","Printer Epson L355," + " 200");
        brg2.setHarga(200);
        Barang brg3 = new Barang("BRG-003,","Koper,",150);
        brg3.setNama("Koper");
        Barang brg4 = new Barang("BRG-004,","Helm,", 20);

        System.out.println(brg1.getIdProduk() + " " + brg1.getNama());
        System.out.println(brg2.getIdProduk() + " " + brg2.getNama());

        System.out.println(brg3.getIdProduk() + " " + brg3.getNama() + " " + brg3.getHarga());
        System.out.println(brg4.getIdProduk() + " " + brg4.getNama() + " " + brg4.getHarga());

        System.out.println("total : " + (brg1.getHarga() + (brg3.getHarga() + brg4.getHarga())));
    }
}