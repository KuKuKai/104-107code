import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFormattedTextField;

@SuppressWarnings("serial")
public class FinalSpecialTopic extends JFrame {

	/**
	 * @param args
	 */

	// TODO Auto-generated method stub
	private JButton jbtnGuess = new JButton("Guess");
	private JTextArea answer = new JTextArea();
	private JScrollPane scroll = new JScrollPane(answer);
	private JLabel jlb1 = new JLabel();
	private JLabel jlb2 = new JLabel();

	
	private Container cp;
	private JFormattedTextField number = new JFormattedTextField();
	private int A = 0, B = 0, X = 0;
	private int[] data = new int[4];
	private int[] user = new int[4];

	public FinalSpecialTopic() {
		initComp();
		data = rndNum();
	}

	private void initComp() {
		cp = this.getContentPane();
		this.setBounds(500, 150, 400, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		cp.setLayout(null);
		cp.add(jlb1);
		cp.add(number);
		cp.add(jbtnGuess);
		cp.add(scroll);
		cp.add(jlb2);

		jlb1.setBounds(50, 125, 300, 25);
		jlb1.setText("���A���P�Ӧ�ƬۦP,���B�����P��ƬۦP");
		number.setBounds(30, 50, 150, 25);
		jbtnGuess.setBounds(250, 50, 100, 25);
		scroll.setBounds(30, 150, 320, 380);
		number.setToolTipText("�п�J���ۦP���|�ӼƦr!!");

		number.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent a) {
				int keyChar = a.getKeyChar();

				if (number.getText().length() < 4 && keyChar >= KeyEvent.VK_0
						&& keyChar <= KeyEvent.VK_9) {
				} else {
					if (keyChar == KeyEvent.VK_BACK_SPACE) {
					} else {
						a.consume();
					}
				}
			}

		});

		jbtnGuess.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a) {
				int c = Integer.parseInt(number.getText());
				A = 0;
				B = 0;
				boolean tt = false;
				int num = (c);
				String str = num + "";
				int len = str.length();
				if (len == 4) {
				user[0] = num / 1000 % 10;
				user[1] = num / 100 % 10;
				user[2] = num / 10 % 10;
				user[3] = num / 1 % 10;
				for (int i = 0; i < 4; i++) {
					for (int j = 0; j < i; j++) {
						if (user[i] == user[j]) {
							answer.append("��J���~�A�ЦA�դ@��!\n");
							tt = true;
							break;
						}
					}
					if (tt)
						break;
				}
				if (tt == false) {
					for (int i = 0; i < 4; i++) {
						if (user[i] == data[i]) {
							A++;
						}
						for (int j = 0; j < 4; j++) {
							if (data[i] == user[j]) {
								B++;
							}
						}
					}
				}
					B = B - A;
					answer.append(number.getText() + "\t");
					answer.append(A + "A" + B + "B\t");
					if (A == 4) {
						answer.append("�AĹ��!�i�H�Y�F��F!\n");
						popFrame("�AĹ��!�i�H�Y�F��F!");
					} else {
						answer.append("�|������A���~��q!\n");
					}
				}else{
					answer.append("��J���~�A�ЦA�դ@��!\n");
				}
				X = 4;
				number.setText("");

			}
		});

		answer.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent b) {
				b.consume();

			}
		});
	}

	public static void popFrame(String message) {

		int n = JOptionPane.showConfirmDialog(null,
				"�AĹ��!�i�H�Y�F��F!\n�����D�Y����,���O�M�w�a!", "����!!!",
				JOptionPane.YES_NO_OPTION);
		if (n == JOptionPane.YES_OPTION) {
			String resturant[] = { "���p�ѵP�Ϧקa!\n�b���p�Ͼ𤯸�25��",
					"�g�ը�����a!\n�b�x�������p�Ϭh�פ���30��", 
					"���ݦ��\���a!\n�b�x�������p�Ϭh�׸�428��",
					"Pizza Factory ���Ĥu�t�a!\n�b�x�������p�Ͼ𤯤���12��",
					"�ѥ�ı�»��`�N����a!\n�b�x�������p�Ͼ𤯸�45��",
					"�T�U�T�f�»������a!\n�b�x�������p�Ͼ𤯸�71��",
					"NU PASTA�M�M�ѧa!\n�b�x�������p�Ͼ𤯸�107��",
					"O2 Brunch �ڹϦ����\�p�Чa!\n�b�x�������p�Ͼ𤯤���6��",
					"���ꭹ��a!\n�b�x�������p�ϪL�˸�998��", 
					"�|���C�s��K�M�橱�a!\n�b�x�������p�Ϥ�����841��",
					"�x�_���»��䨧�G�M���E�a!\n�b�x�������p�Ͼ𤯸�56-5��",
					"�j�y�ѩ��a!\n�b�x�������p�Ͼ𤯸�46��",
					"�����ü�j���a!\n�b�x�������p�ϪL�˸�762��",
					"���b�饻�Ʋz�a!\n�b�x�������p�Ͼ𤯸�39��",
					"�f�֤����ѧa!\n�b�x�������p�Ͼ𤯸�12��", 
					"�W���Τ馡����a!\n�b�x�������p�Ϭh�׸�492��",
					"�s������]�a!\n�b�x�������p�ϪL�˸�998��",
					"��Ź���W���]�a!\n�b�x�������p�Ϥ�����1101-2��",
					"Circus²�\���a!\n�b�x�������p�Ϭh�פ���36��",
					"�ԨȺ~���a!\n�b�x�������p�Ϭh�פG��47��",
					"�R�d�a!\n�b�x�������p�Ϭh�׸�478��",
					"��K���ѧa!\n�b�x�������p�Ϭh�פ���26��",
					"���O�D�ѧa!\n�b�x�������p�Ϭh�פ���18��", 
					"�ݮa²�\�a!\n�b�x�������p�Ϭh�פ���9��",
					"�~�H�͹Ͷ��a!\n�b�x�����x�������p�Ϭh�׸�458��",
					"�g�����f�a!\n�b�x�������p�Ϭh�׸�480��" };
			int a = (int) (Math.random() * resturant.length);
			Object[] options = { "�}�ʤF!" };
			JOptionPane.showOptionDialog(null, "�{�b�h�Y" + resturant[a],
					"�Y���F!", JOptionPane.DEFAULT_OPTION,
					JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			System.exit(0);
		} else {
			System.exit(0);
		}
	}

	public static int[] rndNum() {
		int[] num = new int[4];
		for (int i = 0; i < 4; i++) {
			num[i] = (int) (Math.random() * 10);
			for (int j = 0; j < i; j++) {
				if (num[i] == num[j]) {
					i--;
					break;
				}
			}
		}
//		for (int n : num) {
//			System.out.print(n + "");
//		}
		return num;
	}
}
