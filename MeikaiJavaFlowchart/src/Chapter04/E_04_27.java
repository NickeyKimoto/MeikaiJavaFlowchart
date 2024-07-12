package Chapter04;

/*
*クラス名：E_04_27
*概要：List4-3の0～99数当てゲーム(回数制限付き、終了時答え合わせ)
*合計と平均を表示するプログラム
*作成者：N.Kimoto
*作成日：2024/04/10
*/

//ランダム関数を利用できるようにする
import java.util.Random;
//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_04_27 {

	/*
	*関数名：main
	*概要：0～99数当てゲーム(回数制限付き、終了時答え合わせ)
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/10
	*/

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);
		// ランダムクラスのインスタンスを生成
		Random randomVariable = new Random();

		// 0～99の乱数を生成するための定数を宣言
		final int RANDOM_NUMBER = 100;
		// 入力制限の定数を宣言
		final int MAXIMUM_INPUT = 4;

		// 当てるべき数を1～99の乱数として生成
		int correctAnswer = randomVariable.nextInt(RANDOM_NUMBER);

		// ゲームタイトルを表示
		System.out.println("数当てゲーム開始！！");
		// ゲームルールを表示
		System.out.println("０～９９の数を当ててください。");

		// プレイヤーが入力した数値を初期化
		int inputNumber = 0;
		// プレイヤーが入力した回数を初期化
		int inputCount = 0;

		// 入力された値を判定する
		Outer: do {
			// 数の入力を促す
			System.out.print("いくつかな：");
			// 入力された数を読み込む
			inputNumber = standardInput.nextInt();
			
			// 0～99の整数値が入力されるまで繰り返す
			while (inputNumber < 0) {

				// 0～99の整数値の入力を促す
				System.out.print("0～99の整数値を入力してください:");
				// 入力された数を読み込む
				inputNumber = standardInput.nextInt();

			}

			// 当たっている場合
			if (inputNumber == correctAnswer) {
				
				// 繰り返し入力を終了する
				break Outer;
				
			}
			
			// 入力回数を数える
			inputCount++;
			
			// 入力回数が制限範囲を超えた場合
			if (inputCount == MAXIMUM_INPUT) {
				
				// 繰り返し入力を終了する
				break Outer;
			}
			
			// 入力された数が当てるべき数より大きい場合
			if (inputNumber > correctAnswer) {

				// ヒントを表示
				System.out.println("もっと小さな数だよ。");

			// 入力された数が当てるべき数より小さい場合
			} else {

				// ヒントを表示
				System.out.println("もっと大きな数だよ。");
			
			}

		// 不正解であればループ本体が再び実行される
		} while (inputNumber != correctAnswer);

		// 正解を入力した場合
		if (inputNumber == correctAnswer) {
			
			// 正解であることを表示する
			System.out.println("正解です。");
		
		// 正解を入力できなかった場合
		} else {
			
			// 正解を発表する
			System.out.println("残念！正解は" + correctAnswer + "でした。");
		}

	}

}
