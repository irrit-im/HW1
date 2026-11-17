public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;

        /////////////////////////////////////////////
        int digits = Integer.parseInt(args[0]);
        for (int i = 0; i < digits; i++) {
            double summand = (double)1 / (2 * i + 1);
            if (i%2==0) {
                approxPi += summand;
            } else {
                approxPi -= summand;
            }
        }
        approxPi *= 4;
        /////////////////////////////////////////////
        /// ...
        
        
        /////////////////////////////////////////////
        
        System.out.println(approxPi + " " + actualPi);
    }
}
