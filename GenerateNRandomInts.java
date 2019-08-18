public class GenerateNRandomInts {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < Integer.parseInt(args[0]); i++) {
                System.out.println(Math.round(Math.random()*10));
            }
            System.out.println("quit");
        } catch (NumberFormatException n) {
            System.out.println("[invalid arg in GenerateNRandomInts]");
        }
    }
}
