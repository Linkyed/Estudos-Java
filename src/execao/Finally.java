package execao;

import java.util.Scanner;

public class Finally {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        try {
            System.out.println("OIOIOIO");

            System.out.println(7/ entrada.nextInt());

            entrada.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finalmente...");
            entrada.close();
        }
        System.out.println("Fim.");
    }
}
