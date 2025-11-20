import java.util.Arrays;

public class DeleteAllElement {
    public static void main(String[] args) {
        int[] arr={80,50,40,30,10,60,90,30,30};
        int n=30;
        deleteAllElement(arr,n);
    }
    public static void deleteAllElement(int[] arr,int n){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                count++;
            }
        }
        if(count==0){
            System.out.println("Element not found");
            System.out.println("Array remains the same:");
            System.out.println(Arrays.toString(arr));
            return;
        }
        int[] newArray=new int[arr.length-count];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                continue;
            }
            newArray[j++]=arr[i];
        }
        System.out.println("Array after deleting all occurrences of "+n+":");
        System.out.println(Arrays.toString(newArray));
    }
}
