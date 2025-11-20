import java.util.Arrays;
import java.util.Scanner;

public class ElementCheck {
        static Scanner sc=new Scanner(System.in);
        public static void main(String[] args) {
            int[] arr1=readArray();
            int[] arr2=readArray();
            if(checkElement(arr1, arr2)){
                System.out.println("The Arrays Element are present");
            }
            else{
                System.out.println("The Arrays Element are not present");
            }

        }
     public static int[] readArray(){
        System.out.println("Enter The size of Array ");
        int size=sc.nextInt();
        int[] array=new int[size];
        System.out.println("Enter the Element to the array");
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        return array;
    }
    public static boolean checkElement(int[] arr1,int[] arr2){
       Arrays.sort(arr1);
       Arrays.sort(arr2);
       if (Arrays.equals(arr1,arr2)) {
        return true;
       }
       return false;
    }
}