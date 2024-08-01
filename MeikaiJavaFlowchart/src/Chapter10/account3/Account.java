package Chapter10.account3;

/*
*クラス名：Account
*概要：銀行口座情報を入力し管理、表示する
*作成者：N.Kimoto
*作成日：2024/05/07
*/

public class Account {
	
	// フィールドの宣言
	// 各フィールドは初期化子の値で初期化される
	// 口座名義を表すインスタンス変数を宣言
	private String name;
	// 口座番号を表すインスタンス変数を宣言
	private String no;
	// 預金残高を表すインスタンス変数を宣言
	private long balance;
	// 口座開設日を表すインスタンス変数を宣言
	private Day accountOpeningDay;
	
	// インスタンス初期化子
	{
		
		// インスタンスが生成される度に『明解銀行での口座開設ありがとうございます。』と表示
		System.out.print("『明解銀行での口座開設ありがとうございます。』");
		
	}

	/*
	*コンストラクタ名：Account
	*概要：インスタンスの初期化
	*引数：口座名義(String型)、口座番号(String型)、預金残高(long型)、口座開設日(Day型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/07
	*/
	
	Account(String n, String num, long z, Day accountOpeningDay) {

		// 口座名義を表すインスタンス変数を初期化
		this.name = n;
		// 口座番号を表すインスタンス変数を初期化
		this.no = num;
		// 預金残高を表すインスタンス変数を初期化
		this.balance = z;
		// 口座開設日を表すインスタンス変数を初期化
		this.accountOpeningDay = new Day(accountOpeningDay);
		

	}

	// ゲッタ
	
	/*
	*関数名：getName
	*概要：口座名義を表すフィールドの値を取得
	*引数：なし
	*戻り値：口座名義(String型)
	*作成者：N.Kimoto
	*作成日：2024/05/07
	*/
	
	String getName() {

		// 口座名義を表すフィールドの値を返却
		return name;

	}

	/*
	*関数名：getNo
	*概要：口座番号を表すフィールドの値を取得
	*引数：なし
	*戻り値：口座番号(String型)
	*作成者：N.Kimoto
	*作成日：2024/05/07
	*/
	
	String getNo() {

		// 口座番号を表すフィールドの値を返却
		return no;

	}

	/*
	*関数名：getBalance
	*概要：預金残高を表すフィールドの値を取得
	*引数：なし
	*戻り値：預金残高(long型)
	*作成者：N.Kimoto
	*作成日：2024/05/07
	*/
	
	long getBalance() {

		// 預金残高を表すフィールドの値を返却
		return balance;

	}
	
	/*
	*関数名：getAccountOpeningDay
	*概要：口座開設日を表すフィールドの値を取得
	*引数：なし
	*戻り値：口座開設日(Day型)
	*作成者：N.Kimoto
	*作成日：2024/05/07
	*/
	
	Day getAccountOpeningDay() {

		// 口座開設日フィールドが参照する日付インスタンスのコピーを返却
		return new Day(accountOpeningDay);

	}

	/*
	*関数名：deposit
	*概要：指定した口座にお金を預ける
	*引数：預けたお金
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/02
	*/
	
	void deposit(long k) {

		// 預金残高に預けたお金を加算する
		balance += k;

	}

	/*
	*関数名：withdraw
	*概要：指定した口座からお金をおろす
	*引数：おろしたお金
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/02
	*/
	
	void withdraw(long k) {

		// 預金残高からおろしたお金を減算する
		balance -= k;

	}
	
	/*
	*関数名：toString
	*概要：銀行口座の情報を文字列表現で返却
	*引数：なし
	*戻り値：口座名義、口座番号、預金残高、口座開設日(String型)
	*作成者：N.Kimoto
	*作成日：2024/05/02
	*/
	
	public String toString() {
		
		// 口座名義、口座番号、預金残高、口座開設日を文字列表現で返却
		return String.format("口座名義：%s\n口座番号：%s\n預金残高"
				+ "：%d\n口座開設日：%s", name, no, balance, accountOpeningDay.toString());
		
	}

}
