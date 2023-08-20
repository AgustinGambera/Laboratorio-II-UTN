public class SumatoriaRecursiva {
    public static int sumatoria(int num) {
        
        if (num == 0) {
            return 0;
        }
        return num + sumatoria(num - 1);
        }
    }

  