public class BukuCetak extends Buku {
    private int beratGram;

    public BukuCetak(String judul, String penulis, int harga, int beratGram) {
        super(judul, penulis, harga);
        this.beratGram = beratGram;
    }

    public int getBeratGram() {
        return beratGram;
    }

    // Perhitungan ongkir: Rp5.000 per 500 gram (sisa dibulatkan ke atas)
    public int hitungOngkir() {
        int unit = (int) Math.ceil((double) beratGram / 500);
        return unit * 5000;
    }

    @Override
    public int hargaAkhir() {
        return getHarga() + hitungOngkir();
    }

    @Override
    public String keterangan() {
        String hargaOngkirFormatted = String.format("Rp%,d", hitungOngkir()).replace(',', '.');
        return beratGram + " gram, ongkir " + hargaOngkirFormatted;
    }
}