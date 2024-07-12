package Chapter04;

/*
*クラス名：E_04_07
*概要：読み込んだ個数だけ*と+を交互に表示するプログラム
*作成者：N.Kimoto
*作成日：2024/04/08
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_04_07 {
	
	/*
	*関数名：main
	*概要：読み込んだ個数だけ*と+を交互に表示する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/08
	*/

	public static void main(String[] args) {

		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);
		
		// 記号を表示させる個数の入力を促す
		System.out.print("何個表示しますか：");
		// 入力した個数を表示
		int specifiedNumber = standardInput.nextInt();
		
		// 0以上の値が入力された場合
		if (specifiedNumber >= 0) {
		
			// 繰り返す回数を設定するための変数を宣言
			int tryTimes = 0;
			
			// iがnと同じ値になるまで
			while (tryTimes < specifiedNumber) {
				
				// *を一つ表示
				System.out.print('*');
				// iに1加える
				tryTimes ++;
				
				// *を加えた後の段階で入力された個数に満たない場合
				if (tryTimes < specifiedNumber) {
					
					// +を一つ表示
					System.out.print('+');
					// iに1加える
					tryTimes ++;
					
				}
				
			}
		
		// 改行する
		System.out.println();
		
		// 負の整数値が入力された場合
		} else {
			
			// 0以上の値の入力を促す
			System.out.print("0以上の値を入力してください");
			
		}
		
	}

}
