package com.casa.esercitazione23.it;

import java.time.LocalTime;

public class Timer {
	
	public static LocalTime orarioPartenza;
	public static LocalTime orarioCorrente;
	public static int contatore;
	
	
	public static void avvia(int secondi) {
	
		orarioPartenza = LocalTime.now();
		
		do{
			orarioCorrente = LocalTime.now();
			
		}while(orarioCorrente.isBefore(orarioPartenza.plusSeconds(secondi))); {
			
			System.out.println("Sono passati 5 secondi!");
			
			if(contatore < 2) {
				contatore++;
				avvia(5);
			}
		}
		
		
		
		
	}

}
