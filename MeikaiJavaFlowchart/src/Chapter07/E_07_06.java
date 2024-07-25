package Chapter07;

/*
*クラス名：E_07_06
*概要：指定された月の季節を表示する
*作成者：N.Kimoto
*作成日：2024/04/17
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_07_06 {
	
	/*
	*関数名：printSeason
	*概要：指定された月の季節を表示する
	*引数：月(int型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/17
	*/

	static void printSeason(int m) {

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

		// 3月から5月なら表示
		if (m == MONTH_MARCH || m == MONTH_APRIL || m == MONTH_MAY) {
			
			System.out.println("春");
			
		// 6月から8月なら表示
		} else if (m == MONTH_JUNE || m == MONTH_JULY || m == MONTH_AUGUST) {
			
			System.out.println("夏");
			
		// 9月から11月なら表示
		} else if (m == MONTH_SEPTEMBER || m == MONTH_OCTOBER || m == MONTH_NOVEMBER) {
			
			System.out.println("秋");
			
		// 12月から2月なら表示
		} else if (m == MONTH_DECEMBER || m == MONTH_JANUARY || m == MONTH_FEBRUARY) {
			
			System.out.println("冬");

		}
		
	}
	
	/*
	*関数名：main
	*概要：月の季節を表示する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/17
	*/

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);

		// 整数の入力を促す()
		System.out.print("月：");
		// 入力された値を読み込む
		int integerVariable = standardInput.nextInt();
		
		// 指定された月の季節を表示
		printSeason(integerVariable);

	}

}
