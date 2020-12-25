package TikTakToe_CLI;

import java.util.*;

public class Game {
    Scanner scan = new Scanner(System.in);
    PlayerHum plr1 = new PlayerHum();
    PlayerHum plr2 = new PlayerHum();
    Feld feldG = new Feld();

    //Gameplay - kompletter spielablauf
    public Game(){
        SpielerSetzen();
        SpielErklaerung();
        WerFangtAn();
    }

    //Namen und das Zeichen der Spieler festlegen
    public void SpielerSetzen(){  //Namen und das Zeichen der Spieler festlegen
        boolean zeichenrichtig = false;  //dient fuer die Ueberpruefung

        System.out.printf("Spieler 1, bitte geben Sie Ihren Spielernamen ein: " );
        plr1.setName(scan.nextLine());
        while (zeichenrichtig == false) {  //Das Zeichen muss so lange richtig eingegeben werden bis es das richtige ist
            System.out.println("Welches Zeichen möchten Sie benutzen: (X/O)");
            plr1.setZchn(scan.nextLine());
            if(plr1.getZchn().equals("X") ||plr1.getZchn().equals("x")){  //Dass es nur ein Zeichen ist (Casse Sensitive)
                plr1.setZchn("X");
                zeichenrichtig = true;
            }
            else if( plr1.getZchn().equals("O") || plr1.getZchn().equals("o")){
                plr1.setZchn("O");
                zeichenrichtig = true;
            }
            else{
                System.out.println("Ihre Eingabe ist leider falsch! Bitte wiederholen Sie sie! ");
            }
        }
        System.out.printf("Spieler 2, bitte geben Sie Ihren Spieleramen ein: ");
        plr2.setName(scan.nextLine());
        plr2.setZchn(plr1.getZchn().equals("X") ? "O" : "X"); //ternary Operator - das Zeichen das noch Frei ist, wird verwendet
        System.out.println(plr2.getName() + " du hast das Zeichen: " + plr2.getZchn());
        }

        //Erklaerung des Spielablaufs, Bedienungsanleitung
        public static void SpielErklaerung(){
        System.out.println("  ");
        System.out.println(" ---------------------------------------------------------------");
        System.out.println("In Folgenden Beispiel sehen Sie die Koordinaten fuer das Spiel! ");
        System.out.println("Im Prinzip wird es ganz Einfach handegehabt!");
        System.out.println("   ");
        System.out.println( "|--------------|" );
        System.out.println("| " + "OL" + " | " + "OM" + " | " + "OR"+ " | ");
        System.out.println( "|--------------|" );
        System.out.println("| " + "ML" + " | " + "MM" + " | " + "MR" + " | ");
        System.out.println( "|--------------|" );
        System.out.println("| " + "UR" + " | " + "UM" + " | " + "UR" + " | ");
        System.out.println( "|--------------|" );
        System.out.println("   ");
        System.out.println("Um Ihr Zeichen zu setzen müssen Sie nur die Koordinaten eingeben Sobald Sie aufgerufen ewrden! ");
        System.out.println("Als Beispiel: OL = Obern Links, MM = Mittelere Zeile´mitten Drin! ");
        System.out.println("Falls Sie es nicht verstanden haben, lesen Sie es noch einmal oder Fragen Ihren Arzt oder Apotheker");
        System.out.println("   ");
        }

        // Ziehung wer Anfangen darf
        public void WerFangtAn(){
        Random rand = new Random();
        boolean wfa = rand.nextBoolean();
        if(wfa == true){
            System.out.println(plr1.getName() + " faengt an! ");
            GamePlayPl1();
            }
        else{
            System.out.println( plr2.getName() +" faengt an!");
            GamePlayPl2();
            }
        }

    //Der Spieler 1 muss seine Koordinaten eingeben, ab hier beginnt das eigenltiche Spiel
    public void GamePlayPl1(){
        System.out.println(plr1.getName() + " Bitte geben Sie die gewuenschton Koordinaten ein: ");

        String eingabe1 = scan.nextLine();
        switch (eingabe1){
            case "OL":
               if(feldG.getFeldOL().equals("X") || feldG.getFeldOL().equals("O"))  {
                   System.out.println("Dieses Feld ist bereits belegt!");
                   System.out.println("Bitte versuchen Sie es erneut! ");
                   GamePlayPl1();
               }
                feldG.setFeldOL(plr1.getZchn());
               break;
            case "OM":
                if(feldG.getFeldOM().equals("X") || feldG.getFeldOM().equals("O"))  {
                    System.out.println("Dieses Feld ist bereits belegt!");
                    System.out.println("Bitte versuchen Sie es erneut! ");
                    GamePlayPl1();
                }
                feldG.setFeldOM(plr1.getZchn());
                break;
            case "OR":
                if(feldG.getFeldOR().equals("X") || feldG.getFeldOR().equals("O"))  {
                    System.out.println("Dieses Feld ist bereits belegt!");
                    System.out.println("Bitte versuchen Sie es erneut! ");
                    GamePlayPl1();
                }
                feldG.setFeldOR(plr1.getZchn());
                break;
            case "ML":
                if(feldG.getFeldML().equals("X") || feldG.getFeldML().equals("O"))  {
                    System.out.println("Dieses Feld ist bereits belegt!");
                    System.out.println("Bitte versuchen Sie es erneut! ");
                    GamePlayPl1();
                }
                feldG.setFeldML(plr1.getZchn());
                break;
            case "MM":
                if(feldG.getFeldMM().equals("X") || feldG.getFeldMM().equals("O"))  {
                    System.out.println("Dieses Feld ist bereits belegt!");
                    System.out.println("Bitte versuchen Sie es erneut! ");
                    GamePlayPl1();
                }
                feldG.setFeldMM(plr1.getZchn());
                break;
            case "MR":
                if(feldG.getFeldMR().equals("X") || feldG.getFeldMR().equals("O"))  {
                    System.out.println("Dieses Feld ist bereits belegt!");
                    System.out.println("Bitte versuchen Sie es erneut! ");
                    GamePlayPl1();
                }
                feldG.setFeldMR(plr1.getZchn());
                break;
            case "UL":
                if(feldG.getFeldUL().equals("X") || feldG.getFeldUL().equals("O"))  {
                    System.out.println("Dieses Feld ist bereits belegt!");
                    System.out.println("Bitte versuchen Sie es erneut! ");
                    GamePlayPl1();
                }
                feldG.setFeldUL(plr1.getZchn());
                break;
            case "UM":
                if(feldG.getFeldUM().equals("X") || feldG.getFeldUM().equals("O"))  {
                    System.out.println("Dieses Feld ist bereits belegt!");
                    System.out.println("Bitte versuchen Sie es erneut! ");
                    GamePlayPl1();
                }
                feldG.setFeldUM(plr1.getZchn());
                break;
            case "UR":
                if(feldG.getFeldUR().equals("X") || feldG.getFeldUR().equals("O"))  {
                    System.out.println("Dieses Feld ist bereits belegt!");
                    System.out.println("Bitte versuchen Sie es erneut! ");
                    GamePlayPl1();
                }
                feldG.setFeldUR(plr1.getZchn());
                break;
            default:
                System.out.println("Ihre Eingabe war falsch! Bitte verscuhen Sie es erneut! ");
                GamePlayPl1();
        }
        feldG.FeldG();
        if(CheckMyWinSP1() != true){
            GamePlayPl2();
        }
    }

    //Der Spieler 2 muss seine Koordinaten eingeben, ab hier beginnt das eigenltiche Spiel
    public void GamePlayPl2(){
        System.out.println(plr2.getName() + " bitte geben Sie die gewuenschten Koordinaten ein: ");
        String eingabe1 = scan.nextLine();
        switch (eingabe1){
            case "OL":
                if(feldG.getFeldOL().equals("X") || feldG.getFeldOL().equals("O"))  {
                    System.out.println("Dieses Feld ist bereits belegt!");
                    System.out.println("Bitte versuchen Sie es erneut! ");
                    GamePlayPl2();
                }
                feldG.setFeldOL(plr2.getZchn());
                break;
            case "OM":
                if(feldG.getFeldOM().equals("X") || feldG.getFeldOM().equals("O"))  {
                    System.out.println("Dieses Feld ist bereits belegt!");
                    System.out.println("Bitte versuchen Sie es erneut! ");
                    GamePlayPl2();
                }
                feldG.setFeldOM(plr2.getZchn());
                break;
            case "OR":
                if(feldG.getFeldOR().equals("X") || feldG.getFeldOR().equals("O"))  {
                    System.out.println("Dieses Feld ist bereits belegt!");
                    System.out.println("Bitte versuchen Sie es erneut! ");
                    GamePlayPl2();
                }
                feldG.setFeldOR(plr2.getZchn());
                break;
            case "ML":
                if(feldG.getFeldML().equals("X") || feldG.getFeldML().equals("O"))  {
                    System.out.println("Dieses Feld ist bereits belegt!");
                    System.out.println("Bitte versuchen Sie es erneut! ");
                    GamePlayPl2();
                }
                feldG.setFeldML(plr2.getZchn());
                break;
            case "MM":
                if(feldG.getFeldMM().equals("X") || feldG.getFeldMM().equals("O"))  {
                    System.out.println("Dieses Feld ist bereits belegt!");
                    System.out.println("Bitte versuchen Sie es erneut! ");
                    GamePlayPl2();
                }
                feldG.setFeldMM(plr2.getZchn());
                break;
            case "MR":
                if(feldG.getFeldMR().equals("X") || feldG.getFeldMR().equals("O"))  {
                    System.out.println("Dieses Feld ist bereits belegt!");
                    System.out.println("Bitte versuchen Sie es erneut! ");
                    GamePlayPl2();
                }
                feldG.setFeldMR(plr2.getZchn());
                break;
            case "UL":
                if(feldG.getFeldUL().equals("X") || feldG.getFeldUL().equals("O"))  {
                    System.out.println("Dieses Feld ist bereits belegt!");
                    System.out.println("Bitte versuchen Sie es erneut! ");
                    GamePlayPl2();
                }
                feldG.setFeldUL(plr2.getZchn());
                break;
            case "UM":
                if(feldG.getFeldUM().equals("X") || feldG.getFeldUM().equals("O"))  {
                    System.out.println("Dieses Feld ist bereits belegt!");
                    System.out.println("Bitte versuchen Sie es erneut! ");
                    GamePlayPl2();
                }
                feldG.setFeldUM(plr2.getZchn());
                break;
            case "UR":
                if(feldG.getFeldUR().equals("X") || feldG.getFeldUR().equals("O"))  {
                    System.out.println("Dieses Feld ist bereits belegt!");
                    System.out.println("Bitte versuchen Sie es erneut! ");
                    GamePlayPl2();
                }
                feldG.setFeldUR(plr2.getZchn());
                break;
            default:
                System.out.println("Ihre Eingabe war falsch! Bitte verscuhen Sie es erneut! ");
                GamePlayPl2();
        }
        feldG.FeldG();
        if(CheckMyWinSP2() != true){
            GamePlayPl1();
        }
    }

    //Die Methoden CheckMyWin Ueberpruefen ob Die Spieler gewonnen haben oder nicht
    // Dabei werden die verschiedenen moeglichkeiten Ueberprueft
    public boolean CheckMyWinSP1(){
        if(feldG.getFeldOL().equals(plr1.getZchn()) && feldG.getFeldOM().equals(plr1.getZchn()) && feldG.getFeldOR().equals(plr1.getZchn())
                || feldG.getFeldML().equals(plr1.getZchn()) && feldG.getFeldMM().equals(plr1.getZchn()) && feldG.getFeldMR().equals(plr1.getZchn())
                || feldG.getFeldUL().equals(plr1.getZchn()) && feldG.getFeldUM().equals(plr1.getZchn()) && feldG.getFeldUR().equals(plr1.getZchn())
                || feldG.getFeldOL().equals(plr1.getZchn()) && feldG.getFeldML().equals(plr1.getZchn()) && feldG.getFeldUL().equals(plr1.getZchn())
                || feldG.getFeldOM().equals(plr1.getZchn()) && feldG.getFeldMM().equals(plr1.getZchn()) && feldG.getFeldUM().equals(plr1.getZchn())
                || feldG.getFeldOR().equals(plr1.getZchn()) && feldG.getFeldML().equals(plr1.getZchn()) && feldG.getFeldUR().equals(plr1.getZchn())
                || feldG.getFeldOL().equals(plr1.getZchn()) && feldG.getFeldMM().equals(plr1.getZchn()) && feldG.getFeldUR().equals(plr1.getZchn())
                || feldG.getFeldOR().equals(plr1.getZchn()) && feldG.getFeldMM().equals(plr1.getZchn()) && feldG.getFeldUL().equals(plr1.getZchn())
        ){
            System.out.println("Herzlichen Glueckwunsch " + plr1+"! Sie Haben Gewonnen!");
            return true;
        }

        else{
            return false;
        }

    }

    public boolean CheckMyWinSP2(){
        if(feldG.getFeldOL().equals(plr2.getZchn()) && feldG.getFeldOM().equals(plr2.getZchn()) && feldG.getFeldOR().equals(plr2.getZchn())
                || feldG.getFeldML().equals(plr2.getZchn()) && feldG.getFeldMM().equals(plr2.getZchn()) && feldG.getFeldMR().equals(plr2.getZchn())
                ||feldG.getFeldUL().equals(plr2.getZchn()) && feldG.getFeldUM().equals(plr2.getZchn()) && feldG.getFeldUR().equals(plr2.getZchn())
                || feldG.getFeldOL().equals(plr2.getZchn()) && feldG.getFeldML().equals(plr2.getZchn()) && feldG.getFeldUL().equals(plr2.getZchn())
                || feldG.getFeldOM().equals(plr2.getZchn()) && feldG.getFeldMM().equals(plr2.getZchn()) && feldG.getFeldUM().equals(plr2.getZchn())
                || feldG.getFeldOR().equals(plr2.getZchn()) && feldG.getFeldML().equals(plr2.getZchn()) && feldG.getFeldUR().equals(plr2.getZchn())
                || feldG.getFeldOL().equals(plr2.getZchn()) && feldG.getFeldMM().equals(plr2.getZchn()) && feldG.getFeldUR().equals(plr2.getZchn())
                || feldG.getFeldOR().equals(plr2.getZchn()) && feldG.getFeldMM().equals(plr2.getZchn()) && feldG.getFeldUL().equals(plr2.getZchn()) ){

            System.out.println("Herzlichen Glueckwunsch "+plr2+"! Sie Haben Gewonnen!");
            return true;
        }

        else{
            return false;
        }

    }

}
