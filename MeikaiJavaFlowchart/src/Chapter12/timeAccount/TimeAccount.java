package Chapter12.timeAccount;

/*
*クラス名：TimeAccount
*概要：Accountクラスに定期預金についての情報を追加する
*作成者：N.Kimoto
*作成日：2024/05/21
*/

class TimeAccount extends Account {
	
	// 預金残高(定期預金)を表すフィールドを宣言
	private long timeBalance;
	
	/*
	*コンストラクタ名：TimeAccount
	*概要：フィールドを初期化
	*引数：口座名義(String型)、口座番号(String型)、預金残高(long型)、預金残高(定期預金)(long型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/21
	*/
	
	TimeAccount(String accountHolder, String accountNumber, long depositBalance, long timeBalance) {
		
		// 口座名義、口座番号、預金残高を表すフィールドを初期化
		super(accountHolder, accountNumber, depositBalance);
		 // 預金残高(定期預金)を表すフィールドを初期化
		this.timeBalance = timeBalance; // 預金残高(定期預金)
		
	}
	
	/*
	*関数名：getTimeBalance
	*概要：預金残高(定期預金)を返却
	*引数：なし
	*戻り値：預金残高(定期預金)(long型)
	*作成者：N.Kimoto
	*作成日：2024/05/21
	*/
	
	long getTimeBalance() {
		
		// 預金残高(定期預金)を返却
		return timeBalance;
		
	}
	
	/*
	*関数名：compareBalance
	*概要：二つの口座情報の預金残高と定期預金残高の合計額(定期預金残高の情報を持たない場合は
	*預金残高のみ)を比較し、その結果に対応した値を返却
	*引数：二つの口座情報(Account型)
	*戻り値：結果に対応した値(int型)
	*作成者：N.Kimoto
	*作成日：2024/05/21
	*/
	
	static int compBalance(Account a, Account b) {
		
		// 結果に対応した値を格納した配列を宣言
		final int[] SPECIFIED_VALUE = {-1, 0, 1};
		
		// 一つ目の比較する値をその預金口座で初期化
		long firstCompareValue = a.getDepositBalance();
		// 引数aがTimeAccount型の場合
		if (a instanceof TimeAccount) {
			
			// 定期預金残高を加算する
			firstCompareValue += ((TimeAccount) a).getTimeBalance();
			
		}
		
		// 二つ目の比較する値をその預金口座で初期化
		long secondCompareValue = b.getDepositBalance();
		// 引数bがTimeAccount型の場合
		if (b instanceof TimeAccount) {
			
			// 定期預金残高を加算する
			secondCompareValue += ((TimeAccount) b).getTimeBalance();
			
		}
		
		// 返却する値を宣言し初期化
		int returnValue = SPECIFIED_VALUE[1];
		// 合計額を比較し、1つ目の口座情報のほうが多い場合
		if (firstCompareValue > secondCompareValue) {
			
			// 返却する値を更新
			returnValue = SPECIFIED_VALUE[2];
			
		// 合計額を比較し、2つ目の口座情報のほうが多い場合
		} else if (firstCompareValue < secondCompareValue) {
			
			// 返却する値を更新
			returnValue = SPECIFIED_VALUE[0];
			
		}
		
		// 比較結果に対応した値を返却
		return returnValue;
		
		
	}

}
