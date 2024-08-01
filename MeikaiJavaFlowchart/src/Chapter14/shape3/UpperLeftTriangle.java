package Chapter14.shape3;

/*
*クラス名：HorzLine
*概要：クラスUpperLeftTriangleから派生した左上直角の二等辺三角形を表すクラス
*作成者：N.Kimoto
*作成日：2024/05/22
*/

public class UpperLeftTriangle extends AbstractTriangle {
	
	/*
	*コンストラクタ名：UpperLeftTriangle
	*概要：左上直角の二等辺三角形の斜辺ではない一辺の長さを初期化する
	*引数：左上直角の二等辺三角形の斜辺ではない一辺の長さ(int)
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/22
	*/
	
	public UpperLeftTriangle(int triangleSideLength) { 
		
		// 左上直角の二等辺三角形の斜辺ではない一辺の長さを初期化
		super(triangleSideLength);
		
	}
	
	/*
	*関数名：toString
	*概要：左上直角の二等辺三角形に関する図形情報を表す文字列を返却
	*引数：なし
	*戻り値：左上直角の二等辺三角形に関する図形情報を表す文字列(String型)
	*作成者：N.Kimoto
	*作成日：2024/05/22
	*/
	
	public String toString() {
		
		// 左上直角の二等辺三角形に関する図形情報を表す文字列を返却
		return "UpperLeftTriangle(triangleSideLength:" + getTriangleSideLength() + ")";
		
	}
	
	
	/*
	*関数名：draw
	*概要：左上直角の二等辺三角形を描画する
	*引数：なし
	*戻り値：なし
	*作成者：N.Kimoto
	*作成日：2024/05/22
	*/
	
	public void draw() {
		
		// 斜辺ではない一辺の長さの回数分アステリスク記号'*'を横に並べる
		for (int i = 0; i < getTriangleSideLength(); i++) {
			
			// その行で(段数-出力してる段)回だけ'*'を連続表示
			for (int j = getTriangleSideLength() - i; j > 0; j--) {
			
				// '*'を表示
				System.out.print('*');
					
			}
			
			// 改行する
			System.out.println();
			
		}
		
	}

}
