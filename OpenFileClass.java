///////////////////////////////////////////////////////////////////////////////////////////////////////////
// Program: Words 
// Autor: Damian Kołakowski
// Data wydania: Marzec 2019
// Opis aplikacji: Program wczytuje plik teksowy oraz pokazuje odpowiednie wyrazy wedle opcji wybranej 
// przez uzytkownika
// Licencja: Open Source
//////////////////////////////////////////////////////////////////////////////////////////////////////////


package working_witch_words;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class OpenFileClass extends InfoAboutDoc {
	
	String[][] final_sentence = new String[100][100];
	String[] words = new String[100];
	String[] wordscopy = new String[100];
	int word_pos, choose,readvle;
	String sCurrentLine;
	String findftvalue, findltvalue,findanyvalue,findchoosevalue;
	
	public OpenFileClass(){
		
		System.out.print("Aplikacja wczytuje plik tekstowy oraz wyswietla wyrazy\n\n" 
				+"odpowiadajace zadaniom urzytkownika\n\n"
				+"Wybierz jedna z dostepnych opcji\n\n");
		 
		BufferedReader br = null;
		choose = 1;
		
		try{
			 
			//Wywolanie obiektu wraz z zaladowaniem pliku txt
			br = new BufferedReader(new FileReader("E:\\Java apps\\SimpleSmallApplication\\src\\working_witch_words\\simple_text.txt"));
			
			//petle w ktorej zdefniowano algorytm dopuki przy pomocy metody readline
			//bedzie cos wczytywane do stringa algorytm ma wczytywac tekst 
			//i go wyswietlac 
			
			while((sCurrentLine = br.readLine()) != null){
				
				chooseRightOption();
				
			}
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	
	public void findFirstChar(){
	
		String words[] = sCurrentLine.split(" ");
		
		//zwracanie dlugosci stringa
		int size = words.length;
		
		for(int w=0;w<size;w++){
			//zwracanie pozycji na ktorej jest szukany znak 
			word_pos = words[w].indexOf(findftvalue);
				if(word_pos == 0){
						  
						  System.out.print(words[w]+"\n");
					  }
			
		}
		System.out.print("Nie ma takiego wyrazu");
	}
	
	public void findLastChar(){
		
		String words[] = sCurrentLine.split(" ");
		
		int size = words.length;
		
		for(int w=0;w<size;w++){
			String words2 = words[w];
			int size2 = words2.length(); 
			
			word_pos = words[w].indexOf(findltvalue);
				if(word_pos == size2-1 ){
						  
						  System.out.print(words[w]+"\n");
						  
						  //System.out.print(size2+"\n");
			}
		}
		System.out.print("Nie ma takiego wyrazu");
	}
	
	
	public void findAnyChar(){
		
		String words[] = sCurrentLine.split(" ");
		
		//zwracanie dlugosci stringa
		int size = words.length;
		
		for(int w=0;w<size;w++){
			//zwracanie pozycji na ktorej jest szukany znak 
			word_pos = words[w].indexOf(findanyvalue);
				if(word_pos >= 0){
						  
						  System.out.print(words[w]+"\n");
					  }
					
			}if(word_pos == 0)
			{
				System.out.print("Nie ma takiego wyrazu");
			}
		
	}
	
	public void findchooseChar(){
		
		String words[] = sCurrentLine.split(" ");
		
		//zwracanie dlugosci stringa
		int size = words.length;
		
		for(int w=0;w<size;w++){
			//zwracanie pozycji na ktorej jest szukany znak 
			word_pos = words[w].indexOf(findchoosevalue);
				if(word_pos == readvle){
						  
						  System.out.print(words[w]+"\n");
					  }
			}
		System.out.print("Nie ma takiego wyrazu");
	}
	
	
	public void readFtSets(){
		
		Scanner scan = new Scanner(System.in);
		System.out.print("\nWprowadz litere ktora powinna byc znaleziona jako pierwsza w wyrazie\n\n");
		findftvalue = scan.nextLine();
		
	}
	
	public void readLtSets(){
		
		Scanner scan = new Scanner(System.in);
		System.out.print("\nWprowadz litere ktora powinna byc znaleziona jako ostatnia w wyrazie\n\n");
		findltvalue = scan.nextLine();
		
		
	}
	
	public void readAnySets(){
		
		Scanner scan = new Scanner(System.in);
		System.out.print("\nWprowadz litere ktora powinna byc znaleziona w wyrazie\n\n");
		findanyvalue = scan.nextLine();
	}
	
	public void readchooseSets(){
		//
		Scanner scan = new Scanner(System.in);
		System.out.print("\nWprowadz litere ktora powinna byc znaleziona w wyrazie\n\n");
		findchoosevalue = scan.nextLine();
		System.out.print("\nPodaj na ktorym miejscu powinna wystepowac\n\n");
		readvle = scan.nextInt();
		//Podaj na ktorym miejscu powinna wystepowac
	}
	
	public void menu(){
		
		System.out.print("1 - Litera od ktorej wyraz sie zaczyna\n\n");
		System.out.print("2 - Litera na ktorej konczy sie wyraz\n\n");
		System.out.print("3 - Ktory kolwiek wyraz zawierajacy dana litere\n\n");
		System.out.print("4 - Litera jest w wyrazie na danym miejscu\n\n");
		System.out.print("0 - Wyjscie z programu ");
	}
	
	
	public void chooseRightOption(){
		
		choose = 1;
		
		menu();
		
		while(choose != 0)
		{
		System.out.print("\n\nWybierz wlasciwa opcje\n\n");
		Scanner sc = new Scanner(System.in);
		choose = sc.nextInt();
		
			switch(choose){
				
			case 1: 
				readFtSets();
				findFirstChar();
			break;
			
			case 2:
				readLtSets();
				findLastChar();
			break;
			case 3:
				readAnySets();
				findAnyChar();
			break;
			case 4:
				readchooseSets();
				findchooseChar();
			break;
			
			default:
				System.out.print("Zadna z opcji nie jest wlasciwa");
			}
		}
	}
	
}
