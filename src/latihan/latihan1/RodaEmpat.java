package latihan.latihan1;

// Created by 21343056_Muhammad Asyrof

class RodaEmpat extends Kendaraan {
    double naikHargaKe = 8; //1 kali
    
    void hargaAkhir(){
        hargaDasar = hargaDasar + (hargaDasar + naikHargaKe);
        System.out.println ("Setelah dimodifikasi, harga mobil menjadi Rp. "+hargaDasar);
    }

} 

