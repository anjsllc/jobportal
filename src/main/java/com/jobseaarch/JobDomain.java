package com.jobseaarch;

import java.util.ArrayList;

/*
 * This class is for fetching the selected job results.
 * 
 */
public class JobDomain {
	
	
	public static void main(){
		
		
		
		System.out.println("Choose the Jobs from the list");
		String job = null;
		String job1 = "Network Admin";
		String job2 = "Business Analyst";
		String job3 = "Project Mnager";
		String job4 = "Team Lead";
		
		ArrayList<String> jobList = new ArrayList();
		jobList.add(job1);
		jobList.add(job2);
		jobList.add(job3);
		jobList.add(job4);
		
		if(job==job1){
			System.out.println("Find the following Network Admin related jobs");
		}
		
			else if(job==job2){
				System.out.println("Find the following Business Analyst related jobs");
			
		}
		
			else if (job==job3){
				System.out.println("Find the following Project Manager jobs");
			}
			else if (job==job4){
				System.out.println("Find the jobs related to Team Lead");
			}
	}

	
	
}
