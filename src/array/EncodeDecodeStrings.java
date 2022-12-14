package array;

import java.util.ArrayList;
import java.util.List;

//https://www.lintcode.com/problem/659/
public class EncodeDecodeStrings {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String str : strs){
            sb.append(str.length());
            sb.append(str);
        }
        return sb.toString();
    }


    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        int startLength = str.charAt(0);
        for(int i=0; i<str.length(); i++){
            strs.add(str.substring(0, startLength+1));
            startLength = startLength+1;
            i = startLength+1;
        }
        return strs;
    }

    public static void main(String[] args) {
        EncodeDecodeStrings es = new EncodeDecodeStrings();

        ArrayList<String> gfg = new ArrayList<>();
        gfg.add("lint");
        gfg.add("code");
        gfg.add("love");
        gfg.add("you");
        System.out.println(es.encode(gfg));
    }
}
