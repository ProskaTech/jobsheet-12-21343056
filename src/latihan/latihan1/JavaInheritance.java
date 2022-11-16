package latihan.latihan1;

// Created by 21343056_Muhammad Asyrof

public class JavaInheritance{
    public static void main(String[] args) {
        // membuat objek kendaraan roda dua
        RodaDua sepeda = new RodaDua();

        // membuat objek kendaraan roda empat
        RodaEmpat mobil = new RodaEmpat();
        
        sepeda.tampilkanHarga();
        mobil.hargaAkhir();
        
    }
}

