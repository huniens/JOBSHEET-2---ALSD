/**
 * Buku13
 */
public class Buku13 {
    
    String judul, pengarang;
    int halaman, stok, harga;
    public Buku13(){

    }
        public Buku13(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
        
    void tampilanInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp " + harga);
    }

    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
            System.out.println(jml + " buku terjual. Sisa stok: " + stok);
        } else {
            System.out.println("Stok habis. Tidak dapat melakukan penjualan.");
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }
    int hitungHargaTotal() {
        return harga * (stok > 0 ? stok : 0);
    }

    double hitungDiskon() {
        int hargaTotal = hitungHargaTotal();
        double diskon = 0.0;

        if (hargaTotal > 150000) {
            diskon = 0.12;
        } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
            diskon = 0.05;
        }

        return diskon;
    }

    double hitungHargaBayar() {
        double diskon = hitungDiskon();
        int hargaTotal = hitungHargaTotal();
        return hargaTotal - (hargaTotal * diskon);
    }
}