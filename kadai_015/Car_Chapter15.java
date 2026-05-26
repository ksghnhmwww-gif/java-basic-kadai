package kadai_015;

public class Car_Chapter15 {
	// フィールド
	private int  gear = 1;
	private int speed = 10;
	
	// ギアの値により速度を変えるメソッド
	public void changeGear(int afterGear) {
		
		System.out.println("ギア" + this.gear + 
				"から" + afterGear + "に切り替えました");
		
		this.gear = afterGear;
		
		this.speed = switch(afterGear) {
			case 1 -> 10;
			case 2 -> 20;
			case 3 -> 30;
			case 4 -> 40;
			case 5 -> 50;
			default -> 10;
		};
		
	}
	
	// ギアチェンジ後の速度を表示するメソッド
	public void run () {
		System.out.println("速度は時速" + this.speed + "kmです");
	}

}
