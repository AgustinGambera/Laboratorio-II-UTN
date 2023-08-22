public class DivisionConResta{

     // Método para realizar la división utilizando enfoque iterativo
    public int dividir(int dividendo, int divisor) {
        int contador = 0;

        if (divisor == 0){
            throw new ArithmeticException("No se puede dividir por cero.");
        }

        while (dividendo >= divisor){
        dividendo -= divisor;
        contador++;
        }
        int resto = (dividendo);
        return contador;
    }

    public int dividir(int dividendo, int divisor, boolean recursivo) {
        // Caso base: cuando el dividendo es menor que el divisor, el cociente es 0
        if (dividendo < divisor) {
            return 0;
        }
        return 1 + dividir(dividendo - divisor, divisor);
    }
}
