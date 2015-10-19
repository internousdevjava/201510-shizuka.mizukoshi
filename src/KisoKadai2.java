import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author internous *
 */

public class KisoKadai2 {
//数当てゲーム
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1~100の乱数を得る
		int ran = 0;
		int x = 0;
		while ((ran|x) < 1 | (ran|x) > 100) {
			ran = (int) (Math.random() * 100);
			// 1~100の数字を入力させる
			System.out.println("数当てゲームしよー＾ω＾！");
			System.out.println("ルール：1~100まで");
			System.out.println();
			while (true) {
				System.out.print("いくつだと思う？　⇒　 ");
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr);
				try {
					String buf = br.readLine();
					x = Integer.parseInt(buf);
					if (ran > x) {
						System.out.println("もっと大きいよー");
					} else if (ran < x) {
						System.out.println("もっと小さいなー");
					} else {
						System.out.println("あたり！　でも賞品はない^q^!");
						break;
					}
				} catch (Exception e) {
					x = 0;
				}
				
			}
		}
	}
}
