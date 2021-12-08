import java.util.*;
public class PropDemoDef {
    public static void main(String[] args) {
        Properties defList =new Properties();
        defList.put("Uttar Pradesh", "Lucknow");
        defList.put("Tamil Nadu", "Chennai");
        Properties capitals = new Properties(defList);
        defList.put("America", "Washington DC");
        defList.put("India", "New Delhi");
        defList.put("Maharashtra", "Mumbai");
        defList.put("Punjab", "Chandigarh");
        //Get a set-view of the keys.
        Set states=capitals.keySet();
        //Show all of the states and capitals.
        for(Object name : states)
            System.out.println("The capital of"+name+"is"+capitals.getProperty((String) name)+".");
        System.out.println();
        //Uttar Pradesh will be found in the default list.
        String str=capitals.getProperty("Uttar Pradesh");
        System.out.println("The capital of Uttar Pradesh is "+str+".");

    }
}
