public abstract class Buku {
    private String judul;
    private String penulis;
    private int harga;

    public Buku(String judul, String penulis, int harga) {
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getHarga() {
        return harga;
    }

    public abstract int hargaAkhir();
    public abstract String keterangan();

    public void tampilkanInfo() {
        System.out.println(judul + " (" + penulis + ")");
        System.out.printf("  Harga       : Rp%,d\n", harga).replace(',', '.');
        System.out.println("  Keterangan  : " + keterangan());
        System.out.printf("  Harga akhir : Rp%,d\n", hargaAkhir()).replace(',', '.');
    }
}