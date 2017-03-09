package vko1;

/* 
 Mallivastaus:
  
 Toiminta:
 for-silmukoiden käyttä!

 Tulostaa joulukuusen rungo-osan:
 *
 ***
 *****
 *******
 *********
 ***
 ***
 *****
 Joulukuusi on tässä tulostettu suht. monimutkaisesti,
 mutta esimerkissä onkin panostettu parametrisointiin!
 Kaikki muutettavat arvot ovat luokan vakioina
 */
public class AsciiKuusi {

    // Vakioiden määrittely
    static final int MAX_LEVEYS = 43, // kuusen maksimileveys
            RUNGON_KORKEUS = 5, // rungo-osan korkeus
            RUNGON_LEVEYS = 3, // runko-osan leveys
            JALAN_LEVEYS = 5;   // jalka-osan leveys

    public void oksat(){
    	
    	for (int i = 1; i <= MAX_LEVEYS; i = i + 2) {
            int alkukohta = (MAX_LEVEYS - i) / 2;
            for (int k = 1; k <= alkukohta; k++) // tulostetaan tyhjät
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) // tulostetaan "oksat"
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
    
    public void runko(){
    	
        for (int i = 1; i <= RUNGON_KORKEUS; i++) {
            int alkukohta = (MAX_LEVEYS - RUNGON_LEVEYS) / 2;
            for (int k = 1; k <= alkukohta; k++) // tulostetaan tyhjät
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= RUNGON_LEVEYS; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public void jalka(){
    	
        int alkukohta = (MAX_LEVEYS - JALAN_LEVEYS) / 2;
        for (int k = 1; k <= alkukohta; k++) // tulostetaan tyhjät
        {
            System.out.print(" ");
        }
        for (int p = 1; p <= JALAN_LEVEYS; p++) {
            System.out.print("*");
        }
    }
    
    public static void main(String argumentit[]) {
    	
    	AsciiKuusi kuusi = new AsciiKuusi();
    	
    	kuusi.oksat();
    	kuusi.runko();
    	kuusi.jalka();
    	
    	
    	
    } // pääohjelma loppuu
}
