public class DivisionConResta{
     // Método para realizar la división utilizando recursión
    public int dividir(int dividendo, int divisor) {
        return dividirRecursivo(dividendo, divisor);
    }

    private int dividirRecursivo(int dividendo, int divisor) {
        if (dividendo < divisor) {
            return 0;
        } else {
            return 1 + dividirRecursivo(dividendo - divisor, divisor);
        }
    }

    // Método para realizar la división utilizando iteración
    public int dividir(int dividendo, int divisor, boolean iterativo) {
        if (iterativo) {
            return dividirIterativo(dividendo, divisor);
        } else {
            return dividir(dividendo, divisor); // Llamada al método recursivo por defecto
        }
    }

    private int dividirIterativo(int dividendo, int divisor) {
        int cociente = 0;
        while (dividendo >= divisor) {
            dividendo -= divisor;
            cociente++;
        }
        return cociente;
    }
}