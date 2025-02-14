public class Main {
    public static void main(String[] args) {
        int []frequency=new int[101];
        int[]array={1,4,5,2,3,5,9};
        int size = array.length;
        for(int i :array){
            frequency[i]=frequency[i]+1;
        }
        
        System.out.println("unique");
        for(int i = 0;i<size;i++){
            if(frequency[i]==1){
                System.out.print(i +" ");
            }
        }   
        System.out.println("\nduplicate");
        for(int i = 0;i<size;i++){
            if(frequency[i]>1){
                System.out.print(i +" ");
            }   
        }
    }
}
