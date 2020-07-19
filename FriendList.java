
public class FriendList {

	Friend[] Flist = new Friend[100];
	private int n;
	
	public FriendList()
	{
		n = 0;
		for(int i=0; i<100; i++)
		{
			Flist[i] = new Friend();
		}
	}
	
	//¸Þ¼Òµå
	public int numFriends()
	{
		return n;
	}
	public Friend getFriend(int i)
	{
		return Flist[i];
	}
	public void addFriend(String[] inputFriendList)
	{
		//ºóÄ­ 
		if(inputFriendList.length == 1 && inputFriendList[0].length() == 0)
		{
			return;
		}
		//comment
		if(inputFriendList[0].charAt(0) == '/' && inputFriendList[0].charAt(1) == '/')
		{
			return;
		}
		//case3-1 Check Format Error
		if(inputFriendList.length != 5)
		{
			System.out.println("Irregular input line;Skip the input line\n");
			return;
		}
		if(inputFriendList.length == 5)
		{
			int i = 0;
			for(i=0; i<inputFriendList.length; i++)
			{
				if(inputFriendList[i].length() == 0) break;
			}
			if(i != inputFriendList.length)
			{
				System.out.println("Irregular input line;Skip the input line\n");
				return;
			}
		}
		//case3-0 Check ID Conflicts
		for(int i=0; i<n; i++)
		{
			String t = Flist[i].getName();
			if(inputFriendList[0].equals(t))
			{
				System.out.println("Name Conflict\n");
				Flist[n].setName(inputFriendList[0]);
				Flist[n].setGroup(inputFriendList[1]);
				Flist[n].setPhonenumber(inputFriendList[2]);
				Flist[n].setEmail(inputFriendList[3]);
				Flist[n].setPicture(inputFriendList[4]);
				n++;
				return;
			}
		}
		//case3-2 Check Format Error
		try {
			Integer.parseInt(inputFriendList[1]);
		}
		catch(NumberFormatException e) {
			System.out.println("Illegal value -- "+inputFriendList[1]+"Skip the input line\n");
			return;
		}
		//case3-3 Check Format Error
		if(inputFriendList[3].indexOf("@") == -1 || inputFriendList[3].indexOf(".") == -1)
		{
			System.out.println("Illegal email address ; Skip the input line\n");
			return;
		}
		
		Flist[n].setName(inputFriendList[0]);
		Flist[n].setGroup(inputFriendList[1]);
		Flist[n].setPhonenumber(inputFriendList[2]);
		Flist[n].setEmail(inputFriendList[3]);
		Flist[n].setPicture(inputFriendList[4]);
		
		n++;
	}
}
