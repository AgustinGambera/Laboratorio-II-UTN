public class Main{
    public static void main (String[] args){
        
        /* 
        DivisionConResta calculator = new DivisionConResta();
        
        int dividendo = 100;
        int divisor = 3;
        
        int resultadoRecursivo = calculator.dividir(dividendo, divisor);
        System.out.println("División recursiva: " + resultadoRecursivo);
        
        int resultadoIterativo = calculator.dividir(dividendo, divisor, true);
        System.out.println("División iterativa: " + resultadoIterativo); */

        System.out.println("Ingrese un numero");
        int num = scanner.nextInt();
        int resultado = sumatoria(num);
        System.out.println("La sumatoria de " + num + " es " + resultado);
    
    }
}
