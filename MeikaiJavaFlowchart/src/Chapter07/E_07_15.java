package Chapter07;

/*
*クラス名：E_07_15
*概要：配列aの全要素の合計を求める
*作成者：N.Kimoto
*作成日：2024/04/22
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_07_15 {
	
	/*
	*関数名：sum0f
	*概要：配列の全要素の合計を求める
	*引数：配列
	*戻り値：全要素の合計
	*作成者：N.Kimoto
	*作成日：2024/04/22
	*/

	static int sum0f(int[] a) {

		// 要素の合計を初期化
		int totalValue = 0;

		// 全要素の値を加算する
		for (int i = 0; i < a.length; i++) {

			// その要素の値を加算
			totalValue += a[i];

		}

		// 合計値を返却する
		return totalValue;

	}
	
	/*
	*関数名：main
	*概要：配列の全要素の合計を求める
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/22
	*/

	public static void main(String[] args) {

		// Scannerオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);

		// 要素数の入力を促す
		System.out.print("要素数：");
		// 入力された値を読み込む
		int integerVariable = standardInput.nextInt();
		// 0か負の整数の値を入力された場合
		while (integerVariable <= 0) {

			// 正の整数値の入力を促す
			System.out.print("正の整数値を入力してください：");
			// 入力された値を読み込む
			integerVariable = standardInput.nextInt();

		}

		// 入力された値の要素数を持つ配列を宣言
		int[] firstArray = new int[integerVariable];

		// 配列の全要素に値を入力する
		for (int i = 0; i < integerVariable; i++) {

			// その要素の値の入力を促す
			System.out.print("x[" + i + "]：");
			// 入力された値を読み込む
			firstArray[i] = standardInput.nextInt();

		}

		// 配列の全要素の合計を表示
		System.out.println("配列aの合計値：" + sum0f(firstArray));

	}

}
