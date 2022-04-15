package hospital.main;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import hospital.model.*;
import hospital.services.*;
import hospital.util.*;

public class MainMethod {
	
	public static void main(String[] args) throws InterruptedException, SQLException{
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(Config.class);
		IServices sr = context.getBean(IServices.class);
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("Enter your choice : ");
		System.out.println("1)Insert 2)Update 3)Delete 4)Select 5)Exit");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
    		System.out.println("Enter details of Patient");
    		System.out.println("Enter Id: ");
    		int a = sc.nextInt();
    		System.out.println("Enter First Name ");
    		String b = sc.next();
    		System.out.println("Enter Last Name ");
    		String c = sc.next();
    		System.out.println("Enter mobile Number ");
    		String d = sc.next();
    		System.out.println("Enter Ward ");
    		String e = sc.next();
            sr.add(new Patient(a,b,c,d,e));
            break;

    	case 2:  
    		sr.update(new Patient(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next()));
            break;
        
    	case 3: 
    		System.out.println("Enter id to delete");
    		Patient f = new Patient();
    		f.setId(sc.nextInt());
    		sr.delete(f);
    		break;
    		
    	case 4:
    		List<Patient> g = sr.selection();
    		for(Patient i:g) {
    			System.out.println(i.getId()+"    "+i.getFirstname()+"     "+i.getLastname()+"     "+i.getMobile()+"      "+i.getWardname());
    		}
    		break;
        
    	case 5: 
    		System.exit(0);
    		break;
		}
		}while(true);
		
	}
}
