package GenericUtilities;

import java.util.Random;

public class JavaUtility 
{
public int getRandomNo()
{
	Random ran = new Random();
	int rNo = ran.nextInt(1000);
	return rNo;
	
}

}
