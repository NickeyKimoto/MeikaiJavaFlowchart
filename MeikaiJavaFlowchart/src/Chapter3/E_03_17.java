package Chapter3;

/*
*クラス名：E_03_17
*概要：0～2のいずれかの乱数を生成し、0ならグー、1ならチョキ、2ならパーを表示するプログラム
*作成者：N.Kimoto
*作成日：2024/04/05
*/

//ランダム関数を利用できるようにする
import java.util.Random;

public class E_03_17 {
	
	/*
	*関数名：main
	*概要：0～2のいずれかの乱数を生成し、0ならグー、1ならチョキ、2ならパーを表示するプログラム
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/05
	*/

	public static void main(String[] args) {
		
		// ランダムクラスのインスタンスを生成
		Random randomVariable = new Random();
		
		// 0～2のいずれかの乱数を生成するため宣言
		final int RANDOM_TWO = 3;		
		// 0から2の整数値をランダムに生成
		int randomNumber = randomVariable.nextInt(RANDOM_TWO);
			
		// 生成した乱数を表示
		System.out.println(randomNumber);
		
		// 生成された数値によって以下を実行する
		switch (randomNumber) {
		
			// 0が生成された場合グーを表示しswitch文の実行を終了する
			case 0: System.out.println("グー"); break;
			// 1が生成された場合チョキを表示しswitch文の実行を終了する
			case 1: System.out.println("チョキ"); break;
			// 2が生成された場合パーを表示しswitch文の実行を終了する
			case 2: System.out.println("パー"); break;
			
		}

	}

}
