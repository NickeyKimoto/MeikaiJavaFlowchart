package Chapter09.person2;

/*
*クラス名：PersonPlus
*概要：人の名前・身長・体重の情報を管理し、表示する
*作成者：N.Kimoto
*作成日：2024/05/02
*/

public class PersonPlus {
	
	// フィールドの宣言
	// 名前を表すインスタンス変数を宣言
	private String personName;
	// 身長を表すインスタンス変数を宣言
	private double personHeight;
	// 体重を表すインスタンス変数を宣言
	private double personWeight;
	
	/*
	*コンストラクタ名：PersonPlus
	*概要：インスタンスの初期化
	*引数：名前(String型)、身長(double型)、体重(double型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/02
	*/
	
	PersonPlus(String personName, double personHeight, double personWeight) {
		
		// 名前を表すインスタンス変数を初期化
		this.personName = personName;
		// 身長を表すインスタンス変数を初期化
		this.personHeight = personHeight;
		// 体重を表すインスタンス変数を初期化
		this.personWeight = personWeight;
		
	}
	
	// メソッド
	// ゲッタ
	/*
	*関数名：getPersonName
	*概要：名前を表すフィールドの値を取得
	*引数：なし
	*戻り値：名前(String型)
	*作成者：N.Kimoto
	*作成日：2024/05/02
	*/
	
	String getPersonName() {
		
		// 名前を表すフィールドの値を返却
		return personName;
		
	}
	
	/*
	*関数名：getPersonHeight
	*概要：身長を表すフィールドの値を取得
	*引数：なし
	*戻り値：身長(double型)
	*作成者：N.Kimoto
	*作成日：2024/05/02
	*/
	
	double getPersonHeight() {
		
		// 身長を表すフィールドの値を返却
		return personHeight;
		
	}
	
	/*
	*関数名：getPersonWeight
	*概要：体重を表すフィールドの値を取得
	*引数：なし
	*戻り値：体重(double型)
	*作成者：N.Kimoto
	*作成日：2024/05/02
	*/
	
	double getPersonWeigh() {
		
		// 体重を表すフィールドの値を返却
		return personWeight;
		
	}
	
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
