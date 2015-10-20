import java.io.*;
/**
 * 
 */

/**
 * @author internous
 *
 */
public class test {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		/*
		//テキストファイルを書き込む
		 try {
	            //出力先を作成する
	            FileWriter fw = new FileWriter("c:\\Users\\internous\\newfile.txt", false);  //※１
	            PrintWriter pw = new PrintWriter(new BufferedWriter(fw));

	            //内容を指定する
	            System.out.print("内容を入力してください: ");
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr);
				String str = br.readLine();
				pw.println(str);
				
	            //ファイルに書き出す
	            pw.close();

	            //終了メッセージを画面に出力する
	            System.out.println("出力が完了しました。");

	        } catch (IOException ex) {
	            //例外時処理
	            ex.printStackTrace();
	        }
*/
		
		//新規テキストファイルの作成
		File newfile = new File("c:\\Users\\internous\\newfile.txt");
	    try{
	      if (newfile.createNewFile()){
	        System.out.println("ファイルの作成に成功しました");
	      }else{
	        System.out.println("ファイルの作成に失敗しました");
	      }
	    }catch(Exception e){
	      System.out.println(e);
	    }
	    
		/*
		//新規フォルダ作成
		File newfile = new File("c:\\Users\\internous\\newtext2");

	    if (newfile.mkdir()){
	      System.out.println("ディレクトリの作成に成功しました");
	    }else{
	      System.out.println("ディレクトリの作成に失敗しました");
	    }
*/
	}

}
