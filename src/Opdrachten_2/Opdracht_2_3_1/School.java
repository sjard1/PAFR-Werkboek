package Opdrachten_2.Opdracht_2_3_1;

/**
 * Created by sjard on 18-Nov-17.
 */
public class School {
    String naam, achternaam;
    int id;


    School(String naam, String Achternaam, int id){
        this.naam = naam;
        this.achternaam = Achternaam;
        this.id = id;
    }
    String getNaam(){
        return this.naam;
    }

    void setNaam(String s){
        this.naam = s;
    }

    int getId(){
        return this.id;
    }

    void setId(int id){
        this.id = id;
    }

    String getAchternaam(){
        return this.achternaam;
    }

    void setAchternaam(String achternaam){
        this.achternaam = achternaam;
    }

}
