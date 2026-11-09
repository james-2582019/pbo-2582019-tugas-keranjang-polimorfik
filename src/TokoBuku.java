public class TokoBuku {

    public static int hitungTotal(Buku[] keranjang) {
        int total = 0;
        for (Buku buku : keranjang) {
            total += buku.hargaAkhir();
        }
        return total;
    }

    public static void main(String[] args) {
        // Ketentuan 6: Percobaan instansiasi abstract class (Sudah dikomentari beserta pesan errornya)
        /*
        Buku b = new Buku("X", "Y", 1);
        // Error: Buku is abstract; cannot be instantiated
        */

        // Membuat objek sesuai data soal
        BukuCetak cetak1 = new BukuCetak("Pemrograman Java", "John Doe", 120000, 750);
        BukuCetak cetak2 = new BukuCetak("Algoritma Dasar", "Jane Smith", 95000, 400);
        BukuDigital digital = new BukuDigital("Belajar OOP", "Ani Wijaya", 80000, 12.5);
        BukuAudio audio = new BukuAudio("Kisah Programmer", "Budi Santoso", 60000, 240);

        // Array keranjang berisi semua buku
        Buku[] keranjang = { cetak1, cetak2, digital, audio };

        // Array unduhan bertipe interface BisaDiunduh
        BisaDiunduh[] unduhan = { digital, audio };

        // Output Bagian Keranjang
        System.out.println("=============== KERANJANG ===============");
        for (Buku buku : keranjang) {
            buku.tampilkanInfo();
        }
        System.out.println("-----------------------------------------");
        System.out.printf("Total bayar   : Rp%,d\n\n", hitungTotal(keranjang)).replace(',', '.');


        System.out.println("============== LINK UNDUH ===============");
        for (BisaDiunduh item : unduhan) {
            System.out.println(item.linkUnduh());
        }
    }
}