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
//���\�̍쐬
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = 0;
		int y = 0;
		// ���́@�i���͂ł��鐔�𐧌����A�L���Ȑ������͂����܂ŉ��x�����͂�����j
		while ((x|y)<1 | (x|y)>100) {
			System.out.print("X���̍ő�l����͂��Ă�������: ");
			InputStreamReader isrx = new InputStreamReader(System.in);
			BufferedReader brx = new BufferedReader(isrx);
			try {
				String bufx = brx.readLine();
				x = Integer.parseInt(bufx);
			} catch (Exception e) {
				x = 0;
			}
			System.out.print("Y���̍ő�l����͂��Ă�������: ");
			InputStreamReader isry = new InputStreamReader(System.in);
			BufferedReader bry = new BufferedReader(isry);
			try {
				String bufy = bry.readLine();
				y = Integer.parseInt(bufy);
			} catch (Exception e) {
				y = 0;
			}
		}
		System.out.println("�ȉ��ɋ��\�𐶐����܂��B");
		System.out.println();
		// �\�̐����iX���AY�����ӎ����ĕ\��������j
		for (int i = y; i > 0; i--) {
			for (int j = 1; j <= x; j++) {
				if (i * j < 10) {
					//�����ƂɓK�؂ȃX�y�[�X������
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
