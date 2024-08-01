package Chapter14.shape3;

//Javaでキーボードから標準入力を取得するために必要なScannerクラスをインポート
import java.util.Scanner;

/*
*クラス名：ShapeTester
*概要：図形クラス群のテスト
*作成者：N.Kimoto
*作成日：2024/05/22
*/
public class ShapeTester {
	
	// Scannerオブジェクトを生成
	static Scanner standardInput = new Scanner(System.in);
	
	/*
	*関数名：inputRange
	*概要：入力した値を範囲内の値で入力させる
	*引数：なし
	*戻り値：入力された値(int型)
	*作成者：N.Kimoto
	*作成日：2024/04/30
	*/
	
	static int inputRange() {

		// 範囲内の値の入力を促す
		System.out.print("有効範囲内で入力してください：");
		// 入力された値を読み込む
		int inputValue = standardInput.nextInt();
		// 読み込んだ値を返却する
		return inputValue;
	
	}

	public static void main(String[] args) {
		
		// 生成する図形の個数の入力を促す
		System.out.print("図形は何個：");
		// 入力された値を読み込む
		int numberOfShapes = standardInput.nextInt();
		// 入力された値が0以下の場合
		while (numberOfShapes <= 0) {
			
			// 1以上の値を入力させる
			numberOfShapes = inputRange();
			
		}
		
		// 表示させる図形の情報を格納した配列を宣言
		Shape[] outputShapes = new Shape[numberOfShapes];
		// 表示させることのできる図形の個数の最大値を表す定数を宣言
		final int MAXIMUM_NUMBER_OF_SHAPE_TYPES = 5;
		// 表示させることのできる図形の個数分の要素数を持つ配列を宣言
		final int[] NUMBER_OF_SHAPE_TYPES = new int[MAXIMUM_NUMBER_OF_SHAPE_TYPES];
		// それぞれの要素に表示させることのできる図形を区別する値を代入
		for (int i = 0; i < NUMBER_OF_SHAPE_TYPES.length; i++) {
			
			// 図形を区別する値を表す変数を宣言
			int substitutionValue = i;
			// 要素に表示させることのできる図形を区別する値を代入
			NUMBER_OF_SHAPE_TYPES[i] = ++substitutionValue;
			
		}
		
		// 何個目の図形であるかを表す変数を宣言
		int shapeNumber = 0;
		
		// 表示させる図形の情報を入力させる
		for (int i = 0; i < outputShapes.length; i++) {

			// 表示させる図形の種類の入力を促す
			System.out.print(++shapeNumber + "番の図形の種類(1…点／2…水平直線／3…垂直直線／4…長方形／5…平行四辺形)：");
			// 入力された値を読み込む
			int shapeType = standardInput.nextInt();
			// 入力された値が表示させることのできる図形を区別する値の範囲外の場合
			while (shapeType < NUMBER_OF_SHAPE_TYPES[0] || shapeType > NUMBER_OF_SHAPE_TYPES.length) {
				
				// 範囲内の値を入力させる
				shapeType = inputRange();
				
			}
			
			// 1が入力された場合
			if (shapeType == NUMBER_OF_SHAPE_TYPES[0]) {
				
				// 表示させる図形の情報に点を表示させる情報を追加する
				outputShapes[i] = new Point();
				
			// 2が入力された場合
			} else if (shapeType == NUMBER_OF_SHAPE_TYPES[1]) {
				
				// 水平直線の長さの入力を促す
				System.out.print("長さ：");
				// 入力された値を読み込む
				int horizontalLength = standardInput.nextInt();
				// 入力された値が0以下の場合
				while (horizontalLength <= 0) {
					
					// 1以上の値を入力させる
					horizontalLength = inputRange();
					
				}
				// 表示させる図形の情報に水平直線を表示させる情報を追加する
				outputShapes[i] = new HorzLine(horizontalLength);
				
			// 3が入力された場合
			} else if (shapeType == NUMBER_OF_SHAPE_TYPES[2]) {
				
				// 垂直直線の長さの入力を促す
				System.out.print("長さ：");
				// 入力された値を読み込む
				int verticalLength = standardInput.nextInt();
				// 入力された値が0以下の場合
				while (verticalLength <= 0) {
					
					// 1以上の値を入力させる
					verticalLength = inputRange();
					
				}
				// 表示させる図形の情報に垂直直線を表示させる情報を追加する
				outputShapes[i] = new VirtLine(verticalLength);
			
			// 4が入力された場合
			} else if (shapeType == NUMBER_OF_SHAPE_TYPES[3]) {
				
				// 長方形の幅の入力を促す
				System.out.print("幅：");
				// 入力された値を読み込む
				int rectangleWidth = standardInput.nextInt();
				// 入力された値が0以下の場合
				while (rectangleWidth <= 0) {
					
					// 1以上の値を入力させる
					rectangleWidth = inputRange();
					
				}
				// 長方形の高さの入力を促す
				System.out.print("高さ：");
				// 入力された値を読み込む
				int rectangleHeight = standardInput.nextInt();
				// 入力された値が0以下の場合
				while (rectangleHeight <= 0) {
					
					// 1以上の値を入力させる
					rectangleHeight = inputRange();
					
				}
				// 表示させる図形の情報に長方形を表示させる情報を追加する
				outputShapes[i] = new Rectangle(rectangleWidth, rectangleHeight);
				
			// 5が入力された場合
			} else if (shapeType == NUMBER_OF_SHAPE_TYPES[4]) {
				
				// 平行四辺形の幅の入力を促す
				System.out.print("幅：");
				// 入力された値を読み込む
				int parallelogramWidth = standardInput.nextInt();
				// 入力された値が0以下の場合
				while (parallelogramWidth <= 0) {
					
					// 1以上の値を入力させる
					parallelogramWidth = inputRange();
					
				}
				// 平行四辺形の高さの入力を促す
				System.out.print("高さ：");
				// 入力された値を読み込む
				int parallelogramHeight = standardInput.nextInt();
				// 入力された値が0以下の場合
				while (parallelogramHeight <= 0) {
					
					// 1以上の値を入力させる
					parallelogramHeight = inputRange();
					
				}
				// 表示させる図形の情報に平行四辺形を表示させる情報を追加する
				outputShapes[i] = new Parallelogram(parallelogramWidth, parallelogramHeight);
	
			}
			
		}
		
		// 表示させる図形の情報を格納した配列にある図形の情報を表示する
		for (int i = 0; i < outputShapes.length; i++) {
			
			// 図形の情報を表示する
			outputShapes[i].print();
			// もしこの要素がPlane2D型であれば
			if (outputShapes[i] instanceof Plane2D) {
				// 図形の面積を表示する
				System.out.print("Area:[" + ((Plane2D) outputShapes[i]).getArea() + "]");
			}
			// 改行する
			System.out.println();
			
		}
		
		

	}

}
