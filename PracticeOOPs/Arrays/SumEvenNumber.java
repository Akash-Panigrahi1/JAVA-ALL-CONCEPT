import java.util.Scanner;

public class SumEvenNumber {
    public static void main(String[] args) {
        int[] array = readArray();
        sumEvenArray(array);

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
    public static void sumEvenArray(int[] array){
        int esum = 0;
        for(int num : array){
            if(num % 2 == 0){
                esum += num;
            }
        }
       System.out.println("The sum of the even elements in the array is: " + esum);
    }
}
