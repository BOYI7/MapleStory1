package dialog;

import java.awt.Graphics;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class NpcDialog  extends JPanel
{
	private int num;//NPC编号
	private int progress;//进度
	public NpcDialog(){}
	public void setDialog(int m_num,int m_progress)
	{
		num=m_num;
		progress=m_progress;
	}
	public void paint(Graphics g)
	{
		g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/对话框/对话框体.png"),0,0,this);
		switch(num)
		{
		case 0:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/女神/女神.png"),15,40,this);//这里放原画
			g.drawString("...", 165, 30);
			break;
		}
		case 1:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/贤者/.png"),50,40,this);//这个x，y坐标是相对小屏幕来讲的
			switch(progress)
			{
			case 0:
			{
				g.drawString("醒了？", 165, 30);
				g.drawString("我知道你为何而来。", 165, 30);
				break;
			}
			case 1:
			{
				g.drawString("你的随身物品朵儿都放在那里了，去吧，去寻找你要的答案。", 165, 30);
				g.drawString("（你很疑惑，想问问他有没有见过一个女孩）", 165, 45);
				break;
			}
			case 2:
			{
				g.drawString("（此时一道黑影闪过）", 165, 30);
				break;
			}
			case 3:
			{
				g.drawString("真想不到你能追到这里来...", 165, 30);
				g.drawString("不过...", 165, 45);
				g.drawString("也就到此为止了！", 165, 60);
				break;
			}
			case 4:
			{
				g.drawString("黑魔法师并不想要取女皇性命。", 165, 30);
				g.drawString("成熟的女皇拥有强大的力量，足以威胁到黑魔法师", 165, 45);
				g.drawString("黑魔法师忌惮却又觊觎女皇的力量，所以控制了圣地", 165, 60);
				g.drawString("让傀儡们潜伏在女皇身边...", 165, 75);
				g.drawString("他在等待控制女皇的时机，而我推测，这个时机已经不远了", 165, 90);
				g.drawString("我无法在明处与之对抗，实感惭愧，但是你...", 165, 105);
				g.drawString("如果是你的话，或许可以...", 165, 120);
				g.drawString("(请再和我对话)", 165, 135);
				break;
			}
			case 5:
			{
				g.drawString("实力是很重要的。先将等级提升到10级吧！", 165, 30);
				g.drawString("往左走击杀被控制的士兵可以获取经验值。", 165, 45);
				break;
			}
			case 6:
			{
				g.drawString("你还没有到达10级。", 165, 30);
				break;
			}
			case 7:
			{
				g.drawString("很好，你已经达到了10级，", 165, 30);
				g.drawString("(请再和我对话)", 165, 45);
				break;
			}
			case 8:
			{
				g.drawString("神秘组织似乎到处都是据点", 165, 30);
				g.drawString("(这对你来说全是线索)", 165, 45);
				g.drawString("击败所有的怪物，就能进入下一个地点得到线索", 165, 60);
				g.drawString("(请再和我对话)", 165, 75);
				break;
			}
			case 9:
			{
				g.drawString("往左一直走，前往  [前线1]、[前线2]", 165, 30);
				g.drawString("消灭所有怪物", 165, 45);
				break;
			}
			case 10:
			{
				g.drawString("你确认已经消灭了所有怪物吗？", 165, 30);
				g.drawString("(打开任务窗口可以查看任务完成情况)", 165, 45);
				break;
			}
			case 11:
			{
				g.drawString("", 165, 30);
				g.drawString("(请再和我对话)", 165, 45);
				break;
			}
			case 12:
			{
				g.drawString("从怪物身上掉落了一些装备...", 165, 30);
				g.drawString("我们需要摸清对方的目的", 165, 45);
				g.drawString("(请再和我对话)", 165, 60);
				break;
			}
			case 13:
			{
				g.drawString("通过  [前线1] 地图中央的传送门前往 [武器库]", 165, 30);
				g.drawString("消灭所有怪物", 165, 45);
				break;
			}
			case 14:
			{
				g.drawString("你确认已经消灭了所有怪物吗？", 165, 30);
				g.drawString("(打开任务窗口可以查看任务完成情况)", 165, 45);
				break;
			}
			case 15:
			{
				g.drawString("你完成的很好！", 165, 30);
				g.drawString("(请再和我对话)", 165, 45);
				break;
			}
			case 16:
			{
				g.drawString("圣地的情况终于渐渐好转了", 165, 30);
				g.drawString("我们现在可以考虑如何向黑魔法师反击了", 165, 45);
				g.drawString("(请再和我对话)", 165, 60);
				break;
			}
			case 17:
			{
				g.drawString("在没有足够实力之前不能轻举妄动", 165, 30);
				g.drawString("向外界求取援军是个很不错的办法", 165, 45);
				g.drawString("我不能离开女皇，所以这个任务就交给你了", 165, 60);
				g.drawString("(请再和我对话)", 165, 75);
				break;
			}
			case 18:
			{
				g.drawString("通过[前线2]左边的传送门向冒险岛世界求助吧！", 165, 30);
				break;
			}
			case 19:
			{
				g.drawString("通过[前线2]左边的传送门向冒险岛世界求助吧！", 165, 30);
				break;
			}
			case 20:
			{
				g.drawString("(将看到的景象告诉给南哈特)", 165, 30);
				break;
			}
			case 21:
			{
				g.drawString("什么！灰色石人，并不高大。", 165, 30);
				g.drawString("但是无论如何攻击都纹丝不动！", 165, 45);
				g.drawString("这...难道是！", 165, 60);
				g.drawString("(再次和我对话)", 165, 75);
				break;
			}
			case 22:
			{
				g.drawString("传说中的...", 165, 30);
				g.drawString("(再次和我对话)", 165, 75);
				break;
			}
			case 23:
			{
				g.drawString("传说中的！！！！！！", 165, 30);
				g.drawString("真·24K高强度硫酸铜硬化畴壁共振防涡流损耗和共振损耗电子", 165, 45);
				g.drawString("脉冲带放光二极管及光敏三极管之晶圆脉冲散射之光斑照射粒", 165, 60);
				g.drawString("子带发光半导体及光电感应器之光源硬化及反电磁波加硫酸亚", 165, 75);
				g.drawString("铁硬化以及硝酸铜硬化氪金防暴混凝土家族任务石巨人2009", 165, 90);
				g.drawString("牛年限定特别加强版？！？！！！！！！！！！！！！！",165,105);
				g.drawString("(作者无聊呗)", 165, 120);
				g.drawString("(再次和我对话)", 165, 135);
				break;
			}
			case 24:
			{
				g.drawString("我明白了！这一切都是黑魔法师的阴谋！", 165, 30);
				g.drawString("你所看到的是一种特殊的石巨人", 165, 45);
				g.drawString("他们是很早以前被创造出来用作守护和防御的", 165, 60);
				g.drawString("现在它们因黑魔法师的力量出现在了圣地边缘", 165, 75);
				g.drawString("我所想到的只有一个非常恐怖的阴谋！！", 165, 90);
				g.drawString("只有黑魔法师才做的出的邪恶阴谋！！",165,105);
				g.drawString("(再次和我对话)", 165, 120);
				break;
			}
			case 25:
			{
				g.drawString("黑魔法师觊觎女皇的力量", 165, 30);
				g.drawString("所以...他...不知道用了什么方法..", 165, 45);
				g.drawString("把整个圣地给包围了起来！", 165, 60);
				g.drawString("这简直就是在...圈养女皇！！", 165, 75);
				g.drawString("可恶！圣地遭受到如此耻辱，为什么大路上没有增援的动静?!", 165, 90);
				g.drawString("难道...大家都已经自生难保了吗...",165,105);
				g.drawString("我们必须严肃的对待这件事情！", 165, 120);
				g.drawString("(再次和我对话)", 165, 135);
				break;
			}
			case 26:
			{
				g.drawString("成熟的女皇或许就是这个世界最后的希望了", 165, 30);
				g.drawString("不管发生什么事情，一定要救出女皇！", 165, 45);
				g.drawString("把整个圣地给包围了起来！", 165, 60);
				g.drawString("这简直就是在...圈养女皇！！", 165, 75);
				g.drawString("可恶！圣地遭受到如此耻辱，为什么大路上没有增援的动静?!", 165, 90);
				g.drawString("难道...大家都已经自生难保了吗...",165,105);
				g.drawString("一定...要带女皇离开这里！", 165, 120);
				g.drawString("(再次和我对话)", 165, 135);
				break;
			}
			case 27:
			{
				g.drawString("以我和女皇的实力，是无法突破石巨人阵的", 165, 30);
				g.drawString("但是勇士，你却可以！", 165, 45);
				g.drawString("但凡石巨人出现的地方，附件一定有为其提供能量的物体！", 165, 60);
				g.drawString("虽然艰难，但是请你务必突破石巨人守护阵", 165, 75);
				g.drawString("进入[上山路1]最上方的传送门继续调查", 165, 90);
				g.drawString("你一定可以的！加油！为了女皇！",165,105);
				break;
			}
			case 28:
			{
				g.drawString("快去调查吧！为了女皇！", 165, 30);
				break;
			}
			case 29:
			{
				g.drawString("(将看到的情景告诉南哈特)", 165, 30);
				break;
			}
			case 30:
			{
				g.drawString("原来如此！是用刻印巨石人的力量为石巨人提供能量！", 165, 30);
				g.drawString("只要击杀一定数量的刻印石巨人，石巨人守护阵就会不攻自破", 165, 45);
				g.drawString("尽快行动吧。大概需要击杀10只的样子", 165, 60);
				break;
			}
			case 31:
			{
				g.drawString("尽快行动吧。需要击杀10只刻印石巨人", 165, 30);
				break;
			}
			case 32:
			{
				g.drawString("做的很好！守护阵的力量消失了！", 165, 30);
				g.drawString("(再次和我对话)", 165, 45);
				break;
			}
			case 33:
			{
				g.drawString("总有一种不安的气息", 165, 30);
				g.drawString("进入[上山路2]上方的传送门，继续调查吧！", 165, 45);
				break;
			}
			case 34:
			{
				g.drawString("进入[上山路2]上方的传送门，继续调查吧！", 165, 30);
				break;
			}
			
			}
			break;
		}
		case 2:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/骑士/骑士1.png"),15,40,this);
			g.drawString("恩？新人！呵呵，离女皇远一点！", 165, 30);
			break;
		}
		case 3:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/骑士/骑士2.png"),15,40,this);
			g.drawString("恩？新人！呵呵，离女皇远一点！", 165, 30);
			break;
		}
		case 4:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/骑士/骑士3.png"),15,40,this);
			g.drawString("恩？新人！呵呵，离女皇远一点！", 165, 30);
			break;
		}
		case 5:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/骑士/骑士4.png"),15,40,this);
			g.drawString("恩？新人！呵呵，离女皇远一点！", 165, 30);
			break;
		}
		case 6:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/骑士/骑士5.png"),15,40,this);
			g.drawString("恩？新人！呵呵，离女皇远一点！", 165, 30);
			break;
		}
		case 7:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/高手/站.png"),15,40,this);
			switch(progress)
			{
			case 35:
			{
				g.drawString("你果然还是来了。", 165, 30);
				break;
			}
			case 36:
			{
				g.drawString("回去吧！我无意杀你。", 165, 30);
				break;
			}
			case 39:
			{
				g.drawString("我叫你回去！", 165, 30);
				break;
			}
			}
			break;
		}
		case 8:
		{
			g.drawImage(Toolkit.getDefaultToolkit().getImage("./图片素材/主角/对话.png"),15,40,this);
			switch(progress)
			{
			case 37:
			{
				g.drawString("他竟然是为了...!", 165, 30);
				break;
			}
			case 38:
			{
				g.drawString("(为了这个世界，我必须击败他，可是真的能赢吗...)", 165, 30);
				break;
			}
			}
		}
		}
	}
}
