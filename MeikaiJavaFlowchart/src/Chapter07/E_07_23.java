package Chapter07;

/*
*クラス名：E_07_23
*概要：生成した配列の要素の中で値が指定された値である全要素のインデックスを、
*先頭から順に格納した配列を生成する
*作成者：N.Kimoto
*作成日：2024/04/23
*/

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_07_23 {
	
	/*
	*関数名：arraySearchIdx
	*概要：配列の要素の中で値が指定された値である全要素のインデックスを、
	*先頭から順に格納した配列を生成する
	*引数：配列(int型), 要素の値(int型)
	*戻り値：配列の要素の中で値が指定された値である全要素のインデックスを、
	*先頭から順に格納した配列(int型)
	*作成者：N.Kimoto
	*作成日：2024/04/23
	*/

	static int[] arraySearchIdx(int[] a, int x) {

		// 生成する配列の要素数を初期化
		int elementCount = 0;
		
		// 生成する配列の要素数を調査
		for (int i = 0; i < a.length; i++) {

			// 指定された値を持つ要素の場合
			if (a[i] == x) {

				// その要素を数える
				elementCount++;

			}

		}
		
		// 調査によって得られた数の要素数を持つ配列を生成
		int[] indexArray = new int[elementCount];
		
		// 生成した配列のインデックス番号を初期化
		int arrayIndex = 0;

		// 生成した配列に指定された値を持つ要素のインデックスを代入
		for (int i = 0; i < a.length; i++) {

			// 指定された値を持つ要素の場合
			if (a[i] == x) {
				
				// 生成した配列に順番に指定された値を持つ要素のインデックス番号を代入
				indexArray[arrayIndex] = i;
				// 生成した配列のインデックス番号を進める
				arrayIndex++;

			}

		}

		// 生成した配列を返却
		return indexArray;

	}
	
	/*
	*関数名：main
	*概要：生成した配列の要素の中で値が指定された値である全要素のインデックスを、
	*先頭から順に格納した配列を生成し表示
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/23
	*/

	public static void main(String[] args) {

		// Scannerオブジェクトを生成
		Scanner standardInput = new Scanner(System.in);
		
		// 配列内を調査し終わったことを表すための定数を宣言
		final int INVESTIGATION_COMPLETED = 1;

		// 要素数の入力を促す
		System.out.print("要素数は：");
		// 入力された値を読み込む
		int integerVariable = standardInput.nextInt();

		// 0か負の整数の値を入力された場合
		while (integerVariable <= 0) {

			// 正の整数値の入力を促す
			System.out.print("正の整数値を入力してください：");
			// 入力された値を読み込む
			integerVariable = standardInput.nextInt();

		}

		// 入力された値の要素数を持つ配列を宣言
		int[] firstArray = new int[integerVariable];

		// 各要素に値を入力する
		for (int i = 0; i < integerVariable; i++) {

			// 要素に代入する値の入力を促す
			System.out.print("a[" + i + "]：");
			// 入力された値を読み込む
			firstArray[i] = standardInput.nextInt();

		}
		
		// 指定する要素の値の入力を促す
		System.out.print("指定する要素の値は：");
		// 入力された値を読み込む
		int specifiedNumber = standardInput.nextInt();
		
		// 生成した配列内の要素の値を調査
		for(int i = 0; i < integerVariable; i++) {
			
			// 生成した配列内に入力された値があった場合
			if (firstArray[i] == specifiedNumber) {
				
				// 配列を生成したことを表示
				System.out.println("生成した配列の要素の中で値が" + specifiedNumber + "である全要素のインデックスを、\n"
				+ "先頭から順に格納した配列を生成しました。");

				// 生成した配列を順に表示
				for (int j = 0; j < arraySearchIdx(firstArray, specifiedNumber).length; j++) {

					// 生成した配列の各要素を表示
					System.out.println("indexArray[" + j + "] = " + arraySearchIdx(firstArray, specifiedNumber)[j]);

				}
				
				// 調査を終了する
				break;
				
			}
			
			// 生成した配列内に入力された値がなかった場合
			if (i == integerVariable - INVESTIGATION_COMPLETED) {
				
				// 配列が生成できなかったことを表示
				System.out.println("生成した配列内に値が" + specifiedNumber + "である要素が見つからなかったため、\n"
				+ "配列を生成できませんでした。");
				
			}
			
		}

	}

}
