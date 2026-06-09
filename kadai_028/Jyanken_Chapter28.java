package kadai_028;

import java.util.HashMap;

public class Jyanken_Chapter28 {
	
	//自分のじゃんけんの手を入力する
	public String getMyChoice(String choice) {
		//正しいじゃんけんの手であるか判定し、じゃんけんの手を返す
		if(choice.equals("r")) {
			return "r";
		} else if(choice.equals("s")) {
			return "s";
		} else if(choice.equals("p")) {
			return "p";
		} else {
			throw new IllegalArgumentException("[" + choice + "]"+ "は正しい入力ではありません");
		}
		
	};
	
	//対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		//じゃんけんの手を配列にセット
		String[] jankenHand = {"r", "s", "p"};
		//手の番号をランダムに出力
		int handNumber = (int) Math.floor(Math.random() * 3);
		//手の番号に応じて、じゃんけんの手を返す
		return jankenHand[handNumber];
	};
	
	//じゃんけんを行う
	public void playGame(String myChoice, String enemyChoice) {
		//自分と対戦相手のじゃんけんの手を出力
		HashMap<String,String> handMap = new HashMap<String,String>();
		handMap.put("r", "グー");
		handMap.put("s", "チョキ");
		handMap.put("p", "パー");
		
		String myHand = handMap.get(myChoice);
		String enemyHand = handMap.get(enemyChoice);
		System.out.println("自分の手は" + myHand + ",対戦相手の手は" + enemyHand);
		
		//自分と対戦相手のじゃんけんの手の比較
		if(myHand.equals(enemyHand)) {
			System.out.println("あいこです");
		} else if(
				myHand.equals("グー") && enemyHand.equals("チョキ")
			 || myHand.equals("チョキ") && enemyHand.equals("パー")
			 || myHand.equals("パー") && enemyHand.equals("グー")
		){
			System.out.println("自分の勝ちです");
		} else{
			System.out.println("自分の負けです");
		}
		
	}

}
