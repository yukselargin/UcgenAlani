import java.util.Scanner;
public class Alan {
    public static void main(String[] args){
        int a,b,c,u;
        double alan;
        Scanner kenar= new Scanner(System.in);

        System.out.print("İlk kenarı giriniz:");
        a= kenar.nextInt();
        System.out.print("İkinci kenarı giriniz:");
        b= kenar.nextInt();
        System.out.print("Üçüncü kenarı giriniz:");
        c= kenar.nextInt();

        u= (a+b+c)/2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.print("Üçgenin Alanı:"+alan);
    }
}
