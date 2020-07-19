package de.fbenko;

public class App 
{
    public static void main( String[] args )
    {
        Abonnement abo = new Abonnement("Peter", "Lustig", 1, 54.50);
        System.out.println("Guthaben: " + abo.zeigeGuthaben());
        System.out.println("Zahlung von 12.50");
        abo.ausGuthabenZahlen(12.50, false);
        System.out.println("Guthaben: " + abo.zeigeGuthaben());
    
    }
}
