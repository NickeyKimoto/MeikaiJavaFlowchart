package Chapter15.fingerFlashing;
// Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

/*
*クラス名：FingerFlashing
*概要：3人でジャンケンする
*作成者：N.Kimoto
*作成日：2024/05/27
*/
public class FingerFlashing {

	/*
	*関数名：main
	*概要：3人でジャンケンする
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/27
	*/
	public static void main(String[] args) {
		// Scannerオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);
		
		// 出す手の種類の文字列を格納した配列を宣言
		String[] handsType = {"グー", "チョキ", "パー"};
		// もう一度行うかどうかの意思を表す変数を宣言
		int retryJudgement = 0;
		// 続行する意思を表す定数を宣言
		final int CHOOSE_RETRY =  1;
		// やめる意思を表す定数を宣言
		final int CHOOSE_RETIRE = 0;
		
		// ジャンケンする
		do {
		
			// 人間プレーヤを初期化
			RockPaperScissorsPlayer filstComputerHand = new ComputerPlayer();
			// コンピュータプレーヤ1を初期化
			RockPaperScissorsPlayer secondComputerHand = new ComputerPlayer();
			// コンピュータプレーヤ2を初期化
			RockPaperScissorsPlayer yourHand = new HumanPlayer();
			
			// 改行する
			System.out.println();
	
			// 人間プレーヤの手を表示
			System.out.println("あなた：       " + handsType[yourHand.getPlayHand()]);
			// コンピュータプレーヤ1の手を表示
			System.out.println("コンピュータ1：" + handsType[filstComputerHand.getPlayHand()]);
			// コンピュータプレーヤ2の手を表示
			System.out.println("コンピュータ2：" + handsType[secondComputerHand.getPlayHand()]);
			
			// 改行する
			System.out.println();
			
			// プレーヤの勝ち負けの結果を計算する式の定数を宣言
			final int CALCULATE_RESULT_CONSTANT = 3;
			
			// コンピュータプレーヤ同士の手が同じだった場合
			if (filstComputerHand.getPlayHand() == secondComputerHand.getPlayHand()) {
				
				// 計算によって算出された人間プレーヤの結果を表す変数を宣言
				int resultJudgement = (yourHand.getPlayHand() - filstComputerHand.getPlayHand() 
						+ CALCULATE_RESULT_CONSTANT) % CALCULATE_RESULT_CONSTANT;
				// 引き分けを表す定数を宣言
				final int RESULT_DRAW     = 0;
				// 負けを表す定数を宣言
				final int RESULT_YOU_LOSE = 1;
				// 勝ちを表す定数を宣言
				final int RESULT_YOU_WIN  = 2;
				
				// 計算結果によって表示を変更
				switch (resultJudgement) {
				// 計算の結果、引き分けだった場合
				case RESULT_DRAW :
					// 結果が引き分けであることを表示
					System.out.println("引き分けです。");
					// ゲームから抜ける
					break;
					
				// 計算の結果、人間プレーヤが負けた場合
				case RESULT_YOU_LOSE :
					// 人間プレーヤが負けたことを表示
					System.out.println("あなたの負けです。");
					// コンピュータプレーヤ1が勝ったことを表示
					System.out.println("コンピュータ1の勝ちです。");
					// コンピュータプレーヤ2が勝ったことを表示
					System.out.println("コンピュータ2の勝ちです。");
					// ゲームから抜ける
					break;
					
				// 計算の結果、人間プレーヤが勝った場合
				case RESULT_YOU_WIN :
					// 人間プレーヤが勝ったことを表示
					System.out.println("あなたの勝ちです。"); 
					// コンピュータプレーヤ1が負けたことを表示
					System.out.println("コンピュータ1の負けです。");
					// コンピュータプレーヤ2が負けたことを表示
					System.out.println("コンピュータ2の負けです。");
					// ゲームから抜ける
					break;
				}
			
			// コンピュータプレーヤ同士の手が違う場合
			} else {
			
				// 計算によって算出された人間プレーヤの結果を表す変数を宣言
				int resultJudgement = (filstComputerHand.getPlayHand() + secondComputerHand.getPlayHand() 
				+ yourHand.getPlayHand()) % CALCULATE_RESULT_CONSTANT;
				
				// 引き分けを表す定数を宣言
				final int RESULT_DRAW     = 0;
				// 勝ちを表す定数を宣言
				final int RESULT_YOU_WIN  = 1;
				// 負けを表す定数を宣言
				final int RESULT_YOU_LOSE = 2;
				
				// 計算結果によって表示を変更
				switch (resultJudgement) {
				// 計算の結果、引き分けだった場合
				case RESULT_DRAW :
					// 結果が引き分けであることを表示
					System.out.println("引き分けです。");
					// ゲームから抜ける
					break;
					
				// 計算の結果、人間プレーヤが勝った場合
				case RESULT_YOU_WIN :
					// 人間プレーヤが勝ったことを表示
					System.out.println("あなたの勝ちです。");
					// 人間プレーヤとコンピュータプレーヤ1の手が同じだった場合
					if (yourHand.getPlayHand() == filstComputerHand.getPlayHand()) {
						// コンピュータプレーヤ1が勝ったことを表示
						System.out.println("コンピュータ1の勝ちです。");
						// コンピュータプレーヤ2が負けたことを表示
						System.out.println("コンピュータ2の負けです。");
					// 人間プレーヤとコンピュータプレーヤ1の手が違う場合
					} else {
						// コンピュータプレーヤ1が負けたことを表示
						System.out.println("コンピュータ1の負けです。");
						// コンピュータプレーヤ2が勝ったことを表示
						System.out.println("コンピュータ2の勝ちです。");
					}
					// ゲームから抜ける
					break;
					
				// 計算の結果、人間プレーヤが負けた場合
				case RESULT_YOU_LOSE : 
					// 人間プレーヤが負けたことを表示
					System.out.println("あなたの負けです。");
					// 人間プレーヤとコンピュータプレーヤ1の手が同じだった場合
					if (yourHand.getPlayHand() == filstComputerHand.getPlayHand()) {
						// コンピュータプレーヤ1が負けたことを表示
						System.out.println("コンピュータ1の負けです。");
						// コンピュータプレーヤ2が勝ったことを表示
						System.out.println("コンピュータ2の勝ちです。");
					// 人間プレーヤとコンピュータプレーヤ1の手が違う場合
					} else {
						// コンピュータプレーヤ1が勝ったことを表示
						System.out.println("コンピュータ1の勝ちです。");
						// コンピュータプレーヤ2が負けたことを表示
						System.out.println("コンピュータ2の負けです。");
					}
					// ゲームから抜ける
					break;
				}
			}
			
			// もう一度ジャンケンするかどうかを選択
			do {
				// 意思の入力を促す
				System.out.print("もう一度？ (0)いいえ (1)はい：");
				// 入力された値を読み込む
				retryJudgement = standardInput.nextInt();
				
			// 入力範囲内の数字を入力させる
			} while (retryJudgement != CHOOSE_RETIRE && retryJudgement != CHOOSE_RETRY);
		// 続行の意思を入力し続ける限りジャンケンする
		} while (retryJudgement == CHOOSE_RETRY);

	}

}
