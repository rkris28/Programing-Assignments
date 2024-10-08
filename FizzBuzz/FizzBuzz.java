package FizzBuzz;
class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) { // goes through all numbers from 1-100
            // check if the number is divisible by both 3 and 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // check if the number is divisible by 3
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // check if the number is divisible by 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // print the number if not divisible by 3 or 5
            else {
                String num = String.valueOf(i);
                if (num.contains("3")) { // contains 3
                    num = num.replace("3", "Fizz"); // replace the 3 with fizz
                }
                System.out.println(num);
            }
        }
    }
}
