package string_;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ReplaceWords {

	public static void main(String[]args) {
		List<String> dict = new ArrayList<>();
		dict.add("cat");
        dict.add("bat");
        dict.add("rat");
        String sen = "the cattle was rattled by the battery";
        
        String ans = replaceWords(dict,sen);
        System.out.println(ans);
	}
	
	public static String replaceWords(List<String> dictionary, String sentence) {
        String repalceSentence = "";
		String[] words = sentence.split(" ");
		Set<String> dictSet = new HashSet<>(dictionary);
        
		for(int i=0; i<words.length; i++) {
			for(int j=0; j<words[i].length(); j++) {
				if(dictSet.contains(words[i].substring(0, j+1))) {
					words[i] = words[i].substring(0, j+1);
					break;
				}
			}
		}
		for(int i=0; i<words.length; i++) {
			repalceSentence += (words[i]+" ");
		}
        
        return repalceSentence.substring(0, repalceSentence.length()-1);
    }
}
