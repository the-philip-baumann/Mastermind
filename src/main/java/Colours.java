public enum Colours {
    BLAU ("Blau"),
    ROT ("Rot"),
    GELB ("Gelb"),
    GRUEN ("Grün"),
    SCHWARZ ("Schwarz"),
    WEISS ("Weiss"),
    LILA ("Lila");

    private String colour;

    Colours (String colour) {

    }

    public String getColour () {
        return colour;
    }

    public void setColour (String colour) {
        this.colour = colour;
    }
}
