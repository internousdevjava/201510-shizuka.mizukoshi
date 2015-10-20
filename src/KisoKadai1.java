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
//九九表
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("1~100までの数字を使って九九表を作成させます。");
		int x = 0;
		int y = 0;
		// X軸、Y軸を入力させる
		while ((x|y)<1 | (x|y)>100) {
			System.out.print("X軸の最大値を半角で入力してください: ");
			InputStreamReader isrx = new InputStreamReader(System.in);
			BufferedReader brx = new BufferedReader(isrx);
			try {
				String bufx = brx.readLine();
				x = Integer.parseInt(bufx);
			} catch (Exception e) {
				x = 0;
			}
			System.out.print("Y軸の最大値を半角で入力してください: ");
			InputStreamReader isry = new InputStreamReader(System.in);
			BufferedReader bry = new BufferedReader(isry);
			try {
				String bufy = bry.readLine();
				y = Integer.parseInt(bufy);
			} catch (Exception e) {
				y = 0;
			}
		}
		System.out.println("以下に九九表を生成させます。");
		System.out.println();
		// Y軸の値を決める
		for (int i = y; i > 0; i--) {
			//x軸の値を決める
			for (int j = 1; j <= x; j++) {
				if (i * j < 10) {
					//表の値を揃えるために適切なスペースを入力する
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
