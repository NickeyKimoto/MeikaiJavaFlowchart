package Chapter06;

/*
*クラス名：E_06_08
*概要：double型の配列の全要素の合計値と平均値を求めるプログラム
*作成者：N.Kimoto
*作成日：2024/04/12
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_06_08 {
	
	/*
	*関数名：main
	*概要：double型の配列の全要素の合計値と平均値を求める
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/12
	*/

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);

		// 要素数の入力を促す
		System.out.print("要素数:");
		// 入力された値を読み込む
		int integerVariable = standardInput.nextInt();

		// 正の整数値が入力されるまで繰り返す
		while (integerVariable <= 0) {

			// 正の整数値の入力を促す
			System.out.print("正の整数値を入力してください:");
			// 読み込んだ正の整数値を表示
			integerVariable = standardInput.nextInt();

		}

		// 入力された要素数を持つ配列を生成
		double[] firstArray = new double[integerVariable];

		// 各要素に実数値を代入する
		for (int i = 0; i < firstArray.length; i++) {

			// 値を入力する対象要素を表示
			System.out.print("[" + (i) + "] = ");

			// 入力された値を読み込む
			firstArray[i] = standardInput.nextDouble();

		}

		// 合計値を求めるため初期化
		double totalValue = 0;

		// 生成した配列の全要素を調べる
		for (double i : firstArray) {

			// その要素の実数値を合計値に加算する
			totalValue += i;

		}

		// 全要素の値の和を表示
		System.out.println("全要素の和は" + totalValue + "です。");
		// 全要素の値の平均値を表示
		System.out.println("全要素の平均は" + totalValue / integerVariable + "です。");

	}

}
