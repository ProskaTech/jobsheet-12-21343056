package latihan.latihan1;

// Created by 21343056_Muhammad Asyrof

class RodaDua extends Kendaraan {
    double naikHargaKe = 0.20; //0.2 kali
    
    void hargaAkhir(){
        hargaDasar = hargaDasar + (hargaDasar + naikHargaKe);
        System.out.println ("Setelah dimodifikasi, harga sepeda menjadi Rp. "+hargaDasar);
    }

} 

