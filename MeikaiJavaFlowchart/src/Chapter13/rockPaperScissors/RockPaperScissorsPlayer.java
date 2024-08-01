package Chapter13.rockPaperScissors;

/*
*クラス名：RockPaperScissorsPlayer
*概要：ジャンケンのプレーヤの概念を表す抽象クラス
*作成者：N.Kimoto
*作成日：2024/05/22
*/

public abstract class RockPaperScissorsPlayer {
	
	// グーを表す定数を宣言
	static final int HAND_ROCK = 0;
	// パーを表す定数を宣言
	static final int HAND_PAPER = 1;
	// チョキを表す定数を宣言
	static final int HAND_SCISSORS = 2;
	
	/*
	*関数名：toString
	*概要：プレーヤの情報を表す文字列を返却する抽象メソッド
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/22
	*/
	
	public abstract String toString();
	
	/*
	*関数名：playHand
	*概要：出した手を表示する抽象メソッド
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/22
	*/
	
	public abstract void playHand();
	
	/*
	*関数名：indicatePlayerInformation
	*概要：プレーヤの情報と出した手の表示を行う
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/22
	*/
	
	public void indicatePlayerInformation() {
		
		// メソッドtoStringが返却する文字列を表示
		System.out.println(toString());
		// 出した手を表示
		playHand();
		
	}

}
