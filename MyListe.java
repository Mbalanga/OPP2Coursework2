package emmanuel.com;

import java.util.ArrayList;
import java.util.Scanner;

public class MyListe {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		double Average;
		double Sum;
		double Networking,WebDesign,OOP2,ComputerApp,CommunicatonSkills,ENT;
		
		System.out.println("ENTER SUTDENT'S NAMES"+"");
	ArrayList<String> name=new ArrayList();
		int n=1;
			while(true) {
		
				System.out.println("Enter student's name"+n+":");
		
			String names=new Scanner(System.in).nextLine();
			
			if(names.equals("Exite"))
			break;
			else 
				name.add(names);
			n++;
			
			System.out.println("Enter Networking Marks"+":");
			Networking=scr.nextDouble();
			while(Networking <0||Networking >100) {
				System.out.println("The number entered is wrong pleas try again:");
				Networking=scr.nextInt();
			}

			System.out.println("Enter WebDesign Marks"+":");
			WebDesign=scr.nextDouble();
			while(WebDesign <0||WebDesign >100) {
				System.out.println("The number entered is wrong pleas try again:");
				WebDesign=scr.nextInt();
	}

			System.out.println("Enter OOP2 Marks"+":");
			OOP2=scr.nextDouble();
			while(OOP2 <0||OOP2 >100) {
				System.out.println("The number entered is wrong pleas try again:");
				OOP2=scr.nextInt();
  }

			System.out.println("Enter ComputerApp Marks"+":");
			ComputerApp=scr.nextDouble();
			while(ComputerApp <0||ComputerApp >100) {
				System.out.println("The number entered is wrong pleas try again:");
				ComputerApp=scr.nextInt();
			}
				System.out.println("Enter CommunicatonSkills Marks"+":");
				CommunicatonSkills=scr.nextDouble();
				while(CommunicatonSkills <0||CommunicatonSkills >100) {
					System.out.println("The number entered is wrong pleas try again:");
					CommunicatonSkills=scr.nextInt();
				}
					System.out.println("Enter ComputerApp Marks"+":");
					ComputerApp=scr.nextDouble();
					while(ComputerApp <0||ComputerApp >100) {
						System.out.println("The number entered is wrong pleas try again:");
						ComputerApp=scr.nextInt();
					}
						System.out.println("Enter ENT Marks"+":");
						ENT=scr.nextDouble();
						while(ENT <0||ENT >100) {
							System.out.println("The number entered is wrong pleas try again:");
							ENT=scr.nextInt();
	 	}
						Sum=Networking+WebDesign+OOP2+ComputerApp+CommunicatonSkills+ENT;
						System.out.println("Sum="+Sum);
						Average=Sum/6;
						System.out.println("Average="+Average);
						
						
				
			if(Average<=60 && Average>65) {		
							
				System.out.println("The GPA IS="+3.0);
							
		}else if(Average<=70 && Average>75) {		 
			
								 
			System.out.println("The GPA IS="+3.80);
								
								
		}else if(Average<=80 && Average>85) {		 
								 
			System.out.println("The GPA IS="+4.5);
								
		}else if(Average<=90 && Average<100) {		 
							 
			System.out.println("The GPA IS="+5.0);
			
		
			
	 }
   }
 }
}