import java.util.Scanner;

public class quiz {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("ingrese el numero entero limite");
    int lim = input.nextInt();
    if (lim <= 0) {
      System.out.println("numero no valido");
      input.close();
      return;
    }
    for (int k = 1; k <= lim; k++) {
      for (int j = 1; j <= k; j++) {
        if (j % 2 == 1) {
          System.out.print(k);
        } else {
          System.out.print(k * -1);
        }
        if (j < k) {
          System.out.print(" ");
        }
      }
      System.out.println();
    }

  }
}
