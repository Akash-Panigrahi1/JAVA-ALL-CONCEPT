public class Divide {
    public static void main(String[] args) {
        int[] array = readArray();
        sumOfArray(array);
    }
    public static int[] readArray(){
        java.util.Scanner scanner=new java.util.Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < size; i++){
            array[i] = scanner.nextInt();
        }
        scanner.close();
        return array;
    }
    public static void sumOfArray(int[] array){
        array=devideByTwoThree(array);
        int sum = 0;
        for(int num : array){
            sum += num;
        }
        System.out.println("The sum of the elements divisible by both 2 and 3 is: " + sum);
    }
    public static int[] devideByTwoThree(int[] arr){
        int[] newArr= new int[arr.length];
        int i=0;
        for(int num : arr){
             if (num %2 == 0 && num %3 ==0){
                newArr[i]= num;
                i++;
             }
        }
        for(int n:newArr){
            if (n==0) {
                continue;
            }
            else{
                 System.out.println("The elements divisible by both 2 and 3 are:" + n);
            }
        }
        return newArr;
        
    }
}
