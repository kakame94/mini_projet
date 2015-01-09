package tests;
import option_motorisation.*;
import option_Voiture.*;
import option_options.*;
import Usine_Voiture.*;

import java.util.*;


public class TestVoiture {
	public static void main (String []args) {
		
		ArrayList<Options> lesOptions;
		lesOptions.add(new GPS("gps"));
		Voiture v = new Citroen("Citroen","essence",lesOptions)
		
	       assertEquals("Citroen", v.getMarque(),"essence",v.getModele());
		
		


		
	}

}
