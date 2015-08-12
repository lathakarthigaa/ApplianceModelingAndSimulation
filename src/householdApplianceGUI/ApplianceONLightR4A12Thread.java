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

public class ApplianceONLightR4A12Thread extends Thread
{
	private String lightR4A12ONMessage = null;
	private PrintWriter printWriter2 = null;
	public ApplianceONLightR4A12Thread()
	{
		lightR4A12ONMessage = null;
	}
	public String getLightR4A12ONMessage() {
		return lightR4A12ONMessage;
	}
	@Override
	public void run()
	{
		while(true){
			Socket socket = null;
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
				ServerSocket ss = new ServerSocket(60004, 50, InetAddress.getByName("127.0.0.1"));
				socket = ss.accept();
				lightR4A12ONMessage = null;
				System.out.println("Entered ApplianceONLightR4A12Thread :-)");	
				InputStream in = socket.getInputStream();
				byte[] array = new byte[150];
				try
				{
					while(in.read(array)>=0){;}
					String msg = new String(array);
					lightR4A12ONMessage = msg.trim();
					System.out.println("ApplianceONLightR4A12Thread::::: LightR4A12 ON Message:"+lightR4A12ONMessage);
					if(lightR4A12ONMessage!=null)
					{
						printWriter2.println(lightR4A12ONMessage);
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