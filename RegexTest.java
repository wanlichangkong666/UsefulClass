import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexTest {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("\\d+");
		Matcher m=p.matcher("123456aaaa");
		if(m.matches())
		{
			System.out.println("�ַ����ɴ��������");
		}
		else
		{
			System.out.println("�ַ������Ǵ�����");
		}

	}

}
