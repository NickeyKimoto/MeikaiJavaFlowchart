package Chapter08.parson;

/*
*クラス名：Person
*概要：人の名前・身長・体重の情報を管理し、表示する
*作成者：N.Kimoto
*作成日：2024/04/30
*/

public class Person {
	
	// フィールドの宣言
	// 名前を表すインスタンス変数を宣言
	private String personName;
	// 身長を表すインスタンス変数を宣言
	private double personHeight;
	// 体重を表すインスタンス変数を宣言
	private double personWeight;
	
	/*
	*コンストラクタ名：Person
	*概要：インスタンスの初期化
	*引数：名前(String型)、身長(double型)、体重(double型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/30
	*/
	
	Person(String personName, double personHeight, double personWeight) {
		
		// 名前を表すインスタンス変数を初期化
		this.personName = personName;
		// 身長を表すインスタンス変数を初期化
		this.personHeight = personHeight;
		// 体重を表すインスタンス変数を初期化
		this.personWeight = personWeight;
		
	}
	
	// メソッド
	
	/*
	*関数名：putSpec
	*概要：各ステートの表示
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/30
	*/
	
	public void putSpec() {
		
		// 名前を表示
		System.out.println("名前：" + personName);
		// 身長を表示
		System.out.println("身長：" + personHeight);
		// 体重を表示
		System.out.println("体重：" + personWeight);
		
	}

}
