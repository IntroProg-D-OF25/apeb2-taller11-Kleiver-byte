import java.util.Scanner;
public class Ejercicio3 {
    static double not1, not2, not3, not4;
    public static void main(String[] args) {
        Scanner tcl = new Scanner (System.in);
        System.out.println("INGRESE  NOTA 1");
        not1 = tcl.nextDouble();
        System.out.println("INGRESE  NOTA 2");
        not2 = tcl.nextDouble();        
        System.out.println("INGRESE  NOTA 3");
        not3 = tcl.nextDouble();        
        System.out.println("INGRESE  NOTA 4");
        not4 = tcl.nextDouble();       
        verificacion();
        System.out.println("SU PROMEDIO ES: " + generarPromedio(not1, not2, not3, not4) + " pts " + "SU PROMEDIO ES " + mostrarCalificacion(not1, not2, not3, not4));
    }
    public static void verificacion (){
        if (not1 > 10) 
            not1 = 10;
        else if (not1 < 0)
            not1 = 0;
        if (not2 > 10) 
            not2 = 10;
        else if (not2 < 0)
            not2 = 0;
        if (not3 > 10) 
            not3 = 10;
        else if (not3 < 0)
            not3 = 0;
        if (not4 > 10) 
            not4 = 10;
        else if (not4 < 0)
            not4 = 0;        
    }
    public static String mostrarCalificacion (double nota1, double nota2, double nota3, double nota4){
        String calificacion = ""; 
        double promedio = generarPromedio(nota1, nota2, nota3, nota4);
        if (promedio <= 5)
            calificacion = "REGULAR";
        else if (promedio <= 8)
            calificacion = "BUENO";
        else if (promedio <= 9)
            calificacion = "MUY BUENO";
        else
            calificacion = "SOBRESALIENTE";
        return calificacion;
    }    
    public static double generarPromedio (double nota1, double nota2, double nota3, double nota4){
        return ((nota1 + nota2 + nota3 + nota4) / 4);
    }            
}
