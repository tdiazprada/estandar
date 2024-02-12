import java.util.Scanner;

public class Main {

    static int saldo=0;
    public static void main(String[] args) {



        menu();
    }

        public static void menu() {
            int opcion;


            Scanner leer = new Scanner(System.in);

            String menu = "\n\n*****MENU DE OPCIONES***** \n"+
                    "1. Ingresar dinero \n"+
                    "2. Ingresar gastos \n"+
                    "3. Consultar saldo \n" +
                    "4. Salir \n";
            System.out.println(menu);

            System.out.println("Digite su opcion: ");
            opcion = leer.nextInt();

            switch(opcion) {
                case 1: agregarDinero();
                    break;
                case 2: agregarGastos();
                    break;
                case 3: consultarSaldo();
                    break;
                case 4: break;

            }
        }
        public static void agregarDinero() {
            int dinero;

            Scanner leer = new Scanner(System.in);
            System.out.println("¿Cuanto dinero desea agregar a la cuenta?");
            dinero=leer.nextInt();
            saldo=saldo+dinero;
            System.out.println("***Dinero agregado a la cuenta***");

            menu();
        }

        public  static void agregarGastos() {
            int gasto;

            Scanner leer = new Scanner(System.in);
            System.out.println("Agregar gasto");
            gasto=leer.nextInt();
            saldo=saldo-gasto;
            System.out.println("Gastos registrados");

        menu();
        }

        public static void consultarSaldo() {

            System.out.println("El saldo de su cuenta actualmente es : "+saldo);

        menu();
        }
    }


