import java.util.Scanner;

public class TurkceString {

    String ifade;

    public TurkceString(String ifade){
        this.ifade=ifade;
    }


    public int indexBul(String karakter) {
        int index = ifade.indexOf(karakter.charAt(0));
        return index;
    }

    public char karakterAl(int index) {
        return ifade.charAt(index);
    }

    public String altIfade(int baslangic, int bitis) {
        return ifade.substring(baslangic, bitis);


    }
}