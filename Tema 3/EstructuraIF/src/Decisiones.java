

public class Decisiones {

    public void estructuraIF(int nota) {
        System.out.println("Vamos a explicar la estructura IF");

        if (nota >= 5) {
            System.out.println("El examen está aprobado");
        } else {
            System.out.println("El Examen está suspenso");
        }
        System.out.println("Terminando Evaluación");
    }


    public void estructuraIFELSEIF(double nota) {

        // 0 desastroso
        // 1 - 3.99 mal
        // 4 - 4.99 raspado
        // 5 - 7.99 bien
        // 8 - 8.99 notable
        // 9 - 9.99 sobresaliente
        // 10 matricula
        System.out.println("Iniciando la evaluacion del examen");
        // 0 - 10
        if (nota >= 0 && nota <= 10) {
            if (nota > 0 && nota < 1) {
                System.out.println("Examen desastroso");
            } else if (nota < 4) {
                System.out.println("Examen mal");
            } else if (nota < 5) {
                System.out.println("Examen suspenso raspado");
            } else if (nota < 8) {
                System.out.println("Examen bien");
            } else if (nota < 9) {
                System.out.println("Examen notable");
            } else if (nota < 10) {
                System.out.println("Examen sobresaliente");
            } else {
                System.out.println("Examen de matricula");
            }
        } else {
            System.out.println("Rango incorrecto");
        }


    }
}
