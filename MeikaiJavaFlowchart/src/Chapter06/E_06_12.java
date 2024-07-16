package Chapter06;

/*
*クラス名：E_06_12
*概要：要素型がint型である配列を作り、配列の要素の並びをシャッフルするプログラム
*作成者：N.Kimoto
*作成日：2024/04/15
*/

//ランダム関数を利用できるようにする
import java.util.Random;
//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_06_12 {
	
	/*
	*関数名：main
	*概要：要素型がint型である配列を作り、配列の要素の並びをシャッフルする
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/15
	*/

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);
		// ランダムクラスのインスタンスを生成
		Random randomVariable = new Random();

		// 1以上の乱数を生成するための定数を宣言
		final int ADJUSTMENT_NUMBER = 1;

		// 要素数の入力を促す
		System.out.print("要素数：");
		// 入力された値を読み込む
		int integerVariable = standardInput.nextInt();
		// 正の整数値以外の値を受け付けないようにする
		while (integerVariable <= 0) {

			// 正の整数値の入力を促す
			System.out.print("正の整数値を入力してください:");
			// 入力された値を読み込む
			integerVariable = standardInput.nextInt();

		}

		// 入力された値の要素数を持つ配列を宣言(1)
		int[] firstArray = new int[integerVariable];
		// 入力された値の要素数を持つ配列を宣言(2)
		int[] secondArray = new int[integerVariable];

		// 各要素に生成した1～10の乱数を代入し値を表示
		OUTER: for (int i = 0; i < integerVariable; i++) {

			// その要素に生成した1～10の乱数を代入
			firstArray[i] =ADJUSTMENT_NUMBER + randomVariable.nextInt(integerVariable);

			// 生成された乱数と同じ値を捜索するための変数を宣言
			int findingFirst = firstArray[i];

			// 0から今の繰り返しまで捜索
			for (int j = 0; j < i; j++) {

				// 同じ値があった場合
				if (findingFirst == firstArray[j]) {

					// 同じ要素を繰り返す
					i--;
					// もう一度値を生成し代入しなおす
					continue OUTER;

				}

			}

			// その要素の値を表示
			System.out.println("a[" + i + "] = " + firstArray[i]);

		}
		
		// 1行空ける
		System.out.println();
		
		
		// 要素数の内容をランダム順に表示する
		INNER : for (int i = 0; i < integerVariable; i++) {

			// 表示する要素をランダムに決める
			secondArray[i] = randomVariable.nextInt(integerVariable);

			// 生成された乱数と同じ値を捜索するための変数を宣言
			int findingFirst = secondArray[i];

			// 0から今の繰り返しまで捜索
			for (int k = 0; k < i; k++) {

				// 同じ要素があった場合
				if (i > 0 && findingFirst == secondArray[k]) {

					// カウントを一時停止する
					i--;
					// もう一度値を生成し代入しなおす
					continue INNER;

				}

			}

			// その要素の値を表示
			System.out.println("a[" + secondArray[i] + "] = " + firstArray[secondArray[i]]);

		}

	}

}
