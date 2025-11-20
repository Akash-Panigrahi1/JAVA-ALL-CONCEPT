import java.util.Scanner;

public class FirstOccurance {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = readArray();
        fromold(array);
        writelnew(array);
    }
    public static int[] readArray(){
       
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public static int toNew(){
        
        System.out.println("Enter the new number that you want to convert");
        int newNum=scanner.nextInt();
        System.out.println("The new number is "+newNum);
        return newNum;
    }
    public static int[] fromold(int[] num){
       
        System.out.println("Enter the old number taht you want to convert");
        int oldNum=scanner.nextInt();
        for(int n=0;n<num.length;n++){
            if(num[n]==oldNum){
               num[n]=toNew();
               break;
            }
        }
        return num;
    }
    public static void writelnew(int[] arr){
        System.out.println("The new array is:");
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
}
