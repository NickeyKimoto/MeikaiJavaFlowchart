package Chapter09.day3;

/*
*クラス名：CheckOperationDay
*概要：日付を年・月・日(曜日)で表し、比較したり表示したりする
*作成者：N.Kimoto
*作成日：2024/05/02
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class CheckOperationDay {
	
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
		
		// 一つ目の日付を入力させる
		System.out.println("day1を入力せよ。");
		// 一つ目の年の値の入力を促す
		System.out.print("年：");
		// 入力された値を読み込む
		int firstYear = standardInput.nextInt();
		// 入力された値が0以下の場合
		while (firstYear <= 0) {
			
			// 正の整数値を入力させる
			firstYear = inputRange(firstYear);
			
		}
		
		// 一つ目の月の値の入力を促す
		System.out.print("月：");
		// 入力された値を読み込む
		int firstMonth = standardInput.nextInt();
		// 入力された値が0有効範囲外の場合
		while (firstMonth <= 0 || firstMonth > MAXIMUM_MONTH) {
			
			// 有効範囲内の整数値を入力させる
			firstMonth = inputRange(firstMonth);
			
		}
		
		// 一つ目の日の値の入力を促す
		System.out.print("日：");
		// 入力された値を読み込む
		int firstDate = standardInput.nextInt();
		// 入力された値が0以下の場合
		while (firstDate <= 0 || firstDate > MAXIMUM_DATE) {
			
			// 有効範囲内の整数値を入力させる
			firstDate = inputRange(firstDate);
			
		}
		
		// 読み込んだ値で一つ目の日付を初期化
		Day firstDay = new Day(firstYear, firstMonth, firstDate);
		// 一つ目の日付を表示
		System.out.println("day1 = " + firstDay);
		
		// コピーコンストラクタで一つ目の日付と同じ日付で二つ目の日付を初期化する
		Day secondDay = new Day(firstDay);
		// 二つ目の日付にコピーしたことを表示
		System.out.println("day2をday1と同じ日付として作りました。");
		// 二つ目の日付を表示
		System.out.println("day2 = " + secondDay);
		
		// 二つの日付を比較し、同じだった場合
		if (firstDay.equalTo(secondDay)) {
					
			// 二つの日付が等しいことを表示
			System.out.println("day1とday2は等しいです。");
			
		// 二つの日付を比較し、同じではなかった場合
		} else {
			
			// 二つの日付が等しくないことを表示
			System.out.println("day1とday2は等しくありません。");
			
		}
		
		// 三つ目の日付を入力させる
		System.out.println("day3を入力せよ。");
		// 三つ目の年の値の入力を促す
		System.out.print("年：");
		// 入力された値を読み込む
		int thirdYear = standardInput.nextInt();
		// 入力された値が0以下の場合
		while (thirdYear <= 0) {
			
			// 正の整数値を入力させる
			thirdYear = inputRange(thirdYear);
			
		}
		
		// 三つ目の月の値の入力を促す
		System.out.print("月：");
		// 入力された値を読み込む
		int thirdMonth = standardInput.nextInt();
		// 入力された値が0有効範囲外の場合
		while (thirdMonth <= 0 || thirdMonth > MAXIMUM_MONTH) {
			
			// 有効範囲内の整数値を入力させる
			thirdMonth = inputRange(thirdMonth);
			
		}
		
		// 三つ目の日の値の入力を促す
		System.out.print("日：");
		// 入力された値を読み込む
		int thirdDate = standardInput.nextInt();
		// 入力された値が0以下の場合
		while (thirdDate <= 0 || thirdDate > MAXIMUM_DATE) {
			
			// 有効範囲内の整数値を入力させる
			thirdDate = inputRange(thirdDate);
			
		}
		
		// 読み込んだ値で三つ目の日付を初期化
		Day thirdDay = new Day(thirdYear, thirdMonth, thirdDate);
		// 三つ目の日付を表示
		System.out.println("day3 = " + thirdDay);
		
		// 二つの日付を比較し、同じだった場合
		if (firstDay.equalTo(thirdDay)) {
					
			// 二つの日付が等しいことを表示
			System.out.println("day1とday3は等しいです。");
			
		// 二つの日付を比較し、同じではなかった場合
		} else {
			
			// 二つの日付が等しくないことを表示
			System.out.println("day1とday3は等しくありません。");
			
		}
		
		// 全てのコンストラクタが多重定義されているか検証
		// 一つ目の日付を何も入力せずに初期化
		Day sampleFirstDay  = new Day();
		// 二つ目の日付を年だけ入力し初期化
		Day sampleSecondDay = new Day(firstYear);
		// 三つ目の日付を年と月だけ入力し初期化
		Day sampleThirdDay  = new Day(firstYear, firstMonth);
		// 四つ目の日付を年・月・日を入力し初期化
		Day sampleFourthDay = new Day(firstYear, firstMonth, firstDate);
		
		// 一つ目の日付を表示
		System.out.println("d1   = " + sampleFirstDay);
		// 二つ目の日付を表示
		System.out.println("d2   = " + sampleSecondDay);
		// 三つ目の日付を表示
		System.out.println("d3   = " + sampleThirdDay);
		// 四つ目の日付を表示
		System.out.println("d4   = " + sampleFourthDay);
		
		// Day型配列を生成することを表示
		System.out.println("day型の配列を生成します。");
		// 要素数の入力を促す
		System.out.print("要素数：");
		// 入力された値を読み込む
		int elementCount = standardInput.nextInt();
		// 入力された値が0以下の場合
		while (elementCount <= 0) {
			
			// 正の整数値を入力させる
			elementCount = inputRange(elementCount);
			
		}
		
		// 入力された値の要素数を持つ日付のDay型配列を生成
		Day[] dateArray = new Day[elementCount];
		
		// 生成した配列の全要素に日付を初期化する
		for(int i = 0; i < dateArray.length; i++) {
			
			// 全要素を1年1月1日に設定
			dateArray[i] = new Day();
			
		}
		
		// 生成した配列の全要素の日付を表示
		for(int i = 0; i < dateArray.length; i++) {
			
			// 要素の日付を表示
			System.out.println("a[" + i + "] = " + dateArray[i]);
			
		}

	}

}
