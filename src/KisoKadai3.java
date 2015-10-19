/**
 * 
 */
import java.io.*;

/**
 * @author internous
 *
 */
public class KisoKadai3 {
	// テキストファイルへの読み書きプログラムの作成
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ＜できることを提示＞
		int x = 0;
		while (x > 0 | x < 5) {
			System.out.println("メニュー");
			System.out.println("1.新規フォルダ作成　2.新規テキストファイル作成　3.ファイルの読み込み　4.ファイルの書き込み　9.終了");
			System.out.println();

			try {
				// ＜メニューの選択をさせる＞
				System.out.print("実行したい数字を半角で入力して下さい。　⇒　");
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr);
				String menu = br.readLine();
				x = Integer.parseInt(menu);
			} catch (Exception e) {
				//例外時処理
				x = 0;
			}
			if (x == 1) {
				// ＜1.新規フォルダ作成＞
				String fold = null;
				String foname = null;
				//フォルダを作成する場所を指定させる
				System.out.println("フォルダを作成したい場所を教えて下さい");
				InputStreamReader isr1 = new InputStreamReader(System.in);
				BufferedReader br1 = new BufferedReader(isr1);
				try {
					fold = br1.readLine();
				} catch (IOException e) {
					//例外時処理
					e.printStackTrace();
				}
				//フォルダ名を入力させる
				System.out.println("フォルダ名を入力してください");
				isr1 = new InputStreamReader(System.in);
				br1 = new BufferedReader(isr1);
				try {
					foname = br1.readLine();
				} catch (IOException e) {
					//例外時処理
					e.printStackTrace();
				}
				//上記で指定させた位置と名前でフォルダを作成する
				File newfolder = new File(fold + "\\" + foname);
				if (newfolder.mkdir()) {
					System.out.println("ディレクトリの作成に成功しました");
				} else {
					System.out.println("ディレクトリの作成に失敗しました");
				}
			} else if (x == 2) {
				// ＜2.新規ファイル作成＞
				String nfile = null;
				String nfiname = null;
				//ファイルを入れるフォルダを指定させる
				System.out.println("ファイルを作成したい場所を教えて下さい");
				InputStreamReader isr2 = new InputStreamReader(System.in);
				BufferedReader br2 = new BufferedReader(isr2);
				try {
					nfile = br2.readLine();
					//ファイル名を入力させる
					System.out.println("ファイル名を入力してください");
				} catch (IOException e) {
					//例外時処理
					e.printStackTrace();
				}
				isr2 = new InputStreamReader(System.in);
				br2 = new BufferedReader(isr2);
				try {
					nfiname = br2.readLine();
				} catch (IOException e) {
					//例外時処理
					e.printStackTrace();
				}
				File newfile = new File(nfile + "\\" + nfiname);
				try {
					if (newfile.createNewFile()) {
						System.out.println("ファイルの作成に成功しました");
					} else {
						System.out.println("ファイルの作成に失敗しました");
					}
				} catch (IOException e) {
					//例外時処理
					System.out.println(e);
				}
			} else if (x == 3) {
				// ＜3.ファイルの読み込み＞
				String filer = null;
				String finamer = null;
				// 読みたいファイルが入っているフォルダを指定させる
				System.out.println("読みたいファイルの場所を教えて下さい");
				InputStreamReader isr3 = new InputStreamReader(System.in);
				BufferedReader br3 = new BufferedReader(isr3);
				try {
					filer = br3.readLine();
				} catch (IOException e) {
					//例外時処理
					e.printStackTrace();
				}
				//読みたいファイルを指定させる
				System.out.println("ファイル名を拡張子も含めて入力してください");
				isr3 = new InputStreamReader(System.in);
				br3 = new BufferedReader(isr3);
				try {
					finamer = br3.readLine();
				} catch (IOException e) {
					//例外時処理
					e.printStackTrace();
				}
				try {
					//上記で指定させたファイルを読み込む
					FileReader filereader = new FileReader(filer + "\\" + finamer);
					int ch;
					while ((ch = filereader.read()) != -1) {
						System.out.print((char) ch);
					}
				} catch (IOException e) {
					//例外時処理
					e.printStackTrace();
				}
			} else if (x == 4) {
				// ＜4.ファイル名の指定＞
				String filew = null;
				String finamew = null;
				//書き込みたいファイルの場所を入力させる
				System.out.println("書き込みたいファイルの場所を教えて下さい");
				InputStreamReader isr4 = new InputStreamReader(System.in);
				BufferedReader br4 = new BufferedReader(isr4);
				try {
					filew = br4.readLine();
				} catch (IOException e) {
					//例外時処理
					e.printStackTrace();
				}
				//書き込みたいファイル名を入力させる
				System.out.println("ファイル名を入力してください");
				isr4 = new InputStreamReader(System.in);
				br4 = new BufferedReader(isr4);
				try {
					finamew = br4.readLine();
				} catch (IOException e) {
					//例外時処理
					e.printStackTrace();
				}
				// 上書きか追記を選択する
				System.out.print("ファイルに上書きしたいなら「1」・追記したいなら「2」を入力してください: ");
				InputStreamReader isrb = new InputStreamReader(System.in);
				BufferedReader brb = new BufferedReader(isrb);
				// 上書きと追記の分岐
				boolean bool = true;
				int w = 0;
				try {
					String bufb = brb.readLine();
					w = Integer.parseInt(bufb);
					if (w == 1)
						bool = false;
				} catch (Exception e) {
					//例外時処理
					w = 0;
				}
				// ファイルの書き込み
				System.out.println("書き込み開始　↓　 ");
				try {
					// 出力先を作成する
					FileWriter fw = new FileWriter(filew + "\\" + finamew, bool);
					PrintWriter pw = new PrintWriter(new BufferedWriter(fw));
					// 内容を指定する
					System.out.print("内容を入力してください: ");
					InputStreamReader isr = new InputStreamReader(System.in);
					BufferedReader br = new BufferedReader(isr);
					String str = br.readLine();
					pw.println(str);
					// ファイルに書き出す
					pw.close();
					// 終了メッセージを画面に出力する
					System.out.println("出力が完了しました。");
				} catch (IOException e) {
					// 例外時処理
					e.printStackTrace();
				}
			} else {
				// プログラムの終了
				System.out.println("終了");
			}
		}
	}
}
