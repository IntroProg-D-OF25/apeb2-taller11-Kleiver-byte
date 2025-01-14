import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner (System.in);
        String nomCliente, clienteap, cedula;
        int valorkw, kw, k =0, opci;
        double valorinm;
        System.out.println("INGRESE SU NOMBRE Y APELLIDO: ");
        nomCliente = tcl.next();
        clienteap = tcl.next();
        System.out.println("INGRESA NUMERO DE CEDULA: ");
        cedula = tcl.next();
        System.out.println("SELECCIONA UNA OPCION: ");
        System.out.println(" CALCULAR EL VALOR DE LA LUZ");
        System.out.println(" CALCULAR PREDIO DE INMUEBLE");
        opci = tcl.nextInt();
        while (k == 0) {            
            if (opci == 1) {
                System.out.println("INGRESE EL VALOR POR KW: ");
                valorkw = tcl.nextInt();
                System.out.println("INGRESE LOS KW CONSUMIDOS: ");
                kw = tcl.nextInt();
                System.out.println("Cliente " + nomCliente + clienteap + " con cédula " + cedula + " debe cancelar el valor de $" + calcularValorLuz(valorkw, kw));
                k = 1;
            }
            else if (opci == 2){
                System.out.println("INGRESE EL VALOR DEL INMUEBLE: ");
                valorinm = tcl.nextDouble();
                System.out.println("Cliente " + nomCliente + clienteap + " con cédula " + cedula + " tiene un bien inmueble valorado en $" + valorinm + " y tiene que pagar de predio $" + calcularPredio(valorinm));
                k = 1;
            }
            else
                System.out.println("SELECCIONE UNA OPCION CORRECTA");
        }
    }
    public static int calcularValorLuz (int valorkw, int kw){
        return (valorkw*kw);
    }
    public static int calcularPredio (double valorinm){
        return (int) (valorinm * 0.2);
    }
}
