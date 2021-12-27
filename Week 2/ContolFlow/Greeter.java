public class Greeter {
    public static void main(String[] args) {
        String first = args[0];
        String second = args[1];
        if (args.length == 2) {
            if (second.equals("M")) {
                System.out.println("Dear Mr. " + first);
            }
            else {
                System.out.println("Dear Mdm. " + first);
            }
        } else {
            System.out.println("Dear " + first + " family");
        }
    }
}