package Chapter07;

/*
*クラス名：E_07_12
*概要：整数を左右に回転(最下位ビットと最上位ビットがつながっているとみなしてシフトすること)する
*作成者：N.Kimoto
*作成日：2024/04/19
*/

// Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

public class E_07_12 {

	// Scannerオブジェクトを生成
	static Scanner standardInput = new Scanner(System.in);

	/*
	*関数名：powerVariable
	*概要：整数のべき乗を計算する
	*引数：整数(int型)
	*戻り値：整数のべき乗
	*作成者：N.Kimoto
	*作成日：2024/04/19
	*/

	static int powerVariable(int integerVariable, int powerNumber) {

		// 計算結果を整数の0乗に初期化する
		int CalculatioResult = 1;

		// 整数のべき乗を計算
		while (powerNumber-- > 0) {

			// 1に整数を掛ける
			CalculatioResult *= integerVariable;

		}

		// 整数のべき乗を返却する
		return CalculatioResult;

	}

	/*
	*関数名：lRotate
	*概要：整数xをnビット左回転させる
	*引数：整数x, y(int型)
	*戻り値：左回転した値
	*作成者：N.Kimoto
	*作成日：2024/04/19
	*/

	static int lRotate(int x, int n) {

		// 最上位ビットの桁数の定数を宣言
		final int MAXIMUM_DIGIT = 32;
		
		// 回転した値の変数を初期化
		int rotateLeft = 0;
		
		// 回転した値が0か32の倍数でない場合
		if(n % MAXIMUM_DIGIT > 0) {
			
			// 左にnシフトさせた値の空いたビットに元の値の消えたビット分加算する
			rotateLeft = (x << n) + (x >>> MAXIMUM_DIGIT - n);
			
		// 回転した値が0か32の倍数である場合
		} else {
			
			// 整数値をそのままにする
			rotateLeft = x;
			
		}

		// 出た値を返却する
		return rotateLeft;

	}

	/*
	*関数名：rRotate
	*概要：整数xをnビット右回転させる
	*引数：整数x, y(int型)
	*戻り値：右回転した値
	*作成者：N.Kimoto
	*作成日：2024/04/19
	*/

	static int rRotate(int x, int n) {

		// 最上位ビットの桁数の定数を宣言
		final int MAXIMUM_DIGIT = 32;
		
		// 回転した値の変数を初期化
		int rotateRight = 0;
		
		// 回転した値が0か32の倍数でない場合
				if(n % MAXIMUM_DIGIT > 0) {

			// 整数を右回転させた値を計算する
			rotateRight = (x >>> n) + (x << MAXIMUM_DIGIT - n);
			
		// 回転した値が0か32の倍数である場合
		} else {
			
			// 整数値をそのままにする
			rotateRight = x;
			
		}
		
		// 出た値を返却する
		return rotateRight;

	}

	/*
	*関数名：printBits
	*概要：int型の整数のビット構成を表示
	*引数：整数
	*戻り値：ビット構成
	*作成者：N.Kimoto
	*作成日：2024/04/18
	*/

	static void printBits(int x) {

		// ビット構成の最上位ビットの定数を宣言
		final int MAXIMUM_BITS = 31;
		// 指定された値の定数を宣言
		final int SPECIFIED_ONE = 1;

		// その位の値を調査し、1であれば1を表示する
		for (int i = MAXIMUM_BITS; i >= 0; i--) {

			// その位の値が1か0か調べ結果を表示する
			System.out.print(((x >>> i & SPECIFIED_ONE) == SPECIFIED_ONE) ? '1' : '0');

		}

	}

	/*
	*関数名：main
	*概要：整数を左右に回転された値を表示する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/04/19
	*/

	public static void main(String[] args) {
		
		// 最上位ビットの桁数の定数を宣言
		final int MAXIMUM_DIGIT = 32;

		// 整数値の入力を促す
		System.out.print("整数値：");
		// 入力された整数値を読み込む
		int integerVariable = standardInput.nextInt();
		// 次の値が入力した整数値のビット構成であることを表示
		System.out.print("入力した整数値のビット構成\n = ");
		// 入力された整数値のビット構成を表示
		printBits(integerVariable);

		//一行空ける
		System.out.println("\n");

		// 回転数の入力を促す
		System.out.print("回転数：");
		// 入力された値を読み込む
		int inputNumber = standardInput.nextInt();
		// 正の整数値を入力するまで繰り返す
		while (inputNumber < 0) {

			// 整数の入力を促す
			System.out.print("0か正の整数値：");
			// 入力された値を読み込む
			inputNumber = standardInput.nextInt();

		}
		
		// 32ビット以上の回転で再び元の値に戻すための計算を行う
		int rotateNumber = inputNumber % MAXIMUM_DIGIT;

		// 次の値が右回転した整数値であることを表示
		System.out.print("右回転した値\n = ");
		// 入力された値分だけ右回転させた値を表示
		System.out.println(rRotate(integerVariable, rotateNumber));
		// 次の値が右回転した整数値のビット構成であることを表示
		System.out.print("右回転した値のビット構成\n = ");
		// 入力された値分だけ右回転させた値のビット構成を表示
		printBits(rRotate(integerVariable, rotateNumber));

		// 一行空ける
		System.out.println("\n");

		// 次の値が左回転した整数値であることを表示
		System.out.print("左回転した値\n = ");
		// 入力された値分だけ左回転させた値を表示
		System.out.println(lRotate(integerVariable, rotateNumber));
		// 次の値が左回転した整数値のビット構成であることを表示
		System.out.print("左回転した値のビット構成\n = ");
		// 入力された値分だけ左回転させた値のビット構成を表示
		printBits((lRotate(integerVariable, rotateNumber)));

	}

}
