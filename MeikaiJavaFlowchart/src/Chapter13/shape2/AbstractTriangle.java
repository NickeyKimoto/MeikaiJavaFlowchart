package Chapter13.shape2;

/*
*クラス名：Triangle
*概要：クラスShapeから派生した直角二等辺三角形を表す抽象クラス
*作成者：N.Kimoto
*作成日：2024/05/22
*/

public abstract class AbstractTriangle extends Shape {
	
	// 直角二等辺三角形の斜辺ではない一辺の長さを表すフィールドを宣言
	private int triangleSideLength;
	
	/*
	*コンストラクタ名：AbstractTriangle
	*概要：直角二等辺三角形の斜辺ではない一辺の長さを初期化する
	*引数：直角二等辺三角形の斜辺ではない一辺の長さ(int)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/22
	*/
	
	public AbstractTriangle(int triangleSideLength) {
		
		// 直角二等辺三角形の斜辺ではない一辺の長さを設定する
		setTriangleSideLength(triangleSideLength);
		
	}
	
	/*
	*関数名：getTriangleSideLength
	*概要：直角二等辺三角形の斜辺ではない一辺の長さを取得
	*引数：なし
	*戻り値：直角二等辺三角形の斜辺ではない一辺の長さ(int型)
	*作成者：N.Kimoto
	*作成日：2024/05/22
	*/
	
	public int getTriangleSideLength() {
		
		// 直角二等辺三角形の斜辺ではない一辺の長さを返却
		return triangleSideLength;
		
	}
	
	/*
	*関数名：setTriangleBottom
	*概要：直角二等辺三角形の斜辺ではない一辺の長さを設定
	*引数：直角二等辺三角形の斜辺ではない一辺の長さ(int型)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/22
	*/
	
	public void setTriangleSideLength(int triangleSideLength) {
		
		// 直角二等辺三角形の斜辺ではない一辺の長さを設定
		this.triangleSideLength = triangleSideLength;
		
	}
	
	/*
	*関数名：toString
	*概要：直角二等辺三角形に関する図形情報を表す文字列を返却
	*引数：なし
	*戻り値：直角二等辺三角形に関する図形情報を表す文字列(String型)
	*作成者：N.Kimoto
	*作成日：2024/05/22
	*/
	
	public String toString() {
		
		// 直角二等辺三角形に関する図形情報を表す文字列を返却
		return "AbstractTriangle(triangleSideLength:" + triangleSideLength + ")";
		
	}

}
