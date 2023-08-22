public class Main{
    public static void main (String[] args){
        DivisionConResta division = new DivisionConResta();
        int dividendo = 10;
        int divisor = 3; 
        int cociente = division.dividir(dividendo, divisor, false);
        System.out.println("Cociente: "+cociente);
        
        

    }
}
