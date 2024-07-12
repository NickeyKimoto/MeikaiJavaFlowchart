package Chapter04;

/*
*クラス名：E_04_19
*概要：季節を求めるList4-1の月の読み込みにおいて、1～12の値が入力された場合、
*再入力させるように修正したプログラム
*作成者：N.Kimoto
*作成日：2024/04/09
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_04_19 {

	/*
	*関数名：main
	*概要：入力された月の季節を表示
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/09
	*/

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);

		// 再試行する場合に必要な定数を宣言(再試行する)
		final int RETRY_JUDGMENT = 1;
		// 再試行する場合に必要な定数を宣言(再試行しない)
		final int NO_JUDGMENT = 0;
		
		// 何月であるか定数を宣言(1)
		final int MONTH_JANUARY = 1;
		// 何月であるか定数を宣言(2)
		final int MONTH_FEBRUARY = 2;
		// 何月であるか定数を宣言(3)
		final int MONTH_MARCH = 3;
		// 何月であるか定数を宣言(4)
		final int MONTH_APRIL = 4;
		// 何月であるか定数を宣言(5)
		final int MONTH_MAY = 5;
		// 何月であるか定数を宣言(6)
		final int MONTH_JUNE = 6;
		// 何月であるか定数を宣言(7)
		final int MONTH_JULY = 7;
		// 何月であるか定数を宣言(8)
		final int MONTH_AUGUST = 8;
		// 何月であるか定数を宣言(9)
		final int MONTH_SEPTEMBER = 9;
		// 何月であるか定数を宣言(10)
		final int MONTH_OCTOBER = 10;
		// 何月であるか定数を宣言(11)
		final int MONTH_NOVEMBER = 11;
		// 何月であるか定数を宣言(12)
		final int MONTH_DECEMBER = 12;

		// もう一度行うかどうかを初期化
		int retry;

		// 繰り返される範囲、ループ本体
		do {

			// 月の入力を促す
			System.out.print("季節を求めます。\n何月ですか：");
			// 月を読み込む
			int month = standardInput.nextInt();

			// /1から12以外の値を入力した場合
			if (month < MONTH_JANUARY || month > MONTH_DECEMBER) {

				// 1～12の値を入力させる
				do {

					// 1～12の値の入力を促す
					System.out.print("1～12の値を再入力してください：");
					// 入力された値を読み込む
					month = standardInput.nextInt();

					// // 1～12の値を入力するまで繰り返す
				} while (month < MONTH_JANUARY || month > MONTH_DECEMBER);

			}

			// 3月から5月なら表示
			if (month == MONTH_MARCH || month == MONTH_APRIL || month == MONTH_MAY)
				System.out.println("それは春です。");
			// 6月から8月なら表示
			else if (month == MONTH_JUNE || month == MONTH_JULY || month == MONTH_AUGUST)
				System.out.println("それは夏です。");
			// 9月から11月なら表示
			else if (month == MONTH_SEPTEMBER || month == MONTH_OCTOBER || month == MONTH_NOVEMBER)
				System.out.println("それは秋です。");
			// 12月から2月なら表示
			else if (month == MONTH_DECEMBER || month == MONTH_JANUARY || month == MONTH_FEBRUARY)
				System.out.println("それは冬です。");

			// 繰り返しの選択の入力を促す
			System.out.print("もう一度？。１…Yes／０…No：");
			// 繰り返しの選択を読み込む
			retry = standardInput.nextInt();

			// /0か1以外の値を入力した場合
			if (retry == NO_JUDGMENT || retry == RETRY_JUDGMENT) {

				// 0か1を入力させる
				do {

					// 0か1の入力を促す
					System.out.print("0か1の値を再入力してください：");
					// 入力された値を読み込む
					retry = standardInput.nextInt();

					// 0か1を入力するまで繰り返す
				} while (retry == NO_JUDGMENT || retry == RETRY_JUDGMENT);

			}

			// 制御式がtrueであればループ本体が再び実行される
		} while (retry == RETRY_JUDGMENT);

	}

}
