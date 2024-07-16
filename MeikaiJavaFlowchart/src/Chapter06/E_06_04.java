package Chapter06;

//ランダム関数を利用できるようにする
import java.util.Random;

/*
*クラス名：E_06_04
*概要：配列の全要素に乱数を代入して縦向きの棒グラフで表示するプログラム
*(最下段にインデックスを10で割った剰余を表示)
*作成者：N.Kimoto
*作成日：2024/04/12
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_06_04 {

	/*
	*関数名：main
	*概要：配列の全要素に乱数を代入して縦向きの棒グラフで表示する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/12
	*/

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);
		// ランダムクラスのインスタンスを生成
		Random randomVariable = new Random();

		// 1～10の乱数を生成するための定数を宣言(1)
		final int FIRST_CONSTANT = 10;
		// 1～10の乱数を生成するための定数を宣言(2)
		final int SECOND_CONSTANT = 1;
		// 最下段にインデックスを10で割った剰余を表示するための定数を宣言
		final int RESIDUE_VALUE = 10;

		System.out.print("要素数：");
		int integerVariable = standardInput.nextInt(); // 要素数を読み込む

		// 正の整数値が入力されるまで繰り返す
		while (integerVariable <= 0) {

			// 正の整数値の入力を促す
			System.out.print("正の整数値を入力してください:");
			// 読み込んだ正の整数値を表示
			integerVariable = standardInput.nextInt();

		}

		// 要素数の表示から1行空ける
		System.out.println();

		// 構成要素数が入力された値の配列を生成
		int[] firstArray = new int[integerVariable];

		// 1～10の乱数を各要素に代入
		for (int i = 0; i < integerVariable; i++) {

			// インデックス順に1～10の乱数を生成し代入
			firstArray[i] = SECOND_CONSTANT + randomVariable.nextInt(FIRST_CONSTANT);

		}

		// それぞれの要素の乱数の値を調べ*を表示する
		for (int i = 0; i < FIRST_CONSTANT; i++) {

			// 10～1が入っている要素を調べる
			for (int j = 0; j < firstArray.length; j++) {

				// 見やすくするため空白を表示
				System.out.print(' ');

				// 要素内の値が調べる数値を満たしていない場合
				if (firstArray[j] < (FIRST_CONSTANT - i)) {

					// 空白を表示
					System.out.print(' ');

				// 要素内の値が調べる数値を満たしている場合
				} else {

					// *を表示
					System.out.print('*');

				}

			}

			// インデックスと区別するための境界線の表示
			System.out.println();

		}

		// 入力された値の文だけ境界線を表示
		for (int i = 0; i < integerVariable; i++) {

			// 境界線を表示
			System.out.print("--");

		}

		// 改行
		System.out.println();

		// インデックスの剰余を順に表示
		for (int i = 0; i < integerVariable; i++) {

			// 間に空白をはさみながらインデックスを表示
			System.out.print(" " + i % RESIDUE_VALUE);

		}

	}

}
