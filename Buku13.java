/**
 * Buku13
 */
public class Buku13 {

    String judul, pengarang;
    int halaman, stok, harga;

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
}
//sekian