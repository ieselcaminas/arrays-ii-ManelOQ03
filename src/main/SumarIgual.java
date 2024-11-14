public class SumarIgual {
    public static String sumaIgual(int[] numeros, int igual){
        String resultado = "";
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] + numeros[j] == igual) {
                    resultado += "[" + numeros[i] + "+" +numeros[j] + "]";
                }
            }
        }
        return resultado;

    }

    public static void main(String[] args) {
        int[] numeros = {5,6,7,3,4};
        int igual = 10;

        System.out.println(sumaIgual(numeros, igual));
    }
}
