package collections;

import java.util.HashMap;
import java.util.Map;

public class WordOccurences {
	public int count = 0;

	private static void WordCount1(String string) {

		// Split the string into words using built-in function
		String words[] = string.split(" ");

		System.out.println("Duplicate words in a given string : ");
		for (int i = 0; i < words.length; i++) {
			int count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
					// Set words[j] to 0 to avoid printing visited word
					words[j] = "0";
				}
			}

			// Displays the duplicate word if count is greater than 1
			if (count > 1 && words[i] != "0")
				System.out.println(words[i]);
		}
	}

	private static void WordCount2(String string) {

		// Split the string into words using built-in function
		String words[] = string.split(" ");

		Map<String, Integer> occurrences = new HashMap<String, Integer>();

		for (String word : words) {
			Integer oldCount = occurrences.get(word);
			if (oldCount == null) {
				oldCount = 0;
			}
			occurrences.put(word, oldCount + 1);
			System.out.println(occurrences);
		}
	
	}

	public static void main(String[] args) {
		String string = "Big black bug bit a big black dog on his big black nose";

		// Converts the string into lowercase
		string = string.toLowerCase();
		WordCount1(string);
		 WordCount2(string);

	}
}