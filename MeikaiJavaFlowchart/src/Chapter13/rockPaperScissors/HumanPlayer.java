package Chapter13.rockPaperScissors;

// Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

/*
*クラス名：HumanPlayer
*概要：クラスRockPaperScissorsPlayerから派生した人間のプレーヤを表すクラス
*作成者：N.Kimoto
*作成日：2024/05/22
*/

public class HumanPlayer extends RockPaperScissorsPlayer {
	
	// Scannerオブジェクトを生成
	static Scanner standardInput = new Scanner(System.in);
	
	// 入力した出す手を表すフィールドを宣言
	private static int inputHand;
	
	// 人間のプレーヤが出した手を表すフィールドを宣言
	private int humanPlayHand;
	
	/*
	*コンストラクタ名：HumanPlayer
	*概要：人間のプレーヤを生成する
	*引数：人間のプレーヤが出した手(int型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/22
	*/
	
	public HumanPlayer() {
		
		// 人間のプレーヤの出す手の入力を促す
		System.out.print("あなたの出す手を決めてください[0…グー／1…パー／2…チョキ]：");
		// 入力された値を読み込む
		inputHand = standardInput.nextInt();
		// 入力された値が出せる手以外の値だった場合
		while (inputHand != HAND_ROCK && inputHand != HAND_PAPER && inputHand != HAND_SCISSORS) {
			
			// 出せる手の値を入力させる
			inputHand = inputRange();
			
		}
		
		// 人間のプレーヤが出した手を入力した値で初期化
		humanPlayHand = inputHand;
	}
	
	/*
	*関数名：toString
	*概要：プレーヤに関する図形情報を表す文字列を返却
	*引数：なし
	*戻り値：プレーヤに関する図形情報を表す文字列(String型)
	*作成者：N.Kimoto
	*作成日：2024/05/22
	*/
	
	public String toString() {
		
		// プレーヤに関する図形情報を表す文字列を返却
		return "HumanPlayer";
		
	}
	
	/*
	*関数名：playHand
	*概要：プレーヤが出した手を表示する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/22
	*/
	
	public void playHand() {
		
		// 人間のプレーヤがグーを出していた場合
		if (humanPlayHand == HAND_ROCK) {
			
			// グーを表示
			System.out.println("グー");
			
		// 人間のプレーヤがパーを出していた場合
		} else if (humanPlayHand == HAND_PAPER) {
			
			// パーを表示
			System.out.println("パー");
			
		// 人間のプレーヤがチョキを出していた場合
		} else if (humanPlayHand == HAND_SCISSORS) {
			
			// チョキを表示
			System.out.println("チョキ");
			
		}
		
	}
	
	/*
	*関数名：inputRange
	*概要：入力した値を範囲内の値で入力させる
	*引数：なし
	*戻り値：入力された値(int型)
	*作成者：N.Kimoto
	*作成日：2024/04/30
	*/
	
	static int inputRange() {

		// 範囲内の値の入力を促す
		System.out.print("有効範囲内で入力してください：");
		// 入力された値を読み込む
		int inputValue = standardInput.nextInt();
		// 読み込んだ値を返却する
		return inputValue;
	
	}

}
