package Chapter15;
// Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

/*
*クラス名：E_15_01
*概要：入力された文字列を逆順に表示
*作成者：N.Kimoto
*作成日：2024/05/27
*/
public class E_15_01 {
	
	/*
	*関数名：main
	*概要：入力された文字列を逆順に表示
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/27
	*/
	public static void main(String[] args) {
		// Scannerオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);
		
		// 文字列の入力を促す
		System.out.print("文字列s1：");
		// 入力された値を読み込む
		String characterString = standardInput.next();
		
		// 表示する文字のインデックス番号を合わせるための定数を宣言
		final int START_INDEX = 1;
		
		// 文字列を逆順に表示
		for (int i = characterString.length() - START_INDEX; i >= 0; i--) {
			// 文字を逆順に表示
			System.out.print(characterString.charAt(i));
		}
	}
}