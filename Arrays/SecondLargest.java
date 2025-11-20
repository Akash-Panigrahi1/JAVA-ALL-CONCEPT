public class SecondLargest {
    public static void main(String[] args) {
        int [] array={34,67,23,89,2,45,90,12};
        int secondLargest=findSecondLargest(array);
        System.out.println("The second largest element is: "+secondLargest);
    }
    public static int findSecondLargest(int[] arr){
        if(arr.length<2){
            System.out.println("Array must have at least two elements");
            return -1;
        }
        int[] arrNew=sorting(arr);
        return arrNew[arrNew.length-2];
    }
    public static int[] sorting(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
