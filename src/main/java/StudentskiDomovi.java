import java.util.Scanner;
import java.util.*;
public class StudentskiDomovi {
    private String ime;
    private String adresa;
    private String mesto;
    private int oddalecenost;
    private int rabotnoVreme;
    private StudentiKoiTrebaDaSeNavigiraat student;
    private String opcija;
    private StudentiKoiTrebaDaSeNavigiraat [] studenti;
    private String nasoka;
    private BibliotekiIKnizarnici biblioteka;
    private Kafici kafic;
    private StudentskiDomovi dom;
    StudentskiDomovi(String ime,String adresa,String mesto,int oddalecenost,int rabotnoVreme,String opcija,StudentiKoiTrebaDaSeNavigiraat [] studenti,String nasoka,BibliotekiIKnizarnici biblioteka,Kafici kafic,StudentskiDomovi dom){
        this.ime=ime;
        this.adresa=adresa;
        this.mesto=mesto;
        this.oddalecenost=oddalecenost;
        this.rabotnoVreme=rabotnoVreme;
        this.opcija=opcija;
        for(int brojac=0;brojac<studenti.length;brojac++){
            this.studenti[brojac]=studenti[brojac];
        }
        this.nasoka=nasoka;
        this.biblioteka=biblioteka;
        this.kafic=kafic;
        this.dom=dom;
    }
    public void setDom(StudentskiDomovi d){
        this.dom=d;
    }
    public StudentskiDomovi getDom(){
        return dom;
    }
    public void setKafic(Kafici k){
        this.kafic=k;
    }
    public Kafici getKafic(){
        return kafic;
    }
    public void setBiblioteka(BibliotekiIKnizarnici b){
        this.biblioteka=b;
    }
    public BibliotekiIKnizarnici getBiblioteka(){
        return biblioteka;
    }
    public void setNasoka(String n){
        this.nasoka=n;
    }
    public String getNasoka(){
        return nasoka;
    }
    public void setStudenti(StudentiKoiTrebaDaSeNavigiraat [] s){
        for(int brojac=0;brojac<studenti.length;brojac++){
            this.studenti[brojac]=s[brojac];
        }
    }
    public StudentiKoiTrebaDaSeNavigiraat getStudenti(int brojac){
        return studenti[brojac];
    }
    public void setOpcija(String o){
        this.opcija=o;
    }
    public String getOpcija(){
        return opcija;
    }
    public void setIme(String i){
        this.ime=i;
    }
    public String getIme(){
        return ime;
    }
    public void setAdresa(String a){
        this.adresa=a;
    }
    public String getAdresa(){
        return adresa;
    }
    public void setMesto(String m){
        this.mesto=m;
    }
    public String getMesto(){
        return mesto;
    }
    public void setOddalecenost(int o){
        this.oddalecenost=o;
    }
    public int getOddalecenost(){
        return oddalecenost;
    }
    public void setRabotnoVreme(int vreme){
        this.rabotnoVreme=vreme;
    }
    public int getRabotnoVreme(){
        return rabotnoVreme;
    }
    /************************************************************************************************************************/
    public void checkAccess(int casNaDostapnost,String lokacija,StudentiKoiTrebaDaSeNavigiraat student,Fakulteti faks){
        if((casNaDostapnost>=22 && casNaDostapnost<=7) && student.getLokacija()!=getIme()){
            System.out.println("Nemate pristap do serverot");
        }
        else{
            server(student,faks);
        }
    }
    public void server(StudentiKoiTrebaDaSeNavigiraat student,Fakulteti faks){
        Scanner skener=new Scanner(System.in);
        String imep=skener.nextLine();
        String pass=skener.nextLine();
        if(student.setImePrezime(imep).equals(student.getImePrezime()) && student.setLozinka(pass).equals(student.getLozinka())){
            if(getOpcija().equals("nasokiDoFakultet")){
                student.izvrshuvaj(dom,faks);
            }
            else if(getOpcija().equals("nasokiDoBibliotekiIKnizarnici")){
                getBiblioteka();
                biblioteka.patekaOdFakultetDoBiblioteka(faks.getIme(),biblioteka.getIme());
            }
            else if(getOpcija().equals("nasokiDoKafici")){
                getKafic();
                kafic.odDomDoKafic(dom.getIme(),kafic.getIme());
            }
        }
    }
    public void navigacijaOdDomDoMotel(String imeNaMotel){
        if(getIme().equals("Goce Delcev")){
            imeNaMotel.equals("Shel Motel");
            if(getNasoka().equals("Mitropolit Teodosij Gologanov")){
                System.out.println("Odete do Mitropolit Teodosij Gologanov,Bulevar Goce Delcev i Bulevar Krste Petkov Misirkov");
                System.out.println("Odete do Shel Motel");
            }
            else if(getNasoka().equals("Bulevar Partizanski Odredi")){
                System.out.println("Odete po Bulevar Partizanski Odredi");
                System.out.println("Odete do Shel Motel");
            }
            else if(getNasoka().equals("Mitropolit Teodosij Gologanov i Filip Vtori Makedonski")){
                System.out.println("Odete po Mitropolit Teodosij Gologanov,Dimitrie Cupovski i Filip Vtori Makedonski");
                System.out.println("Odete do Shel Motel");
            }
        }
        else if(getIme().equals("Studentski Centar Skopje")){
            imeNaMotel.equals("Motel Vila");
            if(getNasoka().equals("Bulevar 8mi Septemvri i Jadranska Magistrala/Kacanicki Pat")){
                System.out.println("Upatete se zapadno na Ul Kosta Shahov kon Kosta Shahov");
                System.out.println("Sledete go Metropolit Teodosij Gologanov,Bulevar 8mi Septemvri i Jadranska Magistrala/Kacanicki pat");
                System.out.println("Sledete go stariot Kacanicki Pat do Motel Vila");
            }
            else if(getNasoka().equals("Bulevar Ilinden i Jadranska Magistrala/Kacanicki Pat")){
                System.out.println("Upatete se zapadno na Ul Kosta Shahov kon Kosta Shahov");
                System.out.println("Vozete po Bulevar Ilinden,Bulevar 8mi Septemvri i Jadranska Magistrala/Kacanicki pat");
                System.out.println("Sledete go stariot Kacanicki Pat do Motel Vila");
            }
            else if(getNasoka().equals("Jadranska Magistrala/Kacanicki Pat")){
                System.out.println("Upatete se zapadno na Ul Kosta Shahov kon Kosta Shahov");
                System.out.println("Vozete po Samoilova,Bulevar Nikola Karev i Jadranska magistrala/Kacanicki Pat");
                System.out.println("Sledete go stariot Kacanicki Pat do Motel Vila");

            }
        }
        else if(getIme().equals("Pance Karagjozov")){
            if (getNasoka().equals("Bulevar Ilinden i Jadranska Magistrala/Kacanicki Pat")) {
                System.out.println("Upatete se zapadno na Ul Kosta Shahov kon Kosta Shahov");
                System.out.println("Svrtete nalevo na Mitropolit Teodosij Gologanov");
                System.out.println("Svrtete nalevo na Bulevar Sveti Kliment Ohridski");
                System.out.println("Svrtete nalevo na Bulevar Ilinden");
                System.out.println("Svrtete nadesno na Bulevar 8mi Septemvri");
                System.out.println("Prodolzete pravo na Jadranska Magistrala/Kacanicki Pat");
            }
            else if(getNasoka().equals("Bulevar 8mi Septemvri i Jadranska Magistrala/Kacanicki Pat")){
                System.out.println("Upatete se zapadno na Ul Kosta Shahov kon Kosta Shahov");
                System.out.println("Svrtete nadesno na Mitropolit Teodosij Gologanov");
                System.out.println("Na kruzniot tek,odete na 2ot izlez i ostanete na Mitropolit Teodosij Gologanov");
                System.out.println("Svrete nadesno na Bulevar 8mi Septemvri");
                System.out.println("Prodolzete pravo na Jadranska Magistrala/Kacanicki Pat");
            }
            else if(getNasoka().equals("Jadranska Magistrala/Kacanicki Pat")){
                System.out.println("Odete po Bulevar Sveti Kliment Ohridski i Samoilova do Bulevar Nikola Karev");
                System.out.println("Vozete do Jadranska Magistrala/Kacanicki Pat");
            }
        }
        else if(getIme().equals("Stiv Naumov")){
            if(getNasoka().equals("Bulevar Nikola Karev")){
                System.out.println("Upatete se zapadno na Arhimedova");
                System.out.println("Blago svrtete nalevo na Arhimedova");
                System.out.println("Svrtete nalevo kon Bulevar Nikola Karev");
                System.out.println("Svrtete nadesno na Bulevar Nikola Karev");
                System.out.println("Izlezete na Bulevar Krste Petkov Misirkov");
                System.out.println("Prodolzete pravo na Cvetan Dimov");
            }
            else if(getNasoka().equals("Bulevar Aleksandar Makedonski i Bulevar Nikola Karev")){
                System.out.println("Odete po Arhimedova do 16ta Makedonska Brigada");
                System.out.println("Odete po Bulevar Aleksandar Makedonski i Bulevar Nikola Karev do Cvetan Dimov");
            }
            else if(getNasoka().equals("Ulica Celovek")){
                System.out.println("Odete po Arhimedova i Ulica Celovek do Cvetan Dimov");
                System.out.println("Svrtete nadesno na Cvetan Dimov");
            }
        }
    }
    public void suggestAlternativeOptions(String imeNaMotel,StudentiKoiTrebaDaSeNavigiraat [] studenti,int casNaPristignuvanje){
        for(int brojac=0;brojac<studenti.length;brojac++){
            if(studenti[brojac].getImePrezime().equals(getStudenti(brojac))){
                if(casNaPristignuvanje!=getRabotnoVreme()){
                    navigacijaOdDomDoMotel(imeNaMotel);
                }
            }
        }
    }

}
