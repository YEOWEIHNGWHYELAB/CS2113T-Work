public class comparename{
    public static void main(String[] args) {
        String x = args[0];
        String y = args[1];
        boolean isSame = x.equals(y);
        System.out.println("Words given: " + x + ", " + y);
        System.out.print("They are the same: ");
        System.out.print(isSame);
    }
}