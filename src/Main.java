public class Main {
    public static void main(String[] args) {
        double ticket = 105;
        int mileprice = 20;
        double bonus = ticket / mileprice;
        int result = (int)Math.floor(bonus);
        System.out.println(result);
    }
}