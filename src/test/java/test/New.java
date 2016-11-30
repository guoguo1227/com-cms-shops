package test;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author : samuel
 * @Description :
 * @Date : 16-11-28
 */
public class New {
    public static void main(String[] args){
        ConcurrentHashMap map = new ConcurrentHashMap();
        map.put("1",1);
        map.put("2",2);

        HashMap<String,String> test = new HashMap<>();
        test.put("a","a");
        test.put("b","b");

    }
}
