public class Assignment01Q01 {
    public static void main(String[] args) {
        // TODO: Implement Q01
        for (String arg: args) {
            char firstLetter = arg.charAt(0);
            if ((int)firstLetter % 5 == 0) {
                System.out.println(firstLetter);
            }
        }
    }
}
