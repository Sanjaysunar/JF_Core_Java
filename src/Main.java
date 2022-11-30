public class Main {
    public static void main(String[] args) {
        int five = 5;
        int two = 2;
        int total = five + (five > 3 ? ++two : --two);
        System.out.println(total);
    }
}