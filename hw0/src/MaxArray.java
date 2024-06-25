public class MaxArray {
    /** Returns the maximum value from m. */
    public static int max(int[] m) {
        int res = 0, i = 0;
        while(i < m.length){
            if(m[i]>=res){
                res = m[i];
            }
            i++;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(max(numbers));
    }
}
