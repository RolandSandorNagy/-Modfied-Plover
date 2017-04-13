import java.net.*;
import java.io.*;
import java.util.*;

public class Server
{
	public static void main(String[] args) throws Exception {
		// 0-65535
		// 1024-65535
		int port = 12345;
		try (
			ServerSocket ss = new ServerSocket(port);
			Socket s = ss.accept();
			Scanner sc = new Scanner(s.getInputStream());
			PrintWriter pw = new PrintWriter(s.getOutputStream());
		) {

			String line = sc.nextLine();
			System.out.println(line);

			//pw.println(line);
			//pw.println(line + line + line);

		} catch(Exception e) {
			System.out.println("Exception occoured.");
		}

	}
}

