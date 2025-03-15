// Kelas RekeningBank untuk merepresentasikan rekening bank
class RekeningBank
{
    // Atribut untuk menyimpan informasi rekening
    private String nomorRekening; // Nomor rekening nasabah
    private String namaPemilik; // Nama pemilik rekening
    private double saldo; // Saldo dalam rekening

    // Konstruktor untuk menginisialisasi objek RekeningBank
    public RekeningBank(String nomorRekening, String namaPemilik, double saldo)
    {
        this.nomorRekening = nomorRekening; // Inisialisasi nomor rekening
        this.namaPemilik = namaPemilik; // Inisialisasi nama pemilik rekening
        this.saldo = saldo; // Inisialisasi saldo awal
    }

    // Method untuk menampilkan informasi rekening
    public void tampilkanInfo()
    {
        System.out.println("Nomor Rekening: " + nomorRekening); // Cetak nomor rekening
        System.out.println("Nama Pemilik: " + namaPemilik); // Cetak nama pemilik
        System.out.println("Saldo: Rp" + saldo); // Cetak saldo
        System.out.println(); // Menambahkan baris kosong sebagai pemisah output
    }

    // Method untuk menyetor uang ke rekening
    public void setorUang(double jumlah)
    {
        if (jumlah > 0)
        {
            saldo += jumlah; // Tambahkan jumlah ke saldo
            System.out.println(namaPemilik + " menyetor Rp" + jumlah + ". Saldo sekarang: Rp" + saldo);
        }
        else
        {
            System.out.println("Jumlah setor harus lebih dari 0."); // Pesan jika jumlah tidak valid
        }
    }

    // Method untuk menarik uang dari rekening
    public void tarikUang(double jumlah)
    {
        if (jumlah > saldo)
        {
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Gagal, Saldo tidak mencukupi) Saldo saat ini: Rp" + saldo);
        }
        else
        {
            saldo -= jumlah; // Kurangi saldo jika cukup
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Berhasil) Saldo sekarang: Rp" + saldo);
        }
    }
}

// Kelas Main untuk menjalankan program
public class Main
{
    public static void main(String[] args)
    {
        // Membuat dua objek RekeningBank dengan data awal
        RekeningBank rekening1 = new RekeningBank("202410370110152", "Dimas", 500000.0);
        RekeningBank rekening2 = new RekeningBank("202410370110161", "Dwi", 1000000.0);

        // Menampilkan informasi awal dari kedua rekening
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        // Melakukan transaksi setor uang
        rekening1.setorUang(200000.0); // Maharani menyetor Rp200000
        rekening2.setorUang(500000.0); // Amelia menyetor Rp500000

        // Melakukan transaksi tarik uang
        rekening1.tarikUang(800000.0); // Maharani mencoba menarik Rp800000 (Gagal)
        rekening2.tarikUang(300000.0); // Amelia menarik Rp300000 (Berhasil)

        // Menampilkan informasi akhir setelah transaksi
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();
    }
}