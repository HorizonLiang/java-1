public class TestFunction {
    public static void main(String[] args) {
        int[] a = {1,2};
        int[] b = a;
        b[1] = 5;
        System.out.println(a[1]);
    }
}
