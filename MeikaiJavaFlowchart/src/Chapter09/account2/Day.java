package Chapter09.account2;

/*
*クラス名：Day
*概要：日付を年・月・日(曜日)で表し、比較したり表示したりする
*作成者：N.Kimoto
*作成日：2024/05/02
*/

public class Day {
	
	// 年の値を1に初期化するための定数を宣言
	static final int FIRST_YEAR = 1;
	// 月の値を1に初期化するための定数を宣言
	static final int FIRST_MONTH = 1;
	// 日の値を1に初期化するための定数を宣言
	static final int FIRST_DATE = 1;
	// 1月を表す定数を宣言
	static final int MONTH_JANUARY = 1;
	// 2月を表す定数を宣言
	static final int MONTH_FEBRUARY = 2;
	// 12カ月分ずらすための定数を宣言
	// うるう年によって起こる曜日のずれを計算しやすいように最終月にしたいため
	static final int SHIFT_TWELVE_MONTHS = 12;
	// うるう年が発生する条件における定数を宣言
	static final int LEAP_YEAR_MULTIPLE_OF_FOUR = 4;
	// 月による曜日のずれを表す式に使用する定数を宣言
	static final int FIVE_SHIFT_DAY_OF_WEEK = 5;
	// ある日付の七日後や七日前は同じ曜日になるため、七日を表す定数を宣言
	static final int SEVEN_DAYS = 7;
	// 月による曜日のずれを表す式に使用する定数を宣言
	static final int EIGHT_SHIFT_DAY_OF_WEEK = 8;
	// 月による曜日のずれを表す式に使用する定数を宣言
	static final int THIRTEEN_SHIFT_DAY_OF_WEEK = 13;
	// うるう年が発生しない特別条件における定数を宣言
	static final int NOT_LEAP_YEAR_MULTIPLE_OF_HUNDRED = 100;
	// うるう年が発生する条件における定数を宣言
	static final int LEAP_YEAR_MULTIPLE_OF_FOUR_HUNDRED = 400;
		
	// フィールドの宣言
	// 各フィールドは初期化子の値で初期化される
	// 年を表すインスタンス変数を宣言
	private int year = FIRST_YEAR;
	// 月を表すインスタンス変数を宣言
	private int month = FIRST_MONTH;
	// 日を表すインスタンス変数を宣言
	private int date = FIRST_DATE;
	
	// コンストラクタ
	// コンストラクタを多重定義
	
	/*
	*コンストラクタ名：Day
	*概要：インスタンスの初期化
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/02
	*/
	
	public Day() {
		
	}
	

	/*
	*コンストラクタ名：Day
	*概要：インスタンスの初期化
	*引数：年(int型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/02
	*/
	
	public Day(int year) {
		
		// 年を表すインスタンス変数を引数で初期化
		this.year = year;
		
	}
	
	/*
	*コンストラクタ名：Day
	*概要：インスタンスの初期化
	*引数：年(int型)、月(int型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/02
	*/
	
	public Day(int year, int month) {
		
		// 年を表すインスタンス変数を引数で初期化
		this(year);
		// 月を表すインスタンス変数を引数で初期化
		this.month = month;
		
	}
	
	/*
	*コンストラクタ名：Day
	*概要：インスタンスの初期化
	*引数：年(int型)、月(int型)、日(int型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/02
	*/
	
	public Day(int year, int month, int date) {
		
		// 年と月を表すインスタンス変数を引数で初期化
		this(year, month);
		// 日を表すインスタンス変数を引数で初期化
		this.date = date;
		
	}
	
	/*
	*コンストラクタ名：Day
	*概要：インスタンスの初期化
	*引数：日付(Day型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/02
	*/
	
	public Day(Day d) {
		
		// 日付のそれぞれの値を表すインスタンス変数を引数の日付で初期化
		this(d.year, d.month, d.date);
		
	}
	
	// ゲッタ
	/*
	*関数名：getYear
	*概要：年を表すフィールドの値を取得
	*引数：なし
	*戻り値：年(int型)
	*作成者：N.Kimoto
	*作成日：2024/05/02
	*/
	
	public int getYear() { 
		
		// 年を表すフィールドの値を返却
		return year;
		
	}
	
	/*
	*関数名：getMonth
	*概要：月を表すフィールドの値を取得
	*引数：なし
	*戻り値：月(int型)
	*作成者：N.Kimoto
	*作成日：2024/05/02
	*/
	
	public int getMonth() { 
	
		// 月を表すフィールドの値を返却
		return month;
		
	}
	
	/*
	*関数名：getDate
	*概要：日を表すフィールドの値を取得
	*引数：なし
	*戻り値：日(int型)
	*作成者：N.Kimoto
	*作成日：2024/05/02
	*/
	
	public int getDate() {
		
		// 日を表すフィールドの値を返却
		return date;
		
	}
	
	// セッタ
	/*
	*関数名：setYear
	*概要：フィールドに指定した年の値を設定
	*引数：年(int型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/02
	*/
	
	public void setYear(int year) {
		
		// フィールドに指定した年の値を設定
		this.year = year;
		
	}
	
	/*
	*関数名：setMonth
	*概要：フィールドに指定した月の値を設定
	*引数：月(int型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/02
	*/
	
	public void setMonth(int month) { 
		
		// フィールドに指定した月の値を設定
		this.month = month;
		
	}
	
	/*
	*関数名：setDate
	*概要：フィールドに指定した日の値を設定
	*引数：日(int型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/02
	*/
	
	public void setDate(int date) {
		
		// フィールドに指定した日の値を設定
		this.date = date;
		
	}
	
	/*
	*関数名：set
	*概要：フィールドに指定した日付の値を設定
	*引数：年(int型)、月(int型)、日(int型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/02
	*/
	
	public void set(int year, int month, int date) {
		
		// フィールドに指定した年の値を設定
		this.year = year;
		// フィールドに指定した月の値を設定
		this.month = month;
		// フィールドに指定した日の値を設定
		this.date = date;
		
	}
	
	/*
	*関数名：day0fWeek
	*概要：その日付の曜日を求める
	*引数：日付(Day型)
	*戻り値：曜日表す値(int型)
	*作成者：N.Kimoto
	*作成日：2024/05/02
	*/
	
	public int day0fWeek() {
		
		// 年を表す変数に指定した年の値を代入
		int y = year;    
		// 月を表す変数に指定した月の値を代入
		int m = month;

		// 日付が1月か2月だった場合、前年の13月14月として扱う
		if (m == MONTH_JANUARY || m == MONTH_FEBRUARY) {

			// 年の値を1減らす
			y--;
			// 月の値に12を加算する
			m += SHIFT_TWELVE_MONTHS;
			
		}
		
		// 曜日を求め、日曜日から土曜日までを0から6の値で返却
		return (y + y / LEAP_YEAR_MULTIPLE_OF_FOUR - y / NOT_LEAP_YEAR_MULTIPLE_OF_HUNDRED + y /
				LEAP_YEAR_MULTIPLE_OF_FOUR_HUNDRED + (THIRTEEN_SHIFT_DAY_OF_WEEK * m + 
				EIGHT_SHIFT_DAY_OF_WEEK) / FIVE_SHIFT_DAY_OF_WEEK + date) % SEVEN_DAYS;
		
	}
	
	/*
	*関数名：equalTo
	*概要：指定した日付と比較し日付が等しいかどうかを判定する
	*引数：日付(Day型)
	*戻り値：等しいかどうか(boolean型)
	*作成者：N.Kimoto
	*作成日：2024/05/02
	*/
	
	public boolean equalTo(Day d) {
		
		// 日付を比較しその正否を返却する
		return year == d.year && month == d.month && date == d.date;
		
	}
	
	/*
	*関数名：toString
	*概要：指定した日付を文字列で表現
	*引数：なし
	*戻り値：日付の文字列表現(String型)
	*作成者：N.Kimoto
	*作成日：2024/05/02
	*/
	
	public String toString() {
		
		// 曜日を表す文字に初期化した配列を生成
		String[] wd = { "日", "月", "火", "水", "木", "金", "土" };
		
		// 日付を文字表現で返却
		return String.format("%04d年%02d月%02d日(%s)", year, month, date, wd[day0fWeek()]);
		
	}

}
