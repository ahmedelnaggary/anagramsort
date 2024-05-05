import java.util.Arrays;

public class Main {
    public static void sortAndDisplay(String[] arr) {
        Arrays.sort(arr, (str1, str2) -> {
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            return new String(charArray1).compareTo(new String(charArray2));
        });

        for (String str : arr) {
            System.out.print(str + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] s = {"listen", "hello", "silent", "hi", "hit", "hello", "listens"};


        sortAndDisplay(s);
    }
}
