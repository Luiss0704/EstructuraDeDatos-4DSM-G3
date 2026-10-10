public class Recursividad {

    public static void saludo1(int n) {
        if (n == 1) {       //  Caso base
            System.out.println("Hola! Saludo " + n);
        } else {        //  Caso general
            saludo1(n - 1);
            System.out.println("Hola! Saludo " + n);
        }
    }


    public static void saludo2(int n) {
        if (n != 1) {       //  Caso general
            System.out.println("Hola! Saludo " + n);
            saludo2(n - 1);
        } else {        //  Caso base
            System.out.println("Hola! Saludo " + n);
        }
    }


    public static void saludo3(int n) {
        if (n == 0) {
            return;
        }

        System.out.println("Hola! Saludo " + n);
        saludo3(n - 1);
    }




    public static int sumarNumeros(int n) {
        if (n > 0) {
            System.out.println(n);
            int suma = n + sumarNumeros(n - 1);
            return suma;
        }

        return 0;
    }

    public static int factorialConMulti(int n) {
        if (n > 0) {
            System.out.println(n);
            int fact = n * factorialConMulti(n - 1);
            return fact;
        }

        return 1;
    }


    public static int multiConSumas(int x, int y) {
        if (y > 0) {
            int multi = x + multiConSumas(x, y - 1);
            System.out.println(x + " x " + y + " = " + multi);
            return multi;
        }

        return 0;
    }


    public static int potenciaConMulti(int x, int y) {
        if (y > 0) {
            int power = x * potenciaConMulti(x, y - 1);
            System.out.println(x + " ^ " + y + " = " + power);
            return power;
        }

        return 1;
    }
}
