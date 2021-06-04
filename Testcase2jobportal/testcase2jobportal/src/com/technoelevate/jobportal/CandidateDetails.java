package com.technoelevate.jobportal;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class CandidateDetails {
	Scanner sc=new Scanner(System.in);
	 HashMap <Integer,Candidate> HashMap=new HashMap <Integer,Candidate>();
	 Company company=new Company();
	 void createCadidate(){
		 int k=1;
		 for(int i=0;i<5;i++) {
		 System.out.println("Cadidate"+k+" please enter your details");
		 Candidate cadidate=getInput();
		 HashMap.put(k,cadidate);
		 k++;
		 }
	 }
	private Candidate getInput() {
			System.out.println("Enter Your Name");
			String name=sc.next();
			System.out.println("Enter Your Tenth Percentage");
			double tenthpercentage=sc.nextDouble();
			System.out.println("Enter Your PUC Percentage");
			double pucpercentage=sc.nextDouble();
			System.out.println("Enter Your Degree Percentage");
			double degreethpercentage=sc.nextDouble();
			System.out.println("Enter YOP");
			int year=sc.nextInt();
			return new Candidate(name,tenthpercentage,pucpercentage,degreethpercentage,year);	
	}
	 
		
		public void display() {
		    Set<Entry<Integer,Candidate>> entries=HashMap.entrySet();
		    int k=1;
		    System.out.println();
		    System.out.println("**********************************************************************************************************************************");
		    System.out.println("Technoelevate is a fast-growing IT development unit who is providing a wide range of high quality development services for more than 2500+ people organizations, with presence across 6 countries– USA, UK, Netherlands, Ireland, Poland and Global Delivery Center in India.");
		    System.out.println();
		    System.out.println("Eligible Candidate for Technoelevate are:");
		     for(Entry<Integer,Candidate> entry:entries)	{
		      Candidate candidate=entry.getValue();
               if(checkCriteria(candidate)) {
	            System.out.println(k+". "+candidate.name);
             	k++;
              }

              }

		
		}
		private boolean checkCriteria(Candidate candidate) {
			if(candidate.tenthpercentage>=company.tenthpercentage && candidate.pucpercentage>=company.pucpercentage && 
					candidate.degreethpercentage>=company.degreethpercentage && candidate.year==company.year) {
				return true;
			}else {
				return false;
			}
		}
	 
	
}
