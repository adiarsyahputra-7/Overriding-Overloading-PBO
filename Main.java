package semester.pkg2;
public class Main {
    public static void main(String[] args) {
        // Overloading
        Hitung h = new Hitung();
        System.out.println("Tambah 1 angka: " + h.tambah(5));
        System.out.println("Tambah 2 angka: " + h.tambah(5, 7));
        System.out.println("Tambah 2 angka desimal: " + h.tambah(3.5, 2.2));

        // Overriding
        Hewan hewan1 = new Kucing();
        Hewan hewan2 = new Anjing();

        hewan1.suara(); // Output: Meong... Meong...
        hewan2.suara(); // Output: Guk... Guk...
    }
}
