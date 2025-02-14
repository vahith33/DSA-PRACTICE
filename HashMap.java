import java.util.*;
public class HashMap {
    public static void main(String[] args) {

        //creation

        HashMap<String,String> map = new HashMap<>();

        //insterstion

        map.put("TN","Tamilnadu");
        map.put("KA","Karnataka");
        map.put("KL","Kerala");

        //get

       System.out.println(map.get("TN"));
       System.out.println(map.get("KL"));
       System.out.println(map.getOrDefault("AP","Not Found"));
       System.out.println(map.values());
       System.out.println(map.keySet());

       //traversal

       for(String key:map.keySet()){
           System.out.println(key +" "+ map.get(key));
       }

       //remove

        System.out.println(map.containsKey("AP"));
        map.remove("KL");

        //size
        System.out.println(map.size());

        //empty
        System.out.println(map.isEmpty());
    }
}
