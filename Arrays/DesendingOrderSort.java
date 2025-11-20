public class DesendingOrderSort {
    public static void main(String[] args) {
        int[] array={34,67,23,89,2,45,90,12};
        int[] sortedArray=sortingDescendind(array);
        System.out.println("Array in descending order:");
        for(int n:sortedArray){
            System.out.print(n+" ");
        }
    }
    public static int[] sortingDescendind(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
