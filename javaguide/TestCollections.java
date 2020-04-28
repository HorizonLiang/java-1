import java.util.*;

public class TestCollections {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();

        List<String> list = new ArrayList<>();

        Set<String> set = new HashSet<>();
//        Arrays.binarySearch()

        int size = 10;
        size = size + (size >>> 12);
        System.out.println(size);
    }
}
