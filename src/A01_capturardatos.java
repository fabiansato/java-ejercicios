import java.util.Scanner; //se tiene que importar scanner para poder obtener datos

public class A01_capturardatos {
    
	 public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //hay que llamar a scanner y guaradr el dato en unavariable input

        System.out.print("Ingres� tu nombre: ");
        String nombre = input.next(); //es input next cuando es string, cuando es int es nextInt
        System.out.println("Hola " + nombre + " bienvenido al mundo de la programaci�n");

        // closing the scanner object
        input.close();

    }
}
    