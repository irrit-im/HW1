public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]); 
        System.out.println("The first " + x + " Fibonacci numbers are:");

        ////////////////////////////////////////////////////////////////
        // TODO: Replace this code with the correct Fibonacci sequence
        ////////////////////////////////////////////////////////////////
        /// ...
        
        int numOdd = 0;
        int prev = 1;
        int curr = 1;

        for (int i = 0; i < x; i++) {
            int fib;
            if (i == 0 || i == 1) {
                fib = 1;
            } else {
                fib = prev + curr;
                prev = curr;
                curr = fib;
            }

            if (fib % 2 != 0) {
                numOdd++;
            }

            System.out.print(fib);
            if (i < x - 1) {
                System.out.print(" "); // Make sure we don't print a trailing space
            }
        }
        System.out.println();
        ////////////////////////////////////////////////////////////////
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
