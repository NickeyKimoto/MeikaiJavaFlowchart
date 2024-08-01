package Chapter09.PersonBirthDay;

/*
*クラス名：Person
*概要：人の名前・身長・体重・誕生日の情報を管理し、表示する
*作成者：N.Kimoto
*作成日：2024/05/07
*/

public class Person {
		
	// フィールドの宣言
	// 名前を表すインスタンス変数を宣言
	private String personName;
	// 身長を表すインスタンス変数を宣言
	private double personHeight;
	// 体重を表すインスタンス変数を宣言
	private double personWeight;
	// 誕生日を表すインスタンス変数を宣言
	private Day personBirthday;
	
	/*
	*コンストラクタ名：Person
	*概要：インスタンスの初期化
	*引数：名前(String型)、身長(double型)、体重(double型)、誕生日(Day型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/02
	*/
	
	Person(String personName, double personHeight, double personWeight, Day personBirthday) {
		
		// 名前を表すインスタンス変数を初期化
		this.personName = personName;
		// 身長を表すインスタンス変数を初期化
		this.personHeight = personHeight;
		// 体重を表すインスタンス変数を初期化
		this.personWeight = personWeight;
		// 誕生日を表すインスタンス変数を初期化
		this.personBirthday = new Day(personBirthday);
		
	}
	
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
	*関数名：getPersonBirthday
	*概要：誕生日を表すフィールドの値を取得
	*引数：なし
	*戻り値：誕生日(Day型)
	*作成者：N.Kimoto
	*作成日：2024/05/02
	*/
	
	Day getPersonBirthday() {
		
		// 誕生日フィールドが参照する日付インスタンスのコピーを返却
		return new Day(personBirthday);
		
	}
	
	/*
	*関数名：toString
	*概要：名前・身長・体重・誕生日を文字列表現で返却
	*引数：なし
	*戻り値：名前・身長・体重・誕生日(String型)
	*作成者：N.Kimoto
	*作成日：2024/05/08
	*/
	
	public String toString() {
		
		// 名前・身長・体重・誕生日を文字列表現で返却
		return String.format("名前：%s\n身長：%5.1f\n体重：%5.1f\n誕生日：%s",
				personName, personHeight, personWeight, personBirthday.toString());
		
	}

}
