package OOP2.src;

public class Buah {
    private String nama;
    private int harga;
    private int stock;

    public static int countBuah;

    public Buah(String nama, int harga, int stock) {
        setNama(nama);
        setHarga(harga);
        setStock(stock);

        countBuah++;
        
    }

    public String getNama() {
        return nama;
    }

    private void setNama(String nama) {
        if (nama.length() == 0){
            throw new IllegalArgumentException("ga oleh kosong lo");
        }
        this.nama = nama;
    }

    public int getHarga() {
        return harga;
    }

    private void setHarga(int harga) {
        
        if (harga <= 0 ) {
            throw new IllegalArgumentException("ga bisa negatif atuh");
        }
        this.harga = harga;
    }

    public int getStock() {
        return stock;
    }

    private void setStock(int stock) {
        if (stock < 0 ) {
            throw new IllegalArgumentException("ga bisa negatif atuh");
        }
        this.stock = stock;
    }

  
}