public class SumaEnterosWhile {

        public static void main(String[] args) {
            int suma = 0;
            int i = 1;

            while (i <= 10) {
                suma += i;
                i++;
            }

            System.out.println("La suma de los números enteros del 1 al 10 es: " + suma);
        }
    }
