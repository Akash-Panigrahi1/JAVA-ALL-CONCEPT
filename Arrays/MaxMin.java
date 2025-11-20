import java.util.*;

public class MaxMin {
    public static void main(String[] args) {
        int[] array = readArray();
        findMaxMin(array);
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
    public static void findMaxMin(int[] arr){
        
        for(int i=0;i<arr.length;i++){
            int j=i+1;
            while(j<arr.length){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j++;
            }
        }
        System.out.println("The Minimum element in the array is: " + arr[0]);
        System.out.println("The Maximum element in the array is: " + arr[arr.length-1]);
    }
}
