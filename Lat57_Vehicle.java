/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Nama : Mufida Anggradita
 * NIM : 22166010
 * Kelas : Sistem Informasi
 * Semester 3
 * Mata Kuliah : Pemrogaman Berorientasi Objek 1
 * LATIHAN 57
 */
class Vehicle {
    // Kelas Vehicle
    protected String myBrand;
    protected String myModel;

    // Konstruktor Vehicle
    public Vehicle() {
        this.myBrand = "";
        this.myModel = "";
    }

    // Metode getter untuk mendapatkan brand
    public String getBrand() {
        return myBrand;
    }

    // Metode setter untuk mengatur brand
    public void setBrand(String brand) {
        this.myBrand = brand;
    }

    // Metode getter untuk mendapatkan model
    public String getModel() {
        return myModel;
    }

    // Metode setter untuk mengatur model
    public void setModel(String model) {
        this.myModel = model;
    }
}

// Kelas Bicycle yang merupakan turunan dari Vehicle
class Bicycle extends Vehicle {
    private int myGearCount;

    // Konstruktor Bicycle
    public Bicycle() {
        super(); // Memanggil konstruktor dari kelas induk (Vehicle)
        this.myGearCount = 0;
    }

    // Metode getter untuk mendapatkan jumlah gigi
    public int getGearCount() {
        return myGearCount;
    }

    // Metode setter untuk mengatur jumlah gigi
    public void setGearCount(int gearCount) {
        this.myGearCount = gearCount;
    }
}

// Kelas Skateboard yang merupakan turunan dari Vehicle
class Skateboard extends Vehicle {
    private double myBoardLength;

    // Konstruktor Skateboard
    public Skateboard() {
        super(); // Memanggil konstruktor dari kelas induk (Vehicle)
        this.myBoardLength = 0.0;
    }

    // Metode getter untuk mendapatkan panjang board
    public double getBoardLength() {
        return myBoardLength;
    }

    // Metode setter untuk mengatur panjang board
    public void setBoardLength(double boardLength) {
        this.myBoardLength = boardLength;
    }
}

// Kelas Main untuk menjalankan program
public class Lat57_Vehicle {
    public static void main(String[] args) {
        // Membuat objek Bicycle
        Bicycle bicycle = new Bicycle();
        
        System.out.println("Bicycle");
        // Mengatur brand dan model menggunakan metode dari kelas Vehicle
        bicycle.setBrand("Trek Bike");
        bicycle.setModel("7.4FX");

        // Mengatur jumlah gigi menggunakan metode dari kelas Bicycle
        bicycle.setGearCount(23);

        // Menampilkan informasi brand, model, dan jumlah gigi
        System.out.println("Brand: " + bicycle.getBrand());
        System.out.println("Model: " + bicycle.getModel());
        System.out.println("Jumlah Gear: " + bicycle.getGearCount());

        // Membuat objek Skateboard
        Skateboard skateboard = new Skateboard();
        
        System.out.print("Skateboard");
        // Mengatur brand dan model menggunakan metode dari kelas Vehicle
        skateboard.setBrand("Ally Skate");
        skateboard.setModel("Rocket");

        // Mengatur panjang board menggunakan metode dari kelas Skateboard
        skateboard.setBoardLength(54.5);

        // Menampilkan informasi brand, model, dan panjang board
        System.out.println("\nBrand: " + skateboard.getBrand());
        System.out.println("Model: " + skateboard.getModel());
        System.out.println("Panjangnya Board: " + skateboard.getBoardLength() + " ");
    }
}
