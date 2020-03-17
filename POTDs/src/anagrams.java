import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class anagrams {

    static boolean isAnagram(String a, String b) {
        
        if (a.length() != b.length())
            return false;
        
        Map<Character, Integer> res = new HashMap<Character, Integer>();
        
        for (char c : a.toCharArray()) {
        	
        	if (!res.containsKey(c))
        		res.put(c, 1);
        	
        	else {
        		int freq = res.get(c);
        		res.put(c, ++freq);
        	}
        }
        	
        for (char c : b.toCharArray()) {
        	
        	if (!res.containsKey(c))
        		return false;
        	
        	int freq = res.get(c);
        	
        	if (freq == 0)
        		return false;
        	
        	else {
        		res.put(c, --freq);
        	}
        }

        return true;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
