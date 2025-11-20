import java.util.Arrays;

public class InsertSpecific {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,60};
        int num=80;
        int location =2;
        insertSpecific(arr, num, location);
    }
    public static void insertSpecific(int[] arr,int n,int loc){
        int[] newArray=new int[arr.length+1];
        for(int i=0;i<loc;i++){
            newArray[i]=arr[i];
        }
        newArray[loc]=n;
        for(int j=loc+1;j<newArray.length;j++){
            newArray[j]=arr[j-1];
        }
        System.out.println("The new Array is "+Arrays.toString(newArray));
    }
}
