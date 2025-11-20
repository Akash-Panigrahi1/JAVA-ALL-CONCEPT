import java.util.Scanner;
public class PosetiveNegativeNumberSumArray {
    public static void main(String[] args) 
	{
		int[] arr=readArray();
		posetiveSum(arr);
        negativeSum(arr);
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
	public static void posetiveSum(int[] arr){
		int psum=0;
		int i=0;
		while (i<arr.length)
		{
            if (arr[i]>0) {
                psum+=arr[i];
            }
            i++;
		}
		System.out.println("The Posetive number sum present in the array is "+psum);
	}
    public static void negativeSum(int[] arr){
        int nsum=0;
        for(int num : arr){
            if(num < 0){
                nsum += num;
            }
        }
         System.out.println("The Negative number sum present in the array is "+nsum);
    }
}
