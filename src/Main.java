import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int r;
        double 𝛼;
        double 𝜋 = 3.14;

        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin Yarıçapını Girin: ");
        r = input.nextInt();

        System.out.println("Merkez Açısının Ölçüsünü Girin: ");
        𝛼 = input.nextInt();

        double alan = 𝜋 * r * r;
        double cevre = 2 * 𝜋 * r;
        double daireDilimininAlani = (𝜋 * (r*r) * 𝛼) / 360;


        /* System.out.println("Dairenin Alanı: " + alan);
        System.out.println("Dairenin Çevresi: " + cevre); */
        System.out.println("Daire Diliminin Alanı: " + daireDilimininAlani);

    }
}