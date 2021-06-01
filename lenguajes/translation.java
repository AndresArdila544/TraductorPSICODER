public class Main {
    public static void main(String[] args) {
        int m, amigo1, amigo2, suma_divisores_amigo1, suma_divisores_amigo2;
        System.out.println("Digite el numero hasta donde desea conocer las parejas de numeros amigos ");
        m = System.console().readLine();
        for (amigo1 = 2; amigo1 < m; amigo1 += 1) {
            suma_divisores_amigo1 = amigo(amigo1);
            for (amigo2 = amigo1 + 1; amigo2 <= m; amigo2 += 1) {
                suma_divisores_amigo2 = amigo(amigo2);
                if ((suma_divisores_amigo1 == amigo2) && (suma_divisores_amigo2 == amigo1)) {
                    System.out.println(amigo1 + "" + "  " + "" + amigo2 + "" + " son amigos");

                }

            }

        }

    }

    public static int amigo(int numero) {
        int divisor, suma_divisores = 0;
        for (divisor = 1; divisor < numero; divisor += 1) {
            if (numero % divisor == 0) {
                suma_divisores = suma_divisores + divisor;

            }

        }
        return suma_divisores;

    }
}
