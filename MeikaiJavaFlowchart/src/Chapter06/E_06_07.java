package Chapter06;

/*
*クラス名：E_06_07
*概要：探索するキー値と同じ値の要素が複数存在する場合、最も末尾側に位置する要素を見つけるプログラム
*作成者：N.Kimoto
*作成日：2024/04/12
*/

//ランダム関数を利用できるようにする
import java.util.Random;
//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_06_07 {
	
	/*
	*関数名：main
	*概要：探索するキー値と同じ値の要素が複数存在する場合、最も末尾側に位置する要素を見つける
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

		// 0～9の乱数を生成するための定数を宣言
		final int RANDOM_NINE = 10;
		// 乱数の範囲の最低値である定数を宣言
		final int RANGE_LOWEST = 0;
		// 乱数の範囲の最高値である定数を宣言
		final int RANGE_HIGHEST = 9;
		// 配列の末尾側から探索するための計算に必要な定数を宣言
		final int ADJUSTMENT_NUMBER = 1;

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

		// 0～9の乱数を代入する配列を生成
		int[] pointArray = new int[integerVariable];

		// 各要素に0～9の乱数を順に代入する
		for (int j = 0; j < integerVariable; j++) {

			// その要素に0～9の乱数を代入する
			pointArray[j] = randomVariable.nextInt(RANDOM_NINE);

		}

		// 生成した配列の全要素の値を表示
		System.out.print("配列aの全要素の値\n{ ");

		// 各要素の値を順に表示する
		for (int j = 0; j < integerVariable; j++) {

			// その要素の値を表示
			System.out.print(pointArray[j] + " ");

		}

		// 表示形式を教本にそろえる
		System.out.println("}");

		// 探す数値の入力を促す
		System.out.print("探す数値：");
		// 入力された値を読み込む
		int findingNumber = standardInput.nextInt();

		// 乱数の範囲内の数値が入力されるまで繰り返す
		while (findingNumber < RANGE_LOWEST || findingNumber > RANGE_HIGHEST) {

			// 0～9の値の入力を促す
			System.out.print("0～9の値を入力してください:");
			// 入力された値を読み込む
			findingNumber = standardInput.nextInt();

		}

		// 要素のインデックス数を初期化
		int i = integerVariable;

		// 全要素の値を末尾側から順に探索する
		for (i = integerVariable - ADJUSTMENT_NUMBER; i >= 0; i--) {

			// キーを発見した場合
			if (pointArray[i] == findingNumber) {

				// 探索を終了する
				break;

			}

		}

		// 0まで探索し終わる前に発見した場合
		if (i >= 0) {

			// 発見した要素の末尾側を表示
			System.out.println("それはa[" + i + "]にあります。");

			// 0まで探索し終わる前に発見できなかった場合
		} else {

			// この配列に存在しないことを表示
			System.out.println("それはありません。");

		}

	}

}
