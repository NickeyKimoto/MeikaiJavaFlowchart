package Chapter04;

/*
*クラス名：E_04_06_B
*概要：読み込んだ値が1未満の場合改行文字を出力しないようにしたList4-8
*作成者：N.Kimoto
*作成日：2024/04/08
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_04_06_B {
	
	/*
	*関数名：main
	*概要：読み込んだ個数だけ*を表示し、読み込んだ値が1未満の場合改行文字を出力しない
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/08
	*/

	public static void main(String[] args) {
		
		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);
		
		// *を表示させる個数の入力を促す(教本準拠のため変数はn)
		System.out.print("何個*を表示しますか：");
		// 入力した個数を表示
		int n = standardInput.nextInt();
		
		// 読み込んだ値が1以上の場合
		if (n >= 1) {
		
			// n回繰り返すための変数を宣言(教本準拠のため変数はi)
			int i = 1;
			
			// iがnと同じ値になるまで
			while (i <= n) {
				
				// *を一つ表示
				System.out.print('*');
				// iに1加える
				i ++;
				
			}
			
			// 改行する
			System.out.println();
			
		}

	}

}
