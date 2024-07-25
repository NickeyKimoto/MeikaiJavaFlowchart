package Chapter07;

/*
*クラス名：E_07_08
*概要：a以上b未満の乱数を生成し表示する
*作成者：N.Kimoto
*作成日：2024/04/17
*/

//ランダム関数を利用できるようにする
import java.util.Random;
//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_07_08 {
	
	/*
	*関数名：random
	*概要：a以上b未満の乱数を生成する
	*引数：a, b(int型)
	*戻り値：a以上b未満の乱数、a
	*作成者：N.Kimoto
	*作成日：2024/04/17
	*/

	static int random(int a, int b) {

		// ランダムクラスのインスタンスを生成
		Random randomVariable = new Random();

		// aの値がbより小さい場合
		if (a < b) {

			// aとbの差を求める
			int valueDifference = b - a;

			// 差の値分の範囲の乱数を生成
			int generatedNumber = randomVariable.nextInt(valueDifference);

			// 生成された乱数をa以上b未満に調整し返却
			return generatedNumber + a;

		// aの値がbより小さい場合か、aがb同じ値の場合
		} else {

			// aの値をそのまま返却
			return a;

		}

	}
	
	/*
	*関数名：main
	*概要：入力された範囲の乱数を生成し表示する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/17
	*/

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);

		// 整数の入力を促す
		System.out.print("a以上：");
		// 入力された値を読み込む
		int firstVariable = standardInput.nextInt();
		// 整数の入力を促す
		System.out.print("b未満：");
		// 入力された値を読み込む
		int secondVariable = standardInput.nextInt();
		
		// 入力された範囲の乱数を生成し表示
		System.out.println(random(firstVariable, secondVariable));

	}

}
