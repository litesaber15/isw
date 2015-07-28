package org.isw.threads;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

import org.isw.FlagPacket;
import org.isw.MachineList;
import org.isw.Macros;

public class ListenerThread extends Thread
{
	MachineList machineList;
	public ListenerThread(MachineList machineList)
	{
		this.machineList=machineList;
	}

	public void run()
	{
		MulticastSocket socket;
		try
		{
			socket = new MulticastSocket(Macros.MAINTENANCE_DEPT_MULTICAST_PORT);
			socket.joinGroup(InetAddress.getByName(Macros.MAINTENANCE_DEPT_GROUP));
			while(true)
			{
				FlagPacket fp = FlagPacket.receiveMulticast(socket);
				if(fp.flag ==Macros.REQUEST_MAINTENANCE_DEPT_IP){
					ClientHandlerThread worker = new ClientHandlerThread(socket, fp, machineList);
					worker.start();	
				}	
				
			}

		}catch(IOException e)
		{
			e.printStackTrace();
		}
	
	}
}