import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        String nombreYApellido = "Hernan Xeneize";
        String tipoDecuenta =  "Corriente";
        int numeroDeCuenta = 1545856068;
        double saldo = 150500.99;
        int opcion = 0;
       // int clave = 36109011;

        String inicio = "Por favor ingrese su contraseña ";
        System.out.println(inicio);
        /*Scanner teclado = new Scanner(System.in);
        if (clave.equals(clave)) {
            System.out.println("Acceso concedido");
        }else{
            System.out.println("Contraseña incorrecta. Acceso denegado");
        }*/


        System.out.println("******************************************************");
        System.out.println("\nNombre del cliente: " +  nombreYApellido);
        System.out.println("\nTipo de cuenta: " + tipoDecuenta);
        System.out.println("\nNumero de cuenta: " + numeroDeCuenta);
        System.out.println("\nSu saldo acualmente es de: " + saldo);
        System.out.println("\n******************************************************");


        String menu = """
                Ingrese la opreación a realizar...
                1 - Consultar saldo
                2 - Retirar
                3 - Depocitar
                9 - Salir
                """;
        Scanner teclado = new Scanner(System.in);

        while (opcion != 9){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Su saldo es de " + saldo);
                    break;

                case 2:
                    System.out.println("¿Cual es el valor que desea rtirar?");
                    double valorARetirar = teclado.nextDouble();
                    if (saldo < valorARetirar) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo -= valorARetirar;
                        System.out.println("Su saldo es " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("¿Cual es el monto que desea depocitar?");
                    double valorADepocitar = teclado.nextDouble();
                    saldo += valorADepocitar;
                    System.out.println("su saldo es de:" + saldo);
                    break;

                case 9:
                    System.out.println("Gracias por utilizar nuestro servicio G6");
                    break;

                default:
                    System.out.println("Opcion no valida");


            }


            }


        }



    }

