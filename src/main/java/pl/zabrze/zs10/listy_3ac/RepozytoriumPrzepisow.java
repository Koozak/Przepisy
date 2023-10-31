package pl.zabrze.zs10.listy_3ac;

import java.util.ArrayList;

public class RepozytoriumPrzepisow {
    private ArrayList<Przepis> przepisy = new ArrayList<>();

    public RepozytoriumPrzepisow() {
        wstawPrzepisy();
    }

    public ArrayList<Przepis> getPrzepisy() {
        return przepisy;
    }

    public ArrayList<Przepis> wstawPrzepisy(){
        przepisy.add(new Przepis(
                "Kakao","napoje",0,R.drawable.kakao,"kakao,mleko","wymieszaj wszystko"
        ));
        przepisy.add(new Przepis(
                "Gofry","desery",1,R.drawable.gofry,"mąka,cukier,jajka,proszek do pieczenia","wymieszaj wszystko i piecz 6 minut"
        ));
        przepisy.add(new Przepis(
                "Muffiny","ciasteczka",3,R.drawable.muffiny,"kakao,mleko,jajka,cukier","wymieszaj wszystko,piecz w temperaturze 180 stopniach"
        ));
        przepisy.add(new Przepis(
                "Pierniki","ciasteczka",3,R.drawable.pierniki,"kakao,mleko","wymieszaj wszystko"
        ));
        przepisy.add(new Przepis(
                "Murzynek","ciasto",2,R.drawable.murzynek,"kakao,mleko,proszek do pieczenia,czekolada,jajka","wymieszaj wszystko,piecz w 200 stopniach"
        ));
        przepisy.add(new Przepis(
                "Szarlotka","ciasta",2,R.drawable.szarlotka,"jajka,mleko,proszek do pieczenia,jabłka","wymieszaj jajka z mlekiem i mąką,piecz 10 minut dodaj jabłka"
        ));
        return przepisy;
    }
    public ArrayList<Przepis> przepisyZKategorii(int nrKategorii){
        ArrayList<Przepis> wybranePrzpisy = new ArrayList<>();
        for (Przepis p:przepisy) {
            if (p.getNrKategorii() == nrKategorii){
                wybranePrzpisy.add(p);
            }
        }
        return wybranePrzpisy;
    }
}
