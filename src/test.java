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
		//�e�L�X�g�t�@�C������������
		 try {
	            //�o�͐���쐬����
	            FileWriter fw = new FileWriter("c:\\Users\\internous\\newfile.txt", false);  //���P
	            PrintWriter pw = new PrintWriter(new BufferedWriter(fw));

	            //���e���w�肷��
	            System.out.print("���e����͂��Ă�������: ");
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr);
				String str = br.readLine();
				pw.println(str);
				
	            //�t�@�C���ɏ����o��
	            pw.close();

	            //�I�����b�Z�[�W����ʂɏo�͂���
	            System.out.println("�o�͂��������܂����B");

	        } catch (IOException ex) {
	            //��O������
	            ex.printStackTrace();
	        }
*/
		
		//�V�K�e�L�X�g�t�@�C���̍쐬
		File newfile = new File("c:\\Users\\internous\\newfile.txt");
	    try{
	      if (newfile.createNewFile()){
	        System.out.println("�t�@�C���̍쐬�ɐ������܂���");
	      }else{
	        System.out.println("�t�@�C���̍쐬�Ɏ��s���܂���");
	      }
	    }catch(Exception e){
	      System.out.println(e);
	    }
	    
		/*
		//�V�K�t�H���_�쐬
		File newfile = new File("c:\\Users\\internous\\newtext2");

	    if (newfile.mkdir()){
	      System.out.println("�f�B���N�g���̍쐬�ɐ������܂���");
	    }else{
	      System.out.println("�f�B���N�g���̍쐬�Ɏ��s���܂���");
	    }
*/
	}

}
