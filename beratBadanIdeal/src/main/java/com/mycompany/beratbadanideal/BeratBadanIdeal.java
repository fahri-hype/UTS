
package com.mycompany.beratbadanideal;
import java.util.Scanner;
public class BeratBadanIdeal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jenisKelamin, hasil;
        float berat, tinggi, bmi, meter;
        double broca;
        System.out.println("=========================================");
        System.out.println("Program Java Menghitung Berat Badan Ideal");
        System.out.println("=========================================");
        System.out.println("1. Laki-Laki");
        System.out.println("2. perempuan");
        System.out.println("-----------------------------------------");
        System.out.print("Masukkan jenis Kelamin = ");
        jenisKelamin = input.nextInt();
        System.out.print("Masukkan Berat Badan = ");
        berat = input.nextFloat();
        System.out.print("Masukkan Tinggi Badan = ");
        tinggi = input.nextFloat();
        meter = tinggi / 100;
        bmi = (berat/(meter * meter));
        System.out.print("BMI = "  + bmi + " " );
        if(bmi < 18.5){
           System.out.print("Kurus");
        }else if(bmi <22.9){
            System.out.print("Normal");
    }else if(bmi <24.9){
        System.out.println("Overweight");
    }else {
        System.out.println("Obesitas");{
    }
        System.out.println("-------------------------------");
        broca = switch (jenisKelamin) {
                case 1 -> (tinggi - 100)-(0.10 * (tinggi - 100));
                case 2 -> (tinggi - 100)-(0.15 * (tinggi - 100));
                default -> 0;
            };
     hasil = (int)broca;
     System.out.println("Berat Badan Ideal Anda Menurut Broca = " + hasil + "kg");
     }
    }   
}
