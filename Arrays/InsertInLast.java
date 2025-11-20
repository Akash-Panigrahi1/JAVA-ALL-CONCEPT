import java.util.Arrays;

public class InsertInLast {
    public static void main(String[] args) {
        int[] arr={45,57,96,12,78,21};
        int n=64;
        System.out.println("The new Array is ");
        insert(arr, n);
    }
    public static void insert(int[] arr1,int n){
        int[] newArray=new int[arr1.length+1];
        for(int i=0;i<newArray.length-1;i++){
                newArray[i]=arr1[i];
            }
        newArray[newArray.length-1]=n;
        System.out.println(Arrays.toString(newArray));
    }
}
