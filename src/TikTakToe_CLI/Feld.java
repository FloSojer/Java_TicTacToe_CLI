package TikTakToe_CLI;

public class Feld {
private String feldOL = " ";
private String feldOM = " ";
private String feldOR = " ";

private String feldML = " ";
private String feldMM = " ";
private String feldMR = " ";

private String feldUL = " ";
private String feldUM = " ";
private String feldUR = " ";

    public void FeldG (){
        System.out.println( "|-----------|" );
        System.out.println("| " + this.feldOL + " | " + this.feldOM + " | " + this.feldOR + " | ");
        System.out.println( "|-----------|" );
        System.out.println("| " + this.feldML + " | " + this.feldMM + " | " + this.feldMR + " | ");
        System.out.println( "|-----------|" );
        System.out.println("| " + this.feldUL + " | " + this.feldUM + " | " + this.feldUR + " | ");
        System.out.println( "|-----------|" );


}

    public String getFeldOL () {
        return feldOL;
    }

    public void setFeldOL ( String feldOL ) {
        this.feldOL = feldOL;
    }

    public String getFeldOM () {
        return feldOM;
    }

    public void setFeldOM ( String feldOM ) {
        this.feldOM = feldOM;
    }

    public String getFeldOR () {
        return feldOR;
    }

    public void setFeldOR ( String feldOR ) {
        this.feldOR = feldOR;
    }

    public String getFeldML () {
        return feldML;
    }

    public void setFeldML ( String feldML ) {
        this.feldML = feldML;
    }

    public String getFeldMM () {
        return feldMM;
    }

    public void setFeldMM ( String feldMM ) {
        this.feldMM = feldMM;
    }

    public String getFeldMR () {
        return feldMR;
    }

    public void setFeldMR ( String feldMR ) {
        this.feldMR = feldMR;
    }

    public String getFeldUL () {
        return feldUL;
    }

    public void setFeldUL ( String feldUL ) {
        this.feldUL = feldUL;
    }

    public String getFeldUM () {
        return feldUM;
    }

    public void setFeldUM ( String feldUM ) {
        this.feldUM = feldUM;
    }

    public String getFeldUR () {
        return feldUR;
    }

    public void setFeldUR ( String feldUR ) {
        this.feldUR = feldUR;
    }
}
