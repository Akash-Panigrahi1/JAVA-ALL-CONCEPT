public class ArrayToSet {
    public static void main(String[] args) {
        int[] arr={10,20,30,20,40,10,50,60,30};
        arrayToSet(arr);
    }
    public static void arrayToSet(int[] arr){
        int[] setArr=new int[arr.length];
        int index=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==setArr[j]){
                    break;
                }
                if (j==arr.length-1){
                    setArr[index++]=arr[i];
                }
            }
             
               
        }
        System.out.print("[");
        for(int k:setArr){
            if(k!=0){
                System.out.print(k+", ");
            }
        }
        System.out.println("]");
    }
}
