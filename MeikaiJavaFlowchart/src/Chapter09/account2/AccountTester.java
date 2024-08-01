package Chapter09.account2;

/*
*クラス名：AccountTester
*概要：銀行口座の情報を入力し表示する
*作成者：N.Kimoto
*作成日：2024/05/07
*/

// Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class AccountTester {
	
	// Scannerオブジェクトを生成
	static Scanner standardInput = new Scanner(System.in);
	
	/*
	*関数名：inputRange
	*概要：入力した値を範囲内の値で入力させる
	*引数：入力された値(int型)
	*戻り値：読み込んだ値(int型)
	*作成者：N.Kimoto
	*作成日：2024/04/30
	*/
	
	static int inputRange(int inputValue) {

		// 範囲内の値の入力を促す
		System.out.print("有効範囲内で入力してください：");
		// 入力された値を読み込む
		inputValue = standardInput.nextInt();
		// 読み込んだ値を返却する
		return inputValue;

	}
	
	/*
	*関数名：inputRange
	*概要：入力した値を範囲内の値で入力させる
	*引数：入力された値(long型)
	*戻り値：読み込んだ値(long型)
	*作成者：N.Kimoto
	*作成日：2024/04/30
	*/
	
	static long inputRange(long inputValue) {

		// 範囲内の値の入力を促す
		System.out.print("有効範囲内で入力してください：");
		// 入力された値を読み込む
		inputValue = standardInput.nextLong();
		// 読み込んだ値を返却する
		return inputValue;

	}
	
	/*
	*関数名：main
	*概要：銀行口座の情報を入力し表示する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/07
	*/

	public static void main(String[] args) {
		
		// 月の値の最大値の定数を宣言
		final int MAXIMUM_MONTH = 12;
		// 日の値の最大値の定数を宣言
		final int MAXIMUM_DATE = 31;
		
		// 銀行口座情報の入力を促す
		System.out.println("銀行口座のデータを入力せよ。");
		
		// 口座名義の入力を促す
		System.out.print("口座名義は：");
		// 入力された値を読み込む
		String name = standardInput.next();
		// 口座番号の入力を促す
		System.out.print("口座番号は：");
		// 入力された値を読み込む
		String no = standardInput.next();
		// 預金残高の入力を促す
		System.out.print("預金残高は：");
		// 入力された値を読み込む
		long balance = standardInput.nextLong();
		// 入力された値が0未満の場合
		while (balance < 0) {
			
			// 0以上の整数を入力させる
			balance = inputRange(balance);
			
		}
		// 口座開設日の年の値の入力を促す
		System.out.print("口座開設年：");
		// 入力された値を読み込む
		int openingAccountYear = standardInput.nextInt();
		// 入力された値が0未満の場合
		while (openingAccountYear < 0) {
			
			// 0以上の整数を入力させる
			openingAccountYear = inputRange(openingAccountYear);
			
		}
		// 口座開設日の月の値の入力を促す
		System.out.print("口座開設月：");
		// 入力された値を読み込む
		int openingAccountMonth = standardInput.nextInt();
		// 入力された値が有効範囲(1から12)外の場合
		while (openingAccountMonth <= 0 || openingAccountMonth > MAXIMUM_MONTH) {
			
			// 有効範囲内の整数値を入力させる
			openingAccountMonth = inputRange(openingAccountMonth);
			
		}
		System.out.print("口座開設日：");
		// 入力された値を読み込む
		int openingAccountDate = standardInput.nextInt();
		// 入力された値が有効範囲(1から31)外の場合
		while (openingAccountDate <= 0 || openingAccountDate > MAXIMUM_DATE) {
			
			// 有効範囲内の整数値を入力させる
			openingAccountDate = inputRange(openingAccountDate);
			
		}
		
		// 読み込んだ値で口座情報を初期化
		Account yourAccount = new Account(name, no, balance, new Day(openingAccountYear,
				openingAccountMonth, openingAccountDate));
		
		// 読み込んだ口座情報を表示
		System.out.println(yourAccount.toString());

	}

}
