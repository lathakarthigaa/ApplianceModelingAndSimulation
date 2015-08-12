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

public class ApplianceOKLightR4A12Thread extends Thread
{
	private String lightR4A12OKMessage = null;
	private PrintWriter printWriter2 = null;
	public ApplianceOKLightR4A12Thread()
	{
		lightR4A12OKMessage = null;
	}
	public String getLightR4A12OKMessage() {
		return lightR4A12OKMessage;
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
				ServerSocket ss = new ServerSocket(60005, 50, InetAddress.getByName("127.0.0.1"));
				socket = ss.accept();
				lightR4A12OKMessage = null;
				System.out.println("Entered ApplianceOKLightR4A12Thread :-)");	
				InputStream in = socket.getInputStream();
				byte[] array = new byte[150];
				try
				{
					while(in.read(array)>=0){;}
					String msg = new String(array);
					lightR4A12OKMessage = msg.trim();
					System.out.println("ApplianceONLightR4A12Thread::::: LightR4A12 OK Message:"+lightR4A12OKMessage);
					if(lightR4A12OKMessage!=null)
					{
						printWriter2.println(lightR4A12OKMessage);
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