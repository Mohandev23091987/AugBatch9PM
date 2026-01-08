package CollectionPrograms;

import java.util.HashMap;
import java.util.Map;

public class SkipValuesinHashMap {

    public static void main(String[] args) {


        Map<String,String> map = new HashMap<>();

        map.put("Username","Admin");
        map.put("Password","pwd");
        map.put("Role","QA");


        for(Map.Entry<String,String> entry: map.entrySet()){

            if(entry.getKey().equals(("Username"))&& entry.getValue().equals("Admin")){
                continue;
            }

            System.out.println(entry.getKey() + " ="+ entry.getValue());

        }







    }
}
