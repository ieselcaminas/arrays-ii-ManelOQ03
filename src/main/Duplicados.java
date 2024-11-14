public class Duplicados {
    public static String duplicados(int[] nums1) {
        String duplicados = "";
        for (int i = 0; i < nums1.length; i++) {
            for (int j = i + 1; j < nums1.length; j++) {
                if (nums1[i] == nums1[j]) {
                    duplicados += nums1[i] + " ";
                    break;
                }
            }
        }
        return duplicados;
    }
    public static void main(String[] args) {

    }
}
