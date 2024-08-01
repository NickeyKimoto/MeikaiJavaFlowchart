package Chapter13.shape2;

/*
*クラス名：Shape
*概要：図形の概念を表す抽象クラス
*作成者：N.Kimoto
*作成日：2024/05/22
*/

public abstract class Shape {
	
	// 図形の大きさの最小値を表す定数を宣言
	static final int MINIMUM_SIZE_OF_SHAPE = 1;
	
	/*
	*関数名：toString
	*概要：図形情報を表す文字列を返却する抽象メソッド
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/22
	*/
	
	public abstract String toString();
	
	/*
	*関数名：draw
	*概要：図形を描画する抽象メソッド
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/22
	*/
	
	public abstract void draw();
	
	/*
	*関数名：print
	*概要：図形情報の表示と図形の描画を行う
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/22
	*/
	
	public void print() {
		
		// メソッドtoStringが返却する文字列を表示
		System.out.println(toString());
		// 図形の描画
		draw();
		
	}

}
