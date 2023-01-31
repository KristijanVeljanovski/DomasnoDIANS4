public class Knizarnici {
    private String adresa;
    private String mesto;
    private int oddalecenost;
    private String dejnosti;
    private int rabotnoVreme;
    private String ime;
    private String [] pobaraniMaterijaliOdKnizarnicata;
    private int brojNaMaterijaliVoKnizarnicata;
    private int cenaZaMaterijali;
    private int goleminaNaMaterijali;
    private String tematika;
    private String lokacija;
    private String pateka;
    private String jazik;
    private String binderType;
    private int brojNaMaterijali;
    public Knizarnici(String adresa,String mesto,int oddalecenost,String dejnosti,int rabotnoVreme,String ime,String [] pobaraniMaterijaliOdKnizarnicata,int brojNaMaterijaliVoKnizarnicata,int cenaZaMaterijali,int goleminaNaMaterijali,String tematika,String lokacija,String pateka,String jazik,String binderType,int brojNaMaterijali){
        this.adresa=adresa;
        this.mesto=mesto;
        this.oddalecenost=oddalecenost;
        this.dejnosti=dejnosti;
        this.rabotnoVreme=rabotnoVreme;
        this.ime=ime;
        for(int brojac=0;brojac<pobaraniMaterijaliOdKnizarnicata.length;brojac++){
            this.pobaraniMaterijaliOdKnizarnicata[brojac]=pobaraniMaterijaliOdKnizarnicata[brojac];
        }
        this.brojNaMaterijaliVoKnizarnicata=brojNaMaterijaliVoKnizarnicata;
        this.cenaZaMaterijali=cenaZaMaterijali;
        this.goleminaNaMaterijali=goleminaNaMaterijali;
        this.tematika=tematika;
        this.lokacija=lokacija;
        this.pateka=pateka;
        this.jazik=jazik;
        this.binderType=binderType;
        this.brojNaMaterijali=brojNaMaterijali;
    }
    public void setBrojNaMaterijali(int broj){
        this.brojNaMaterijali=broj;
    }
    public int getBrojNaMaterijali(){
        return brojNaMaterijali;
    }
    public void setBinderType(String bt){
        this.binderType=bt;
    }
    public String getBinderType(){
        return binderType;
    }
    public void setJazik(String j){
        this.jazik=j;
    }
    public String getJazik(){
        return jazik;
    }
    public void setPateka(String p){
        this.pateka=p;
    }
    public String getPateka(){
        return pateka;
    }
    public void setLokacija(String l){
        this.lokacija=l;
    }
    public String getLokacija(){
        return lokacija;
    }
    public void setTematika(String t){
        this.tematika=t;
    }
    public String getTematika(){
        return tematika;
    }
    public void setGoleminaNaMaterijali(int golemina){
        this.goleminaNaMaterijali=golemina;
    }
    public int getGoleminaNaMaterijali(){
        return goleminaNaMaterijali;
    }
    public int alteracijaNaCenite(int cena,int goleminaNaMaterijali){
        if(goleminaNaMaterijali>=100 && goleminaNaMaterijali<=400){
            cenaZaMaterijali=250;
        }
        else if(goleminaNaMaterijali>=500 && goleminaNaMaterijali<=1000){
            cenaZaMaterijali=500;
        }
        else if(goleminaNaMaterijali>=1100 && goleminaNaMaterijali<=1500){
            cenaZaMaterijali=1000;
        }
        return cenaZaMaterijali;
    }
    public void setCenaZaMaterijali(int cena){
        this.cenaZaMaterijali=cena;
    }
    public int getCenaZaMaterijali(){
        return cenaZaMaterijali;
    }
    public int presmetajCenaZaMaterijalite(String [] materijali){
        int suma=0;
        for(int brojac=0;brojac<materijali.length;brojac++){
            suma+=getCenaZaMaterijali();
        }
        return suma;
    }
    public void setBrojNaMaterijaliVoKnizarnicata(int broj){
        this.brojNaMaterijaliVoKnizarnicata=broj;
    }
    public int getBrojNaMaterijaliVoKnizarnicata(){
        return brojNaMaterijaliVoKnizarnicata;
    }
    public void setPobaraniMaterijaliOdKnizarnicata(String [] materijali){
        for(int brojac=0;brojac<pobaraniMaterijaliOdKnizarnicata.length;brojac++){
            this.pobaraniMaterijaliOdKnizarnicata[brojac]=materijali[brojac];
        }
    }
    public String getPobaraniMaterijaliOdKnizarnicata(int brojac){
        return pobaraniMaterijaliOdKnizarnicata[brojac];
    }
    public int brojNaZemeniMaterijaliOdKnizarnicata(String [] materijali){
        int brojka=0;
        for(int brojac=0;brojac<materijali.length;brojac++){
            getPobaraniMaterijaliOdKnizarnicata(brojac);
            brojka++;
        }
        return getBrojNaMaterijaliVoKnizarnicata()-brojka;
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
    public void setRabotnoVreme(int vreme){
        this.rabotnoVreme=vreme;
    }
    public int getRabotnoVreme(){
        return rabotnoVreme;
    }
    public void setIme(String i){
        this.ime=i;
    }
    public String getIme(){
        return ime;
    }
    /*************************************************************************************************************************/
    public void fiskalnaSmetka(int maks,int vrednost){
        boolean validnaGolemina=false;
        boolean validnaCena=false;
        String [] materijali=new String[getBrojNaMaterijali()];
        if(getGoleminaNaMaterijali()>0 && getGoleminaNaMaterijali()<maks){
            validnaGolemina=true;
        }
        if(presmetajCenaZaMaterijalite(materijali)>0 && presmetajCenaZaMaterijalite(materijali)<=vrednost){
            validnaCena=true;
        }
        if(validnaGolemina==true && validnaCena==true){
            getGoleminaNaMaterijali();
            presmetajCenaZaMaterijalite(materijali);
            getLokacija();
        }
    }
    public void patekaOdFakultetDoKnizarnica(String imeFaks,String imePecatnica){
        if((imeFaks.equals("FINKI") || imeFaks.equals("FEIT") || imeFaks.equals("TMF") || imeFaks.equals("MFS")) && imePecatnica.equals("Ekvus")){
            if(getPateka().equals("Rugjer Boskovic i Shekspirova")){
                System.out.println("Svrtete zapadno na Rugjer Boskovic i odete do Shekspirova");
                System.out.println("Svrtete nalevo na Shekspirova");
                System.out.println("Odete nalevo na prvata raskrsnica na Veselin Maslesha");
            }
        }
        if((imeFaks.equals("FINKI") || imeFaks.equals("FEIT") || imeFaks.equals("TMF") || imeFaks.equals("MFS")) && imePecatnica.equals("Sterna")){
            if(getPateka().equals("Rugjer Boskovic i Shekspirova")){
                System.out.println("Svrtete zapadno na Rugjer Boskovic i odete do Shekspirova");
                System.out.println("Svrtete nalevo na Shekspirova");
            }
        }
        if((imeFaks.equals("FINKI") || imeFaks.equals("FEIT") || imeFaks.equals("TMF") || imeFaks.equals("MFS")) && imePecatnica.equals("Impegna")){
            if(getPateka().equals("Bulevar Partizanski Odredi")){
                System.out.println("Odete zapadno na Rugjer Boskovic nakaj Shekspirova");
                System.out.println("Svrtete nalevo na Shekspirova");
                System.out.println("Svrtete nadesno na Bulevar Partizanski Odredi");
                System.out.println("Svrtete nalevo na Bulevar 8mi Septemvri");
                System.out.println("Odete nalevo na prvata raskrsnica na Bulevar Partizanski Odredi");
                System.out.println("Svrtete nadesno na Franklin Ruzvelt");
            }
            else if(getPateka().equals("Franklin Ruzvelt")){
                System.out.println("Odete do Nikola Tesla");
                System.out.println("Svrtete nadesno na prvata raskrsnica na Nikola Tesla");
                System.out.println("Po Branislav Nusikj i Daskal Kama odete nakaj Franklin Ruzvelt");
                System.out.println("Svrteete nadesno na Franklin Ruzvelt");
            }
            else if(getPateka().equals("Orce Nikolov i Franklin Ruzvelt")){
                System.out.println("Odete zapadno na Rugjer Boskovic");
                System.out.println("Svrtete nadesno");
                System.out.println("Odete nadesno na Nikola Tesla");
                System.out.println("Svrtete nalevo na prvata raskrsnica na Nikola Tesla");
                System.out.println("Odete nadesno na Orce Nikolov");
                System.out.println("Svrtete nadesno na Franklin Ruzvelt");
            }
        }
        if((imeFaks.equals("FINKI") || imeFaks.equals("FEIT") || imeFaks.equals("TMF") || imeFaks.equals("MFS")) && imePecatnica.equals("Libro")){
            if(getPateka().equals("Bulevar Nikola Karev")){
                System.out.println("Odete zapadno na Rugjer Boskovic kon Shekspirova");
                System.out.println("Svrtete nadesno na Branislav Nusic");
                System.out.println("Svrtete nadesno na Bulevar 8mi Septemvri");
                System.out.println("Oddete nadesno na Bulevar Nikola Karev");
                System.out.println("Upatete se na izlezot na Belasica");
                System.out.println("Na kruzniot tek,odete na prviot izlez na Belasica");
                System.out.println("Svrtete se nadesno na Bulevar Goce Delcev");
            }
            else if(getPateka().equals("Bulevar Ilinden")){
                System.out.println("Odete do Nikola Tesla");
                System.out.println("Po Bulevar Ilinden i Bulevar Goce Delcev upatete se na Kej Dimitar Vlahov");
                System.out.println("Od Kej Dimitar Vlahov odete na Bulevar Goce Delcev");
            }
            else if(getPateka().equals("Bulevar Ilinden i Bulevar Nikola Karev")){
                System.out.println("Odete do Nikola Tesla");
                System.out.println("Odete po Bulevar Ilinden,Samoilova,Bulevar Nikola Karev do Bulevar Goce Delcev");
            }
        }
    }
    public int presmetajCenaZaPrevod(String jazikZaPrevod,String [] materijali){
        if(jazikZaPrevod.equals(getJazik())){
            setPobaraniMaterijaliOdKnizarnicata(materijali);
            switch(jazikZaPrevod){
                case "English": return presmetajCenaZaMaterijalite(materijali)*2; break;
                case "Mandarin Chinese": return presmetajCenaZaMaterijalite(materijali)*2; break;
                case "Hindi": return presmetajCenaZaMaterijalite(materijali)*2; break;
                case "Spanish": return presmetajCenaZaMaterijalite(materijali)*2; break;
                case "French": return presmetajCenaZaMaterijalite(materijali)*2; break;
                case "Arabic": return presmetajCenaZaMaterijalite(materijali)*2; break;
                case "Bengali": return presmetajCenaZaMaterijalite(materijali)*2; break;
                case "Russian": return presmetajCenaZaMaterijalite(materijali)*2; break;
                case "Portuguese": return presmetajCenaZaMaterijalite(materijali)*2; break;
                case "Indonesian": return presmetajCenaZaMaterijalite(materijali)*2; break;
                case "Urdu": return presmetajCenaZaMaterijalite(materijali)*2; break;
                case "Japanese": return presmetajCenaZaMaterijalite(materijali)*2; break;
                case "German": return presmetajCenaZaMaterijalite(materijali)*2; break;
                case "Punjabi": return presmetajCenaZaMaterijalite(materijali)*2; break;
                case "Javanese": return presmetajCenaZaMaterijalite(materijali)*2; break;
                case "Wu Chinese": return presmetajCenaZaMaterijalite(materijali)*2; break;
                case "Telugu": return presmetajCenaZaMaterijalite(materijali)*2; break;
                case "Turkish": return presmetajCenaZaMaterijalite(materijali)*2; break;
                case "Korean": return presmetajCenaZaMaterijalite(materijali)*2; break;
                case "Marathi": return presmetajCenaZaMaterijalite(materijali)*2; break;
            }
        }
        return presmetajCenaZaMaterijalite(materijali)*2;
    }
    public int presmetajCenaZaUkoricuvanje(String binder,String [] materijali){
        if(binder.equals(getBinderType())){
            setPobaraniMaterijaliOdKnizarnicata(materijali);
            switch(binder){
                case "Spiral binding": return presmetajCenaZaMaterijalite(materijali)*2; break;
                case "Stapled binder": return presmetajCenaZaMaterijalite(materijali)*2; break;
                case "Prestige binder": return presmetajCenaZaMaterijalite(materijali)*2; break;
                case "Book-style glue binder": return presmetajCenaZaMaterijalite(materijali)*2; break;
                case "Saddle-stitched": return presmetajCenaZaMaterijalite(materijali)*2; break;
                case "Perfect bound": return presmetajCenaZaMaterijalite(materijali)*2; break;
                case "Case bound": return presmetajCenaZaMaterijalite(materijali)*2; break;
                case "Wiro bound": return presmetajCenaZaMaterijalite(materijali)*2; break;
                case "Plastic comb bound": return presmetajCenaZaMaterijalite(materijali)*2; break;
            }
        }
        return presmetajCenaZaMaterijalite(materijali)*2;
    }
}