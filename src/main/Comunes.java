public class Comunes {
    public static String comunes(int[] nums1, int[] nums2) {
        String comunes = "";
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    comunes += nums1[i] + " ";
                    break;
                }
            }
        }
        return comunes;
    }

    public static void main(String[] args) {

    }
}
