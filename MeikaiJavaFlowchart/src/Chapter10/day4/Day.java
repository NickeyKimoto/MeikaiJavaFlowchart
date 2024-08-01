package Chapter10.day4;

/*
*クラス名：Day
*概要：日付に関する機能と情報を管理する
*作成者：N.Kimoto
*作成日：2024/05/16
*/

// Javaで現在の日付を取得するために必要なCalendarクラスをインポート
import static java.util.Calendar.*;

// Javaで現在の日付を取得するために必要なGregorianCalendarクラスをインポート
import java.util.GregorianCalendar;
//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class Day {
	
	// Scannerオブジェクトを生成
	static Scanner standardInput = new Scanner(System.in);
	
	// 年の値を初期化するための定数を宣言
	static final int DEFAULT_YEAR = 1;
	// 月の値を初期化するための定数を宣言
	static final int DEFAULT_MONTH = 1;
	// 日の値を初期化するための定数を宣言
	static final int DEFAULT_DATE = 1;
	// 1月を表す定数を宣言
	static final int MONTH_JANUARY = 1;
	// 2月を表す定数を宣言
	static final int MONTH_FEBRUARY = 2;
	// 12カ月分ずらすための定数を宣言
	// うるう年によって起こる曜日のずれを計算しやすいように最終月にしたいため
	static final int SHIFT_MONTHS = 12;
	// ある日付の七日後や七日前は同じ曜日になるため、七日を表す定数を宣言
	static final int SAME_DAY_OF_THE_WEEK = 7;
	// get(MONTH)の返却する値を正しい月に調整する定数を宣言
	static final int ADJUST_MONTH_NOTATION = 1;
	// うるう年が発生する条件を配列に格納し宣言
	static final int[] CONDITIONS_CONSTANT_LEAP_YEAR = {4, 100, 400};
	// 年を表す値の最小値の定数を宣言
	static final int MINIMUM_YEAR = 1;
	// 月を表す値の最大値の定数を宣言
	static final int MAXIMUM_MONTH = 12;
	// 月を表す値の最小値の定数を宣言
	static final int MINIMUM_MONTH = 1;
	// 日を表す値の最小値の定数を宣言
	static final int MINIMUM_DATE = 1;
	
	// 年を表すインスタンス変数を宣言
	private int year = DEFAULT_YEAR;
	// 月を表すインスタンス変数を宣言
	private int month = DEFAULT_MONTH;
	// 日を表すインスタンス変数を宣言
	private int date = DEFAULT_DATE;
	
	/*
	*コンストラクタ名：Day
	*概要：インスタンスの初期化
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/02
	*/
	
	public Day() {
		
		// プログラム実行時の日付を取得
		GregorianCalendar today = new GregorianCalendar();
		
		// 年を表すインスタンス変数をプログラム実行時の日付で初期化
		this.year = today.get(YEAR);
		// 月を表すインスタンス変数をプログラム実行時の日付で初期化
		this.month = today.get(MONTH) + ADJUST_MONTH_NOTATION;
		// 日を表すインスタンス変数をプログラム実行時の日付で初期化
		this.date = today.get(DATE);
		
	}
	

	/*
	*コンストラクタ名：Day
	*概要：インスタンスの初期化
	*引数：年(int型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/14
	*/
	
	public Day(int year) {
		
		// 受け取った年の引数が最小値を下回る場合
		if (year < MINIMUM_YEAR) {
			
			// 年の値を最小値に調整
			year = MINIMUM_YEAR;
			
		}
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
		
		// 受け取った年の引数が最小値を下回る場合
		if (year < MINIMUM_YEAR) {
			
			// 年の値を最小値に調整
			year = MINIMUM_YEAR;
			
		}
		// 年を表すインスタンス変数を引数で初期化
		this.year = year;
		
		// 受け取った月の引数が月の値の最小値を下回る場合
		if (month < MINIMUM_MONTH) {
			
			// 月の値を最小値に調整
			month = MINIMUM_MONTH;
			
			// 受け取った月の引数が月の値の最大値を上回る場合
		} else if (month > MAXIMUM_MONTH) {
			
			// 月の値を最大値に調整
			month = MAXIMUM_MONTH;
			
		}
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
		
		// 受け取った年の引数が最小値を下回る場合
		if (year < MINIMUM_YEAR) {
			
			// 年の値を最小値に調整
			year = MINIMUM_YEAR;
			
		}
		// 年を表すインスタンス変数を引数で初期化
		this.year = year;
		
		// 受け取った月の引数が月の値の最小値を下回る場合
		if (month < MINIMUM_MONTH) {
			
			// 月の値を最小値に調整
			month = MINIMUM_MONTH;
			
			// 受け取った月の引数が月の値の最大値を上回る場合
		} else if (month > MAXIMUM_MONTH) {
			
			// 月の値を最大値に調整
			month = MAXIMUM_MONTH;
			
		}
		// 月を表すインスタンス変数を引数で初期化
		this.month = month;
		
		// 受け取った日の引数が日の値の最小値を下回る場合
		if (date < MINIMUM_DATE) {
			
			// 日の値を最小値に調整
			date = MINIMUM_DATE;
			
		// 受け取った日の引数が日の値の最大値を上回る場合
		} else if (date > findMaximumDaysOfMonth(year, month)) {
			
			// 日の値をその月の最大日数に調整
			date = findMaximumDaysOfMonth(year, month);
			
		}
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
	*関数名：isLeap
	*概要：その年が閏年かどうか判定する
	*引数：年(int型)
	*戻り値：閏年であるかどうか(boolean型)
	*作成者：N.Kimoto
	*作成日：2024/05/14
	*/
	
	public static boolean isLeap(int applicableYear) {
		
		// ツェラーの公式を用いて指定された年と条件を照らし合わせ、閏年であるかどうかを返却する(教本準拠の式)
		return applicableYear % CONDITIONS_CONSTANT_LEAP_YEAR[0] == 0 && applicableYear % CONDITIONS_CONSTANT_LEAP_YEAR[1] 
				!= 0 || applicableYear % CONDITIONS_CONSTANT_LEAP_YEAR[2] == 0;
		
	}
	
	/*
	*関数名：isLeap
	*概要：その年が閏年かどうか判定する
	*引数：なし
	*戻り値：その年が閏年かどうか(boolean型)
	*作成者：N.Kimoto
	*作成日：2024/05/14
	*/
	
	public boolean isLeap() {
		
		// 閏年の判定をメソッドを用いて行い、正否を返却する
		return isLeap(year);
		
	}
	
	/*
	*関数名：findMaximumDaysOfMonth
	*概要：指定した年の指定した月の最大日数を返却
	*引数：年(int型)、月(int型)
	*戻り値：最大日数(int型)
	*作成者：N.Kimoto
	*作成日：2024/05/15
	*/
	
	public static int findMaximumDaysOfMonth (int inputYear, int inputMonth) {
		
		// その月の最大日数を格納した配列を宣言
		final int[] MAXIMUM_DAYS_OF_MONTH = {31, isLeap(inputYear) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		// インデックス番号を引数の年と月に対応する箇所に調整し、最大日数を返却
		return MAXIMUM_DAYS_OF_MONTH[inputMonth--];
		
	}
	
	/*
	*関数名：day0fWeek
	*概要：その日付の曜日を求める
	*引数：なし
	*戻り値：曜日表す値(int型)
	*作成者：N.Kimoto
	*作成日：2024/05/02
	*/
	
	public int day0fWeek() {
		
		// 月による曜日のずれを求める公式の定数を構成要素に持つ配列を宣言
		final int[] SHIFT_IN_DAYS_OF_WEEK = {5, 8, 13};
		
		// 年を表す変数に指定した年の値を代入
		int y = year;    
		// 月を表す変数に指定した月の値を代入
		int m = month;

		// 日付が1月か2月だった場合、前年の13月14月として扱う
		if (m == MONTH_JANUARY || m == MONTH_FEBRUARY) {

			// 年の値を1減らす
			y--;
			// 月の値に12を加算する
			m += SHIFT_MONTHS;
			
		}
		
		// 曜日を求め、日曜日から土曜日までを0から6の値で返却
		return (y + y / CONDITIONS_CONSTANT_LEAP_YEAR[0] - y / CONDITIONS_CONSTANT_LEAP_YEAR[1] + y /
				CONDITIONS_CONSTANT_LEAP_YEAR[2] + (SHIFT_IN_DAYS_OF_WEEK[2] * m + 
						SHIFT_IN_DAYS_OF_WEEK[1]) / SHIFT_IN_DAYS_OF_WEEK[0] + date) % SAME_DAY_OF_THE_WEEK;
		
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
	*関数名：calculateElapsedDays
	*概要：年内での経過日数を求め、その値を返却する
	*引数：日付(Day型)
	*戻り値：年内での経過日数(int型)
	*作成者：N.Kimoto
	*作成日：2024/05/13
	*/
	
	public static int calculateElapsedDays(Day inputDay) {
		
		// 経過日数を表す変数を宣言(初期値は日付の日の値までの日数を計算した値)
		int elapsedDays = --inputDay.date;
			
		// その月までの月の最大日数を経過日数に加算する
		for (int i = 1; i < inputDay.month; i++) {
			
			// その月の最大日数を経過日数に加算する
			elapsedDays += findMaximumDaysOfMonth(inputDay.year, i);
			
		}
		
		// 求めた経過日数を返却する
		return elapsedDays;
		
	}
	
	/*
	*関数名：calculateDaysLeft
	*概要：年内での残り日数を求め、その値を返却する
	*引数：日付(Day型)
	*戻り値：年内での残り日数(int型)
	*作成者：N.Kimoto
	*作成日：2024/05/13
	*/
	
	public static int calculateDaysLeft(Day inputDay) {
		
		// その年の最大日数を格納した配列を宣言する
		final int[] MAXIMUM_DAYS_OF_YEAR = {366, 365};
		// 閏年を考慮しながら残り日数を計算する
		int daysLeft = (inputDay.isLeap() ? MAXIMUM_DAYS_OF_YEAR[0] : MAXIMUM_DAYS_OF_YEAR[1])
				- calculateElapsedDays(inputDay);
		
		// 求めた残り日数を返却する
		return daysLeft;
		
	}
	
	/*
	*関数名：calculateQuantifiedDate
	*概要：日付を比較可能な数値へと変更する
	*引数：日付(Day型)
	*戻り値：比較可能な数値(int型)
	*作成者：N.Kimoto
	*作成日：2024/05/15
	*/
	
	public static int calculateQuantifiedDate(Day inputDay) {
		
		// 日付を比較可能な数値へと変更した際に、最初の比較箇所となる部分を表す定数を宣言
		final int FIRST_COMPARISON_POINT = 10000;
		// 日付を比較可能な数値へと変更した際に、2番目の比較箇所となる部分を表す定数を宣言
		final int SECOND_COMPARISON_POINT = 100;
		
		// 引数の日付を計算し比較可能な数値へ変更
		int inputQuantifiedDate = inputDay.getYear() * FIRST_COMPARISON_POINT +
				inputDay.getMonth() * SECOND_COMPARISON_POINT + inputDay.getDate();
		
		// 数値を返却
		return inputQuantifiedDate;
		
	}
	
	/*
	*関数名：compareOtherDates
	*概要：指定された日付と比較対象となる日付の前後関係を調べる
	*引数：日付(Day型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/13
	*/
	
	public static void compareOtherDates (Day inputDay) {
		
		// 比較する対象となる日付の入力を促す
		System.out.println("比較する日付を入力せよ。");
		
		// 比較する対象となる日付の年の値の入力を促す
		System.out.print("年：");
		// 入力された値を読み込む
		int targetsYear = standardInput.nextInt();
		// 比較する対象となる日付の月の値の入力を促す
		System.out.print("月：");
		// 入力された値を読み込む
		int targetsMonth = standardInput.nextInt();
		// 比較する対象となる日付の日の値の入力を促す
		System.out.print("日：");
		// 入力された値を読み込む
		int targetsDate = standardInput.nextInt();
		
		// 入力された値で比較する対象となる日付を初期化
		Day targetsDay = new Day(targetsYear, targetsMonth, targetsDate);
		
		// 引数の日付を計算し比較可能な数値へ変更
		int inputQuantifiedDate = calculateQuantifiedDate(inputDay);
		// 比較する対象となる日付を計算し比較可能な数値へ変更
		int targetsQuantifiedDate = calculateQuantifiedDate(targetsDay);
		
		// 二つの日付を比較し、引数の日付のほうが大きい場合
		if (inputQuantifiedDate > targetsQuantifiedDate) {
			
			// 引数の日付が対象の日付よりも後の日付であることを表示
			System.out.println(inputDay.toString() + "は、" + targetsDay.toString() + "よりも後の日付です。");
			
		// 二つの日付を比較し、引数の日付のほうが小さい場合
		} else if (inputQuantifiedDate < targetsQuantifiedDate) {
			
			// 引数の日付が対象の日付よりも前の日付であることを表示
			System.out.println(inputDay.toString() + "は、" + targetsDay.toString() + "よりも前の日付です。");
			
		// 二つの日付を比較し、二つとも同じ大きさの場合
		} else {
			
			// 引数の日付と対象の日付が同じ日付であることを表示
			System.out.println(inputDay.toString() + "は、" + targetsDay.toString() + "と同じ日付です。");
			
		}
		
	}
	
	/*
	*関数名：compareTwoDates
	*概要：二つの日付の前後関係を調べる
	*引数：日付(Day型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/15
	*/
	
	public static void compareTwoDates (Day inputFirstDay, Day inputSecondDay) {
		
		// 引数の一つ目の日付を計算し比較可能な数値へ変更
		int inputFirstQuantifiedDate = calculateQuantifiedDate(inputFirstDay);
		// 引数の二つ目の日付を計算し比較可能な数値へ変更
		int inputSecondQuantifiedDate = calculateQuantifiedDate(inputSecondDay);
		
		// 二つの日付を比較し、一つ目の日付のほうが大きい場合
		if (inputFirstQuantifiedDate > inputSecondQuantifiedDate) {
			
			// 一つ目の日付が後の日付で二つ目の日付が前の日付であることを表示
			System.out.println(inputFirstDay.toString() + "が後の日付で、" + inputSecondDay.toString() + "が前の日付です。");
			
		// 二つの日付を比較し、二つ目の日付のほうが大きい場合
		} else if (inputFirstQuantifiedDate < inputSecondQuantifiedDate) {
			
			// 一つ目の日付が前の日付で二つ目の日付が後の日付であることを表示
			System.out.println(inputFirstDay.toString() + "が前の日付で、" + inputSecondDay.toString() + "が後の日付です。");
			
		// 二つの日付を比較し、二つとも同じ日付の場合
		} else {
			
			// 二つの日付が同じ日付であることを表示
			System.out.println(inputFirstDay.toString() + "と" + inputSecondDay.toString() + "は同じ日付です。");
			
		}
		
	}
	
	/*
	*関数名：calculateTomorrow
	*概要：引数の日付の次の日の日付を返却
	*引数：日付(Day型)
	*戻り値：次の日の日付(Day型)
	*作成者：N.Kimoto
	*作成日：2024/05/15
	*/
	
	public static Day calculateTomorrow (Day inputDay) {
		
		// 次の日の日付の年の値を引数の日付の年の値で初期化
		int yearTomorrow = inputDay.year;
		// 次の日の日付の月の値を引数の日付の月の値で初期化
		int monthTomorrow = inputDay.month;
		// 次の日の日付の日の値を引数の日付の日の値で初期化
		int dateTomorrow = inputDay.date;
		
		// 次の日の日付の日の値を1つ進める
		dateTomorrow++;
		
		// 次の日の日付の日の値がその月の最大日数を超える場合
		if (dateTomorrow > findMaximumDaysOfMonth(yearTomorrow, monthTomorrow)) {
			
			// 次の日の日付の日の値を最小値に戻す
			dateTomorrow = MINIMUM_DATE;
			// 次の日の日付の月の値を1つ進める
			monthTomorrow++;
			
			// 次の日の日付の月の値が最大月数を超える場合
			if (monthTomorrow > MAXIMUM_MONTH) {
				
				// 次の日の日付の月の値を最小値に戻す
				monthTomorrow = MINIMUM_MONTH;
				// 次の日の日付の年の値を1つ進める
				yearTomorrow++;
				
			}
			
		}
		
		// 次の日の日付を求めた値で初期化
		Day nextDay = new Day(yearTomorrow, monthTomorrow, dateTomorrow);
		
		// 次の日の日付を返却
		return nextDay;
		
	}
	
	/*
	*関数名：moveTomorrow
	*概要：引数の日付の次の日の日付を表示
	*引数：日付(Day型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/15
	*/
	
	public static void moveTomorrow (Day inputDay) {
		
		// 引数の日付の次の日の日付を表示
		System.out.println("明日の日付：" + calculateTomorrow(inputDay).toString());
		
	}
	
	/*
	*関数名：calculateSeveralDaysLater
	*概要：引数の日付の数日後の日付を返却
	*引数：日付(Day型)、ずらす日数(int型)
	*戻り値：数日後の日付(Day型)
	*作成者：N.Kimoto
	*作成日：2024/05/15
	*/
	
	public static Day calculateSeveralDaysLater (Day inputDay, int shiftNumberOfDays) {
		
		// 数日後の日付の年の値を引数の日付の年の値で初期化
		int yearSeveralDaysLater = inputDay.year;
		// 数日後の日付の月の値を引数の日付の月の値で初期化
		int monthSeveralDaysLater = inputDay.month;
		// 数日後の日付の日の値を引数の日付の日の値で初期化
		int dateSeveralDaysLater = inputDay.date;
			
		// 日付をずらすと月をまたぐ場合、日付とずらす日数を更新する
		while(shiftNumberOfDays - (findMaximumDaysOfMonth(yearSeveralDaysLater, monthSeveralDaysLater) - dateSeveralDaysLater) > 0) {
			
			// その月の最大日数に到達するまで日付をずらす
			shiftNumberOfDays -= findMaximumDaysOfMonth(yearSeveralDaysLater, monthSeveralDaysLater) - dateSeveralDaysLater;
			// 次の月に進む
			monthSeveralDaysLater++;
			
			// 月の値が最大値を超えた場合
			if (monthSeveralDaysLater > MAXIMUM_MONTH) {
				
				// 次の年に進む
				yearSeveralDaysLater++;
				// 月の値を最小値に戻す
				monthSeveralDaysLater = MINIMUM_MONTH;
				
			}
			
			// 日付の日の値を0にする
			dateSeveralDaysLater = 0;
			
		}
		
		// 日数分日付をずらす
		dateSeveralDaysLater += shiftNumberOfDays;
		
		// 数日後の日付を求めた値で初期化
		Day severalDaysLaterDay = new Day(yearSeveralDaysLater, monthSeveralDaysLater, dateSeveralDaysLater);
		
		// 数日後の日付を返却
		return severalDaysLaterDay;
		
	}
	
	/*
	*関数名：moveAFewDaysLater
	*概要：引数の日付の数日後の日付を返却
	*引数：日付(Day型)、ずらす日数(int型)
	*戻り値：
	*作成者：N.Kimoto
	*作成日：2024/05/15
	*/
	
	public static void moveAFewDaysLater (Day inputDay, int shiftNumberOfDays) {
		
		// 引数の日付の数日後の日付を表示
		System.out.println(shiftNumberOfDays + "日後の日付：" 
		+ calculateSeveralDaysLater(inputDay, shiftNumberOfDays).toString());
		
	}
	
	/*
	*関数名：calculateYesterday
	*概要：引数の日付の前の日の日付(前の日がない場合は最小値の日付)を返却
	*引数：日付(Day型)
	*戻り値：前の日の日付(Day型)
	*作成者：N.Kimoto
	*作成日：2024/05/15
	*/

	public static Day calculateYesterday (Day inputDay) {
		
		// 前の日の日付の年の値を引数の日付の年の値で初期化
		int yearYesterday = inputDay.year;
		// 前の日の日付の月の値を引数の日付の月の値で初期化
		int monthYesterday = inputDay.month;
		// 前の日の日付の日の値を引数の日付の日の値で初期化
		int dateYesterday = inputDay.date;
		
		// 引数の日付の各値すべてがそれぞれの最小値だった場合
		if (inputDay.year == MINIMUM_YEAR && inputDay.month == MINIMUM_MONTH && inputDay.date == MINIMUM_DATE) {
			
			// 値を変更しなかったことを表示
			System.out.println("前日の日付が存在しないため、値を変更しませんでした。");
			
		// 引数の日付の各値がどれか一つでも最小値でなかった場合
		} else {
		
			// 前の日の日付の日の値を1つ戻す
			dateYesterday--;
			
			// 前の日の日付の日の値が最小値を下回る場合
			if (dateYesterday < MINIMUM_DATE) {
				
				// 前の日の日付の月の値を1つ戻す
				monthYesterday--;
				
				// 前の日の日付の月の値が最小値を下回る場合
				if (monthYesterday < MINIMUM_MONTH) {
					
					// 前の日の日付の年の値を1つ戻す
					yearYesterday--;
					// 前の日の日付の月の値を最大値に進める
					monthYesterday = MAXIMUM_MONTH;
					
				}
				
				// 前の日の日付の日の値をその月の最大日数に進める
				dateYesterday = findMaximumDaysOfMonth(yearYesterday, monthYesterday);
				
			}
			
		}
		
		// 前の日の日付を求めた値で初期化
		Day beforeDay = new Day(yearYesterday, monthYesterday, dateYesterday);
		
		// 前の日の日付(前の日がない場合は最小値の日付)を返却
		return beforeDay;
		
	}
	
	/*
	*関数名：moveYesterday
	*概要：引数の日付の前の日の日付を表示
	*引数：日付(Day型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/15
	*/
	
	public static void moveYesterday (Day inputDay) {
		
		// 引数の日付の各値すべてがそれぞれの最小値だった場合
		if (inputDay.year == MINIMUM_YEAR && inputDay.month == MINIMUM_MONTH && inputDay.date == MINIMUM_DATE) {
			
			// 前日の日付がないことを表示
			System.out.println("前日の日付は存在しません。");
			
		// 引数の日付の各値がどれか一つでも最小値でなかった場合
		} else {
			
			// 引数の日付の前の日の日付を表示
			System.out.println("前日の日付：" + calculateYesterday(inputDay).toString());
			
		}
		
	}
	
	/*
	*関数名：calculateSeveralDaysAgo
	*概要：引数の日付の数日前の日付を返却
	*引数：日付(Day型)、ずらす日数(int型)
	*戻り値：数日前の日付(Day型)
	*作成者：N.Kimoto
	*作成日：2024/05/15
	*/
	
	public static Day calculateSeveralDaysAgo (Day inputDay, int shiftNumberOfDays) {
		
		// 数日前の日付の年の値を引数の日付の年の値で初期化
		int yearSeveralDaysAgo = inputDay.year;
		// 数日前の日付の月の値を引数の日付の月の値で初期化
		int monthSeveralDaysAgo = inputDay.month;
		// 数日前の日付の日の値を引数の日付の日の値で初期化
		int dateSeveralDaysAgo = inputDay.date;
			
		// 日付をずらすと月をまたぐ場合、日付とずらす日数を更新する
		while(dateSeveralDaysAgo - shiftNumberOfDays < MINIMUM_DATE) {
			
			// ずらす日数を更新する
			shiftNumberOfDays -= dateSeveralDaysAgo;
			// 前の月に戻る
			monthSeveralDaysAgo--;
			
			// 月の値が最小値を下回る場合
			if (monthSeveralDaysAgo < MINIMUM_MONTH) {
				
				// 前の年に戻る
				yearSeveralDaysAgo--;
				// 月の値を最大値に戻す
				monthSeveralDaysAgo = MAXIMUM_MONTH;
				
				// 日付をずらすと年の最小値を下回ってしまう場合
				if (yearSeveralDaysAgo < MINIMUM_YEAR) {
					
					// これ以上前日に戻せないため、できる限り日付を戻したことを表示
					System.out.println("これ以上前日に戻せないため、" + MINIMUM_YEAR + "年"
					+ MINIMUM_MONTH + "月" + MINIMUM_DATE + "日まで戻します。");
					
					// 日付の更新を終了する
					break;
					
				}
				
			}
			
			// 日付の日の値をその月の最大日数にする
			dateSeveralDaysAgo = findMaximumDaysOfMonth(yearSeveralDaysAgo, monthSeveralDaysAgo);
			
		}
		
		// 日数分日付をずらす
		dateSeveralDaysAgo -= shiftNumberOfDays;
		
		// 数日前の日付を求めた値で初期化
		Day severalDaysAgoDay = new Day(yearSeveralDaysAgo, monthSeveralDaysAgo, dateSeveralDaysAgo);
		// 日付を戻せる範囲まで戻した場合の日付をそれぞれの最小値の値で初期化
		Day DayFailureToShiftDay = new Day(MINIMUM_YEAR, MINIMUM_MONTH, MINIMUM_DATE);
		
		// 数日前の日付を返却
		return yearSeveralDaysAgo < MINIMUM_YEAR ? DayFailureToShiftDay : severalDaysAgoDay;
		
	}
	
	/*
	*関数名：moveAFewDaysAgo
	*概要：引数の日付の数日前の日付を表示
	*引数：日付(Day型)、ずらす日数(int型)
	*戻り値：
	*作成者：N.Kimoto
	*作成日：2024/05/15
	*/
	
	public static void moveAFewDaysAgo (Day inputDay, int shiftNumberOfDays) {
		
		// 数日前の日付の年の値を引数の日付の年の値で初期化
		int yearSeveralDaysAgo = inputDay.year;
		// 数日前の日付の月の値を引数の日付の月の値で初期化
		int monthSeveralDaysAgo = inputDay.month;
		// 数日前の日付の日の値を引数の日付の日の値で初期化
		int dateSeveralDaysAgo = inputDay.date;
		// ずらす日数の残りを表す変数を宣言
		int shiftNumberRemaining = shiftNumberOfDays;
		// 実際にずらした日数を表す変数を宣言
		int countShiftNumberOfDays = 0;
		
		// 実際にずらした日数を計算する
		// 日付をずらすと月をまたぐ場合、日付とずらす日数の残りを更新する
		while(dateSeveralDaysAgo - shiftNumberRemaining < MINIMUM_DATE) {
			
			// ずらす日数を更新する
			shiftNumberRemaining -= dateSeveralDaysAgo;
			// 実際にずらした日数をカウントする
			countShiftNumberOfDays += dateSeveralDaysAgo;
			
			// 日の値が最小値を下回ったため、前の月に戻る
			monthSeveralDaysAgo--;
			
			// 月の値が最小値を下回る場合
			if (monthSeveralDaysAgo < MINIMUM_MONTH) {
				
				// 月の値が最小値を下回ったため、前の年に戻る
				yearSeveralDaysAgo--;
				
				// 年の値が最小値を下回る場合
				if (yearSeveralDaysAgo < MINIMUM_YEAR) {
					
					// これ以上ずらすことができないので、実際にずらした日数の計算を終了する
					break;
				}
				
				// 月の値を最大値に戻す
				monthSeveralDaysAgo = MAXIMUM_MONTH;
				
			}
			
			// 日付の日の値をその月の最大日数にする
			dateSeveralDaysAgo = findMaximumDaysOfMonth(yearSeveralDaysAgo, monthSeveralDaysAgo);
			
		}
		
		// 日付をずらした際に年の値が最小値を下回った場合
		if (yearSeveralDaysAgo < MINIMUM_YEAR) {
			
			// 戻ることができた実際の日数と最小値の日付を正しい表記に直して表示
			System.out.println(--countShiftNumberOfDays + "日前の日付：" 
			+ calculateSeveralDaysAgo(inputDay, shiftNumberOfDays).toString());
			
		// 日付をずらした際に年の値が最小値を下回らなかった場合
		} else {
			
			// ずらした日数と引数の日付の数日前の日付を表示
			System.out.println(shiftNumberOfDays + "日前の日付：" 
			+ calculateSeveralDaysAgo(inputDay, shiftNumberOfDays).toString());
		}
		
	}

}
