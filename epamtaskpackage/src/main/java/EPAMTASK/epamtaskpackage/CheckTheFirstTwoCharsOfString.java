package EPAMTASK.epamtaskpackage;

public class CheckTheFirstTwoCharsOfString
{
		public String verify(String str)
		{
			String laststr=str.substring(2,str.length());
			String firststr=str.substring(0,2);
			char a[]=firststr.toCharArray();
			int l=0;
			while(l!=2)
			{
				if(a[l]=='A')
					a[l]='0';
				l++;
			}
			l=0;
			String fString=new String(laststr);
			while(l!=2)
			{
				if(a[l]!='0')
					fString =a[l]+fString;
				l++;
			}
			return fString;
		}
}
