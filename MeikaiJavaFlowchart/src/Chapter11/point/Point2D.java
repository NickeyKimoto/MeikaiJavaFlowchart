// 2次元座標クラス

// このソースプログラムで宣言するクラスをパッケージ
// MeikaiJava.List.Chap11.pointに所属させる
package Chapter11.point;

public class Point2D {

	private int x; // X座標
	private int y; // Y座標
	
	public Point2D() { }
	public Point2D(int x, int y) { this.x = x; this.y = y; }
	public Point2D(Point2D p) { this(p.x, p.y); }
	
	public String toString() {
		
		return "(" + x + "," + y + ")"; 
		
	}

}
