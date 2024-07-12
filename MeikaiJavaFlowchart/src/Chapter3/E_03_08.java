package Chapter3;

/*
*クラス名：E_03_08
*概要：読み込んだ点数に応じて、優／良／可／不可を判定し表示するプログラム
*作成者：N.Kimoto
*作成日：2024/04/05
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_03_08 {
	
	/*
	*関数名：main
	*概要：読み込んだ点数に応じて、優／良／可／不可を判定し表示するプログラム
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/05
	*/

	public static void main(String[] args) {
		
		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);
										
	    // 点数の入力を促す
		System.out.print("点数：");
	    // 点数を読み込む
		int scoreValue = standardInput.nextInt();
		
		// 0～100が入力された場合
		if (0 <= scoreValue && scoreValue <= 100) {
		
			// 0～59点の場合
			if (scoreValue >= 0 && scoreValue <= 59) {
				
				// 判定が『不可』であることを表示
				System.out.print("不可");
			
			// 60～69点の場合
			} else if (scoreValue >= 60 && scoreValue <= 69) {
				
				// 判定が『可』であることを表示
				System.out.print("可");
				
			// 70～79点の場合
			} else if (scoreValue >= 70 && scoreValue <= 79) {
				
				// 判定が『良』であることを表示
				System.out.print("良");
				
			// 80～100点の場合
			} else if (scoreValue >= 80 && scoreValue <= 100) {
				
				// 判定が『優』であることを表示
				System.out.print("優");
				
			}
			
		// 0～100でない値が入力された場合
		} else {
					
			// 0～100でない値が入力されたことを表示
			System.out.print("0～100を入力してください。");
				
		}

	}

}
