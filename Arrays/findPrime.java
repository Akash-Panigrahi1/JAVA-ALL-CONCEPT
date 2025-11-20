public class findPrime {
    public static void main(String[] args) {
        int[] array={2,7,4,3,11,5,45,87,12,9,88,15,13};
        int[] primeElements=findPrimeElement(array);
        System.out.println("The prime elements in the array are:");
        for(int n:primeElements){
            if(n!=0){
                System.out.print(n+" ");
            }
        }
    }
    public static int[] findPrimeElement(int[] arr){
        int c=0;
        int[] primeArr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(isPrime(arr[i])){
                primeArr[c]=arr[i];
                c++;
            }
        }
        return primeArr;
    }
    public static boolean isPrime(int num){
        if(num <2){
            return false;
        }
        else{
            for(int i=2;i<num/2;i++){
                if(num%i==0){
                    return false;
                }
            }
            return true;
        }
    }
}
