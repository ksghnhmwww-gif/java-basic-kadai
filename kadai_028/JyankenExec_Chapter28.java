package kadai_028;

import java.util.Scanner;

public class JyankenExec_Chapter28 {

	public static void main(String[] args) {
		//Jyanken_Chapter28クラスのインスタンスを作成する
		Jyanken_Chapter28 janken = new Jyanken_Chapter28();
		
		//自分のじゃんけんの手を入力する
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		Scanner scanner = new Scanner(System.in);
		String input;
		String myChoice = null;
		
		while(true) {
			input = scanner.next();
			
			try {
				myChoice = janken.getMyChoice(input);
				break;
			} catch(IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
			
		}
		
		//じゃんけんメソッドの実行
		String enemyChoice = janken.getRandom();
		janken.playGame(myChoice, enemyChoice);
		
		scanner.close();

	}

}
