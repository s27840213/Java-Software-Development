package hw5;
import java.util.Scanner;

public class Main {
	private static Scanner keyb;
	public static void main(String[] args) {
		keyb = new Scanner(System.in);
		Document d = new Document();
		Email e = new Email();
		File f = new File();
		String same;
		String sel;
		String mode = keyb.nextLine();
		String type = keyb.nextLine();
		
		if(type.equals("Document"))
		{
			d.setText(keyb.nextLine());
		}
		if(type.equals("Email"))
		{
			e.setSender(keyb.nextLine());
			e.setRecipient(keyb.nextLine());
			e.setTitle(keyb.nextLine());
			e.setText(keyb.nextLine());
		}
		if(type.equals("File"))
		{
			f.setPathname(keyb.nextLine());
			f.setText(keyb.nextLine());
		}
		
		if(mode.equals("A"))
		{
			if(type.equals("Document"))
			{
				System.out.print(d.toString());
			}
			else if(type.equals("Email"))
			{
				System.out.println("From: "+e.getSender());
				System.out.println("To: "+e.getRecipient());
				System.out.println("Title: "+e.getTitle());
				System.out.print(e.toString());
			}
			else if(type.equals("File"))
			{
				System.out.println(f.getPathname());
				System.out.print(f.toString());
			}
		}
		if(mode.equals("B"))
		{
				same = keyb.nextLine();
				if(type.equals("Document")){
					System.out.print(d.toString().contains(same));
				} 
				else if(type.equals("Email")){
					System.out.print(e.toString().contains(same));
				}
				else if(type.equals("File")){
					System.out.print(f.toString().contains(same));
				}
					
		}
		if(mode.equals("C"))
		{
			if(type.equals("Document"))
			{
				sel = keyb.nextLine();
				d.setText(keyb.nextLine());
				System.out.print(d.toString());
				
			}
			else if(type.equals("Email"))
			{
				sel = keyb.nextLine();
				if(sel.equals("text"))
					e.setText(keyb.nextLine());
				if(sel.equals("sender"))
					e.setSender(keyb.nextLine());
				if(sel.equals("recipient"))
					e.setRecipient(keyb.nextLine());
				if(sel.equals("title"))
					e.setTitle(keyb.nextLine());
				System.out.println("From: "+e.getSender());
				System.out.println("To: "+e.getRecipient());
				System.out.println("Title: "+e.getTitle());
				System.out.print(e.toString());
			}
			else if(type.equals("File"))
			{
				sel = keyb.nextLine();
				if(sel.equals("text"))
					f.setText(keyb.nextLine());
				if(sel.equals("pathname"))
					f.setPathname(keyb.nextLine());
				System.out.println(f.getPathname());
				System.out.print(f.toString());
			}
		}
		
	}

}
