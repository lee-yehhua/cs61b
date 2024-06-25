public class ForMax {
    /** Returns the maximum value from m using a for loop. */
    public static int forMax(int[] m) {
        int res = 0,len = m.length;
        for (int i=0;i<len;i++){
            if(m[i]>=res){
                res = m[i];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
        System.out.println(forMax(numbers));
    }
}
