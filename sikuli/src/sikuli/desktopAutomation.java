package sikuli;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class desktopAutomation {

	public static void main(String[] args) throws FindFailed {
		// TODO Auto-generated method stub
		
		Screen screen=new Screen();
		Pattern pattern=new Pattern("C://Users//Susmita//Desktop//SikuliImages//image1.PNG");
		
		//screen.click(pattern);
		//screen.doubleClick(pattern);
		screen.rightClick(pattern);

	}

}
