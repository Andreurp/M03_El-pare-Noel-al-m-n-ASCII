package net.andreu.ElPareNoelAlMonASCII;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.Reader;

public class Comprovar {

	private String pareNoel="*<]:-DOo";
	private String ren=">:o)";
	private String ajudants="<]:-D";
	private Reader llegir;
	private BufferedReader buf;
	private FileInputStream arxiu;
	
	public void fitxer(String pareNoel,String ren,String ajudants){
		pareNoel=this.pareNoel;
		ren=this.ren;
		ajudants=this.ajudants;
	}
	
	public String llegirFitxer(){
		arxiu = new FileInputStream("visites.txt");
		int c;
		while((c=arxiu.read()) != -1){
			
		}
		return c;
	}
	
}
