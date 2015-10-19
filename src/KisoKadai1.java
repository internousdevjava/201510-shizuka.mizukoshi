import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author internous
 *
 */
public class KisoKadai1 {
//九九表の作成
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		// 入力　（入力できる数を制限し、有効な数が入力されるまで何度も入力させる）
		while ((x|y)<1 | (x|y)>100) {
			System.out.print("X軸の最大値を入力してください: ");
			InputStreamReader isrx = new InputStreamReader(System.in);
			BufferedReader brx = new BufferedReader(isrx);
			try {
				String bufx = brx.readLine();
				x = Integer.parseInt(bufx);
			} catch (Exception e) {
				x = 0;
			}
			System.out.print("Y軸の最大値を入力してください: ");
			InputStreamReader isry = new InputStreamReader(System.in);
			BufferedReader bry = new BufferedReader(isry);
			try {
				String bufy = bry.readLine();
				y = Integer.parseInt(bufy);
			} catch (Exception e) {
				y = 0;
			}
		}
		System.out.println("以下に九九表を生成します。");
		System.out.println();
		// 表の生成（X軸、Y軸を意識して表示させる）
		for (int i = y; i > 0; i--) {
			for (int j = 1; j <= x; j++) {
				if (i * j < 10) {
					//桁ごとに適切なスペースを入れる
					System.out.print("    ");
				} else if (i * j < 100) {
					System.out.print("   ");
				} else if (i * j < 1000) {
					System.out.print("  ");
				} else if (i * j < 10000) {
					System.out.print(" ");
				}
				System.out.print("  " + i * j);
			}
			System.out.println();
		}
	}
}
