package vko1;

public class RajaPoikkeusTesti {

    public static void main(String args[]) {
        try {
            Kokonaisluku v = new Kokonaisluku(100, 0, 500);
            v.tulosta();
            v.kerro(2);
            v.tulosta();
            v.nelio();
            v.tulosta();
        } catch (RajaPoikkeus e) {
            System.out.print(e);
        }
    }
}
