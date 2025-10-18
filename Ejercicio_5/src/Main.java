public class Main {

    public static void main (String[] args){

        final String aplicacion = "MiApp";
        final String version = "1.0.0";
        final float pi = 3.14159f;
        String usuario = "Laura";
        int nivel = 1;
        int puntuacion = 0;

        System.out.println("Apliación: " + aplicacion);
        System.out.println("Versión: " +version);
        System.out.println("Valor de pi: " +pi);
        System.out.println("Usuario actual: "+ usuario);
        System.out.println("Nivel: " +nivel);
        System.out.println("Puntuación: " + puntuacion);
        usuario = "Miguel";
        nivel = 2;
        puntuacion = 150;

        System.out.println("Usuario actualizado: " + usuario);
        System.out.println("Nivel actualizado: " +nivel);
        System.out.println("Puntuación actualizada: " +puntuacion);
    }

}
