package Chapter04;

/*
*クラス名：E_04_01
*概要：読み込んだ整数値の符号を好きなだけ繰り返して入力・表示できるプログラム
*作成者：N.Kimoto
*作成日：2024/04/05
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_04_01 {
	
	/*
	*関数名：main
	*概要：読み込んだ整数値の符号を好きなだけ繰り返して入力・表示できるプログラム
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/05
	*/

	public static void main(String[] args) {
		
		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);
		
		// 実行を終了するときの定数を宣言
		final int END_NOMBER = 0;
		// 再び実行するときの定数を宣言
		final int RETRY_NOMBER = 1;
		
		// もう一度行うかどうかを確かめるために宣言
		int retryJudgment = 0;
		
		// 繰り返される範囲、ループ本体
		do {
						
			// 整数値の入力を促す
			System.out.print("整数値：");
			// 整数値を読み込む
			int integerVariable = standardInput.nextInt();
						
			// 入力された整数値が正の場合
			if (integerVariable > 0) {
				
				// 入力された整数値が正であることを表示
				System.out.println("その値は正です。");
					
			// 入力された整数値が負の場合
			} else if (integerVariable < 0) {
					
				// 入力された整数値が負のであることを表示
			    System.out.println("その値は負です。");
				    
			// 入力された整数値が0の場合
			} else {
				
				// 入力された整数値が0であることを表示
			    System.out.println("その値は０です。");
			    
			}
			
			// 繰り返しの選択の入力を促す
			System.out.print("もう一度？。１…Yes／０…No：");
			// 繰り返しの選択を読み込む
			retryJudgment = standardInput.nextInt();
			
			// 0か1以外の整数を入力した場合
			if (retryJudgment < END_NOMBER || retryJudgment > RETRY_NOMBER) {
				
				// 入力をやり直させる
				do {
					
					// 繰り返しの選択の入力を促す
					System.out.print("0か1を入力してください。\nもう一度？。１…Yes／０…No：");
					// 繰り返しの選択を読み込む
					retryJudgment = standardInput.nextInt();
				
				// 0か1を入力するまで繰り返す
				} while (retryJudgment < END_NOMBER || retryJudgment > RETRY_NOMBER);
				
			}
				
		// 1を入力した場合もう一度整数値の符号を表示できる
		} while (retryJudgment == RETRY_NOMBER);

	}

}
