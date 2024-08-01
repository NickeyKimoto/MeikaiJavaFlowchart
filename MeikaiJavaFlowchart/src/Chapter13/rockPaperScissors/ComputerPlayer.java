package Chapter13.rockPaperScissors;

// ランダム関数を利用できるようにする
import java.util.Random;

/*
*クラス名：ComputerPlayer
*概要：クラスRockPaperScissorsPlayerから派生したコンピュータのプレーヤを表すクラス
*作成者：N.Kimoto
*作成日：2024/05/22
*/


public class ComputerPlayer extends RockPaperScissorsPlayer {
	
	// ランダムクラスのインスタンスを生成
	Random randomVariable = new Random();
	
	// コンピュータのプレーヤが出した手を表すフィールドを宣言
	private int computerPlayHand;
	
	/*
	*コンストラクタ名：HumanPlayer
	*概要：何もしない
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/22
	*/
	
	public ComputerPlayer() { }
	
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
		return "ComputerPlayer";
		
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
		
		// 出せる手の種類の数を表す定数を宣言
		final int NUMBER_TYPE_OF_HAND = 3;
		
		// コンピュータのプレーヤが出す手を乱数で決定
		computerPlayHand = randomVariable.nextInt(NUMBER_TYPE_OF_HAND);
		
		// コンピュータのプレーヤがグーを出していた場合
		if (computerPlayHand == HAND_ROCK) {
			
			// グーを表示
			System.out.println("グー");
			
		// コンピュータのプレーヤがパーを出していた場合
		} else if (computerPlayHand == HAND_PAPER) {
			
			// パーを表示
			System.out.println("パー");
			
		// コンピュータのプレーヤがチョキを出していた場合
		} else if (computerPlayHand == HAND_SCISSORS) {
			
			// チョキを表示
			System.out.println("チョキ");
			
		}
		
	}

}
