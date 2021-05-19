package helpers;

import java.util.Map;
import java.util.function.Predicate;

public class Utilities {
    public Predicate predicate(){
        Predicate<Map<String,String>> predicate = new Predicate<Map<String, String>>() {
            @Override
            public boolean test(Map<String, String> map) {
                if(map.get("name")!=null){
                    return (map.get("name").equals("doggie")&&map.get("status").equals("available"));
                }
                return false;
            }
        };
        return predicate;
    }
}
