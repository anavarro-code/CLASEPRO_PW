import java.util.Scanner;

public class Operadores {

    public void operadoresAritmeticos(){

        System.out.println("Explicación de los operadores aritmeticos");
            // Unarios -> solo necesitan un operando
            int operandoUno = 5;
            operandoUno++; // operandoUno = operandoUno + 1
            operandoUno++; // operandoUno = operandoUno + 1
            System.out.println("Despues de incrementar " +operandoUno);
            operandoUno--; // operandoUno = operandoUno -1;
            System.out.println("Despues de decrementar " +operandoUno);

            operandoUno= -operandoUno; // Cambia el signo al numero = -7

        // Binarios
        int operandoDos = 5;

        int suma = operandoUno + operandoDos;
        System.out.println("El resutaldo de la suma es: " + suma);

        int resta = operandoUno -  operandoDos;
        System.out.println("El resultado de la resta es: " + resta);

        int multiplicacion = operandoUno * operandoDos;
        System.out.println("El resultado de la multiplicación es: " + multiplicacion);

        double division = (double) operandoUno / operandoDos;
        System.out.println("El resultado de la división es: " + division); //(Impresion por pantalla normal)

        // Impresion por pantalla "formateada (con %.2f) para que muestre dos decimales
        // Tambien cambia Println por Printf
        //System.out.printf("El resultado de la división es: %.2f",division);

        int modulo = operandoUno % operandoDos; // El resto de la division
        System.out.println("El resto de la division es: " + modulo);

    }

    public void operadoresAsignacion (){
        int operandoUno = 6;
        operandoUno += 6; // operandoUno = operandoUno +6; // 12
        operandoUno -=3; // 9
        operandoUno *=2; // 18
        operandoUno /=2; // 9
        operandoUno %=3; // 0
    }

    public void operadoresRelacionales (){
        int numeroUno = 4;
        int numeroDos = 7;

        boolean resultado = numeroUno > numeroDos; // false
        resultado = numeroUno >= numeroDos; // false
        System.out.println("El resultado de >= es " +resultado);
        resultado = numeroUno < numeroDos; // true
        System.out.println("El resultado de < es " +resultado);
        resultado = numeroUno <= numeroDos; // true
        System.out.println("El resultado de <= es " +resultado);
        resultado = numeroUno == numeroDos; // false
        System.out.println("El resultado de == es " +resultado);
        resultado = numeroUno != numeroDos; //true
        System.out.println("El resultado de != es " +resultado);




    }

    public void operadoresLogicos(){
        int numeroUno = 4;
        int numeroDos = 10;
        int numeroTres = 17;

                                  //true && true && true && true -> true
        boolean resultadoLogicoAND = numeroUno>1 && numeroDos<11 && numeroDos != numeroTres && numeroTres %2 == 0;
                                //true && true && true && false -> false
        System.out.println("El resultado Lógico del AND es: " +resultadoLogicoAND);

        boolean resultadoLogicoOR = numeroUno !=10 || numeroDos>10 || numeroTres<numeroDos || numeroDos%2 != 0;
                                // true || false || false || false -> true
        System.out.println("El resultado de la Lógica OR es: " +resultadoLogicoOR);

        boolean resultadoLogicoComb = numeroUno <10 || numeroTres >0 || numeroDos !=9 && numeroUno >0;
                                     // true || true ||true && true
        System.out.println("El resultado logico del OR y AND es: " +resultadoLogicoComb);

        numeroTres = 20;
        numeroDos = 10;
        numeroUno = 0;

        boolean resultadoTotal = numeroUno >= 0 && numeroDos <20 && false; //false
        System.out.println("El resultado total es: " +resultadoTotal);
        boolean resultadoTotalInv = !resultadoTotal;
        System.out.println("El resultado total inverso es: " +resultadoTotalInv);
    }

    public void evaluarCandidato(){

        Scanner lectorTeclado = new Scanner(System.in);
        System.out.println("Dime tu Nombre y Apellido");
        String nombreApellido = lectorTeclado.nextLine();
        System.out.println("Dime tu edad");
        int edad = lectorTeclado.nextInt();
        System.out.println("Dime que salario quieres cobrar");
        double salario = lectorTeclado.nextDouble();
        System.out.println("Tienes experiencia");
        boolean experiencia = lectorTeclado.nextBoolean();

        //edad inferior a 40 y sueldo < 40.000 y experiencia
        boolean resultadoEvaluacion = edad<40 && salario<40000 && experiencia;
        System.out.println("El resultado de la evaluación es que el candidato es: " +resultadoEvaluacion);

        lectorTeclado.close();
    }

}
