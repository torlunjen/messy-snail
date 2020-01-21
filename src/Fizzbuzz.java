public class Fizzbuzz {

    public String compute(Integer num) {
        if (num != 0) {
            if ( num % 3 == 0) {
                if ( num % 5 == 0) {
                    return "FizzBuzz";
                }
                return "Fizz";
            }
            else if ( num % 5 == 0) {
                return "Buzz";
            }

        }
        return num.toString();
    }

    public void compute1To100() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(compute(i));
        }
    }

    public static void main(String[] args) {
        Fizzbuzz fizzbuzz = new Fizzbuzz();
        fizzbuzz.compute1To100();
    }
}
