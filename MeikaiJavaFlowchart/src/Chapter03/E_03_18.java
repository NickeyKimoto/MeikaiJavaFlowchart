package Chapter03;

/*
*クラス名：E_03_18
*概要：入力された月を整数値として読み込み、それに対応する季節を表示するプログラム
*作成者：N.Kimoto
*作成日：2024/04/05
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_03_18 {
	
	/*
	*関数名：main
	*概要：入力された月を整数値として読み込み、それに対応する季節を表示するプログラム
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/05
	*/

	public static void main(String[] args) {
		
		// 引数で標準入力System.inを指定
		Scanner standardInput = new Scanner(System.in);
										
	    // 月の入力を促す
		System.out.print("季節を求めます。\n何月ですか：");
	    // 入力された月を読み込む
		int monthNumber = standardInput.nextInt();
		
		// 1～12が入力された場合
		if (monthNumber > 0 && monthNumber <= 12) {
		
			// それぞれの月に対応したラベルを実行する
			switch (monthNumber) {
			
				// 3月のとき文章を表示しswitch文の実行を終了する
				case 3:
				// 4月のとき文章を表示しswitch文の実行を終了する
				case 4:
				// 5月のとき文章を表示しswitch文の実行を終了する
				case 5:  System.out.println("春"); break;
				// 6月のとき文章を表示しswitch文の実行を終了する
				case 6:
				// 7月のとき文章を表示しswitch文の実行を終了する
				case 7:
				// 8月のとき文章を表示しswitch文の実行を終了する
				case 8:  System.out.println("夏"); break;
				// 9月のとき文章を表示しswitch文の実行を終了する
				case 9:
				// 10月のとき文章を表示しswitch文の実行を終了する
				case 10:
				// 11月のとき文章を表示しswitch文の実行を終了する
				case 11:  System.out.println("秋"); break;
				// 12月のとき文章を表示しswitch文の実行を終了する
				case 12:
				// 1月のとき文章を表示しswitch文の実行を終了する
				case 1:
				// 2月のとき文章を表示しswitch文の実行を終了する
				case 2:  System.out.println("冬"); break;
			
			}
			
		// 1～12でない値が入力された場合
		} else {
			
			// 月でない値が入力されたことを表示
			System.out.print("正しくない値が入力されました。");
				
		}

	}

}
