package Chapter12.timeAccount;

/*
*クラス名：TimeAccountTester
*概要：AccountクラスとTimeAccountクラスのテスト
*作成者：N.Kimoto
*作成日：2024/05/21
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;


public class TimeAccountTester {
	
	// Scannerオブジェクトを生成
	static Scanner standardInput = new Scanner(System.in);
	
	/*
	*関数名：inputRange
	*概要：入力した値を範囲内の値で入力させる
	*引数：入力された値(long型)
	*戻り値：再入力された値(long型)
	*作成者：N.Kimoto
	*作成日：2024/04/30
	*/
	
	static long inputRange(long inputValue) {

		// 範囲内の値の入力を促す
		System.out.print("有効範囲内で入力してください：");
		// 入力された値を読み込む
		inputValue = standardInput.nextInt();
		// 読み込んだ値を返却する
		return inputValue;

	}
	
	/*
	*関数名：indicateComparisonResult
	*概要：比較によって返却された値が意味する表記を表示
	*引数：返却された値(int型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/21
	*/
	
	static void indicateComparisonResult(int returnValue) {
		
		// 結果に対応した値を格納した配列を宣言
		final int[] SPECIFIED_VALUE = {-1, 0, 1};
		// 比較した結果、後者のほうが大きい場合
		if (returnValue == SPECIFIED_VALUE[0]) {
			
			// 後者の値のほうが大きいことを表示
			System.out.println("比較された値は、後者の値のほうが大きいです。");
			
		// 比較した結果、同じ値だった場合
		} else if (returnValue == SPECIFIED_VALUE[1]) {
			
			// 同じ値だったことを表示
			System.out.println("比較された値は、同じ値です。");
			
		// 比較した結果、前者の値のほうが大きい場合
		} else if (returnValue == SPECIFIED_VALUE[2]) {
			
			// 前者の値のほうが大きいことを表示
			System.out.println("比較された値は、前者の値のほうが大きいです。");
			
		}
		
	}
	
	/*
	*関数名：main
	*概要：銀行口座の情報を管理し表示
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/21
	*/

	public static void main(String[] args) {
		
		// 必要な預金残高情報の数を表す定数を宣言
		final int NUMBER_INFORMATION_DEPOSIT_BALANCE = 4;
		// 必要な定期預金残高情報の数を表す定数を宣言
		final int NUMBER_INFORMATION_TIME_BALANCE = 2;
		
		// それぞれの預金残高の値を格納した配列を宣言
		long[] temporaryDepositBalance = new long[NUMBER_INFORMATION_DEPOSIT_BALANCE];

		// 足立君の預金残高の値の入力を促す
		System.out.print("足立君の預金残高の値：");
		// 入力された値を読み込む
		temporaryDepositBalance[0] = standardInput.nextLong();
		// 0未満の値を入力された場合
		while (temporaryDepositBalance[0] < 0) {
			
			// 0以上の値を入力させる
			temporaryDepositBalance[0] = inputRange(temporaryDepositBalance[0]);
				
		}
		// 仲田君の預金残高の値の入力を促す
		System.out.print("仲田君の預金残高の値：");
		// 入力された値を読み込む
		temporaryDepositBalance[1] = standardInput.nextLong();
		// 0未満の値を入力された場合
		while (temporaryDepositBalance[1] < 0) {
			
			// 0以上の値を入力させる
			temporaryDepositBalance[1] = inputRange(temporaryDepositBalance[1]);
				
		}
		// 松本君の預金残高の値の入力を促す
		System.out.print("松本君の預金残高の値：");
		// 入力された値を読み込む
		temporaryDepositBalance[2] = standardInput.nextLong();
		// 0未満の値を入力された場合
		while (temporaryDepositBalance[2] < 0) {
			
			// 0以上の値を入力させる
			temporaryDepositBalance[2] = inputRange(temporaryDepositBalance[2]);
				
		}
		// 高橋君の預金残高の値の入力を促す
		System.out.print("高橋君の預金残高の値：");
		// 入力された値を読み込む
		temporaryDepositBalance[3] = standardInput.nextLong();
		// 0未満の値を入力された場合
		while (temporaryDepositBalance[3] < 0) {
			
			// 0以上の値を入力させる
			temporaryDepositBalance[3] = inputRange(temporaryDepositBalance[3]);
				
		}
		
		// それぞれの定期預金残高の値を格納した配列を宣言
		long[] TEMPORARY_TIME_BALANCE = new long[NUMBER_INFORMATION_TIME_BALANCE];

		// 松本君の定期預金残高の値の入力を促す
		System.out.print("松本君の定期預金残高の値：");
		// 入力された値を読み込む
		TEMPORARY_TIME_BALANCE[0] = standardInput.nextLong();
		// 0未満の値を入力された場合
		while (TEMPORARY_TIME_BALANCE[0] < 0) {
			
			// 0以上の値を入力させる
			TEMPORARY_TIME_BALANCE[0] = inputRange(temporaryDepositBalance[0]);
			
		}
		// 高橋君の定期預金残高の値の入力を促す
		System.out.print("高橋君の定期預金残高の値：");
		// 入力された値を読み込む
		TEMPORARY_TIME_BALANCE[0] = standardInput.nextLong();
		// 0未満の値を入力された場合
		while (TEMPORARY_TIME_BALANCE[0] < 0) {
			
			// 0以上の値を入力させる
			TEMPORARY_TIME_BALANCE[0] = inputRange(temporaryDepositBalance[0]);
			
		}

		// 足立君の口座情報を初期化
		Account adachiAccount = new Account("足立", "111111", temporaryDepositBalance[0]);
		// 仲田君の口座情報を初期化
		Account nakataAccount = new Account("仲田", "222222", temporaryDepositBalance[1]);
		// 松本君の口座情報を初期化
		TimeAccount matumotoAccount = new TimeAccount("松本", "333333", temporaryDepositBalance[2], TEMPORARY_TIME_BALANCE[0]);
		// 高橋君の口座情報を初期化
		TimeAccount takahashiAccount = new TimeAccount("高橋", "444444", temporaryDepositBalance[3], TEMPORARY_TIME_BALANCE[1]);
		
		// 足立君の口座情報を表示
		System.out.println("■足立君の口座");
		// 足立君の口座名義を表示
		System.out.println("　口座名義：" + adachiAccount.getAccountHolder());
		// 足立君の口座番号を表示
		System.out.println("　口座番号：" + adachiAccount.getAccountNumber());
		// 足立君の預金残高を表示
		System.out.println("　預金残高：" + adachiAccount.getDepositBalance());
		
		// 仲田君の口座情報を表示
		System.out.println("■仲田君の口座");
		// 仲田君の口座名義を表示
		System.out.println("　口座名義：" + nakataAccount.getAccountHolder());
		// 仲田君の口座番号を表示
		System.out.println("　口座番号：" + nakataAccount.getAccountNumber());
		// 仲田君の預金残高を表示
		System.out.println("　預金残高：" + nakataAccount.getDepositBalance());
		
		// 松本君の口座情報を表示
		System.out.println("■松本君の口座");
		// 松本君の口座名義を表示
		System.out.println("　口座名義：" + matumotoAccount.getAccountHolder());
		// 松本君の口座番号を表示
		System.out.println("　口座番号：" + matumotoAccount.getAccountNumber());
		// 松本君の預金残高を表示
		System.out.println("　預金残高：" + matumotoAccount.getDepositBalance());
		// 松本君の定期預金残高を表示
		System.out.println("　定期預金残高：" + matumotoAccount.getTimeBalance());
		// 松本君の預金残高合計を表示
		System.out.println("　預金残高合計：" + matumotoAccount.getDepositBalance() + matumotoAccount.getTimeBalance());
		
		// 高橋君の口座情報を表示
		System.out.println("■高橋君の口座");
		// 高橋君の口座名義を表示
		System.out.println("　口座名義：" + takahashiAccount.getAccountHolder());
		// 高橋君の口座番号を表示
		System.out.println("　口座番号：" + takahashiAccount.getAccountNumber());
		// 高橋君の預金残高を表示
		System.out.println("　預金残高：" + takahashiAccount.getDepositBalance());
		// 高橋君の定期預金残高を表示
		System.out.println("　定期預金残高：" + takahashiAccount.getTimeBalance());
		// 高橋君の預金残高合計を表示
		System.out.println("　預金残高合計：" + takahashiAccount.getDepositBalance() + takahashiAccount.getTimeBalance());
		
		// 改行する
		System.out.println();
		// 足立君と仲田君の口座情報の預金残高と定期預金残高の合計額(定期預金残高の情報を持たない場合は
		// 預金残高のみ)を比較し、その結果に対応した値を表示
		System.out.println("足立・仲田　返却値：" + TimeAccount.compBalance(adachiAccount, nakataAccount));
		// 返却された値の意味する表記を表示
		indicateComparisonResult(TimeAccount.compBalance(adachiAccount, nakataAccount));
		// 足立君と松本君の口座情報の預金残高と定期預金残高の合計額(定期預金残高の情報を持たない場合は
		// 預金残高のみ)を比較し、その結果に対応した値を表示
		System.out.println("足立・松本　返却値：" + TimeAccount.compBalance(adachiAccount, matumotoAccount));
		// 返却された値の意味する表記を表示
		indicateComparisonResult(TimeAccount.compBalance(adachiAccount, matumotoAccount));
		// 足立君と高橋君の口座情報の預金残高と定期預金残高の合計額(定期預金残高の情報を持たない場合は
		// 預金残高のみ)を比較し、その結果に対応した値を表示
		System.out.println("足立・高橋　返却値：" + TimeAccount.compBalance(adachiAccount, takahashiAccount));
		// 返却された値の意味する表記を表示
		indicateComparisonResult(TimeAccount.compBalance(adachiAccount, takahashiAccount));
		
		// 改行する
		System.out.println();
		// 仲田君と松本君の口座情報の預金残高と定期預金残高の合計額(定期預金残高の情報を持たない場合は
		// 預金残高のみ)を比較し、その結果に対応した値を表示
		System.out.println("仲田・松本　返却値：" + TimeAccount.compBalance(nakataAccount, matumotoAccount));
		// 返却された値の意味する表記を表示
		indicateComparisonResult(TimeAccount.compBalance(nakataAccount, matumotoAccount));
		// 仲田君と高橋君の口座情報の預金残高と定期預金残高の合計額(定期預金残高の情報を持たない場合は
		// 預金残高のみ)を比較し、その結果に対応した値を表示
		System.out.println("仲田・高橋　返却値：" + TimeAccount.compBalance(nakataAccount, takahashiAccount));
		// 返却された値の意味する表記を表示
		indicateComparisonResult(TimeAccount.compBalance(nakataAccount, takahashiAccount));
		
		// 改行する
		System.out.println();
		// 松本君と高橋君の口座情報の預金残高と定期預金残高の合計額(定期預金残高の情報を持たない場合は
		// 預金残高のみ)を比較し、その結果に対応した値を表示
		System.out.println("松本・高橋　返却値：" + TimeAccount.compBalance(matumotoAccount, takahashiAccount));
		// 返却された値の意味する表記を表示
		indicateComparisonResult(TimeAccount.compBalance(matumotoAccount, takahashiAccount));

	}

}
