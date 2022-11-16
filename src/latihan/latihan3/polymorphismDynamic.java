package latihan.latihan3;

// Created by 21343056_Muhammad Asyrof

class polymorphismDynamic {
    public static void main(String[] args) {
    // creating variable of bank class 
    Bank B;
    B = new BRI();
    System.out.println("Tingkat suku bunga BRI adalah : "+B.sukuBunga());       
    B = new BNI();
    System.out.println("Tingkat suku bunga BNI adalah : "+B.sukuBunga());
    B = new Mandiri();
    System.out.println("Tingkat suku bunga Mandiri adalah : "+B.sukuBunga());

    }
}
