import java.util.Arrays;

public class InsertInFast {
    public static void main(String[] args) {
        int[] arr={12,14,16,20,54,84,20};
        int n=95;
        System.out.println("The new array is");
        firstInsert(arr, n);
    }
    public static void firstInsert(int[] arr,int n){
        int[] newArray=new int[arr.length+1];
        newArray[0]=n;
        for(int i=1;i<newArray.length;i++){
            newArray[i]=arr[i-1];
        }
        System.out.println(Arrays.toString(newArray));
    }
}
