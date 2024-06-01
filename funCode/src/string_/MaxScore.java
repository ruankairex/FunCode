package string_;

import java.util.HashMap;
import java.util.Map;

//參考leetcode 1255 Maximum Score Words Formed by Letters
//dfs深度優先概念
public class MaxScore {

	public static void main(String[]args) {
		String[] words = {"dog","cat","dad","good"};
		char[] letters = {'a','c','d','d','d','g','o','o'};
		int[] score = {1,0,9,5,0,0,3,0,0,0,0,0,0,0,2,0,0,0,0,0,0,0,0,0,0,0};
		int scores = maxScoreWords(words,letters,score);
		System.out.println(scores);
	}
	
	public static int maxScoreWords(String[] words, char[] letters, int[] score) {
		
		//把letters存進map，並計數
		Map<Character,Integer> letterCount = new HashMap<>();
		for(char c: letters) {
			letterCount.put(c, letterCount.getOrDefault(c, 0)+1);
		}
		
		//算每個詞的分數
		int[] wordScore = new int[words.length];
		for(int i=0; i<words.length; i++) {
			int totalScore = 0;
			String tmpWord = words[i];
			for(char c:tmpWord.toCharArray()) {
				totalScore += score[c - 'a'];
			}
			wordScore[i] = totalScore;
		}
		
		// 回溯法找出最大
        return backtrack(words, letterCount, wordScore, 0);
	}
	
	
	private static int backtrack(String[] words, Map<Character, Integer> letterCount, int[] wordScores, int index) {
        if (index == words.length) {
            return 0;
        }
        
        // 跳過該詞
        int maxScore = backtrack(words, letterCount, wordScores, index + 1);
        
        // 包含該詞
        String word = words[index];
        Map<Character, Integer> wordCounter = new HashMap<>();
        for (char c : word.toCharArray()) {
            wordCounter.put(c, wordCounter.getOrDefault(c, 0) + 1);
        }
        
        boolean canFormWord = true;
        for (char c : wordCounter.keySet()) {
            if (wordCounter.get(c) > letterCount.getOrDefault(c, 0)) {
                canFormWord = false;
                break;
            }
        }
        
        if (canFormWord) {
            // 更新
            for (char c : wordCounter.keySet()) {
                letterCount.put(c, letterCount.get(c) - wordCounter.get(c));
            }
            maxScore = Math.max(maxScore, wordScores[index] + backtrack(words, letterCount, wordScores, index + 1));
            // 回溯
            for (char c : wordCounter.keySet()) {
                letterCount.put(c, letterCount.get(c) + wordCounter.get(c));
            }
        }
        
        return maxScore;
    }
}
