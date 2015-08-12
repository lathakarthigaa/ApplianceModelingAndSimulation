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

public class ApplianceOFFHeaterR3A9Thread extends Thread
{
	private String heaterR3A9OFFMessage = null;
	private PrintWriter printWriter2 = null;
	public ApplianceOFFHeaterR3A9Thread()
	{
		heaterR3A9OFFMessage = null;
	}
	public String getHeaterR3A9OFFMessage() {
		return heaterR3A9OFFMessage;
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
				ServerSocket ss = new ServerSocket(60006, 50, InetAddress.getByName("127.0.0.1"));
				socket = ss.accept();
				heaterR3A9OFFMessage = null;
				System.out.println("Entered ApplianceOFFHeaterR3A9Thread :-)");	
				InputStream in = socket.getInputStream();
				byte[] array = new byte[150];
				try
				{
					while(in.read(array)>=0){;}
					String msg = new String(array);
					heaterR3A9OFFMessage = msg.trim();
					System.out.println("ApplianceOFFHeaterR3A9Thread::::: Heater R3A9 OFF Message:"+heaterR3A9OFFMessage);
					if(heaterR3A9OFFMessage!=null)
					{
						printWriter2.println(heaterR3A9OFFMessage);
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