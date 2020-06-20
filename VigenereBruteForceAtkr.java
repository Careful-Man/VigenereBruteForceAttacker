
public class VigenereBruteForceAtkr {

	public static void main(String[] args) {
		
		
		try{
			
			//Intro messages
			System.out.println("This programm was developed for the ATS2018 course, Project 1.");
			Thread.sleep(2000); //pause for 2000 miliseconds
			System.out.println("What it does is trying brute force attacks to decipher the text:");
			Thread.sleep(3000);
			System.out.println("VIEOEGMOCIGOHHJGBALOTMRJBHUMPXRJKQAMMBZAZKLMROROMQRAAUMNFWUGKXRNGK\n"
			                  +"KUCTXKXJLXGNXAFWQCHLBIAJLJVVQSHLVBVSXQZBUIKSGBBUEUELFZNXPKNXXZLTYE\n"
			                  +"MBVIIGBFRJYKUIFSFGGXUWAUMZFZTKMNYIGNXVZOTKLNSWBQBMZVGNXCEBRXGYK.\n");
			Thread.sleep(4000);
			System.out.println("It has been ciphered with the Vigenere cipher algorithm and has a key\n"
					          +"length of 6 characters, that are Enlgish capital letters.");
			Thread.sleep(4000);
			System.out.println("The deciphered text is:");
			Thread.sleep(2000);
			System.out.println("CONGRATULATIONSYOUSUCEEDINDECRYPTINGTHISMESSAGEITWASNOTTOOHARDAFTER\n"
			                  +"ALLKEEPUPTHEGOODWORKANDSPENDMORETIMEWITHCRYPTOOLANDSTUDYCAREFULLYTHE\n"
			                  +"AVAILABLEBOOKSANDDONOTFORGETTHATHEBIGGESTBOOKISINTHEINTERNET.\n");
			Thread.sleep(4000);
			System.out.println("Remember that the goal is not to decipher the entire text but to\n"
			          		  +"find the key, the time and the tries it took to decipher the 6\n"
			          		  +"first letters of the ciphered text, since the key is exactly 6\n"
			          		  +"characters long!");
			Thread.sleep(5500);
			System.out.println("So as long as we decipher \"VIEOEG\" into \"CONGRA\" using Vigenere decryption\n"
					          +"we're good to go!\n");
			Thread.sleep(3000);
			
			int[] cipheredTextNum = new int[6];
			int[] decipheredTextNum = new int[6];
			String[] decipherKeyText = new String[6];
			String decipherKey = "";
			//ciphertext is VIEOEG. Converting letters to numbers(A=1, Z=26)
			cipheredTextNum[0] = 22;
			cipheredTextNum[1] = 9;
			cipheredTextNum[2] = 5;
			
			cipheredTextNum[3] = 15;
			cipheredTextNum[4] = 5;
			cipheredTextNum[5] = 7;
			
			//deciphertext is CONGRA. Converting letters to numbers(A=1, Z=26)
			decipheredTextNum[0] = 3;
			decipheredTextNum[1] = 15;
			decipheredTextNum[2] = 14;
			
			decipheredTextNum[3] = 7;
			decipheredTextNum[4] = 18;
			decipheredTextNum[5] = 1;
			
			
			System.out.println("Let's start!");
			System.out.println("...");
			//starting dechiper process timer
			long startTimer = System.currentTimeMillis();
			//initializing a brute force attack counter
			int bruteForceAttacks = 0;
			boolean textDeciphered = false;
			int[] decipherKeyNum = new int[6];
			for(int i=0; i<6; i++) {
				decipherKeyNum[i] = 1;
			}
			
			//deciphering text with brute force attacks
			while(decipherKeyNum[0]<=26 && !textDeciphered) {
				decipherKeyNum[1] = 1;
				while(decipherKeyNum[1]<=26 && !textDeciphered) {
					decipherKeyNum[2] = 1;
					while(decipherKeyNum[2]<=26 && !textDeciphered) {
						decipherKeyNum[3] = 1;
						while(decipherKeyNum[3]<=26 && !textDeciphered) {
							decipherKeyNum[4] = 1;
							while(decipherKeyNum[4]<=26 && !textDeciphered) {
								decipherKeyNum[5] = 1;
								while(decipherKeyNum[5]<=26 && !textDeciphered) {
									if((cipheredTextNum[0]+decipherKeyNum[0])%26 == decipheredTextNum[0]) {
										if((cipheredTextNum[1]+decipherKeyNum[1])%26 == decipheredTextNum[1]) {
											if((cipheredTextNum[2]+decipherKeyNum[2])%26 == decipheredTextNum[2]) {
												if((cipheredTextNum[3]+decipherKeyNum[3])%26 == decipheredTextNum[3]) {
													if((cipheredTextNum[4]+decipherKeyNum[4])%26 == decipheredTextNum[4]) {
														if((cipheredTextNum[5]+decipherKeyNum[5])%26 == decipheredTextNum[5]) {
															textDeciphered = true;
														}
													}
												}
											}
										}
									}
									bruteForceAttacks++;
									decipherKeyNum[5]++;
								}
								decipherKeyNum[4]++;
							}
							decipherKeyNum[3]++;
						}
						decipherKeyNum[2]++;
					}
					decipherKeyNum[1]++;
				}
				decipherKeyNum[0]++;		
			}
			
			
			for(int i=0; i<6; i++) {
				if(decipherKeyNum[i] - 1 == 1) 
					decipherKeyText[i] = "A";
				else if(decipherKeyNum[i] - 1 == 2)
					decipherKeyText[i] = "B";
				else if(decipherKeyNum[i] - 1 == 3)
					decipherKeyText[i] = "C";
				else if(decipherKeyNum[i] - 1 == 4)
					decipherKeyText[i] = "D";
				else if(decipherKeyNum[i] - 1 == 5)
					decipherKeyText[i] = "E";
				else if(decipherKeyNum[i] - 1 == 6)
					decipherKeyText[i] = "F";
				else if(decipherKeyNum[i] - 1 == 7)
					decipherKeyText[i] = "G";
				else if(decipherKeyNum[i] - 1 == 8)
					decipherKeyText[i] = "H";
				else if(decipherKeyNum[i] - 1 == 9)
					decipherKeyText[i] = "I";
				else if(decipherKeyNum[i] - 1 == 10)
					decipherKeyText[i] = "J";
				else if(decipherKeyNum[i] - 1 == 11)
					decipherKeyText[i] = "K";
				else if(decipherKeyNum[i] - 1 == 12)
					decipherKeyText[i] = "L";
				else if(decipherKeyNum[i] - 1 == 13)
					decipherKeyText[i] = "M";
				else if(decipherKeyNum[i] - 1 == 14)
					decipherKeyText[i] = "N";
				else if(decipherKeyNum[i] - 1 == 15)
					decipherKeyText[i] = "O";
				else if(decipherKeyNum[i] - 1 == 16)
					decipherKeyText[i] = "P";
				else if(decipherKeyNum[i] - 1 == 17)
					decipherKeyText[i] = "Q";
				else if(decipherKeyNum[i] - 1 == 18)
					decipherKeyText[i] = "R";
				else if(decipherKeyNum[i] - 1 == 19)
					decipherKeyText[i] = "S";
				else if(decipherKeyNum[i] - 1 == 20)
					decipherKeyText[i] = "T";
				else if(decipherKeyNum[i] - 1 == 21)
					decipherKeyText[i] = "U";
				else if(decipherKeyNum[i] - 1 == 22)
					decipherKeyText[i] = "V";
				else if(decipherKeyNum[i] - 1 == 23)
					decipherKeyText[i] = "W";
				else if(decipherKeyNum[i] - 1 == 24)
					decipherKeyText[i] = "X";
				else if(decipherKeyNum[i] - 1 == 25)
					decipherKeyText[i] = "Y";
				else
					decipherKeyText[i] = "Z";
			}
			for(int i=0; i<6; i++) {
				decipherKey += decipherKeyText[i];
			}
			
			//stoping dechiper process timer
			long endTimer = System.currentTimeMillis();
			//printing results
			System.out.println("Decipher process is over!\n");
			System.out.println("The decipher key is " + decipherKey + ". ");
			System.out.println("The number of brute force attacks was " + bruteForceAttacks + ". ");
			System.out.println("Elapsed time was " + ((endTimer-startTimer)) + " miliseconds. ");
			
			
		}
		catch(InterruptedException e){
			System.out.println("System got interrupted!");
		}
		
		
	}

}
