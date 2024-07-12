package Chapter04;

/*
*クラス名：E_04_05
*概要：List4-5のx--が--xとなっていたらどのような出力が得られるか確認するプログラム
*作成者：N.Kimoto
*作成日：2024/04/08
*/


//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_04_05 {
	
	/*
	*関数名：main
	*概要：入力された正の整数を0までカウントダウンし、List4-5のx--が
	*--xとなっていたらどのような出力が得られるか確認する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/08
	*/

	public static void main(String[] args) {
		
		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);
		
		// カウントダウンすることを表示
		System.out.println("カウントダウンします。");
	    // xを初期化する(教本準拠のため変数はx)
	    int x = 0;
	    
	    // 入力された値が0以下の場合
	    do {
	    	
	    	// 正の整数値の入力を促す
	    	System.out.print("正の整数値：");
	    	// 入力された正の整数値を読み込む
	    	x = standardInput.nextInt();
	    	
    	// xが正の整数値になるまで繰り返す
	    } while (x <= 0);
	    
	    // xが0になるまで繰り返す
	    while (x >= 0) {
	    	
	    	// xの値を表示
	    	System.out.println(--x);
	    	
	    }
	    
	    // 結果：最後の値から1引いたものが表示されるので-1まで表示される

	}

}
