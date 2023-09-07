import java.util.Scanner;
public class EjercicioResuelto10 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el numero de inscripcion: ");
        int nInscripcion=entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese el nombre: ");
        String nombre=entrada.nextLine();
        System.out.println("Ingrese su patrimonio sin puntos ni comas: ");
        double patrimonio=entrada.nextDouble();
        System.out.println("Ingrese su estrato: ");
        int estrato=entrada.nextInt();
        double matricula=50000;
        if(patrimonio>2000000 && estrato>3){
            matricula+=patrimonio*0.03;
        }
        System.out.println("Su numero de inscripción es: "+nInscripcion);
        System.out.println("Su nombre es: "+nombre);
        System.out.println("El valor de su matricula es: "+matricula);

    }
}
