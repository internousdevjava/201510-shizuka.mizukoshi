import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * @author internous *
 */

public class KisoKadai2 {
//�����ăQ�[��
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 1~100�̗����𓾂�
		int ran = 0;
		int x = 0;
		while ((ran|x) < 1 | (ran|x) > 100) {
			ran = (int) (Math.random() * 100);
			// 1~100�̐�������͂�����
			System.out.println("�����ăQ�[������[�O�ցO�I");
			System.out.println("���[���F1~100�܂�");
			System.out.println();
			while (true) {
				System.out.print("�������Ǝv���H�@�ˁ@ ");
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr);
				try {
					String buf = br.readLine();
					x = Integer.parseInt(buf);
					if (ran > x) {
						System.out.println("�����Ƒ傫����[");
					} else if (ran < x) {
						System.out.println("�����Ə������ȁ[");
					} else {
						System.out.println("������I�@�ł��ܕi�͂Ȃ�^q^!");
						break;
					}
				} catch (Exception e) {
					x = 0;
				}
				
			}
		}
	}
}
