package Chapter12.timeAccount;

/*
*クラス名：Account
*概要：銀行口座の情報を管理する
*作成者：N.Kimoto
*作成日：2024/05/21
*/

class Account {

	// 口座名義を表すフィールドを宣言
	private String accountHolder;
	// 口座番号を表すフィールドを宣言
	private String accountNumber;
	// 預金残高を表すフィールドを宣言
	private long depositBalance;

	/*
	*コンストラクタ名：Account
	*概要：フィールドを初期化
	*引数：口座名義(String型)、口座番号(String型)、預金残高(long型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/21
	*/
	
	Account(String accountHolder, String accountNumber, long depositBalance) {

		// 口座名義を表すフィールドを初期化
		this.accountHolder = accountHolder;
		// 口座番号を表すフィールドを初期化
		this.accountNumber = accountNumber;
		// 預金残高を表すフィールドを初期化
		this.depositBalance = depositBalance;

	}

	/*
	*関数名：getAccountHolder
	*概要：口座名義を返却
	*引数：なし
	*戻り値：口座名義(String型)
	*作成者：N.Kimoto
	*作成日：2024/05/21
	*/
	
	String getAccountHolder() {

		// 口座名義を返却
		return accountHolder;

	}

	/*
	*関数名：getAccountNumber
	*概要：口座番号を返却
	*引数：なし
	*戻り値：口座番号(String型)
	*作成者：N.Kimoto
	*作成日：2024/05/21
	*/
	
	String getAccountNumber() {

		// 口座番号を返却
		return accountNumber;

	}


	/*
	*関数名：getDepositBalance
	*概要：預金残高を返却
	*引数：なし
	*戻り値：預金残高(long型)
	*作成者：N.Kimoto
	*作成日：2024/05/21
	*/
	
	long getDepositBalance() {

		// 預金残高を返却
		return depositBalance;

	}

}
