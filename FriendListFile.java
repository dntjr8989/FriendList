import java.io.*;
import java.util.*;

public class FriendListFile {

	public FriendList readFileToList(String fileName)
	{
		FriendList inputFriend = new FriendList();
		String[] inputFriendList;
		File file = new File(fileName);
		
		Scanner input = null;
		try {
			input = new Scanner(file);
		}
		catch(Exception e) {
			System.out.println("Unknown File");
		}
		
		
		while (input.hasNext())
		{
			String line = input.nextLine();
			inputFriendList = line.split(":");
			for(int i=0; i<inputFriendList.length; i++)
			{
				inputFriendList[i] = inputFriendList[i].trim();
			}
			inputFriend.addFriend(inputFriendList);
		}
		return inputFriend;
	}
	public void writeListToFile(String fileName, FriendList Friend)
	{
		try 
		{
			PrintWriter out = new PrintWriter(new FileWriter(fileName), true);
			for(int i=0; i<Friend.numFriends(); i++)
			{
				out.println(Friend.Flist[i].getName() + ":" + Friend.Flist[i].getGroup() + ":" + Friend.Flist[i].getPhonenumber() + ":" + Friend.Flist[i].getEmail() + ":" + Friend.Flist[i].getPicture());
			}
			out.close();
		}
		catch(IOException e)
		{
			System.out.println("Error processing file");
		}
	}
}