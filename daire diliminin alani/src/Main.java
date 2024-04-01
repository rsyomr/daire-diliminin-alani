import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // değişkenleri tanımla

        double alan, r, pi = 3.14, aci;
        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin Yarıçapını giriniz : ");
        r = input.nextDouble();
        System.out.print("Merkez Açı Ölçüsü Giriniz : ");
        aci = input.nextDouble();
        alan = (pi * (r * r) * aci) / 360;
        System.out.print("Daire Diliminin Alanı : " + alan);




    }
}