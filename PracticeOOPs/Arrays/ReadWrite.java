import java.util.Scanner;
class ReadWrite{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Size of array:");
    int size=sc.nextInt();
    int arr[]=new int[size];
    System.out.println("Enter the elements of array:");
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }
    
    System.out.println("The elements of array using for loop:");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
    System.out.println("The elements of array using for each loop:");
    for(int i:arr){
        System.out.print(i+" ");
    }
    System.out.println();
    System.out.println("The elements of array using while loop:");
    int j=0;
    while (j<size){
        System.out.print(arr[j]+" ");
        j++;
    }
}
}