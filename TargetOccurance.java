public class TargetOccurance {
    public static void main(String[] args) {
        int [] array={2,3,2,1,6,7,2};
        int target=2,count=0;
        for(int i:array){
            if(target==i){
                count+=1;
            }
        }
        System.out.println("the number of occurance is "+ count);
        
    }
}
