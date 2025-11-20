import java.util.Scanner;

public class SumOddNumber {
    public static void main(String[] args) {
        int[] array = readArray();
        sumOddArray(array);

    }
    public static int[] readArray(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt();
        }
        sc.close();
        return array;
        
    }
    public static void sumOddArray(int[] array){
        int osum = 0;
        for(int num : array){
            if(num % 2 != 0){
                osum += num;
            }
        }
       System.out.println("The sum of the odd elements in the array is: " + osum);
    }
}
