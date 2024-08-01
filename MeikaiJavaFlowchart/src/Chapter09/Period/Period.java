package Chapter09.Period;

/*
*クラス名：Period
*概要：開始日、終了日の情報を管理する
*作成者：N.Kimoto
*作成日：2024/05/08
*/

public class Period {
	
	// 開始日を表すインスタンス変数を宣言
	private Day from;
	// 終了日を表すインスタンス変数を宣言
	private Day to;
	
	/*
	*コンストラクタ名：Period
	*概要：インスタンスの初期化
	*引数：開始日(Day型)、終了日(Day型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/08
	*/
	
	public Period(Day from, Day to) {
		
		// 開始日を表すインスタンス変数を初期化
		this.from = from;
		// 終了日を表すインスタンス変数を初期化
		this.to = to;
		
	}
	
	/*
	*関数名：getFrom
	*概要：開始日フィールドが参照する日付インスタンスのコピーを返却
	*引数：なし
	*戻り値：開始日(String型)
	*作成者：N.Kimoto
	*作成日：2024/05/08
	*/
	
	public Day getFrom() {
		
		// 開始日フィールドが参照する日付インスタンスのコピーを返却
		return new Day(from);
		
	}
	
	/*
	*関数名：getTo
	*概要：終了日フィールドが参照する日付インスタンスのコピーを返却
	*引数：なし
	*戻り値：終了日(String型)
	*作成者：N.Kimoto
	*作成日：2024/05/08
	*/
	
	public Day getTo() {
		
		// 終了日フィールドが参照する日付インスタンスのコピーを返却
		return new Day(to);
		
	}
	
	/*
	*関数名：toString
	*概要：開始日・終了日を文字列表現で返却
	*引数：なし
	*戻り値：開始日・終了日(String型)
	*作成者：N.Kimoto
	*作成日：2024/05/08
	*/
	
	public String toString() {
		
		// 開始日・終了日を文字列表現で返却
		return String.format("開始日：%s\n終了日：%s", from.toString(), to.toString());
		
	}

}
