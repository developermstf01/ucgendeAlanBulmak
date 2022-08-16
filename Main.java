import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float a,b,c;

        System.out.print("Birinci kenar uzunluğu: ");
        a = input.nextInt();
        System.out.print("İkinci kenar uzunluğu: ");
        b = input.nextInt();
        System.out.print("Üçüncü kenar uzunluğu: ");
        c = input.nextInt();

        double cevre = (a+b+c);

        double alan = Math.sqrt(cevre/2*(cevre/2-a)*(cevre/2-b)*(cevre/2-c));

        System.out.print("Üçgenin alanı: "+alan);
    }
}