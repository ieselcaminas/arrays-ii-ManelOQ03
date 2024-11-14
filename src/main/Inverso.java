import java.util.Arrays;

public class Inverso {
    public static int[] alReves(int[]numeros) {
        int[] resultado = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            resultado[numeros.length -i -1]= numeros[i];
        }
        return resultado;
    }
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4};
        System.out.println(Arrays.toString(alReves(numeros)));
    }
}
