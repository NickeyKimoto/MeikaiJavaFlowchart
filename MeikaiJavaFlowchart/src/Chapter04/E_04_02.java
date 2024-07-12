package Chapter04;

/*
*クラス名：E_04_02
*概要：2桁の整数値を当てさせる数当てゲーム
*作成者：N.Kimoto
*作成日：2024/04/08
*/

//ランダム関数を利用できるようにする
import java.util.Random;
//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_04_02 {
	
	/*
	*関数名：main
	*概要：2桁の整数値を当てさせる数当てゲーム
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/08
	*/

	public static void main(String[] args) {
		
		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);
		// ランダムクラスのインスタンスを生成
		Random randomVariable = new Random();
		
		// 10～99の乱数を生成するために宣言
		final int RNDOM_NUMBER = 90;
		// 生成された乱数を指定された数に調整するための定数を宣言
		final int ADJUST_NUMBER = 10;

		// 0～89の乱数を生成
		int generatedNumber = randomVariable.nextInt(RNDOM_NUMBER);
		//当てるべき数を10～99の乱数として生成
		int targetNumber = ADJUST_NUMBER + generatedNumber;

		// ゲームタイトルを表示
		System.out.println("数当てゲーム開始！！");
		// ゲームルールを表示
		System.out.println("１０～９９の数を当ててください。");

		// プレイヤーが入力した数を初期化
		int inputNumber = 0;

		// 繰り返される範囲、ループ本体
		do {
			
			// 数の入力を促す
			System.out.print("いくつかな：");
			// 入力された数を読み込む
			inputNumber = standardInput.nextInt();
			
			// 10～99以外の整数を入力した場合
			if (inputNumber < 10 || inputNumber > 99) {
				
				// 入力をやり直させる
				do {
					
					// 繰り返しの選択の入力を促す
					System.out.print("１０～９９の数を当ててください。：");
					// 繰り返しの選択を読み込む
					inputNumber = standardInput.nextInt();
				
				// 10～99を入力するまで繰り返す
				} while (inputNumber < 10 || inputNumber > 99);
				
			}
			
			// 入力された数が当てるべき数より大きい場合
			if (inputNumber > targetNumber) {
				
				// ヒントを表示
				System.out.println("もっと小さな数だよ。");
			
			// 入力された数が当てるべき数より小さい場合
			} else if (inputNumber < targetNumber) {
				
				// ヒントを表示
				System.out.println("もっと大きな数だよ。");
				
			}
				
		// 不正解であればループ本体が再び実行される
		} while (inputNumber != targetNumber);
		
		// 正解であれば表示する
		System.out.println("正解です。");
		
	}

}
