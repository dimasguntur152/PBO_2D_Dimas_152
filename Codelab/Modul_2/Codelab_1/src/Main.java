// Mendefinisikan kelas Hewan
class Hewan
{
    // Mendeklarasikan atribut nama, jenis, dan suara dengan tipe data String
    String nama;
    String jenis;
    String suara;

    // Konstruktor untuk menginisialisasi atribut saat objek dibuat
    public Hewan(String nama, String jenis, String suara)
    {
        this.nama = nama; // Menetapkan nilai parameter nama ke atribut nama
        this.jenis = jenis; // Menetapkan nilai parameter jenis ke atribut jenis
        this.suara = suara; // Menetapkan nilai parameter suara ke atribut suara
    }

    // Metode untuk menampilkan informasi hewan
    public void tampilkanInfo()
    {
        System.out.println("Nama: " + nama); // Mencetak nama hewan
        System.out.println("Jenis: " + jenis); // Mencetak jenis hewan
        System.out.println("Suara: " + suara); // Mencetak suara hewan
        System.out.println(); // Menambahkan baris kosong sebagai pemisah output
    }
}

// Kelas utama (Main) untuk menjalankan program
public class Main {
    // Metode utama (entry point) dalam program Java
    public static void main(String[] args)
    {
        // Membuat objek hewan1 dengan atribut: Nama = "Kucing", Jenis = "Mamalia", Suara = "Nyann~~"
        Hewan hewan1 = new Hewan("Kucing", "Mamalia", "Nyann~~");
        // Membuat objek hewan2 dengan atribut: Nama = "Anjing", Jenis = "Mamalia", Suara = "Woof-Woof!!"
        Hewan hewan2 = new Hewan("Anjing", "Mamalia", "Woof-Woof!!");

        hewan1.tampilkanInfo(); // Memanggil metode tampilkanInfo() pada objek hewan1 untuk menampilkan informasi hewan pertama
        hewan2.tampilkanInfo(); // Memanggil metode tampilkanInfo() pada objek hewan2 untuk menampilkan informasi hewan kedua
    }
}
