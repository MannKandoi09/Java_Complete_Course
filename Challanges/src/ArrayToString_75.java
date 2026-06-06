public class ArrayToString_75 {
    public static void main(String[] args) {
        String[] arr = new String[]{
                "Mann Kandoi", "Future Java Developer","Never Loose Hope"
        };

        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str).append(" ");
        }
        System.out.println(sb);
    }
}
