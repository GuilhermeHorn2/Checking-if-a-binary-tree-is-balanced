package misc;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Date;

public class main_misc {
    
	
	public static void main(String[] args) {
	  
	
		
        Graph_1 g = new Graph_1();
        g.add(0);
        g.add(1);
        g.add(2);
        g.add(3);
        g.add(4);
        g.add(5);
        g.add(6);
        g.add(7);
        g.add(8);
        g.link(0, 2);
        g.link(0, 1);
        g.link(2, 4);
        g.link(2, 3);
        g.link(1, 6);
        g.link(6, 7);
        g.link(1, 5);
        g.link(7, 8);
        
        Graph_1 h = new Graph_1();
        
        h.add(0);
        h.add(1);
        h.add(2);
        h.add(3);
        h.add(4);
        h.link(0, 2);
        h.link(0, 1);
        h.link(2, 3);
        h.link(2, 4);
        
    System.out.println(g.is_balanced(g.get_root()));
    
    System.out.println(h.is_balanced(h.get_root()));
       
       
		
	}
		
		
	}
	
	
		
	
		

	
  
	
    
	
		

	

	
		
		
	

	
	
	
	
	
	
	
	
	

	


	
	

	
		
	
	


	

	
	


	
	
	

	


	
	

	
		
	
	


	

	
	

