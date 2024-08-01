package Chapter13.rockPaperScissors;

// Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

/*
*クラス名：RockPaperScissorsPlayerTester
*概要：プレーヤクラス群のテスト
*作成者：N.Kimoto
*作成日：2024/05/22
*/

public class RockPaperScissorsPlayerTester {
	
	// Scannerオブジェクトを生成
	static Scanner standardInput = new Scanner(System.in);
	
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
	
	/*
	*関数名：main
	*概要：プレーヤクラス群のテスト
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/30
	*/
	
	public static void main(String[] args) {
		
		// 生成する図形の個数の入力を促す
		System.out.print("プレーヤは何人：");
		// 入力された値を読み込む
		int numberOfPlayers = standardInput.nextInt();
		// 入力された値が0以下の場合
		while (numberOfPlayers <= 0) {
			
			// 1以上の値を入力させる
			numberOfPlayers = inputRange();
			
		}
		// プレーヤの情報を格納した配列を宣言
		RockPaperScissorsPlayer[] outputHand = new RockPaperScissorsPlayer[numberOfPlayers];
		// プレーヤの種類の最大値を表す定数を宣言
		final int MAXIMUM_NUMBER_OF_PLAYER_TYPES = 2;
		// プレーヤの種類分の要素数を持つ配列を宣言
		final int[] NUMBER_OF_PLAYER_TYPES = new int[MAXIMUM_NUMBER_OF_PLAYER_TYPES];
		// それぞれの要素にプレーヤの種類を区別する値を代入
		for (int i = 0; i < NUMBER_OF_PLAYER_TYPES.length; i++) {
			
			// 要素にプレーヤの種類を区別する値を代入
			NUMBER_OF_PLAYER_TYPES[i] = i;
			
		}
		
		// 何人目のプレーヤであるかを表す変数を宣言
		int playerNumber = 0;
		
		// プレーヤの情報を入力させる
		for (int i = 0; i < outputHand.length; i++) {
			
			// プレーヤの種類の選択を促す
			System.out.print(++playerNumber + "人目のプレーヤの種類[0…人間／1…コンピュータ]：");
			// 入力された値を読み込む
			int playerType = standardInput.nextInt();
			// 入力された値がプレーヤの種類を区別する値の範囲外の場合
			while (playerType < NUMBER_OF_PLAYER_TYPES[0] || playerType > NUMBER_OF_PLAYER_TYPES.length) {
				
				// 範囲内の値を入力させる
				playerType = inputRange();
				
			}
			
			// 0が入力された場合
			if (playerType == NUMBER_OF_PLAYER_TYPES[0]) {
				
				// プレーヤの情報にプレーヤが人間であることと出す手の情報を追加する
				outputHand[i] = new HumanPlayer();

				
			// 1が入力された場合
			} else if (playerType == NUMBER_OF_PLAYER_TYPES[1]) {
				
				// プレーヤの情報にプレーヤがコンピュータであることを追加する
				outputHand[i] = new ComputerPlayer();
				
			}
			
		}
		
		// 改行する
		System.out.println();
		
		// プレーヤに関する情報を人数分表示する
		for (RockPaperScissorsPlayer s : outputHand) {
		
			// プレーヤの情報を表示する
			s.indicatePlayerInformation();
			// 改行する
			System.out.println();
		
		}
		
	}

}