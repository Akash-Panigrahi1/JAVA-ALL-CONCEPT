import java.util.Scanner;

public class FactorialSumArray {
    public static void main(String[] args) {
        int[] arr=readArray();
        factorialSum(arr);
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
    public static void factorialSum(int[] arr){
        int fsum=0;
        for(int i=0;i<arr.length;i++){
            fsum+=factorial(arr[i]);
        }
        System.out.println("The sum of factorials of the elements in the array is: " + fsum);
    }
    public static int factorial(int num){
        int f=1;
        for(int i=1;i<=num;i++){
            f=f*i;
        }
        System.out.println("The factorial of "+num+" is "+f);
        return f;
    }
}
