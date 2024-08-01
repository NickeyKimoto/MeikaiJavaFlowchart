package Chapter13.shape2;

/*
*クラス名：Point
*概要：図形を表す抽象クラスShapeから派生した、点を表すクラス
*作成者：N.Kimoto
*作成日：2024/05/22
*/

public class Point extends Shape {
	
	/*
	*コンストラクタ名：Point
	*概要：何もしない
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/22
	*/
	
	public Point() { }
	
	/*
	*関数名：toString
	*概要：点に関する図形情報を表す文字列を返却
	*引数：なし
	*戻り値：点に関する図形情報を表す文字列(String型)
	*作成者：N.Kimoto
	*作成日：2024/05/22
	*/
	
	public String toString() {
		
		// 点に関する図形情報を表す文字列
		return "Point";
		
	}
	
	/*
	*関数名：draw
	*概要：点を描画する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/22
	*/
	
	public void draw() {
		
		// 点を描画する
		System.out.println('+');
		
	}

}
