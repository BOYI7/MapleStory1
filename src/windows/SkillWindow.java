package windows;

import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class SkillWindow extends JPanel
{
	private boolean display=false;

	public boolean ChangeDisplay()
	{
		display=!display;
		return !display;
	}

	public void paint(Graphics g)
	{
		g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/���ܿ�/���.png"),0,0,this);
		g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/�¼���/��ɨ.png"),3,50,this);
		g.drawString("��ɨ", 45, 60);
		g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/�¼���/����.png"),3,90,this);
		g.drawString("����", 45, 100);
		g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/�¼���/�ٵ�.png"),3,130,this);
		g.drawString("�ٵ�", 45, 140);
		g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/�¼���/��Ѫ.png"),3,170,this);
		g.drawString("��Ѫ", 45, 180 );
	}
}
