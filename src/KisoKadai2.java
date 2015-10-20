import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author internous *
 */

public class KisoKadai2 {
	// 数当てゲーム
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1~100の乱数を得る
		int ran = 0;
		int x = 0;
		while ((ran | x) < 1 | (ran | x) > 100) {
			ran = (int) (Math.random() * 100);
			System.out.println("数当てゲームしよー＾ω＾！");
			System.out.println("ルール：1~100まで");
			System.out.println();
			while (true) {
				// 1~100の数字を入力させる
				System.out.print("いくつだと思う？　⇒　 ");
				System.out.println();
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr);
				try {
					String buf = br.readLine();
					x = Integer.parseInt(buf);
					// 入力値に対するHigh&Lowを教える
				
					if (x < 1 | x > 100) {
						System.out.println("1~100で入力しなさい！");
						System.out.println();
						continue;
				}else if (ran > x){ 
						System.out.println("もっと大きいよー");
						System.out.println();
					} else if (ran < x) {
						System.out.println("もっと小さいなー");
						System.out.println();
					}   else {
						System.out.println("あたり！　でも賞品はない^q^!");
						System.out.println();
						break;
					}
				} catch (Exception e) {
					x = 0;
					System.out.println();
					System.out.println("半角で数字を入力して！ ");
					System.out.println();
				}
			}
		}
	}
}