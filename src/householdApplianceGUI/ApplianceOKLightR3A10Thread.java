package householdApplianceGUI;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ApplianceOKLightR3A10Thread extends Thread
{
	private String lightR3A10OKMessage = null;
	private PrintWriter printWriter2 = null;
	public ApplianceOKLightR3A10Thread()
	{
		lightR3A10OKMessage = null;
	}
	public String getLightR3A10ONMessage() {
		return lightR3A10OKMessage;
	}
	@Override
	public void run()
	{
		while(true){
			Socket socket = null;
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:00");
			try {
				printWriter2 = new PrintWriter(new FileWriter("D:/ddd2.txt", true));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				ServerSocket ss = new ServerSocket(60002, 50, InetAddress.getByName("127.0.0.1"));
				socket = ss.accept();
				lightR3A10OKMessage = null;
				System.out.println("Entered ApplianceOKLightR3A10Thread :-)");	
				InputStream in = socket.getInputStream();
				byte[] array = new byte[150];
				try
				{
					while(in.read(array)>=0){;}
					String msg = new String(array);
					lightR3A10OKMessage = msg.trim();
					System.out.println("ApplianceONLightR3A10Thread::::: LightR3A10 OK Message:"+lightR3A10OKMessage);
					if(lightR3A10OKMessage!=null)
					{
						printWriter2.println(lightR3A10OKMessage);
					}
				}
				catch(EOFException e)
				{
					e.printStackTrace();
				}
				
				in.close();
				socket.close();
				ss.close();
				printWriter2.close();
								
			} catch (UnknownHostException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}