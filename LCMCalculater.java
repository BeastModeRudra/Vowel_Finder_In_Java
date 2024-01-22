public class LCMCalculater {

        private static int gcd(int a, int b) {
            if (b == 0) {
                return a;
            }
            return gcd(b, a % b);
        }
    
        
        private static int lcm(int a, int b) {
            return (a * b) / gcd(a, b);
        }
        private static int findLCM(int[] numbers) {
            if (numbers.length == 0) {
                throw new IllegalArgumentException("Array must not be empty");
            }
    
            int result = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                result = lcm(result, numbers[i]);
            }
    
            return result;
        }
    
        public static void main(String[] args) {
            int[] numbers = {4, 6, 8, 16};
    
            try {
                int lcmResult = findLCM(numbers);
                System.out.println("LCM of the numbers in the array: " + lcmResult);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    

