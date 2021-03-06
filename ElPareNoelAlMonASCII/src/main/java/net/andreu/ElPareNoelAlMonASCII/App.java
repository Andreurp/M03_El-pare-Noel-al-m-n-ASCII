package net.andreu.ElPareNoelAlMonASCII;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * El pare Noel al món ASCII
 *
 */
public class App {

	private static String pareNoel="*<]:-DOo";
	private static String ren=">:o)";
	private static String ajudants="<]:-D";
	
	private static String arxiu="src/main/resources/visites.txt";

	public static void main(String[] args) {
		App a = new App();
		a.inici();
	}

	public void inici() {
		llegirFitxer();
	}

	public void llegirFitxer() {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(arxiu));
			String linia = br.readLine();
			int n_pareNoel=0;
			int n_ren=0;
			int n_ajudants=0;
			
			//mentre hi hagi una linia segueix llegint
			while (linia != null) {
				n_pareNoel=0;
				n_ren=0;
				n_ajudants=0;
				
				System.out.println(linia);
				int posicio= -1;
				//si la linea conte un pare noel suma-li 1
				do{
					posicio=linia.indexOf(pareNoel, posicio+1);
					if(posicio!=-1){
						n_pareNoel++;
					}
				}while(posicio!=-1);
				//si la linea conte un ren suma-li 1
				do{
					posicio=linia.indexOf(ren, posicio+1);
					if(posicio!=-1){
						n_ren++;
					}
				}while(posicio!=-1);
				//si la linea conte un ajudant suma-li 1
				do{
					posicio=linia.indexOf(ajudants, posicio+1);
					if(posicio!=-1){
						//distigim entre pare noel i ajudants
						if(posicio>0 && linia.indexOf(pareNoel, posicio-1)!=posicio-1){
							n_ajudants++;
						}
					}
				}while(posicio!=-1);
				System.out.println("Pare Noel: "+n_pareNoel);
				System.out.println("Ren: "+n_ren);
				System.out.println("Ajudants: "+n_ajudants);
				System.out.println();
				linia = br.readLine();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
