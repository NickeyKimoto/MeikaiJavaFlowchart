package Chapter15;

// Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

/*
*クラス名：E_15_03
*概要：文字列探索を行う
*作成者：N.Kimoto
*作成日：2024/05/27
*/
public class E_15_03 {

	/*
	*関数名：main
	*概要：文字列探索を行う
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/27
	*/
	public static void main(String[] args) {
		// Scannerオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);
		
		// 探索する文字列の入力を促す
		System.out.print("文字列s1：");
		// 入力された値を読み込む(教本準拠の変数名)
		String s1 = standardInput.next();
		
		// 探索する対象となる文字列の入力を促す
		System.out.print("文字列s2：");
		// 入力された値を読み込む(教本準拠の変数名)
		String s2 = standardInput.next();

		// 探索し文字列が含まれていればその位置を、含まれていなければ-1を格納(教本準拠の変数名)
		int idx = s1.indexOf(s2);
		// -1が返却された場合
		if (idx == -1) {
			// 入力された文字列内に対象となる文字列が含まれなかったことを表示
			System.out.println("s1中にs2は含まれません。");
		// 位置が返却された場合
		} else {
			// 文字列を表示
			System.out.println(s1);
			// 対象となる文字列を表示する位置を調整
			for (int i = 0; i < idx; i++) {
				// 空白を表示
				System.out.print(" ");
			}
			// 対象となる文字列を表示
			System.out.print(s2);
		}

	}

}
