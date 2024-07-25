package Chapter07;

/*
*クラス名：E_07_10
*概要：3桁の整数を3つランダムに生成し、その値を計算させる
*作成者：N.Kimoto
*作成日：2024/04/18
*/

//ランダム関数を利用できるようにする
import java.util.Random;
//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_07_10 {

	// 引数で標準入力System.inを指定
	static Scanner standardInput = new Scanner(System.in);
	
	/*
	*関数名：confirmRetry
	*概要：プログラムの続行を選択させる
	*引数：なし
	*戻り値：続ける、やめる
	*作成者：N.Kimoto
	*作成日：2024/04/18
	*/

	static boolean confirmRetry() {
		
		// 選択した場合続行するための定数を宣言
		final int SELECT_CONTINUES = 1;
		// 選択した場合やめるための定数を宣言
		final int SELECT_RETIRE = 0;

		// 判断内容を初期化
		int judgmentSign = 0;

		// やめるか続けるか選択させる
		do {

			// 1か0の入力を促す
			System.out.println("もう一度? <Yes ... 1 / No ... 0>：");
			// 入力された値を読み込む
			judgmentSign = standardInput.nextInt();

		// 0か1を選択するまで繰り返す
		} while (judgmentSign != SELECT_RETIRE && judgmentSign != SELECT_CONTINUES);

		// 続けるを選択した場合trueを返却
		return judgmentSign == SELECT_CONTINUES;

	}
	
	/*
	*関数名：main
	*概要：3桁の整数を3つランダムに生成し、その値を計算させる
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/18
	*/

	public static void main(String[] args) {

		// ランダムクラスのインスタンスを生成
		Random randomVariable = new Random();
		
		// 0～3の乱数を生成するための定数を宣言
		final int RANDOM_FOUR = 4;
		// 3桁の乱数を生成するための定数を宣言
		final int THREE_DIGITS = 900;
		// 3桁の整数に調整するための定数を宣言
		final int ADJUSTMENT_NUMBER = 100;
		// 式の内容を表すための定数を宣言(1)
		final int PLUS_PLUS = 0;
		// 式の内容を表すための定数を宣言(2)
		final int PLUS_MINOS = 1;
		// 式の内容を表すための定数を宣言(3)
		final int MINOS_PLUS = 2;
		// 式の内容を表すための定数を宣言(4)
		final int MINOS_MINOS = 3;

		// プログラムの内容を表示
		System.out.println("暗算力トレーニング!!");
		
		// 式の内容を区別するための配列を宣言
		int[] randomCalculating = new int [RANDOM_FOUR];

		// 表示された式を計算させる
		do {
			
			// 用意された式をランダムに選択する
			int calculatingType = randomVariable.nextInt(RANDOM_FOUR);

			// 3桁の整数をランダムに生成する(1)
			int firstRandom = randomVariable.nextInt(THREE_DIGITS) + ADJUSTMENT_NUMBER;
			// 3桁の整数をランダムに生成する(2)
			int secondRandom = randomVariable.nextInt(THREE_DIGITS) + ADJUSTMENT_NUMBER;
			// 3桁の整数をランダムに生成する(3)
			int thirdRandom = randomVariable.nextInt(THREE_DIGITS) + ADJUSTMENT_NUMBER;
			
			// 0が生成された場合「＋＋」の式を表示
			randomCalculating[PLUS_PLUS] = firstRandom + secondRandom + thirdRandom;
			// 1が生成された場合「＋ー」の式を表示
			randomCalculating[PLUS_MINOS] = firstRandom + secondRandom - thirdRandom;
			// 2が生成された場合「ー＋」の式を表示
			randomCalculating[MINOS_PLUS] = firstRandom - secondRandom + thirdRandom;
			// 3が生成された場合「ーー」の式を表示
			randomCalculating[MINOS_MINOS] = firstRandom - secondRandom - thirdRandom;

			// 正解するまで入力させる
			while (true) {
				
				// 生成された値によって式の表示を変更
				switch(calculatingType) {
					
					// 0が生成された場合
					case PLUS_PLUS:
						// 生成された3桁の整数三つと「＋＋」からなる式を表示
						System.out.print(firstRandom + " + " + secondRandom + " + " + thirdRandom + " = ");
						// 値の読み込みに進む
						break;
					// 1が生成された場合
					case PLUS_MINOS:
						// 生成された3桁の整数三つと「＋ー」からなる式を表示
						System.out.print(firstRandom + " + " + secondRandom + " - " + thirdRandom + " = ");
						// 値の読み込みに進む
						break;
					// 2が生成された場合
					case MINOS_PLUS:
						// 生成された3桁の整数三つと「ー＋」からなる式を表示
						System.out.print(firstRandom + " - " + secondRandom + " + " + thirdRandom + " = ");
						// 値の読み込みに進む
						break;
					// 3が生成された場合
					case MINOS_MINOS:
						// 生成された3桁の整数三つと「ーー」からなる式を表示
						System.out.print(firstRandom + " - " + secondRandom + " - " + thirdRandom + " = ");
						// 値の読み込みに進む
						break;
							
				}

				// 答えとなる値の入力させ読み込む
				int integerVariable = standardInput.nextInt();

				// 正解している場合
				if (integerVariable == randomCalculating[calculatingType]) {

					// 出題を停止する
					break;

				}

				// 不正解の場合もう一度入力させる
				System.out.println("違いますよ!!");

			}

		// プログラムの続行を選択させる
		} while (confirmRetry());

	}

}
