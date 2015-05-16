package org.isw;

/*
 * Scheduling listens on 8888
 * Machine listens on 8889
 */

public class Macros {
	public static final int REQUEST_SCHEDULING_DEPT_IP = 1;
	public static final int REPLY_SCHEDULING_DEPT_IP = 2;
	public static final int REQUEST_MAINTENANCE_IP = 3;
	public static final int REPLY_MAINTENANCE_IP = 4;
	public static final int REQUEST_MACHINE_LIST = 5;
	public static final int REPLY_MACHINE_LIST = 6;
	
	public static final int SCHEDULING_DEPT_PORT = 8889;
	public static final int MACHINE_PORT = 8889;
	public static final int MAINTENANCE_DEPT_PORT_TCP = 8890;
	
	public static final String MACHINE_SCHEDULING_GROUP = "224.0.0.1";
	public static final String MAINTENANCE_SCHEDULING_GROUP = "224.0.0.2";
}