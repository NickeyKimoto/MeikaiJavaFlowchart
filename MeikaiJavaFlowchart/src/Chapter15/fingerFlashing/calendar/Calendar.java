package Chapter15.fingerFlashing.calendar;

/*
*クラス名：Calendar
*概要：カレンダーを表示
*作成者：N.Kimoto
*作成日：2024/05/28
*/
public class Calendar {

	/*
	*関数名：main
	*概要：カレンダーを表示
	*引数：日付の年の値(int型)、日付の月の値(int型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/28
	*/
	public static void main(String[] args) {
		// コマンドライン引数の個数を格納した配列を宣言
		final int[] ARGUMENT_NUMBER = {0, 1, 2}; 
		// コマンドライン引数の個数を格納した配列のインデックス番号を格納した配列を宣言
		final int[] INDEX_NUMBER_OF_ARGUMENT = {1, 2};
		
		// コマンドライン引数の個数が0個だった場合
		if (args.length == ARGUMENT_NUMBER[0]) {
			// 引数を受け取らずにDay型変数を初期化
			Day displayCalendar = new Day();
			// 実行日の月のカレンダーを表示
			displayCalendar.displayCalendar(displayCalendar);
			
		// コマンドライン引数の個数が1個だった場合
		} else if (args.length == ARGUMENT_NUMBER[INDEX_NUMBER_OF_ARGUMENT[0]]) {
			// 最大月数を表す定数を宣言
			final int MAXIMUM_MONTH = 12;
			// その年の全ての月のカレンダーを表示
			for (int i = 0; i < MAXIMUM_MONTH; i++) {
				// 表示する月を表す変数を初期化
				int displayMonth = i;
				// コマンドライン引数の年の値と表示する月の値で日付を初期化
				Day displayCalendar = new Day(Integer.parseInt(args[0]), ++displayMonth);
				// 初期化した日付の月のカレンダーを表示
				displayCalendar.displayCalendar(displayCalendar);
			}
			
		// コマンドライン引数の個数が2個だった場合
		} else if(args.length == ARGUMENT_NUMBER[INDEX_NUMBER_OF_ARGUMENT[1]]) {
			// コマンドライン引数の年の値と月の値で日付を初期化
			Day displayCalendar = new Day(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
			// 初期化した日付の月のカレンダーを表示
			displayCalendar.displayCalendar(displayCalendar);
			
			// コマンドライン引数の個数が3個以上だった場合
		} else {
			// プログラムを終了することを表示
			System.out.println("コマンドライン引数の個数は0以上2以下にしてください。\nプログラムを終了します。");
		}

	}

}
