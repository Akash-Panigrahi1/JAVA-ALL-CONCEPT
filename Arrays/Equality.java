import java.util.Scanner;

public class Equality {
    static  Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        int[] Array1=readArray();
        int[] Array2=readArray();
        if(checkArrayEquality(Array1, Array2)){
            System.out.println("The Both Array are Equals");
        }
        else{
            System.out.println("The Both Array are not Equal");
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
    public static boolean checkArrayEquality(int[] arr1,int[] arr2){
        if(arr1.length!=arr2.length){
            return false;
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]==arr2[i]){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
