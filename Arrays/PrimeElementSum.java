import java.util.Scanner;

public class PrimeElementSum {
    public static void main(String[] args) {
        int[] array = readArray();
        System.out.println("The sum of prime number in array is "+sumOfPrimeElements(array));
    }
    public static int[] readArray(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        scanner.close();
        return array;
    }
    public static int sumOfPrimeElements(int[] array){
        int sum = 0;
        for(int num : array){
            if(isPrime(num)){
                System.out.println("The prime element is: " + num);
                sum += num;
            }
        }
        return sum;
    }
    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

}
