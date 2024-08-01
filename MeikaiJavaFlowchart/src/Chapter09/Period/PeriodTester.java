package Chapter09.Period;

/*
*クラス名：PeriodTester
*概要：期間の情報を入力し表示する
*作成者：N.Kimoto
*作成日：2024/05/08
*/

// Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class PeriodTester {
	
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

	public static void main(String[] args) {

		// 月の値の最大値の定数を宣言
		final int MAXIMUM_MONTH = 12;
		// 日の値の最大値の定数を宣言
		final int MAXIMUM_DATE = 31;
		
		// 期間の情報の入力を促す
		System.out.println("期間のデータを入力せよ。");
		
		// 開始日の年の値の入力を促す
		System.out.print("開始日の年：");
		// 入力された値を読み込む
		int startDateYear = standardInput.nextInt();
		// 入力された値が0未満の場合
		while (startDateYear < 0) {
			
			// 0以上の整数を入力させる
			startDateYear = inputRange(startDateYear);
			
		}
		// 開始日の月の値の入力を促す
		System.out.print("開始日の月：");
		// 入力された値を読み込む
		int startDateMonth = standardInput.nextInt();
		// 入力された値が有効範囲(1から12)外の場合
		while (startDateMonth <= 0 || startDateMonth > MAXIMUM_MONTH) {
			
			// 有効範囲内の整数値を入力させる
			startDateMonth = inputRange(startDateMonth);
			
		}
		// 開始日の日の値の入力を促す
		System.out.print("開始日の日：");
		// 入力された値を読み込む
		int startDateDate = standardInput.nextInt();
		// 入力された値が有効範囲(1から31)外の場合
		while (startDateDate <= 0 || startDateDate > MAXIMUM_DATE) {
			
			// 有効範囲内の整数値を入力させる
			startDateDate = inputRange(startDateDate);
			
		}
		
		// 終了日の年の値の入力を促す
		System.out.print("終了日の年：");
		// 入力された値を読み込む
		int endDateYear = standardInput.nextInt();
		// 入力された値が0未満の場合
		while (endDateYear < 0) {
			
			// 0以上の整数を入力させる
			endDateYear = inputRange(endDateYear);
			
		}
		// 終了日の月の値の入力を促す
		System.out.print("終了日の月：");
		// 入力された値を読み込む
		int endDateMonth = standardInput.nextInt();
		// 入力された値が有効範囲(1から12)外の場合
		while (endDateMonth <= 0 || endDateMonth > MAXIMUM_MONTH) {
			
			// 有効範囲内の整数値を入力させる
			endDateMonth = inputRange(endDateMonth);
			
		}
		// 終了日の日の値の入力を促す
		System.out.print("終了日の日：");
		// 入力された値を読み込む
		int endDateDate = standardInput.nextInt();
		// 入力された値が有効範囲(1から31)外の場合
		while (endDateDate <= 0 || endDateDate > MAXIMUM_DATE) {
			
			// 有効範囲内の整数値を入力させる
			endDateDate = inputRange(endDateDate);
			
		}
		
		// 読み込んだ値で開始日を初期化
		Day startDate = new Day(startDateYear, startDateMonth, startDateDate);
		// 読み込んだ値で終了日を初期化
		Day endDate = new Day(endDateYear, endDateMonth, endDateDate);
		
		// 読み込んだ開始日と終了日で期間を初期化
		Period specifiedPeriod = new Period(startDate, endDate);
		
		// 読み込んだ期間の情報を表示
		System.out.println(specifiedPeriod.toString());

	}

}
