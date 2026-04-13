package semester.pkg2;
// Contoh Overloading
public class Hitung {

    // Method dengan 1 parameter
    int tambah(int a) {
        return a + 10;
    }

    // Method dengan 2 parameter (overloading)
    int tambah(int a, int b) {
        return a + b;
    }

    // Method dengan tipe parameter berbeda (overloading)
    double tambah(double a, double b) {
        return a + b;
    }
}