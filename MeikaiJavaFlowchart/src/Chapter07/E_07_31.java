package Chapter07;

/*
*クラス名：E_07_31
*概要：入力された値の絶対値を求める
*作成者：N.Kimoto
*作成日：2024/04/24
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_07_31 {

	/*
	*関数名：absolute
	*概要：入力された値の絶対値を求め返却する
	*引数：整数(int型)
	*戻り値：絶対値(int型)
	*作成者：N.Kimoto
	*作成日：2024/04/24
	*/

	static int absolute(int x) {

		// 絶対値を初期化
		int absoluteValue = 0;

		// 入力された値が正の場合
		if (x > 0) {

			// 絶対値は入力された値となる
			absoluteValue = x;

			// 入力された値が0か負の場合
		} else {

			// 絶対値は入力された値の符号を反転した値となる
			absoluteValue = -x;

		}

		// 求めた絶対値を表示
		return absoluteValue;

	}

	/*
	*関数名：absolute
	*概要：入力された値の絶対値を求め返却する
	*引数：整数(long型)
	*戻り値：絶対値(long型)
	*作成者：N.Kimoto
	*作成日：2024/04/24
	*/

	static long absolute(long x) {

		// 絶対値を初期化
		long absoluteValue = 0;

		// 入力された値が正の場合
		if (x > 0) {

			// 絶対値は入力された値となる
			absoluteValue = x;

			// 入力された値が0か負の場合
		} else {

			// 絶対値は入力された値の符号を反転した値となる
			absoluteValue = -x;

		}

		// 求めた絶対値を表示
		return absoluteValue;

	}

	/*
	*関数名：absolute
	*概要：入力された値の絶対値を求め返却する
	*引数：実数(float型)
	*戻り値：絶対値(float型)
	*作成者：N.Kimoto
	*作成日：2024/04/24
	*/

	static float absolute(float x) {

		// 絶対値を初期化
		float absoluteValue = 0;

		// 入力された値が正の場合
		if (x > 0) {

			// 絶対値は入力された値となる
			absoluteValue = x;

			// 入力された値が0か負の場合
		} else {

			// 絶対値は入力された値の符号を反転した値となる
			absoluteValue = -x;

		}

		// 求めた絶対値を表示
		return absoluteValue;

	}

	/*
	*関数名：absolute
	*概要：入力された値の絶対値を求め返却する
	*引数：整数(double型)
	*戻り値：絶対値(double型)
	*作成者：N.Kimoto
	*作成日：2024/04/24
	*/

	static double absolute(double x) {

		// 絶対値を初期化
		double absoluteValue = 0;

		// 入力された値が正の場合
		if (x > 0) {

			// 絶対値は入力された値となる
			absoluteValue = x;

			// 入力された値が0か負の場合
		} else {

			// 絶対値は入力された値の符号を反転した値となる
			absoluteValue = -x;

		}

		// 求めた絶対値を表示
		return absoluteValue;

	}

	/*
	*関数名：main
	*概要：入力された値の絶対値を求め表示する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/24
	*/

	public static void main(String[] args) {

		// Scannerオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);

		// int型の整数値の入力を促す
		System.out.print("int型の整数値：");
		// 入力された値を読み込む
		int firstInput = standardInput.nextInt();
		// 入力された値のint型の絶対値を表示
		System.out.println("int型の絶対値：" + absolute(firstInput));
		//改行する
		System.out.println();

		// long型の整数値の入力を促す
		System.out.print("long型の整数値：");
		// 入力された値を読み込む
		long secondInput = standardInput.nextLong();
		// 入力された値のlong型の絶対値を表示
		System.out.println("long型の絶対値：" + absolute(secondInput));
		//改行する
		System.out.println();

		// float型の整数値の入力を促す
		System.out.print("float型の整数値：");
		// 入力された値を読み込む
		float thirdInput = standardInput.nextFloat();
		// 入力された値のfloat型の絶対値を表示
		System.out.println("float型の絶対値：" + absolute(thirdInput));
		//改行する
		System.out.println();

		// double型の整数値の入力を促す
		System.out.print("double型の整数値：");
		// 入力された値を読み込む
		double fourthInput = standardInput.nextDouble();
		// 入力された値のdouble型の絶対値を表示
		System.out.println("double型の絶対値：" + absolute(fourthInput));

	}

}
