public class BukuDigital extends Buku implements BisaDiunduh {
    private double ukuranMB;

    public BukuDigital(String judul, String penulis, int harga, double ukuranMB) {
        super(judul, penulis, harga);
        this.ukuranMB = ukuranMB;
    }

    public double getUkuranMB() {
        return ukuranMB;
    }

    @Override
    public int hargaAkhir() {
        // Diskon 20%
        return (int) (getHarga() * 0.8);
    }

    @Override
    public String keterangan() {
        // Format ukuranMB agar menampilkan angka bulat jika desimal 0, atau desimal jika ada
        String ukuranStr = (ukuranMB == (long) ukuranMB) ? String.format("%d", (long) ukuranMB) : String.valueOf(ukuranMB);
        return ukuranStr + " MB, diskon 20%";
    }

    @Override
    public String linkUnduh() {
        String judulFormatted = getJudul().toLowerCase().replace(' ', '-');
        return "https://toko.buku/ebook/" + judulFormatted;
    }
}