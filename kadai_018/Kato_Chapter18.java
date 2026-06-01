package kadai_018;

abstract public class Kato_Chapter18 {
	// フィールド
	public String familiyName = "加藤";  // 姓を表す
	public String givenName;             // 名を表す
	public String address     = "東京都中野区○×";  // 住所を表す
	
	// メソッド
	// 共通の紹介を出力する
	public void commonIntroduce() {
		System.out.println("名前は" + this.familiyName + this.givenName + "です");
		System.out.println("住所は" + this.address + "です");
	}
	
	// 個別の紹介を出力する
	abstract public void eachIntroduce();
	
	// 紹介を実行する
	public void execIntroduce() {
		this.commonIntroduce();
		this.eachIntroduce();
	}

}
