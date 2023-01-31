public class StudentiKoiTrebaDaSeNavigiraat implements Filter {
    private String imeprezime;
    private int godini;
    private int indeks;
    private int brojNaClenskaOdBiblioteka;
    private int brojNaKreditnaKarticka;
    private int IPadresa;
    private int telefonskiBroj;
    private Fakulteti faks;
    private StudentskiDomovi dom;
    private String nasoki;
    private String lozinka;
    private String lokacija;
    private int [] proseciOdSrednoObrazovanie;
    private String [] referenci;
    private int godinaNaStudii;
    private String extraCurricularActivity;
    private boolean daliStudentotZapishalTrud;
    private String [] vestini;
    private String [] istorijaNaVrabotuvanje;
    public StudentiKoiTrebaDaSeNavigiraat(String imeprezime,int godini,int indeks,int brojNaClenskaOdBiblioteka,int brojNaKreditnaKarticka,int IPadresa,int telefonskiBroj,Fakulteti faks,StudentskiDomovi dom,String nasoki,String lozinka,String lokacija,int [] proseciOdSrednoObrazovanie,String [] referenci,int godinaNaStudii,String extraCurricularActivity,boolean daliStudentotZapishalTrud,String [] vestini,String [] istorijaNaVrabotuvanje){
        this.imeprezime=imeprezime;
        this.godini=godini;
        this.indeks=indeks;
        this.brojNaClenskaOdBiblioteka=brojNaClenskaOdBiblioteka;
        this.brojNaKreditnaKarticka=brojNaKreditnaKarticka;
        this.IPadresa=IPadresa;
        this.telefonskiBroj=telefonskiBroj;
        this.faks=faks;
        this.dom=dom;
        this.lozinka=lozinka;
        this.lokacija=lokacija;
        for(int brojac=0;brojac<4;brojac++){
            this.proseciOdSrednoObrazovanie[brojac]=proseciOdSrednoObrazovanie[brojac];
        }
        for(int brojac=0;brojac<referenci.length;brojac++){
            this.referenci[brojac]=referenci[brojac];
        }
        this.nasoki=nasoki;
        this.godinaNaStudii=godinaNaStudii;
        this.extraCurricularActivity=extraCurricularActivity;
        this.daliStudentotZapishalTrud=daliStudentotZapishalTrud;
        for(int brojac=0;brojac<vestini.length;brojac++){
            this.vestini[brojac]=vestini[brojac];
        }
        for(int brojac=0;brojac<istorijaNaVrabotuvanje.length;brojac++){
            this.istorijaNaVrabotuvanje[brojac]=istorijaNaVrabotuvanje[brojac];
        }
    }
    public void setVestini(String [] v){
        for(int brojac=0;brojac<vestini.length;brojac++){
            this.vestini[brojac]=v[brojac];
        }
    }
    public String getVestini(int brojac){
        return vestini[brojac];
    }
    public void setIstorijaNaVrabotuvanje(String [] inv){
        for(int brojac=0;brojac<istorijaNaVrabotuvanje.length;brojac++){
            this.istorijaNaVrabotuvanje[brojac]=inv[brojac];
        }
    }
    public String getIstorijaNaVrabotuvanje(int brojac){
        return istorijaNaVrabotuvanje[brojac];
    }
    public void setDaliStudentotZapishalTrud(boolean trud){
        daliStudentotZapishalTrud=trud;
    }
    public boolean getDaliStudentotZapishalTrud(){
        return daliStudentotZapishalTrud;
    }
    public void setExtraCurricularActivity(String aktivnosti){
        extraCurricularActivity.equals(aktivnosti);
    }
    public String getExtraCurricularActivity(){
        return extraCurricularActivity;
    }
    public void setGodinaNaStudii(int godina){
        this.godinaNaStudii=godinaNaStudii;
    }
    public int getGodinaNaStudii(){
        return godinaNaStudii;
    }
    public void setReferenci(String [] r){
        for(int brojac=0;brojac<referenci.length;brojac++){
            this.referenci[brojac]=r[brojac];
        }
    }
    public String getReferenci(int indeks){
        return referenci[indeks];
    }
    public void setProseciOdSrednoObrazovanie(int [] proseci){
        for(int brojac=0;brojac<4;brojac++){
            this.proseciOdSrednoObrazovanie[brojac]=proseci[brojac];
        }
    }
    public int getProseciOdSrednoObrazovanie(int indeks){
        return proseciOdSrednoObrazovanie[indeks];
    }
    public void setLokacija(String l){
        this.lokacija=l;
    }
    public String getLokacija(){
        return lokacija;
    }
    public void setLozinka(String l){
        this.lozinka=l;
    }
    public String getLozinka(){
        return lozinka;
    }
    public void setNasoki(String n){
        this.nasoki=n;
    }
    public String getNasoki(){
        return nasoki;
    }
    public void setStudentskiDomovi(StudentskiDomovi d){
        this.dom=d;
    }
    public StudentskiDomovi getStudentskiDomovi(){
        return dom;
    }
    public void setImePrezime(String imeprez){
        this.imeprezime=imeprez;
    }
    public String getImePrezime(){
        return imeprezime;
    }
    public void setGodini(int g){
        this.godini=g;
    }
    public int getGodini(){
        return godini;
    }
    public void setIndeks(int i){
        this.indeks=i;
    }
    public int getIndeks(){
        return indeks;
    }
    public void setBrojNaClenskaOdBiblioteka(int broj){
        this.brojNaClenskaOdBiblioteka=broj;
    }
    public int getBrojNaClenskaOdBiblioteka(){
        return brojNaClenskaOdBiblioteka;
    }
    public void setBrojNaKreditnaKarticka(int broj){
        this.brojNaKreditnaKarticka=broj;
    }
    public int getBrojNaKreditnaKarticka(){
        return brojNaKreditnaKarticka;
    }
    public void setIPadresa(int ip){
        this.IPadresa=ip;
    }
    public int getIPadresa(){
        return IPadresa;
    }
    public void setTelefonskiBroj(int broj){
        this.telefonskiBroj=broj;
    }
    public int getTelefonskiBroj(){
        return telefonskiBroj;
    }
    public void setFaks(Fakulteti f){
        this.faks=f;
    }
    public Fakulteti getFaks(){
        return faks;
    }
    public void izvrshuvaj(StudentskiDomovi dom,Fakulteti faks){
        if(dom.getIme().equals("Goce Delcev")){
            if(faks.getIme().equals("FINKI") || faks.getIme().equals("FEIT") || faks.getIme().equals("MFS") || faks.getIme().equals("TMF")){
                if(getNasoki().equals("Bulevar Partizanski Odredi") || getNasoki().equals("Bulevar Ilinden")){
                    System.out.println("Severno na Moskovska kon Budimpestanska");
                    System.out.println("Nadesno na Bulevar Partizanski Odredi");
                    System.out.println("Nalevo na Bulevar 8-mi Septemvri");
                    System.out.println("Nadesno na Branislav Nusic");
                    System.out.println("Nadesno na Veselin Maslesha");
                    System.out.println("Nalevo na Nikola Tesla");
                    System.out.println("Nalevo na 1vata raskrsnica na Ruger Boskovic");
                }
                else if(getNasoki().equals("Mitropolit Teodosij Gologanov i Bulevar 8-mi Septemvri")){
                    System.out.println("Sledete Mitropolit Teodosij Gologanov i Bulevar 8-mi Septemvri do Branislav Nusic");
                    System.out.println("Odete po Veselin Maslesha do Nikola Tesla");
                    System.out.println("Svrtete nalevo na Nikola Tesla");
                    System.out.println("Nalevo na 1vata raskrsnica na Ruger Boskovic");
                }
            }
        }
        else if(dom.getIme().equals("Studentski Centar Skopje")){
            if(faks.getIme().equals("FINKI") || faks.getIme().equals("FEIT") || faks.getIme().equals("MFS") || faks.getIme().equals("TMF")){
                if(getNasoki().equals("Mitropolit Teodosij Gologanov i Franklin Ruzvelt")){
                    System.out.println("Zapadno na Mitropolit Teodosij Gologanov kon Bulevar Mitropolit Teodosij Gologanov");
                    System.out.println("Na Kruzniot tek,Odete na 2ot izlez i ostanete na Mitropolit Teodosij Gologanov");
                    System.out.println("Svrtete nadesno na Franklin Ruzvelt");
                    System.out.println("Svrtete nalevo na Bulevar Partizanski Odredi");
                    System.out.println("Blago svrtete nadesno na Nikola Tesla");
                    System.out.println("Svrtete nalevo na Rugjer Boskovic");
                }
                else{
                    System.out.println("Nema drug pat");
                }
            }
        }
        else if(dom.getIme().equals("Pance Karagozov")){
            if(faks.getIme().equals("FINKI") || faks.getIme().equals("FEIT") || faks.getIme().equals("MFS") || faks.getIme().equals("TMF")){
                if(getNasoki().equals("Mitropolit Teodosij Gologanov i Franklin Ruzvelt")){
                    System.out.println("Zapadno na Ulica Kosta Shahov kon Kosta Shahov");
                    System.out.println("Nadesno na Mitropolit Teodosij Gologanov");
                    System.out.println("Na Kruzniot tek,Odete na 2ot izlez i ostanete na Mitropolit Teodosij Gologanov");
                    System.out.println("Svrtete nadesno na Franklin Ruzvelt");
                    System.out.println("Svrtete nalevo na Bulevar Partizanski Odredi");
                    System.out.println("Blago svrtete nadesno na Nikola Tesla");
                    System.out.println("Svrtete nalevo na Rugjer Boskovic");
                }
                else if(getNasoki().equals("Bulevar Ilinden")){
                    System.out.println("Odete po Kosta Kirkov i Leninova do Bulevar Partizanski Odredi");
                    System.out.println("Odete po Bulevar Ilinden do Rugjer Boskovic");
                    System.out.println("Svrtete nadesno na Ruger Boskovic");
                }
            }
        }
        else if(dom.getIme().equals("Stiv Naumov")){
            if(faks.getIme().equals("FINKI") || faks.getIme().equals("FEIT") || faks.getIme().equals("MFS") || faks.getIme().equals("TMF")){
                if(getNasoki().equals("Bulevar Nikola Karev")){
                    System.out.println("Odete po Arhimedova do Bulevar Nikola Karev");
                    System.out.println("Sledete go bulevarot se do bulevar 8mi Septemvri");
                    System.out.println("Prodolzete do Rugjer Boskovic");
                }
                else if(getNasoki().equals("Bulevar Ilinden")){
                    System.out.println("Odete po Arhimedova do Bulevar Nikola Karev");
                    System.out.println("Odete po Bulevar Goce Delcev i Bulevar Ilinden do Rugjer Boskovic");
                    System.out.println("Svrtete nadesno na Ruger Boskovic");
                }
                else if(getNasoki().equals("Bulevar Partizanski Odredi")){
                    System.out.println("Odete po Arhimedova do Bulevar Nikola Karev");
                    System.out.println("Odete po Bulevar Krste Petkov Misirkov pa Bulevar Goce Delcev i Bulevar Partizanski Odredi");
                    System.out.println("Svrtete nalevo na Ruger Boskovic");
                }
            }
        }
        else if(dom.getIme().equals("Zdravko Cvetkovski")){
            if(faks.getIme().equals("FINKI") || faks.getIme().equals("FEIT") || faks.getIme().equals("MFS") || faks.getIme().equals("TMF")){
                if(getNasoki().equals("Bulevar Partizanski Odredi i Nikola Tesla")){
                    System.out.println("Istocno na Drezdenska kon Franklin Ruzvelt");
                    System.out.println("Svrtete nalevo na Franklin Ruzvelt");
                    System.out.println("Svrtete nalevo na Bulevar Partizanski Odredi");
                    System.out.println("Svrtete nadesno na Nikola Tesla");
                    System.out.println("Svrtete nadesno na Ruger Boskovic");
                }
            }
        }
    }
    @Override
    public Object izvrshuvaj(Object vnes) {
        return null;
    }
    @Override
    public Object izvrshuvajStudentskiDomKafic(Object vnes) {
        return null;
    }
    @Override
    public Object izvrshuvajFakultetKopirnica(Object vnes) {
        return null;
    }
    @Override
    public Object izvrshuvajFakultetBiblioteki(Object vnes) {
        return null;
    }
}