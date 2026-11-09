public class BukuAudio extends Buku implements BisaDiunduh {
    private int durasiMenit;

    public BukuAudio(String judul, String penulis, int harga, int durasiMenit) {
        super(judul, penulis, harga);
        this.durasiMenit = durasiMenit;
    }

    public int getDurasiMenit() {
        return durasiMenit;
    }

    @Override
    public int hargaAkhir() {
        // Diskon 10%
        return (int) (getHarga() * 0.9);
    }

    @Override
    public String keterangan() {
        return durasiMenit + " menit, diskon 10%";
    }

    @Override
    public String linkUnduh() {
        String judulFormatted = getJudul().toLowerCase().replace(' ', '-');
        return "https://toko.buku/audio/" + judulFormatted;
    }
}