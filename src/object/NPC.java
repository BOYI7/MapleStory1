package object;

import java.awt.*;


import javax.swing.JPanel;

public class NPC extends JPanel
{
	private int num;//NPC���
	public NPC(int m_num)
	{
		num=m_num;
	}
	public void paint(Graphics g)
	{
		switch(num)
		{
		case 0:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/Ů��/Ů��.png"),0,0,this);
			break;
		}
		case 1:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/վ/վ.png"),-40,-50,273,180,this);
			break;
		}
		case 2:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/��ʿ/��ʿ1.png"),0,0,this);
			break;
		}
		case 3:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/��ʿ/��ʿ2.png"),0,0,this);
			break;
		}
		case 4:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/��ʿ/��ʿ3.png"),0,0,this);
			break;
		}
		case 5:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/��ʿ/��ʿ4.png"),0,0,this);
			break;
		}
		case 6:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/��ʿ/��ʿ5.png"),0,0,this);
			break;
		}
		case 7:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/վ.png"),0,0,this);
			break;
		}
		case 8:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./ͼƬ�ز�/����/վ.png"),0,0,this);
			break;
		}
		}
	}
}
