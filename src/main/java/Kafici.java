import java.util.Scanner;
public class Kafici {
    private String adresa;
    private String mesto;
    private int oddalecenost;
    private String dejnosti;
    private int rabotnoVreme;
    private float zadovolstvoNaMusterii;
    private int [] musterii;
    private String [] kafinja;
    private String [] preporaki;
    private String ime;
    private String nasoka;
    private int dolzinaNaKafic;
    private int sirinaNaKafic;
    public Kafici(String adresa,String mesto,int oddalecenost,String dejnosti,int rabotnoVreme,int zadovolstvoNaMusterii,int [] musterii,String [] kafinja,String ime,String nasoka,String [] preporaki,int dolzinaNaKafic,int sirinaNaKafic){
        this.adresa=adresa;
        this.mesto=mesto;
        this.oddalecenost=oddalecenost;
        this.dejnosti=dejnosti;
        this.rabotnoVreme=rabotnoVreme;
        this.zadovolstvoNaMusterii=zadovolstvoNaMusterii;
        for(int brojac=0;brojac<musterii.length;brojac++){
            this.musterii[brojac]=musterii[brojac];
        }
        for(int brojac=0;brojac<kafinja.length;brojac++){
            this.kafinja[brojac]=kafinja[brojac];
        }
        this.ime=ime;
        this.nasoka=nasoka;
        for(int brojac=0;brojac<preporaki.length;brojac++){
            this.preporaki[brojac]=preporaki[brojac];
        }
        this.dolzinaNaKafic=dolzinaNaKafic;
        this.sirinaNaKafic=sirinaNaKafic;
    }
    public void setDolzinaNaKafic(int dolzina){
        this.dolzinaNaKafic=dolzina;
    }
    public int getDolzinaNaKafic(){
        return dolzinaNaKafic;
    }
    public void setSirinaNaKafic(int sirina){
        this.sirinaNaKafic=sirina;
    }
    public int getSirinaNaKafic(){
        return sirinaNaKafic;
    }
    public void setPreporaki(String [] p){
        for(int brojac=0;brojac<preporaki.length;brojac++){
            this.preporaki[brojac]=p[brojac];
        }
    }
    public String getPreporaki(int brojac){
        return preporaki[brojac];
    }
    public void setNasoka(String pat){
        this.nasoka=pat;
    }
    public String getNasoka(){
        return nasoka;
    }
    public void setIme(String i){
        this.ime=i;
    }
    public String getIme(){
        return ime;
    }
    public void setZadovolstvoNaMusterii(float znm){
        this.zadovolstvoNaMusterii=znm;
    }
    public float getZadovolstvoNaMusterii(){
        return zadovolstvoNaMusterii;
    }
    public float presmetajZadovolstvoNaMusterii(int [] musterii){
        float sumaNaReakcii=0;
        for(int brojac=0;brojac<musterii.length;brojac++){
            sumaNaReakcii+=getZadovolstvoNaMusterii();
            int limiter=musterii.length/2;
            if(getZadovolstvoNaMusterii()==4 || getZadovolstvoNaMusterii()==5){
                System.out.println("Musteriite se zadovolni");
                if(getZadovolstvoNaMusterii()>limiter){
                    System.out.println("Kazete mu na shefot za raise");
                }
            }
            else if(getZadovolstvoNaMusterii()==3){
                System.out.println("Ima prostor za podobruvanja");
                if(getZadovolstvoNaMusterii()>limiter){
                    System.out.println("Ocekuvajte da bidete izvesteni od shefot");
                }
            }
            else if(getZadovolstvoNaMusterii()==1 || getZadovolstvoNaMusterii()==2) {
                System.out.println("Mora da ima promeni");
                if(getZadovolstvoNaMusterii()>limiter){
                    System.out.println("Ke ima sostanok");
                }
            }
        }
        return sumaNaReakcii;
    }
    public int kvalitetNaMeni(String [] kafinja){
        int kvalitetNaKafinja=0;
        for(int brojac=0;brojac<kafinja.length;brojac++){
            switch(kafinja[brojac]){
                case "Colombian Andean coffee":kvalitetNaKafinja+=2; break;
                case "Ethiopian acidic coffee":kvalitetNaKafinja+=2; break;
                case "Indonesian civet coffee":kvalitetNaKafinja+=2; break;
                case "Yemeni coffee of Mocha":kvalitetNaKafinja+=2; break;
                case "Mexican café de olla": kvalitetNaKafinja+=2;  break;
                case "Jamaican Blue Mountain coffee": kvalitetNaKafinja+=2; break;
                case "Traditional Brazilian cafezinho": kvalitetNaKafinja+=2; break;
                case "Italian espresso": kvalitetNaKafinja+=2; break;
            }
        }
        return kvalitetNaKafinja;
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
    public void setDejnosti(String d){
        this.dejnosti=d;
    }
    public String getDejnosti(){
        return dejnosti;
    }
    public void setRabotnoVreme(int rv){
        this.rabotnoVreme=rv;
    }
    public int getRabotnoVreme(){
        return rabotnoVreme;
    }
    public void odDomDoKafic(StudentskiDomovi dom,String ime){
        if(dom.getIme().equals("Goce Delcev") && ime.equals("Kafe Li")){
            if(getNasoka().equals("Metropolit Teodosij Gologanov")){
                System.out.println("Upatete se juzno na Moskovska kon Oslo");
                System.out.println("Odete pravo na Moskovska");
                System.out.println("Svrtete nalevo na Mitropolit Teodosij Gologanov");
                System.out.println("Svrtete nalevo na Ankarska");
                System.out.println("Svrtete nalevo na Atinska dvapati");
            }
            else if(getNasoka().equals("Bulevar Partizanski Odredi")){
                System.out.println("Upatete se severno na Moskovska kon Budimpestanska");
                System.out.println("Svrtete nadesno na Bulevar Partizanski Odredi");
                System.out.println("Svrtete nadesno na Franklin Ruzvelt");
                System.out.println("Svrtete nadesno na Borka Taleski");
                System.out.println("Svrtete nalevo na Atinska");
            }
        }
        if(dom.getIme().equals("Studentski Centar Skopje") && ime.equals("Cresha Bar")){
            if(getNasoka().equals("Vladimir Polezhanovski")){
                System.out.println("Upatete se Istocno na Ulica Kosta Shahov do Debarca");
                System.out.println("Od Ulica Kosta Shahov svrtete nalevo nakaj Debarca");
                System.out.println("Odete nalevo na Kosta Kirkov");
                System.out.println("Svrtete nadesno na Leninova");
                System.out.println("Upatete se nalevo na Vladimir Polezhanovski/Debarca");
                System.out.println("Odete nadesno na Rajko Zhinzifov");
            }
            else if(getNasoka().equals("Nikola Trimpare")){
                System.out.println("Upatete se Istocno na Ulica Kosta Shahov do Debarca");
                System.out.println("Od Ulica Kosta Shahov svrtete nalevo nakaj Debarca");
                System.out.println("Odete nalevo na Kosta Kirkov");
                System.out.println("Svrtete nadesno na Leninova");
                System.out.println("Preminete nalevo na prvata raskrsnica na Nikola Trimpare");
                System.out.println("Upatete se nadesno na Apostol Guslarot");
                System.out.println("Preminete nalevo na prvata raskrsnica na Borka Taleski");
                System.out.println("Svrtete nadesno na Rajko Zhinzifov");
            }
            else if(getNasoka().equals("Mitropolit Teodosij Gologanov i Kostursli Heroi")){
                System.out.println("Odete zapadno na Ulica Kosta Shahov kon Kosta Shahov");
                System.out.println("Svrtete nadesno na Mitropolit Teodosij Gologanov");
                System.out.println("Na kruzniot tek,odete na prviot izlez na Kosturski Heroi");
                System.out.println("Upatete se nadesno na Borka Taleski");
                System.out.println("Svrtete nalevo na Rajko Zhinzifov");
            }
        }
        if(dom.getIme().equals("Pance Karagozov") && ime.equals("Broz Kafe")){
            if(getNasoka().equals("Bulevar Sveti Kliment Ohridski i Bulevar Partizanski Odredi")){
                System.out.println("Odete severozapadno na 50ta Divizija kon Majka Tereza");
                System.out.println("Svrtete nadesno na Majka Tereza");
                System.out.println("Upatete se pravo na Bulevar Sveti Kliment Ohridski");
                System.out.println("Svrtete nalevo na Bulevar Partizanski Odredi");
            }
        }
        if(dom.getIme().equals("Stiv Naumov") && ime.equals("Dzovani")){
            if(getNasoka().equals("Bulevar Nikola Karev i Bulevar 8mi Septemvri")){
                System.out.println("Odete od Arhimedova do Bulevar Nikola Karev");
                System.out.println("Potoa odete od Bulevar Nikola Karev do Bulevar 8mi Septemvri");
                System.out.println("Odete od Bulevar 8mi Septemvri do Dzovani");
            }
            else if(getNasoka().equals("Bulevar Nikola Karev i Bulevar Partizanski Odredi")){
                System.out.println("Odete od Arhimedova do Bulevar Nikola Karev");
                System.out.println("Odete po Bulevar Nikola Karev,Lazar Licenoski,Bulevar Partizanski Odredi");
                System.out.println("Odete do Dzovani");
            }
            else if(getNasoka().equals("Sveti Kiril I Metodij")){
                System.out.println("Upatete se na Arhimedova do 16ta Makedonska Brigada");
                System.out.println("Odete po Bulevar Aleksandar Makedonski,Bulevar Goce Delcev,Bulevar Koco Racin,Sveti Kiril I Metodij,Mitropolit Teodosij Gologanov");
                System.out.println("Odete do Dzovani");
            }
        }
    }
    /*****************************************************************************************************************/
    public void postaviPreporaka(String [] preporaki){
        if(getZadovolstvoNaMusterii()==1 || getZadovolstvoNaMusterii()==2){
            setPreporaki(preporaki);
        }
    }
    public void CVNaStudentot(StudentiKoiTrebaDaSeNavigiraat student){
        student.getImePrezime();
        if(student.getGodini()>=18){
            for(int brojac=0;brojac<3;brojac++){
                student.getReferenci(brojac);
                student.getVestini(brojac);
                student.getIstorijaNaVrabotuvanje(brojac);
            }
        }
    }
    public int rangijrajKvalitetNaMuzika(String [] muzika){
        int kvalitetNaMuzika=0;
        for(int brojac=0;brojac<muzika.length;brojac++){
            switch(muzika[brojac]){
                case "Modern Folk": kvalitetNaMuzika+=2; break;
                case "Alternative Rock": kvalitetNaMuzika+=2; break;
                case "Electronica": kvalitetNaMuzika+=2; break;
                case "Chillwave": kvalitetNaMuzika+=2; break;
                case "Classical": kvalitetNaMuzika+=2; break;
                case "Classic Rock": kvalitetNaMuzika+=2; break;
                case "Jazz": kvalitetNaMuzika+=2; break;
            }
        }
        return kvalitetNaMuzika;
    }
    public void seatingArea(int [][] raspored){
        Scanner skener=new Scanner(System.in);
        int [][] orientacija=new int[1][1];
        int [][] vleznaTocka=new int[1][1];
        int [][] koordinati=new int[1][1];
        for(int brojac=0;brojac<getDolzinaNaKafic();brojac++){
            for(int novBrojac=0;novBrojac<getSirinaNaKafic();novBrojac++){
                raspored[brojac][novBrojac]=skener.nextInt();
            }
        }
        for(int brojac=0;brojac<1;brojac++){
            for(int novBrojac=0;novBrojac<1;novBrojac++){
                orientacija[brojac][novBrojac]=skener.nextInt();
            }
        }
        for(int brojac=0;brojac<1;brojac++){
            for(int novBrojac=0;novBrojac<1;novBrojac++){
                vleznaTocka[brojac][novBrojac]=skener.nextInt();
            }
        }
        for(int brojac=0;brojac<1;brojac++){
            for(int novBrojac=0;novBrojac<1;novBrojac++){
                koordinati[brojac][novBrojac]=vleznaTocka[brojac][novBrojac]-orientacija[brojac][novBrojac];
                System.out.print(koordinati[brojac][novBrojac]);
            }
        }
    }
    public int rezervacijaNaMesto(String [] imeNaKafic,int kapar,int brojNaLugje){
        Scanner skener=new Scanner(System.in);
        String ime=skener.nextLine();
        String [] beverages=new String[brojNaLugje];
        int vkupnaCena=0;
        for(int brojac=0;brojac<imeNaKafic.length;brojac++){
            if(ime.equals(imeNaKafic[brojac])){
                brojNaLugje=skener.nextInt();
            }
        }
        for(int brojac=0;brojac<brojNaLugje;brojac++){
            beverages[brojac]=skener.nextLine();
            kvalitetNaMeni(beverages);
            if(beverages[brojac].equals(kvalitetNaMeni(beverages))){
                vkupnaCena+=130;
            }
            else if(!beverages[brojac].equals(kvalitetNaMeni(beverages))){
                vkupnaCena+=70;
            }
        }
        return vkupnaCena;
    }

}
