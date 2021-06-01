public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int m, amigo1, amigo2, suma_divisores_amigo1, suma_divisores_amigo2;
        boolean f;
        double r;
        String ca;
        char c;
        System.out.println("Digite el numero hasta donde desea conocer las parejas de numeros amigos ");
        m = scanner.nextInt();
        f = scanner.nextBoolean();
        r = scanner.nextDouble();
        ca = scanner.next();
        c = scanner.next().charAt(0);
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
