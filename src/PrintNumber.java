public class PrintNumber {
    public static void main(String[] args) {

        for(int j = 1; j <= 100; j++){
            if (j % 3 ==0){
                System.out.println("Fizz");
            } else if (j % 5 ==0){
                System.out.println("Buzz");
            } else if (j % 4 ==0) {
                System.out.println("FizzBuzz");
                
            }else System.out.println(j);

        }
        }



    }

