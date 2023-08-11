import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hola, mundo.");
        System.out.println("Ingrese 3 números enteros, uno por uno.");
        int max=0;
        int med=0;
        int min=0;
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();

        if (a>=b && a>=c){
            max = a;

            if (b>=c) {
                med = b;
                min = c;
            } else {
                med = c;
                min = b;
            }
        }

        if (b>=a && b>=c){
            max = b;

            if (a>=c) {
                med = a;
                min = c;
            }   else {
                med = c;
                min = a;
            }
        }

        if (c>=a && c>=b){
            max = c;

            if (a>=b) {
                med = a;
                min = b;
            }   else {
                med = b;
                min = a;
            }
        }

        System.out.println("Sus números ordenados: "+max+" "+med+" "+min);
    }
}
