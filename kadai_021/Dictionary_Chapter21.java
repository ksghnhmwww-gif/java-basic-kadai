package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	//HashMapの宣言
	HashMap<String,String> dictionary = new HashMap<String,String>();
	
	public Dictionary_Chapter21() {
		//英単語と意味の追加
		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウィ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");
	}
	
	//英単語のチェック
	public void checkWord(String[] words) {
		for(int i = 0; i < words.length; i++) {
			String meaning = dictionary.get(words[i]);
			
			if(meaning == null) {
				System.out.println(words[i] + "は辞書に存在しません");
			} else {
				System.out.println(words[i] + "の意味は" + meaning);
			}
		}
		
	}
	

}
