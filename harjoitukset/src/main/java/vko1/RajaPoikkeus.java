package vko1;

public class RajaPoikkeus extends Exception {

    public RajaPoikkeus() {
        super("virhe! rajat ylitetty");
    }

    public RajaPoikkeus(int l, int ar, int yr) {
        super("virhe! rajat " + ar + "-" + yr
                + " ylitetty (arvo: " + l + ")");
    }
}
