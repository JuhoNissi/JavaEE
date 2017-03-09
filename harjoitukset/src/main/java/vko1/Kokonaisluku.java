package vko1;

public class Kokonaisluku {

    private int luku;
    private int alaraja, ylaraja;

    public Kokonaisluku(int alkuarvo)
            throws RajaPoikkeus {

        aseta_rajat(Integer.MIN_VALUE, Integer.MAX_VALUE);
        alusta(alkuarvo);
    }

    public Kokonaisluku(int alkuarvo, int ar, int yr)
            throws RajaPoikkeus {

        aseta_rajat(ar, yr);
        alusta(alkuarvo);
    }

    // Metodi voi aiheuttaa poikkeuksen!
    private void alusta(int alkuarvo)
            throws RajaPoikkeus {

        if (alkuarvo >= alaraja && alkuarvo <= ylaraja) {
            luku = alkuarvo;
        } else {
            throw new RajaPoikkeus(alkuarvo,
                    alaraja, ylaraja);
        }
    }

    // Metodi voi aiheuttaa poikkeuksen!
    private void aseta_rajat(int ar, int yr)
            throws RajaPoikkeus {

        if (luku < ar || luku > yr) {
            throw new RajaPoikkeus(luku,
                    alaraja, ylaraja);
        }
        alaraja = ar;
        ylaraja = yr;
    }

    public void nelio() throws RajaPoikkeus {
        kerro(luku);
    }

    public void kuutio() throws RajaPoikkeus {
        kerro(luku * luku);
    }

    public void kerro(int n) throws RajaPoikkeus {
        double tulos = luku * n;
        if (tulos >= alaraja && tulos <= ylaraja) {
            luku = (int) tulos;
        } else {
            throw new RajaPoikkeus(
                    (int) tulos, alaraja, ylaraja);
        }
    }

    public void tulosta() {
        System.out.println(this.luku + ", Rajat: ["
                + this.alaraja + "," + this.ylaraja + "]");
    }
}
