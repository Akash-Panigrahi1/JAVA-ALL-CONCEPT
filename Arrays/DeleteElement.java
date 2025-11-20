import java.util.Arrays;

public class DeleteElement {
    public static void main(String[] args) {
        int[] arr={80,50,40,30,10,60,90};
        int loc=-1;
        deleteElement(arr,loc);
    }
    public static void deleteElement(int[] arr,int loc){
        int[] newArray=new int[arr.length-1];
        int j=0;
        if(loc<0 || loc>=arr.length){
            System.out.println("Invalid location");
            System.out.println("Array remains the same:"+Arrays.toString(arr));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(i==loc){
                continue;
            }
            newArray[j++]=arr[i];
        }
        System.out.println("Array after deletion:"+Arrays.toString(newArray));
    }
}
