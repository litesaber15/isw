package org.isw;

import java.io.Serializable;

public class Job implements Serializable {
	/**
	 * 
	 */
	public static final int JOB_NORMAL = 1;
	public static final int JOB_PM = 2;
	public static final int JOB_CM = 3;
	private static final long serialVersionUID = 1L;
	long jobTime;
	String jobName;
	int jobType;
	double fixedCost;
	double jobCost;
	double penaltyCost;
	public Job(String jobName, long jobTime,double  jobCost, int jobType) {
		this.jobTime = jobTime;
		this.jobName = jobName;
		this.jobType = jobType;
		this.jobCost = jobCost;
		fixedCost = 0;
		penaltyCost = 0;
	}
	
	public void setPenaltyCost(double penaltyCost){
		this.penaltyCost = penaltyCost;
	}
	public double getPenaltyCost(){
		return penaltyCost;
	}
	public long getJobTime() {
		return jobTime;
	}
	
	public void decrement(long delta) {
		jobTime -=delta;
	}
	
	public String getJobName() {
		return jobName;
	}
	
	public int getJobType(){
		return jobType;
	}
	
	/**
	 * Fixed cost flag.
	 * TODO: Rename to something better.
	 * **/
	public void setFixedCost(double fixedCost){
		this.fixedCost = fixedCost;
	}
	public double getFixedCost(){
		return fixedCost;
	}

	public double getJobCost() {
		return jobCost;
	}
}