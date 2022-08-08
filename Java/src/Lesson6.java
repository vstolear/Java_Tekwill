import java.util.Scanner;
public class Lesson6 {
/*
Scrieti o clasa cu metoda main in ea. Definiti o variabila de tip numeric intreg.
Daca valoare variabilei este un numar intreg si mai mare ca 10, atunci printati mesajul "Numarul este par."
Daca numarul este impar si mai mic de 15, atunci printati un mesaj "Numarul este impar".
 */


        public static void main(String[] args) {

          /*  Scanner reader = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = reader.nextInt();

            if(num % 2 == 0 && num > 10)
                System.out.println(" Numarul este par");
            else  if (num % 2 == 1 && num < 15)
                System.out.println(" Numarul este impar");
            else {
                System.out.println(" Mai incearca o data");
            }
            */

/*
        /*int num = 5;
        // nr intreg par > 10
        if (num % 2 == 0 && num > 10) {
            System.out.println(" Numarul este par");
        } else if (num % 2 != 0 && num <= 15) {
            System.out.println(" Numarul este impar");
        }
*/
            int num = 5;
            // nr intreg par > 10
            if (num % 2 == 0 && num > 10) {
                System.out.println(" Numarul este par");
            }
            if (num % 2 != 0 && num <= 15) {
                System.out.println(" Numarul este impar");
            }


        }
    }

