
/**
 * 
 */
import java.io.*;

/**
 * @author internous
 *
 */
public class KisoKadai3 {
	// �e�L�X�g�t�@�C���ւ̓ǂݏ����v���O�����̍쐬
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ���s���������Ƃ̑I��
		int x = 0;
		while (x > 0 | x < 5) {
			System.out.println("���j���[");
			System.out.println("1.�V�K�t�H���_�쐬�@2.�V�K�e�L�X�g�t�@�C���쐬�@3.�t�@�C���̓ǂݍ��݁@4.�t�@�C���̏������݁@9.�I��");
			System.out.println();

			try {
				// ���j���[�̑I��
				System.out.print("���s�����������𔼊p�œ��͂��ĉ������B�@�ˁ@");
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr);
				String menu = br.readLine();
				x = Integer.parseInt(menu);
			} catch (Exception e) {
				x = 0;
			}
			if (x == 1) {
				// �V�K�t�H���_�쐬
				String fold = null;
				String foname = null;
				System.out.println("�t�H���_���쐬�������ꏊ�������ĉ�����");
				InputStreamReader isr1 = new InputStreamReader(System.in);
				BufferedReader br1 = new BufferedReader(isr1);
				try {
					fold = br1.readLine();
					System.out.println("�t�H���_������͂��Ă�������");
				} catch (IOException e) {
					e.printStackTrace();
				}
				isr1 = new InputStreamReader(System.in);
				br1 = new BufferedReader(isr1);
				try {
					foname = br1.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
				File newfolder = new File(fold + "\\" + foname);
				if (newfolder.mkdir()) {
					System.out.println("�f�B���N�g���̍쐬�ɐ������܂���");
				} else {
					System.out.println("�f�B���N�g���̍쐬�Ɏ��s���܂���");
				}
			} else if (x == 2) {
				// �V�K�t�@�C���쐬
				String nfile = null;
				String nfiname = null;
				System.out.println("�t�@�C�����쐬�������ꏊ�������ĉ�����");
				InputStreamReader isr2 = new InputStreamReader(System.in);
				BufferedReader br2 = new BufferedReader(isr2);
				try {
					nfile = br2.readLine();
					System.out.println("�t�@�C��������͂��Ă�������");
				} catch (IOException e) {
					e.printStackTrace();
				}
				isr2 = new InputStreamReader(System.in);
				br2 = new BufferedReader(isr2);
				try {
					nfiname = br2.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
				File newfile = new File(nfile + "\\" + nfiname);
				try {
					if (newfile.createNewFile()) {
						System.out.println("�t�@�C���̍쐬�ɐ������܂���");
					} else {
						System.out.println("�t�@�C���̍쐬�Ɏ��s���܂���");
					}
				} catch (IOException e) {
					System.out.println(e);
				}
			} else if (x == 3) {
				// �t�@�C���̓ǂݍ���
				String filer = null;
				String finamer = null;
				//�t�H���_�ƃt�@�C�����w�肵�Ă��炤
				System.out.println("�ǂ݂����t�@�C���̏ꏊ�������ĉ�����");
				InputStreamReader isr3 = new InputStreamReader(System.in);
				BufferedReader br3 = new BufferedReader(isr3);
				try {
					filer = br3.readLine();
					System.out.println("�t�@�C��������͂��Ă�������");
				} catch (IOException e) {
					e.printStackTrace();
				}
				isr3 = new InputStreamReader(System.in);
				br3 = new BufferedReader(isr3);
				try {
					finamer = br3.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
				try {
					FileReader filereader = new FileReader(filer + "\\" + finamer);
					int ch;
					while ((ch = filereader.read()) != -1) {
						System.out.print((char) ch);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			} else if (x == 4) {
				//�t�@�C�����̎w��
				String filew = null;
				String finamew = null;
				System.out.println("�������݂����t�@�C���̏ꏊ�������ĉ�����");
				InputStreamReader isr4 = new InputStreamReader(System.in);
				BufferedReader br4 = new BufferedReader(isr4);
				try {
					filew = br4.readLine();
					System.out.println("�t�@�C��������͂��Ă�������");
				} catch (IOException e) {
					e.printStackTrace();
				}
				isr4 = new InputStreamReader(System.in);
				br4 = new BufferedReader(isr4);
				try {
					finamew = br4.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
				// �㏑�����ǋL��I������
				System.out.print("�t�@�C���ɏ㏑���������Ȃ�u1�v�E�ǋL�������Ȃ�u2�v����͂��Ă�������: ");
				InputStreamReader isrb = new InputStreamReader(System.in);
				BufferedReader brb = new BufferedReader(isrb);
				// �㏑���ƒǋL�̕���
				boolean bool = true;
				int w = 0;
				try {
					String bufb = brb.readLine();
					w = Integer.parseInt(bufb);
					if (w == 1)
						bool = false;
				} catch (Exception e) {
					w = 0;
				}
				// �t�@�C���̏�������
				System.out.println("�������݊J�n�@���@ ");
				try {
					// �o�͐���쐬����
					FileWriter fw = new FileWriter(filew +"\\"+ finamew, bool);
					PrintWriter pw = new PrintWriter(new BufferedWriter(fw));

					// ���e���w�肷��
					System.out.print("���e����͂��Ă�������: ");
					InputStreamReader isr = new InputStreamReader(System.in);
					BufferedReader br = new BufferedReader(isr);
					String str = br.readLine();
					pw.println(str);

					// �t�@�C���ɏ����o��
					pw.close();

					// �I�����b�Z�[�W����ʂɏo�͂���
					System.out.println("�o�͂��������܂����B");

				} catch (IOException ex) {
					// ��O������
					ex.printStackTrace();
				}
			} else {
				// �v���O�����̏I��
				System.out.println("�I��");
			}
		}
	}
}
