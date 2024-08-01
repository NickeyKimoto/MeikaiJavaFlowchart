package Chapter10.day4;

/*
*クラス名：DayTester
*概要：Dayクラスをテストする
*作成者：N.Kimoto
*作成日：2024/05/16
*/

// Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class DayTester {
	
	// Scannerオブジェクトを生成
	static Scanner standardInput = new Scanner(System.in);
	
	/*
	*関数名：inputRange
	*概要：入力した値を範囲内の値で入力させる
	*引数：なし
	*戻り値：入力された値(int型)
	*作成者：N.Kimoto
	*作成日：2024/04/30
	*/
	
	static int inputRange() {

		// 範囲内の値の入力を促す
		System.out.print("有効範囲内で入力してください：");
		// 入力された値を読み込む
		int inputValue = standardInput.nextInt();
		// 読み込んだ値を返却する
		return inputValue;

	}
	
	/*
	*関数名：inputYear
	*概要：年の値を入力させ、返却する
	*引数：なし
	*戻り値：年の値(int型)
	*作成者：N.Kimoto
	*作成日：2024/05/15
	*/
	
	static int inputYear() {
		
		// 年の値の入力を促す
		System.out.print("年：");
		// 入力された値を読み込む
		int enteredValue = standardInput.nextInt();
		
		// 年の値を返却する
		return enteredValue;
		
	}
	
	/*
	*関数名：inputMonth
	*概要：月の値を入力させ、返却する
	*引数：なし
	*戻り値：月の値(int型)
	*作成者：N.Kimoto
	*作成日：2024/05/15
	*/
	
	static int inputMonth() {
		
		// 月の値の入力を促す
		System.out.print("月：");
		// 入力された値を読み込む
		int enteredValue = standardInput.nextInt();
		
		// 月の値を返却する
		return enteredValue;
		
	}
	
	/*
	*関数名：inputDate
	*概要：日の値を入力させ、返却する
	*引数：なし
	*戻り値：日の値(int型)
	*作成者：N.Kimoto
	*作成日：2024/05/15
	*/
	
	static int inputDate() {
		
		// 日の値の入力を促す
		System.out.print("日：");
		// 入力された値を読み込む
		int enteredValue = standardInput.nextInt();
		
		// 日の値を返却する
		return enteredValue;
		
	}

	public static void main(String[] args) {
		
		// 追加したそれぞれのメソッドの説明をメソッド番号を振り分けながら表示
		// 1個目のメソッドの説明を表示
		System.out.println("①引数を受け取らないコンストラクタによるインスタンス生成時\n"
				+ "プログラム実行時の日付で初期化");
		// 2個目のメソッドの説明を表示
		System.out.println("②引数を受け取るコンストラクタに不正な値が指定された場合\n"
				+ "適当な値に調整する");
		// 3個目のメソッドの説明を表示
		System.out.println("③年内での経過日数を求めるメソッド");
		// 4個目のメソッドの説明を表示
		System.out.println("④年内での残り日数を求めるメソッド");
		// 5個目のメソッドの説明を表示
		System.out.println("⑤他の日付との前後関係を判定するメソッド");
		// 6個目のメソッドの説明を表示
		System.out.println("⑥二つの日付の前後関係を判定するメソッド");
		// 7個目のメソッドの説明を表示
		System.out.println("⑦日付を一つ後ろに進めるメソッド");
		// 8個目のメソッドの説明を表示
		System.out.println("⑧次の日の日付を返却するメソッド");
		// 9個目のメソッドの説明を表示
		System.out.println("⑨日付を一つ前に戻すメソッド");
		// 10個目のメソッドの説明を表示
		System.out.println("⑩前の日の日付を返却するメソッド");
		// 11個目のメソッドの説明を表示
		System.out.println("⑪日付をn日後ろに進めるメソッド");
		// 12個目のメソッドの説明を表示
		System.out.println("⑫n日後の日付を返却するメソッド");
		// 13個目のメソッドの説明を表示
		System.out.println("⑬日付をn日前に戻すメソッド");
		// 14個目のメソッドの説明を表示
		System.out.println("⑭n日前の日付を返却するメソッド");
		
		// 行える選択肢の個数を表す定数を宣言
		final int NUMBER_OF_CHOICES = 15;
		// プログラムを終了する番号とそれぞれのテスト番号を格納する配列を宣言
		final int[] TEST_METHOD_NUMBER = new int[NUMBER_OF_CHOICES];
		// 配列にプログラムを終了する番号とそれぞれのテスト番号を格納する
		for (int i = 0; i < NUMBER_OF_CHOICES; i++) {
			
			// 0から順に値を代入
			TEST_METHOD_NUMBER[i] = i;
			
		}
		
		
		// テストするメソッドの番号を表す変数を初期化
		int chooseTestNumber = 0;
		
		// 選択したメソッドのテストを行う
		do {
		
			// テストするメソッドの番号の入力を促す
			System.out.print("どの機能をテストしますか[0…終了 ／ 1～14…テストするメソッド番号]：");
			// 入力された値を読み込む
			chooseTestNumber = standardInput.nextInt();
			
			// 改行する
			System.out.println();
			
			// 0かテストするメソッド番号以外の値を入力した場合
			while (chooseTestNumber < TEST_METHOD_NUMBER[0] || chooseTestNumber > TEST_METHOD_NUMBER.length) {
				
				// 0かテストするメソッド番号の値を入力させる
				chooseTestNumber = inputRange();
				
			}
			
			// テスト番号1を入力した場合
			if (chooseTestNumber == TEST_METHOD_NUMBER[1]) {
				
				// 1のメソッドのテストを行うことを表示
				System.out.println("①をテストします。");
				
				// 引数を受け取らずにDay型変数を宣言
				Day noInputDate = new Day();
				// 宣言したDay型変数を表示
				System.out.println("noInputDate = " + noInputDate);
				
				// 改行する
				System.out.println();
			
			// テスト番号2を入力した場合
			} else if (chooseTestNumber == TEST_METHOD_NUMBER[2]) {
				
				// 2のメソッドのテストを行うことを表示
				System.out.println("②をテストします。");
				// 日付の入力を促す
				System.out.println("日付を入力せよ。");
				// 年の値を入力させ値を読み込む
				int sampleYear = inputYear();
				// 月の値を入力させ値を読み込む
				int sampleMonth = inputMonth();
				// 日の値を入力させ値を読み込む
				int sampleDate = inputDate();
				
				// 年の値を引数に持つ日付を宣言
				Day haveYearDate = new Day (sampleYear);
				// 年と月の値を引数に持つ日付を宣言
				Day haveYearMonthDate = new Day (sampleYear, sampleMonth);
				// 年と月と日の値を引数に持つ日付を宣言
				Day haveYearMonthDateDate = new Day (sampleYear, sampleMonth, sampleDate);
				// Day型変数を引数に持つ日付を宣言
				Day haveDayDate = new Day(haveYearMonthDateDate);
				
				// 年の値を引数に持つ日付を表示
				System.out.println("年の値を引数に持つ日付 = " + haveYearDate);
				// 年と月の値を引数に持つ日付を表示
				System.out.println("年と月の値を引数に持つ日付 = " + haveYearMonthDate);
				// 年と月と日の値を引数に持つ日付を表示
				System.out.println("年と月と日の値を引数に持つ日付 = " + haveYearMonthDateDate);
				// Day型変数を引数に持つ日付を表示
				System.out.println("Day型変数を引数に持つ日付 = " + haveDayDate);
				
				// 改行する
				System.out.println();
					
			// テスト番号3を入力した場合
			} else if (chooseTestNumber == TEST_METHOD_NUMBER[3]) {

				// 3のメソッドのテストを行うことを表示
				System.out.println("③をテストします。");
				// 日付の入力を促す
				System.out.println("日付を入力せよ。");
				// 基準となる日付の年の値を入力させ値を読み込む
				int standardYear = inputYear();
				// 基準となる日付の月の値を入力させ値を読み込む
				int standardMonth = inputMonth();
				// 基準となる日付の日の値を入力させ値を読み込む
				int standardDate = inputDate();
				
				// 入力された値で基準となる日付を初期化
				Day standardDayDate = new Day(standardYear, standardMonth, standardDate);
				// 基準となる日付を表示
				System.out.println("基準となる日付 = " + standardDayDate);
				
				// 経過日数を計算し表示
				System.out.println(standardDayDate.getYear() + "年内での経過日数は" 
				+ Day.calculateElapsedDays(standardDayDate) + "日です。");
				
				// 改行する
				System.out.println();
				
			// テスト番号4を入力した場合
			} else if (chooseTestNumber == TEST_METHOD_NUMBER[4]) {
				
				// 4のメソッドのテストを行うことを表示
				System.out.println("④をテストします。");
				// 日付の入力を促す
				System.out.println("日付を入力せよ。");
				// 基準となる日付の年の値を入力させ値を読み込む
				int standardYear = inputYear();
				// 基準となる日付の月の値を入力させ値を読み込む
				int standardMonth = inputMonth();
				// 基準となる日付の日の値を入力させ値を読み込む
				int standardDate = inputDate();
				
				// 入力された値で基準となる日付を初期化
				Day standardDayDate = new Day(standardYear, standardMonth, standardDate);
				// 基準となる日付を表示
				System.out.println("基準となる日付 = " + standardDayDate);
				
				// 残り日数を計算し表示
				System.out.println(standardDayDate.getYear() + "年内での残り日数は"
				+ Day.calculateDaysLeft(standardDayDate) + "日です。");
				
				// 改行する
				System.out.println();
				
			// テスト番号5を入力した場合
			} else if (chooseTestNumber == TEST_METHOD_NUMBER[5]) {
				
				// 5のメソッドのテストを行うことを表示
				System.out.println("⑤をテストします。");
				// 日付の入力を促す
				System.out.println("日付を入力せよ。");
				// 比較対象となる日付の年の値を入力させ値を読み込む
				int targetsYear = inputYear();
				// 比較対象となる日付の月の値を入力させ値を読み込む
				int targetsMonth = inputMonth();
				// 比較対象となる日付の日の値を入力させ値を読み込む
				int targetsDate = inputDate();
				
				// 入力された値で比較対象となる日付を初期化
				Day targetsDayDate = new Day(targetsYear, targetsMonth, targetsDate);
				// 比較対象となる日付を表示
				System.out.println("比較対象となる日付 = " + targetsDayDate);
				
				// 比較対象となる日付と他の日付の前後関係を調査し表示
				Day.compareOtherDates(targetsDayDate);
				
				// 改行する
				System.out.println();
				
			// テスト番号6を入力した場合
			} else if (chooseTestNumber == TEST_METHOD_NUMBER[6]) {
				
				// 6のメソッドのテストを行うことを表示
				System.out.println("⑥をテストします。");
				// 日付の入力を促す
				System.out.println("日付を入力せよ。");
				// 一つ目の比較対象となる日付の年の値を入力させ値を読み込む
				int firstTargetsYear = inputYear();
				// 一つ目の比較対象となる日付の月の値を入力させ値を読み込む
				int firstTargetsMonth = inputMonth();
				// 一つ目の比較対象となる日付の日の値を入力させ値を読み込む
				int firstTargetsDate = inputDate();
				
				// 入力された値で一つ目の比較対象となる日付を初期化
				Day firstTargetsDayDate = new Day(firstTargetsYear, firstTargetsMonth, firstTargetsDate);
				// 一つ目の比較対象となる日付を表示
				System.out.println("一つ目の比較対象となる日付 = " + firstTargetsDayDate);
				
				// 二つ目の比較対象となる日付の年の値を入力させ値を読み込む
				int secondTargetsYear = inputYear();
				// 二つ目の比較対象となる日付の月の値を入力させ値を読み込む
				int secondTargetsMonth = inputMonth();
				// 二つ目の比較対象となる日付の日の値を入力させ値を読み込む
				int secondTargetsDate = inputDate();
				
				// 入力された値で二つ目の比較対象となる日付を初期化
				Day secondTargetsDayDate = new Day(secondTargetsYear, secondTargetsMonth, secondTargetsDate);
				// 二つ目の比較対象となる日付を表示
				System.out.println("二つ目の比較対象となる日付 = " + secondTargetsDayDate);
				
				// 二つの比較対象となる日付の前後関係を調査し表示
				Day.compareTwoDates(firstTargetsDayDate, secondTargetsDayDate);
				
				// 改行する
				System.out.println();
				
			// テスト番号7を入力した場合
			} else if (chooseTestNumber == TEST_METHOD_NUMBER[7]) {
				
				// 7のメソッドのテストを行うことを表示
				System.out.println("⑦をテストします。");
				// 日付の入力を促す
				System.out.println("日付を入力せよ。");
				// 指定する日付の年の値を入力させ値を読み込む
				int specifyYear = inputYear();
				// 指定する日付の月の値を入力させ値を読み込む
				int specifyMonth = inputMonth();
				// 指定する日付の日の値を入力させ値を読み込む
				int specifyDate = inputDate();
				
				// 入力された値で指定する日付を初期化
				Day specifyDayDate = new Day(specifyYear, specifyMonth, specifyDate);
				// 指定する日付を表示
				System.out.println("指定する日付 = " + specifyDayDate);
				
				// 指定する日付を一つ後ろに進め表示
				Day.moveTomorrow(specifyDayDate);
				
				// 改行する
				System.out.println();
				
			// テスト番号8を入力した場合
			} else if (chooseTestNumber == TEST_METHOD_NUMBER[8]) {
				
				// 8のメソッドのテストを行うことを表示
				System.out.println("⑧をテストします。");
				// 日付の入力を促す
				System.out.println("日付を入力せよ。");
				// 指定する日付の年の値を入力させ値を読み込む
				int specifyYear = inputYear();
				// 指定する日付の月の値を入力させ値を読み込む
				int specifyMonth = inputMonth();
				// 指定する日付の日の値を入力させ値を読み込む
				int specifyDate = inputDate();
				
				// 入力された値で指定する日付を初期化
				Day specifyDayDate = new Day(specifyYear, specifyMonth, specifyDate);
				// 指定する日付を表示
				System.out.println("指定する日付 = " + specifyDayDate);
				
				// 指定する日付を一つ後ろに進め表示
				System.out.println("specifyDayDateの一つ後ろの日付は" + Day.calculateTomorrow(specifyDayDate) + "です。");
				
				// 改行する
				System.out.println();
				
			// テスト番号9を入力した場合
			} else if (chooseTestNumber == TEST_METHOD_NUMBER[9]) {
				
				// 9のメソッドのテストを行うことを表示
				System.out.println("⑨をテストします。");
				// 日付の入力を促す
				System.out.println("日付を入力せよ。");
				// 指定する日付の年の値を入力させ値を読み込む
				int specifyYear = inputYear();
				// 指定する日付の月の値を入力させ値を読み込む
				int specifyMonth = inputMonth();
				// 指定する日付の日の値を入力させ値を読み込む
				int specifyDate = inputDate();
				
				// 入力された値で指定する日付を初期化
				Day specifyDayDate = new Day(specifyYear, specifyMonth, specifyDate);
				// 指定する日付を表示
				System.out.println("指定する日付 = " + specifyDayDate);
				
				// 指定する日付を一つ前に戻し表示
				Day.moveYesterday(specifyDayDate);
				
				// 改行する
				System.out.println();
				
			// テスト番号10を入力した場合
			} else if (chooseTestNumber == TEST_METHOD_NUMBER[10]) {
				
				// 10のメソッドのテストを行うことを表示
				System.out.println("⑩をテストします。");
				// 日付の入力を促す
				System.out.println("日付を入力せよ。");
				// 指定する日付の年の値を入力させ値を読み込む
				int specifyYear = inputYear();
				// 指定する日付の月の値を入力させ値を読み込む
				int specifyMonth = inputMonth();
				// 指定する日付の日の値を入力させ値を読み込む
				int specifyDate = inputDate();
				
				// 入力された値で指定する日付を初期化
				Day specifyDayDate = new Day(specifyYear, specifyMonth, specifyDate);
				// 指定する日付を表示
				System.out.println("指定する日付 = " + specifyDayDate);
				
				// 指定する日付を一つ前に戻し(ひとつ前の日が存在しない場合は元の日付)表示
				System.out.println(Day.calculateYesterday(specifyDayDate));
				
				// 改行する
				System.out.println();
				
			// テスト番号11を入力した場合
			} else if (chooseTestNumber == TEST_METHOD_NUMBER[11]) {
				
				// 11のメソッドのテストを行うことを表示
				System.out.println("⑪をテストします。");
				// 後ろに進める日数の値の入力を促す
				System.out.print("何日後(有効範囲…1日以上)：");
				// 入力された値を読み込む
				int shiftNumberOfDays = standardInput.nextInt();
				// 入力された値が1未満の場合
				while (shiftNumberOfDays < 1) {
					
					// 1以上の値を入力させる
					shiftNumberOfDays = inputRange();
					
				}
				// 指定する日付の年の値を入力させ値を読み込む
				int specifyYear = inputYear();
				// 指定する日付の月の値を入力させ値を読み込む
				int specifyMonth = inputMonth();
				// 指定する日付の日の値を入力させ値を読み込む
				int specifyDate = inputDate();
				
				// 入力された値で指定する日付を初期化
				Day specifyDayDate = new Day(specifyYear, specifyMonth, specifyDate);
				// 指定する日付を表示
				System.out.println("指定する日付 = " + specifyDayDate);
				
				// 指定する日付を入力された日数分後ろに進め表示
				Day.moveAFewDaysLater(specifyDayDate, shiftNumberOfDays);
				
				// 改行する
				System.out.println();
				
			// テスト番号12を入力した場合
			} else if (chooseTestNumber == TEST_METHOD_NUMBER[12]) {
				
				// 12のメソッドのテストを行うことを表示
				System.out.println("⑫をテストします。");
				// 後ろに進める日数の値の入力を促す
				System.out.print("何日後(有効範囲…1日以上)：");
				// 入力された値を読み込む
				int shiftNumberOfDays = standardInput.nextInt();
				// 入力された値が1未満の場合
				while (shiftNumberOfDays < 1) {
					
					// 1以上の値を入力させる
					shiftNumberOfDays = inputRange();
					
				}
				// 指定する日付の年の値を入力させ値を読み込む
				int specifyYear = inputYear();
				// 指定する日付の月の値を入力させ値を読み込む
				int specifyMonth = inputMonth();
				// 指定する日付の日の値を入力させ値を読み込む
				int specifyDate = inputDate();
				
				// 入力された値で指定する日付を初期化
				Day specifyDayDate = new Day(specifyYear, specifyMonth, specifyDate);
				// 指定する日付を表示
				System.out.println("指定する日付 = " + specifyDayDate);
				
				// 指定する日付を入力された日数分後ろに進め表示
				System.out.println("specifyDayDateの" + shiftNumberOfDays + "日後の日付は" + 
				Day.calculateSeveralDaysLater(specifyDayDate, shiftNumberOfDays) + "です。");
				
				// 改行する
				System.out.println();
				
			// テスト番号13を入力した場合
			} else if (chooseTestNumber == TEST_METHOD_NUMBER[13]) {
				
				// 13のメソッドのテストを行うことを表示
				System.out.println("⑬をテストします。");
				// 前に戻す日数の値の入力を促す
				System.out.print("何日前(有効範囲…1日以上)：");
				// 入力された値を読み込む
				int shiftNumberOfDays = standardInput.nextInt();
				// 入力された値が1未満の場合
				while (shiftNumberOfDays < 1) {
					
					// 1以上の値を入力させる
					shiftNumberOfDays = inputRange();
					
				}
				// 指定する日付の年の値を入力させ値を読み込む
				int specifyYear = inputYear();
				// 指定する日付の月の値を入力させ値を読み込む
				int specifyMonth = inputMonth();
				// 指定する日付の日の値を入力させ値を読み込む
				int specifyDate = inputDate();
				
				// 入力された値で指定する日付を初期化
				Day specifyDayDate = new Day(specifyYear, specifyMonth, specifyDate);
				// 指定する日付を表示
				System.out.println("指定する日付 = " + specifyDayDate);
				
				// 指定する日付を入力された日数分前に戻し表示
				Day.moveAFewDaysAgo(specifyDayDate, shiftNumberOfDays);
				
				// 改行する
				System.out.println();
				
			// テスト番号14を入力した場合
			} else if (chooseTestNumber == TEST_METHOD_NUMBER[14]) {
				
				// 14のメソッドのテストを行うことを表示
				System.out.println("⑭をテストします。");
				// 前に戻す日数の値の入力を促す
				System.out.print("何日前(有効範囲…1日以上)：");
				// 入力された値を読み込む
				int shiftNumberOfDays = standardInput.nextInt();
				// 入力された値が1未満の場合
				while (shiftNumberOfDays < 1) {
					
					// 1以上の値を入力させる
					shiftNumberOfDays = inputRange();
					
				}
				// 指定する日付の年の値を入力させ値を読み込む
				int specifyYear = inputYear();
				// 指定する日付の月の値を入力させ値を読み込む
				int specifyMonth = inputMonth();
				// 指定する日付の日の値を入力させ値を読み込む
				int specifyDate = inputDate();
				
				// 入力された値で指定する日付を初期化
				Day specifyDayDate = new Day(specifyYear, specifyMonth, specifyDate);
				// 指定する日付を表示
				System.out.println("指定する日付 = " + specifyDayDate);
				
				// 実際にずらした日数を計算する
				final int MINIMUM_YEAR = 1;
				// 月を表す値の最大値の定数を宣言
				final int MAXIMUM_MONTH = 12;
				// 月を表す値の最小値の定数を宣言
				final int MINIMUM_MONTH = 1;
				// 日を表す値の最小値の定数を宣言
				final int MINIMUM_DATE = 1;
				// 実際にずらした日数を正しい値の表記に調整するための定数を宣言
				final int ADJUSTMENT_NOTATION = 1;
				// ずらす日数の残りを表す変数を宣言
				int shiftNumberRemaining = shiftNumberOfDays;
				// 実際にずらした日数を表す変数を宣言
				int countShiftNumberOfDays = 0;
				
				// 日付をずらすと月をまたぐ場合、日付とずらす日数の残りを更新する
				while(specifyDate - shiftNumberRemaining < MINIMUM_DATE) {
					
					// ずらす日数を更新する
					shiftNumberRemaining -= specifyDate;
					// 実際にずらした日数をカウントする
					countShiftNumberOfDays += specifyDate;
					
					// 日の値が最小値を下回ったため、前の月に戻る
					specifyMonth--;
					
					// 月の値が最小値を下回る場合
					if (specifyMonth < MINIMUM_MONTH) {
						
						// 月の値が最小値を下回ったため、前の年に戻る
						specifyYear--;
						
						// 年の値が最小値を下回る場合
						if (specifyYear < MINIMUM_YEAR) {
							
							// これ以上ずらすことができないので、実際にずらした日数の計算を終了する
							break;
						}
						
						// 月の値を最大値に戻す
						specifyMonth = MAXIMUM_MONTH;
						
					}
					
					// 日付の日の値をその月の最大日数にする
					specifyDate = Day.findMaximumDaysOfMonth(specifyYear, specifyMonth);
					
				}
				
				// 日付をずらした際に年の値が最小値を下回った場合
				if (specifyYear < MINIMUM_YEAR) {
					
					// 戻ることができた実際の日数と最小値の日付を正しい表記に直して表示
					System.out.println(specifyDayDate + "の" + (countShiftNumberOfDays - ADJUSTMENT_NOTATION) + "日前の日付は"
							+ Day.calculateSeveralDaysAgo(specifyDayDate, shiftNumberOfDays) + "です。");
					
				// 日付をずらした際に年の値が最小値を下回らなかった場合
				} else {
				
					// 指定する日付を入力された日数分前に戻し表示
					System.out.println(specifyDayDate + "の" + shiftNumberOfDays + "日前の日付は"
					+ Day.calculateSeveralDaysAgo(specifyDayDate, shiftNumberOfDays) + "です。");
				
				}
				
				// 改行する
				System.out.println();
			
			}
			
		// 0を入力されない限り繰り返す
		} while (chooseTestNumber != TEST_METHOD_NUMBER[0]);
		
	}

}
