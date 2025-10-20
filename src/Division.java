public class Division {

    public static int[] division(int[] digits, int divisor) {
        if (divisor == 0) throw new ArithmeticException("Error: Division by zero");

        int[] result = new int[digits.length];
        int rest = 0;

        for (int i = 0; i < digits.length; i++) {
            int current = rest * 10 + digits[i];
            result[i] = current / divisor;
            rest = current % divisor;
        }

        return result;
    }
}