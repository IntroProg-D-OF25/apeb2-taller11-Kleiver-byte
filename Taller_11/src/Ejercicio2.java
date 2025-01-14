import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner (System.in);
        int h = 0, i = 0, opciarea, base, altura;
        do {            
            do {            
                System.out.println("SELECCIONE UNA OPCION: ");
                System.out.println("1. AREA DE CUADRADO");
                System.out.println("2. AREA DE TRIANGULO");
                System.out.println("3. AREA DE RECTANGULO");
                opciarea = tcl.nextInt();
                switch (opciarea)  {
                    case 1:
                        System.out.println("INGRESAR LA BASE: ");
                        base = tcl.nextInt();
                        System.out.println("AREA DEL CUADRADO: " + obtenerAreaCuadrado(base));
                        h = 1;
                        break;
                    case 2:
                        System.out.println("INGRESAR LA BASE Y LA ALTURA: ");
                        base = tcl.nextInt();
                        altura = tcl.nextInt();
                        System.out.println("AREA DEL TRIANGULO: " + obtenerAreaTriangulo(base, altura));                    
                        h = 1;
                        break;
                    case 3:
                        System.out.println("INGRESAR LA BASE Y LA ALTURA: ");
                        base = tcl.nextInt();
                        altura = tcl.nextInt();
                        System.out.println("AREA DEL RECTANGULO: " + obtenerAreaRectangulo(base, altura));                    
                        h = 1;
                        break;
                    default:
                        System.out.println("____________________________");
                        System.out.println("INGRESAR UNA OPCION CORRECTA");
                        System.out.println("----------------------------");
                        System.out.println("");
                }
            }  while (h == 0);
            System.out.println("INTETAR DE NUEVO¿?");
            System.out.println("1. SI / 2. NO");
            i = tcl.nextInt();
            System.out.println("------------------");
        } while (i == 0);
    }
    public static int obtenerAreaCuadrado(int base) {
        return (base * base);
    }
    public static int obtenerAreaTriangulo(int base, int altura) {
        return ((base * altura) / 2);
    }
    public static int obtenerAreaRectangulo(int base, int altura) {
        return (base * altura);
    }
}
