public class CloneArray {
    public static void main(String[] args) {
        int[] array={31,43,12,54,124,45,124};
        int[] cloneArray=copyArray(array);
        System.out.println("Original Array:");
        printArray(array);
        System.out.println("Cloned Array:");
        printArray(cloneArray);
    }
    public static int[] copyArray(int[] arr){
        int[] newArr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            newArr[i]=arr[i];
        }
        return newArr;
    }
    public static void printArray(int[] arr){
        for(int n:arr){
            System.out.print(n+" ");
        }
        System.out.println();
    }
}
