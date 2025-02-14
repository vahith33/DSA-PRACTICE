public class ArrayOddEven {
    public static void main(String[] args) {
        int array[]={2,4,7,9,12};
        int oddCount = 0;
        int evenCount = 0;
        
        for (int i: array){
            if (i%2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        
        int[] odd=new int [oddCount];
        int []even=new int [evenCount];
        
        int evenIndex=0;
        int oddIndex=0;
        
        for(int num:array){
            if(num%2==0){
                even[evenIndex]=num;
                evenIndex++;
            }
            else{
                odd[oddIndex]=num;
                oddIndex++;
            }
        }
        System.out.println("ODD NUMBERS");
        for(int oddresult : odd){
            System.out.print(oddresult +" " );
        }
        System.out.println("\nEVEN NUMBERS");
        for (int evenresult : even){
            System.out.print(evenresult + " ");
        }
    }
}
