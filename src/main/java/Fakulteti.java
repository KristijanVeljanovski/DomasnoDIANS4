public class Fakulteti {
    private String ime;
    private String adresa;
    private String mesto;
    private float oddalecenost;
    private int rabotnoVreme;
    private String dejnosti;
    private String [] smerovi;
    private int [] indeksi;
    private float [] proseci;
    private boolean nagradeniStudenti;
    private boolean daliPolozil;
    private String [] predmeti;
    private int brojNaVlez;
    private int brojNaSprat;
    private StudentskiDomovi dom;
    private StudentiKoiTrebaDaSeNavigiraat student;
    private String firmaZaPraksa;
    private String nasokiDoPraksa;
    private String [] kursevi;
    private int proverkiOdProfesori;
    private String predmetce;
    private int kabinet;
    public Fakulteti(String ime,String adresa,String mesto,float oddalecenost,int rabotnoVreme,String dejnosti,String [] smerovi,int [] indeksi,float [] proseci,boolean nagradeniStudenti,boolean daliPolozil,int brojNaVlez,int brojNaSprat,StudentskiDomovi dom,StudentiKoiTrebaDaSeNavigiraat student,String firmaZaPraksa,String nasokiDoPraksa,String [] kursevi,int proverkiOdProfesori,String predmetce,int kabinet){
        this.ime=ime;
        this.adresa=adresa;
        this.mesto=mesto;
        this.oddalecenost=oddalecenost;
        this.rabotnoVreme=rabotnoVreme;
        this.dejnosti=dejnosti;
        for(int brojac=0;brojac<smerovi.length;brojac++){
            this.smerovi[brojac]=smerovi[brojac];
        }
        for(int brojac=0;brojac<indeksi.length;brojac++){
            this.indeksi[brojac]=indeksi[brojac];
        }
        for(int brojac=0;brojac<proseci.length;brojac++){
            this.proseci[brojac]=proseci[brojac];
        }
        this.nagradeniStudenti=nagradeniStudenti;
        this.daliPolozil=daliPolozil;
        for(int brojac=0;brojac<predmeti.length;brojac++){
            this.predmeti[brojac]=predmeti[brojac];
        }
        this.brojNaVlez=brojNaVlez;
        this.brojNaSprat=brojNaSprat;
        this.dom=dom;
        this.student=student;
        this.firmaZaPraksa=firmaZaPraksa;
        this.nasokiDoPraksa=nasokiDoPraksa;
        for(int brojac=0;brojac<kursevi.length;brojac++){
            this.kursevi[brojac]=kursevi[brojac];
        }
        this.proverkiOdProfesori=proverkiOdProfesori;
        this.predmetce=predmetce;
        this.kabinet=kabinet;
    }
    public void setKabinet(int k){
        this.kabinet=k;
    }
    public int getKabinet(){
        return kabinet;
    }
    public void setPredmetce(String p){
        this.predmetce=p;
    }
    public String getPredmetce(){
        return predmetce;
    }
    public void setProverkiOdProfesori(int pop){
        this.proverkiOdProfesori=pop;
    }
    public int getProverkiOdProfesori(){
        return proverkiOdProfesori;
    }
    public void setKursevi(String [] k){
        for(int brojac=0;brojac<kursevi.length;brojac++){
            this.kursevi[brojac]=k[brojac];
        }
    }
    public String getKursevi(int brojac){
        return kursevi[brojac];
    }
    public void setNasokiDoPraksa(String nasoki){
        nasokiDoPraksa.equals(nasoki);
    }
    public String getNasokiDoPraksa(){
        return nasokiDoPraksa;
    }
    public void setFirmaZaPraksa(String firma){
        firmaZaPraksa.equals(firma);
    }
    public String getFirmaZaPraksa(){
        return firmaZaPraksa;
    }
    public void setStudent(StudentiKoiTrebaDaSeNavigiraat s){
        this.student=s;
    }
    public StudentiKoiTrebaDaSeNavigiraat getStudent(){
        return student;
    }
    public void setDom(StudentskiDomovi d){
        this.dom=d;
    }
    public StudentskiDomovi getDom(){
        return dom;
    }
    public void setBrojNaSprat(int brojce){
        this.brojNaSprat=brojce;
    }
    public int getBrojNaSprat(){
        return brojNaSprat;
    }
    public void setBrNaVlez(int broj){
        this.brojNaVlez=broj;
    }
    public int getBrNaVlez(){
        return brojNaVlez;
    }
    public void setDaliPolozil(boolean polozil){
        this.daliPolozil=polozil;
    }
    public boolean getDaliPolozil(){
        return daliPolozil;
    }
    public void setPredmeti(String [] krediti){
        for(int brojac=0;brojac<predmeti.length;brojac++){
            this.predmeti[brojac]=krediti[brojac];
        }
    }
    public String getPredmeti(int brojac){
        return predmeti[brojac];
    }
    public int brojNaKreditiOsvoeniZaStudentot(String [] predmeti){
        int krediti=0;
        for(int brojac=0;brojac<predmeti.length;brojac++){
            if(getDaliPolozil()==true){
                krediti+=6;
            }
        }
        return krediti;
    }
    public void setNagradeniStudenti(boolean nagrada){
        this.nagradeniStudenti=nagrada;
    }
    public boolean getNagradeniStudenti(){
        return nagradeniStudenti;
    }
    public void printNagradeniStudenti(float [] indeksi,boolean nagradeniStudenti){
        nagradeniStudenti=false;
        for(int brojac=0;brojac<indeksi.length;brojac++){
            if(getProseci(brojac)>9.5){
                nagradeniStudenti=true;
                System.out.println(indeksi[brojac]);
            }
        }
    }
    public void setProseci(float [] p){
        for(int brojac=0;brojac<proseci.length;brojac++){
            this.proseci[brojac]=p[brojac];
        }
    }
    public float getProseci(int brojac){
        return proseci[brojac];
    }
    public float presmetajProseci(int [] ocenki){
        float sumaNaOcenki=0;
        for(int brojac=0;brojac<5;brojac++){
            sumaNaOcenki+=ocenki[brojac];
        }
        return sumaNaOcenki/5;
    }
    public void setIndeksi(int [] i){
        for(int brojac=0;brojac<indeksi.length;brojac++){
            this.indeksi[brojac]=i[brojac];
        }
    }
    public int getIndeksi(int brojac){
        return indeksi[brojac];
    }
    public void setSmerovi(String [] s){
        for(int brojac=0;brojac<smerovi.length;brojac++){
            this.smerovi[brojac]=s[brojac];
        }
    }
    public String getSmerovi(int brojac){
        return smerovi[brojac];
    }
    public void raspredelbaNaStudenti(String [] smerovi,int [] indeksi){
        for(int brojac=0;brojac<smerovi.length;brojac++){
            getSmerovi(brojac);
            for(int novBrojac=0;novBrojac<indeksi.length;novBrojac++){
                getIndeksi(novBrojac);
            }
        }
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
    public void setOddalecenost(float o){
        this.oddalecenost=o;
    }
    public float getOddalecenost(){
        return oddalecenost;
    }
    public void setRabotnoVreme(int vreme){
        this.rabotnoVreme=vreme;
    }
    public int getRabotnoVreme(){
        return rabotnoVreme;
    }
    public void setDejnosti(String d){
        this.dejnosti=d;
    }
    public String getDejnosti(){
        return dejnosti;
    }
    /***********************************************************************************************************/
    public int brojNaSprat(int broj){
        return (getBrojNaSprat()==-1 || getBrojNaSprat()==0 || getBrojNaSprat()==1 || getBrojNaSprat()==2)?1:0;
    }
    public void navigacijaNaSpratovite(int brojce,String kancelarija){
        if(brojNaSprat(brojce)==-1){
            if(kancelarija.equals("Lab2") || kancelarija.equals("Lab3")){
                System.out.println("Simnete se vo podrumot na TMF i svrtete nadesno");
            }
            else if(kancelarija.equals("Kabinet37") || kancelarija.equals("Kabinet36") || kancelarija.equals("Kabinet35") || kancelarija.equals("Kabinet34") || kancelarija.equals("Kabinet26A") || kancelarija.equals("Kabinet26")){
                System.out.println("Simnete se vo podrumot na TMF i svrtete nalevo");
            }
            else if(kancelarija.equals("Lab12") || kancelarija.equals("Lab13")){
                System.out.println("Simnete se vo podrumot na TMF,svrtete nalevo dvapati,odete na krajot na hodnikot");
            }
        }
        else if(brojNaSprat(brojce)==0){
            if(kancelarija.equals("AmfiteatarTMF")){
                System.out.println("Odete na krajot na vlezot na chelo,svrtete nadesno po skalickite");
            }
            else if(kancelarija.equals("Lab138")){
                System.out.println("Na samiot vlez svrtete nadesno,odete po hodnikot,pa svrtete na prvoto levo");
            }
            else if(kancelarija.equals("Kabinet122") || kancelarija.equals("Kabinet114") || kancelarija.equals("Kabinet115") || kancelarija.equals("Kabinet116")){
                System.out.println("Na samiot vlez svrtete nadesno,odete po hodnikot,pa svrtete na prvoto levo");
            }
            else if(kancelarija.equals("Baraka2.1") || kancelarija.equals("Baraka2.2") || kancelarija.equals("Baraka3.1") || kancelarija.equals("Baraka3.2") || kancelarija.equals("Baraka1")){
                System.out.println("Odete pozadi aneksot na FEIT,odete nachelo");
            }
        }
        else if(brojNaSprat(brojce)==1){
            if(kancelarija.equals("Lab200A") || kancelarija.equals("Lab200B")){
                System.out.println("Kacete se po skalickite na prviot sprat i svrtete nadesno");
            }
            else if(kancelarija.equals("Laab200V")){
                System.out.println("Kacete se po skalickite na prviot sprat i svrtete dvapati nadesno");
            }
            else if(kancelarija.equals("Predavalna203")){
                System.out.println("Kacete se po skalickite na prviot sprat,svrtete nadesno,pa svrtete nalevo");
            }
            else if(kancelarija.equals("Lab215") || kancelarija.equals("Predavalna216")){
                System.out.println("Kacete se po skalickite na prviot sprat,svrtete nalevo dvapati");
            }
            else if(kancelarija.equals("Kabinet222")){
                System.out.println("Kacete se po skalickite na prviot sprat,svrtete nalevo,pa svrtete nadesno");
            }
        }
        else if(brojNaSprat(brojce)==2){
            if(kancelarija.equals("Predavalna315")){
                System.out.println("Kacete se po skalickite na vtoriot sprat,svrtete nalevo dva pati");
            }
            else if(kancelarija.equals("Kabinet321") || kancelarija.equals("Kabinet322") || kancelarija.equals("Kabinet332")){
                System.out.println("Kacete se po skalickite na vtoriot sprat,svrtete nalevo,pa nadesno");
            }
            else if(kancelarija.equals("Predavalna302")){
                System.out.println("Kacete se po skalickite na vtoriot sprat,svrtete nadesno dva pati");
            }
        }
    }
    public void publishTimeTable(int cas,int minuti,String [] predmet){
        int brojNaObjektiVoCiklusot;
        for(int brojac=0;brojac<6;brojac++){
            if(cas>=8 && cas<=20){
                if(minuti==0 || minuti==45){
                    for(int novBrojac=0;novBrojac<2;novBrojac++){
                        if(predmet[brojac].equals(getPredmetce())){
                            getPredmetce();
                        }
                    }
                }
            }
        }
    }
    public void getNoviNasokiSporedVlezot(int brojNaVlez,String ime,String kancelarija){
        if(ime.equals("TMF")){
            if(brojNaSprat(getBrojNaSprat())){
                if(getBrojNaSprat()==-1){
                    if(getBrNaVlez()==1){
                        if(kancelarija.equals("Lab2") || kancelarija.equals("Lab3")){
                            System.out.println("Odete pravo po holot");
                            System.out.println("Svrtete na prvoto desno");
                        }
                        else if(kancelarija.equals("Kabinet37") || kancelarija.equals("Kabinet36") || kancelarija.equals("Kabinet35") || kancelarija.equals("Kabinet34") || kancelarija.equals("Kabinet26A") || kancelarija.equals("Kabinet26")){
                            System.out.println("Odete pravo po holot");
                            System.out.println("Svrtete na prvoto levo");
                        }
                        else if(kancelarija.equals("Lab12") || kancelarija.equals("Lab13")){
                            System.out.println("Ne mozete da stignete do ovie laboratorii preku ovoj vlez. Ve molime izberete drug");
                        }
                    }
                    if(getBrNaVlez()==2){
                        if(kancelarija.equals("Lab12") || kancelarija.equals("Lab13")){
                            System.out.println("Prodolzete pravo na hodnikot i odete do kraj");
                        }
                        else if(kancelarija.equals("Kabinet37") || kancelarija.equals("Kabinet36") || kancelarija.equals("Kabinet35") || kancelarija.equals("Kabinet34") || kancelarija.equals("Kabinet26A") || kancelarija.equals("Kabinet26")){
                            System.out.println("Svrtete na prvoto levo");
                            System.out.println("Prodolzete po hodnikot");
                        }
                        else if(kancelarija.equals("Lab2") || kancelarija.equals("Lab3")){
                            System.out.println("Svrtete na prvoto levo");
                            System.out.println("Prodolzete po hodnikot");
                            System.out.println("Svrtete na prvoto desno");
                        }
                    }
                    if(getBrNaVlez()==3){
                        if(kancelarija.equals("Lab12") || kancelarija.equals("Lab13")){
                            System.out.println("Svrtete na prvoto desno");
                            System.out.println("Prodolzete po hodnikot");
                            System.out.println("Svrtete na prvoto levo");
                        }
                        else if(kancelarija.equals("Kabinet37") || kancelarija.equals("Kabinet36") || kancelarija.equals("Kabinet35") || kancelarija.equals("Kabinet34") || kancelarija.equals("Kabinet26A") || kancelarija.equals("Kabinet26")){
                            System.out.println("Svrtete na prvoto desno");
                            System.out.println("Prodolzete po hodnikot");
                        }
                        else if(kancelarija.equals("Lab2") || kancelarija.equals("Lab3")){
                            System.out.println("Prodolzete po hodnikot i odete do kraj");
                        }
                    }
                }
                if(getBrojNaSprat()==0){
                    if(getBrNaVlez()==1){
                        if(kancelarija.equals("Lab138") || kancelarija.equals("AmfiteatarTMF")){
                            System.out.println("Prodolzete pravo na hodnikot do kraj");
                        }
                        else if(kancelarija.equals("Kabinet122")){
                            System.out.println("Svrtete na prvoto desno");
                            System.out.println("Prodolzete pravo na hodnikot");
                            System.out.println("Svrtete na prvoto levo");
                        }
                        else if(kancelarija.equals("114") || kancelarija.equals("115") || kancelarija.equals("116") || kancelarija.equals("KabinetX") || kancelarija.equals("117")){
                            System.out.println("Prodolzete po hodnikot do samiot kraj");
                            System.out.println("Svrtete na desno");
                            System.out.println("Prodolzete po hodnikot do samiot kraj");
                            System.out.println("Svrtete na levo");
                            System.out.println("Prodolzete po hodnikot do samiot kraj");
                        }
                    }
                    else if(getBrNaVlez()==2){
                        if(kancelarija.equals("Kabinet122")){
                            System.out.println("Prodolzete po hodnikot. Kabinetot e na samiot pocetok");
                        }
                        else if(kancelarija.equals("114") || kancelarija.equals("115") || kancelarija.equals("116") || kancelarija.equals("KabinetX") || kancelarija.equals("117")){
                            System.out.println("Prodolzete po hodnikot do samiot kraj");
                            System.out.println("Prodolzete po hodnikot i vlezete na drugiot");
                            System.out.println("Vlezete na vtoriot hodnik");
                            System.out.println("Prodolzete pravo po hodnikot");
                        }
                        else if(kancelarija.equals("Lab138") || kancelarija.equals("AmfiteatarTMF")){
                            System.out.println("Svrtete na prvoto levo");
                            System.out.println("Prodolzete po hodnikot");
                            System.out.println("Svrtete na prvoto desno");
                            System.out.println("Prodolzete po hodnikot");
                        }
                    }
                    else if(getBrNaVlez()==3){
                        if(kancelarija.equals("114") || kancelarija.equals("115") || kancelarija.equals("116") || kancelarija.equals("KabinetX") || kancelarija.equals("117")){
                            System.out.println("Prodolzete po hodnikot do samiot kraj");
                        }
                        else if(kancelarija.equals("122")){
                            System.out.println("Prodolzete po hodnikot do samiot kraj");
                            System.out.println("Prodolzete po hodnikot i vlezete na drugiot");
                            System.out.println("Vlezete na vtoriot hodnik");
                            System.out.println("Prodolzete pravo po hodnikot");
                        }
                        else if(kancelarija.equals("Lab138") || kancelarija.equals("AmfiteatarTMF")){
                            System.out.println("Prodolzete po hodnikot do samiot kraj");
                            System.out.println("Svrtete nadesno na sledniot hodnik");
                            System.out.println("Odete do samiot kraj");
                            System.out.println("Svrtete nalevo");
                            System.out.println("Kabinetite se na samiot vlez na hodnikot");
                        }
                    }
                }
                if(getBrojNaSprat()==1){
                    if(getBrNaVlez()==1){
                        if(kancelarija.equals("Lab200A") || kancelarija.equals("Lab200B")){
                            System.out.println("Otkako ke se kacite po skalite svrtete nadesno");
                            System.out.println("Laboratoriite se naogaat na celo pred vas");
                        }
                        else if(kancelarija.equals("Predavalna 203")){
                            System.out.println("Otkako ke se kacite po skalite svrtete nadesno");
                            System.out.println("Prodolzete po hodnikot do kraj");
                            System.out.println("Svrtete nadesno");
                        }
                        else if(kancelarija.equals("Lab200V")){
                            System.out.println("Otkako ke se kacite po skalite svrtete nadesno");
                            System.out.println("Prodolzete po hodnikot do kraj");
                            System.out.println("Svrtete nalevo");
                        }
                        else if(kancelarija.equals("Lab215") || kancelarija.equals("Predavalna216")){
                            System.out.println("Otkako ke se kacite po skalite svrtete nalevo");
                            System.out.println("Prodolzete po hodnikot do kraj");
                            System.out.println("Svrtete nalevo");
                            System.out.println("Prodolzete po hodnikot");
                        }
                        else if(kancelarija.equals("Kabinet222")){
                            System.out.println("Otkako ke se kacite po skalite svrtete nalevo");
                            System.out.println("Prodolzete po hodnikot do kraj");
                            System.out.println("Svrtete nadesno");
                            System.out.println("Prodolzete po hodnikot");
                        }
                    }
                    else if(getBrNaVlez()==2){
                        if(kancelarija.equals("Lab215") || kancelarija.equals("Predavalna216")){
                            System.out.println("Otkako ke se kacite po skalite svrtete nadesno");
                            System.out.println("Svrtete na prvot levo");
                            System.out.println("Prodolzete po hodnikot");
                        }
                        else if(kancelarija.equals("Kabinet222")){
                            System.out.println("Otkako ke se kacite po skalite svrtete nadesno");
                            System.out.println("Svrtete na prvoto levo");
                            System.out.println("Prodolzete po hodnikot do samiot kraj");
                            System.out.println("Koga ke izlezete od hodnikot prodolzete pravo");
                            System.out.println("Vlezete na sledniot hodnik");
                            System.out.println("Prodolzete po hodnikot");
                        }
                        else if(kancelarija.equals("Lab200A") || kancelarija.equals("Lab200B")){
                            System.out.println("Otkako ke se kacite po skalite svrtete nadesno");
                            System.out.println("Prodolzete po hodnikot");
                            System.out.println("Svrtete nalevo");
                            System.out.println("Prodolzete po hodnikot do samiot kraj");
                            System.out.println("Svrtete nadesno");
                            System.out.println("Laboratoriite se na vidik");
                        }
                        else if(kancelarija.equals("Predavalna203")){
                            System.out.println("Otkako ke se kacite po skalite svrtete nadesno");
                            System.out.println("Prodolzete po hodnikot");
                            System.out.println("Svrtete nalevo");
                            System.out.println("Prodolzete po hodnikot do samiot kraj");
                            System.out.println("Svrtete nadesno");
                            System.out.println("Prodolzete po hodnikot i odete do krajot");
                            System.out.println("Svrtete nadesno");
                        }
                        else if(kancelarija.equals("Lab200V")){
                            System.out.println("Otkako ke se kacite po skalite svrtete nadesno");
                            System.out.println("Prodolzete po hodnikot");
                            System.out.println("Svrtete nalevo");
                            System.out.println("Prodolzete po hodnikot do samiot kraj");
                            System.out.println("Svrtete nadesno");
                            System.out.println("Prodolzete po hodnikot i odete do krajot");
                            System.out.println("Svrtete nalevo");
                        }
                    }
                }
                if(getBrojNaSprat()==2){
                    if(getBrNaVlez()==1){
                        if(kancelarija.equals("Predavalna315")){
                            System.out.println("Otkako ke se kacite po skalite svrtete nalevo");
                            System.out.println("Odete do krajot na hodnikot");
                            System.out.println("Svrtete nalevo po hodnikot");
                        }
                        else if(kancelarija.equals("Kabinet 321") || kancelarija.equals("Kabinet 322") || kancelarija.equals("Kabinet 332")){
                            System.out.println("Otkako ke se kacite po skalite svrtete nalevo");
                            System.out.println("Odete do krajot na hodnikot");
                            System.out.println("Svrtete nadesno po hodnikot");
                            System.out.println("Prodolzete po hodnikot");
                        }
                        else if(kancelarija.equals("Predavalna302")){
                            System.out.println("Otkako ke se kacite po skalite svrtete nadesno");
                            System.out.println("Odete do krajot na hodnikot");
                            System.out.println("Svrtete nadesno na pocetokot na hodnikot");
                        }
                    }
                    else if(getBrNaVlez()==2){
                        if(kancelarija.equals("Predavalna315")){
                            System.out.println("Otkako ke se kacite po skalite prodolzete po hodnikot");
                        }
                        else if(kancelarija.equals("Predavalna302")){
                            System.out.println("Otkako ke se kacite po skalite svrtete nadesno");
                            System.out.println("Prodolzete po hodnikot do samiot kraj");
                            System.out.println("Svrtete nalevo na sledniot hodnik");
                            System.out.println("Predavalnata e na samiot pocetok na hodnikot");
                        }
                        else if(kancelarija.equals("Kabinet 321") || kancelarija.equals("Kabinet 322") || kancelarija.equals("Kabinet 332")){
                            System.out.println("Otkako ke se kacite po skalite prodolzete po hodnikot");
                            System.out.println("Odete do samiot kraj na hodnikot");
                            System.out.println("Izlezete na hodnikot sred spratot");
                            System.out.println("Vlezete vo hodnikot pred vas");
                            System.out.println("Prodolzete po hodnikot");
                        }
                    }
                    else if(getBrNaVlez()==3){
                        if(kancelarija.equals("Predavalna315")){
                            System.out.println("Otkako ke se kacite po skalite prodolzete po hodnikot");
                            System.out.println("Odete do samiot kraj na hodnikot");
                            System.out.println("Izlezete na hodnikot sred spratot");
                            System.out.println("Vlezete vo hodnikot pred vas");
                            System.out.println("Prodolzete po hodnikot");
                        }
                        else if(kancelarija.equals("Kabinet 321") || kancelarija.equals("Kabinet 322") || kancelarija.equals("Kabinet 332")){
                            System.out.println("Otkako ke se kacite po skalite prodolzete po hodnikot");
                        }
                        else if(kancelarija.equals("Predavalna302")){
                            System.out.println("Otkako ke se kacite po skalite prodolzete po hodnikot");
                            System.out.println("Odete do samiot kraj na hodnikot");
                            System.out.println("Svrtete nalevo na hodnikot");
                            System.out.println("Prodolzete po hodnikot");
                            System.out.println("Svrtete nadesno");
                            System.out.println("Predavalnata e na samiot pocetok na hodnikot");
                        }
                    }
                    else if(getBrNaVlez()==4){
                        if(kancelarija.equals("Predavalna302")){
                            System.out.println("Otkako ke se kacite po skalite prodolzete po hodnikot");
                            System.out.println("Odete do samiot kraj na hodnikot");
                            System.out.println("Izlezete na hodnikot sred spratot");
                            System.out.println("Vlezete vo hodnikot pred vas");
                            System.out.println("Prodolzete po hodnikot");
                            System.out.println("Predavalnata e na samiot pocetok na hodnikot");
                        }
                        else if(kancelarija.equals("Kabinet 321") || kancelarija.equals("Kabinet 322") || kancelarija.equals("Kabinet 332")){
                            System.out.println("Otkako ke se kacite po skalite svrtete nadesno");
                            System.out.println("Prodolzete po hodnikot");
                            System.out.println("Odete do krajot na hodnikot");
                            System.out.println("Svrtete nalevo");
                            System.out.println("Kabinetite se na hodnikot");
                        }
                        else if(kancelarija.equals("Predavalna315")){
                            System.out.println("Otkako ke se kacite po skalite svrtete nadesno");
                            System.out.println("Prodolzete po hodnikot");
                            System.out.println("Odete do krajot na hodnikot");
                            System.out.println("Svrtete nalevo");
                            System.out.println("Odete do samiot kraj na hodnikot");
                            System.out.println("Izlezete na hodnikot sred spratot");
                            System.out.println("Vlezete vo hodnikot pred vas");
                            System.out.println("Prodolzete po hodnikot");
                            System.out.println("Predavalnata e na samiot pocetok na hodnikot");
                        }
                    }
                }
            }
        }
    }
    public void proveriDaliNavigaciiteSeDostapni(StudentskiDomovi dom,StudentiKoiTrebaDaSeNavigiraat student,String kancelarija){
        String lokacijaNaFakultetot=getAdresa();
        if(!lokacijaNaFakultetot.equals(dom.getAdresa())){
            getNoviNasokiSporedVlezot(getBrNaVlez(),ime,kancelarija);
        }
    }
    /********************************************************************************************************************/
    public String daliStudentotTrebaDaOdiNaPraksa(StudentiKoiTrebaDaSeNavigiraat student,String firma){
        if(student.getGodinaNaStudii()>=2)
            student.setExtraCurricularActivity(firma);
        return "Vie ste prva godina. Nemate pravo na praksa";
    }
    public void getNasokiDoPraksaOdDom(){
        if(dom.equals("Goce Delcev") && firmaZaPraksa.equals("Axeltra")){
            if(getNasokiDoPraksa().equals("Moskovska")){
                System.out.println("Upatete se severno na Moskovska kon Budimpestanska");
                System.out.println("Svrtete nadesno na Bulevar Partizanski Odredi");
                System.out.println("Svrtete nalevo na Manapo");
                System.out.println("Svrtete nadesno na Nikola Rusinski");
                System.out.println("Svrtete nadesno");
                System.out.println("Svrtete nalevo");
                System.out.println("Firmata e na desnata strana");
            }
        }
        else if(dom.equals("Studentski Centar Skopje") && firmaZaPraksa.equals("BMG Universe")){
            if(getNasokiDoPraksa().equals("Bulevar Partizanski Odredi")){
                System.out.println("Upatete se istocno na Ul. Kosta Shahov kon Debarca");
                System.out.println("Ul. Kosta Shahov svrti nalevo kon Debarca");
                System.out.println("Svrtete nalevo na Borka Taleski");
                System.out.println("Svrtete nalevo na Leninova");
                System.out.println("Svrtete nalevo na Bulevar Partizanski Odredi");
                System.out.println("Odete preku peshackiot premin");
                System.out.println("Svrtete nadesno na Ljubljanska");
                System.out.println("Svrtete nadesno na Volgogradska");
            }
            else if(getNasokiDoPraksa().equals("Vladimir Polezanovski")){
                System.out.println("Upatete se istocno na Ul. Kosta Shahov kon Debarca");
                System.out.println("Ul. Kosta Shahov svrti nalevo kon Debarca");
                System.out.println("Svrtete nalevo na Borka Taleski");
                System.out.println("Svrtete nadesno na Leninova");
                System.out.println("Blago svrtete nalevo na Vladimir Polezanovski/Debarca");
                System.out.println("Prodolzete na Drezdenska");
                System.out.println("Prodolzete na Varsavska");
                System.out.println("Na kruzniot tek,odete na prviot izlez na Pariska");
                System.out.println("Svrtete nalevo na Bulevar Partizanski Odredi");
                System.out.println("Odete preku peshackiot premin");
                System.out.println("Svrtete nadesno na Ljubljanska");
                System.out.println("Svrtete nadesno na Volgogradska");
                System.out.println("Firmata e na desnata strana");
            }
            else if(getNasokiDoPraksa().equals("Mitropolit Teodosij Gologanov i Bulevar Partizanski Odredi")){
                System.out.println("Upatete se zapadno na Ul. Kosta Shahov");
                System.out.println("Svrtete nalevo za da ostanete na Ul. Kosta Shahov");
                System.out.println("Svrtete nadesno na Mitropolit Teodosij Gologanov");
                System.out.println("Pominete niz eden kruzen tek");
                System.out.println("Svrtete nadesno na Bulevar 8mi Septemvri");
                System.out.println("Svrtete nalevo na Bulevar Partizanski Odredi");
                System.out.println("Svrtete nadesno na Ljubljanska");
                System.out.println("Svrtete nadesno na Volgogradska");
                System.out.println("Firmata e na desnata strana");
            }
        }
        else if(dom.equals("Pance Karagjozov") && firmaZaPraksa.equals("CodeWell")){
            if(getNasokiDoPraksa().equals("Naroden Front")){
                System.out.println("Upatete se severozapadno na 50ta Divizija kon Majka Tereza");
                System.out.println("Svrtete nadesno na Majka Teraza");
                System.out.println("Naglo svrtete nalevo na Vasil Gjorgov");
                System.out.println("Blago svrtete nadesno na Naroden Front");
                System.out.println("Svrtete nalevo za da ostanete na Naroden Front");
                System.out.println("Svrtete nadesno za da ostanete na Naroden Front");
                System.out.println("Svrtete nalevo na Sv.Kiril i Metodij");
                System.out.println("Na kruzniot tek, odete na 2ot izlez na Kosturski Heroi");
                System.out.println("Svrtete nalevo na Vasil Stefanovski");
                System.out.println("Svrtete nadesno na Ul. Petar Pop Arsov");
                System.out.println("Svrtete nalevo na Dime Anicin");
                System.out.println("Firmata kje bide na levata strana");
            }
            else if(getNasokiDoPraksa().equals("Naroden Front i Mitropolit Teodosij Gologanov")){
                System.out.println("Upatete se severozapadno na 50ta Divizija kon Majka Tereza");
                System.out.println("Svrtete nadesno na Majka Teraza");
                System.out.println("Naglo svrtete nalevo na Vasil Gjorgov");
                System.out.println("Blago svrtete nadesno na Naroden Front");
                System.out.println("Svrtete nalevo za da ostanete na Naroden Front");
                System.out.println("Svrtete nadesno kon Mitropolit Teodosij Gologanov");
                System.out.println("Svrtete nalevo na Mitropolit Teodosij Gologanov");
                System.out.println("Svrtete nadesno na 9ti Maj");
                System.out.println("Svrtete nadesno na Dime Anicin");
                System.out.println("Firmata kje bide na desnata strana");
            }
            else if(getNasokiDoPraksa().equals("Vasil Gjorgov")){
                System.out.println("Upatete se severozapadno na 50ta Divizija kon Majka Tereza");
                System.out.println("Svrtete nadesno na Majka Teraza");
                System.out.println("Naglo svrtete nalevo na Vasil Gjorgov");
                System.out.println("Svrtete nadesno na Kozara");
                System.out.println("Svrtete nalevo na Mitropolit Teodosij Gologanov");
                System.out.println("Svrtete nadesno na 9ti Maj");
                System.out.println("Svrtete nadesno na Dime Anicin");
                System.out.println("Firmata kje bide na desnata strana");
            }
        }
        else if(dom.equals("Stiv Naumov") && firmaZaPraksa.equals("Digital Point")){
            if(getNasokiDoPraksa().equals("Arhimedova")){
                System.out.println("Upatete se zapadno kon Arhimedova");
                System.out.println("Blago svrtete nalevo na Arhimedova");
                System.out.println("Prodolzete na Petre Georgiev");
                System.out.println("Svrtete nalevo na Otokar Kershovani");
                System.out.println("Svrtete nalevo na Bulevar Krste Petkov Misirkov");
                System.out.println("Svrtete nadesno na Bulevar Goce Delcev");
                System.out.println("Svrtete nalevo na Filip Vtori Makedonski");
                System.out.println("Svrtete nadesno na Kej 13ti Noemvri");
                System.out.println("Firmata e na levata strana");
            }
            else if(getNasokiDoPraksa().equals("Kej Dimitar Vlahov")){
                System.out.println("Upatete se severoistocno na Arhimedova");
                System.out.println("Blago svrtete nadesno na Arhimedova");
                System.out.println("Svrtete nadesno kon 16ta Makedonska Brigada");
                System.out.println("Svrtete nadesno na 16ta Makedonska Brigada");
                System.out.println("Svrtete nadesno na Bulevar Aleksandar Makedonski");
                System.out.println("Blago svrtete nalevo");
                System.out.println("Blago svrtete nalevo na Belasica");
                System.out.println("Svrtete nadesno na Bulevar Goce Delcev");
                System.out.println("Svrtete nalevo na Kej Dimitar Vlahov");
                System.out.println("Svrtete nalevo za da ostanete na Kej Dimitar Vlahov");
                System.out.println("Svrtete nadesno za da ostanete na Kej Dimitar Vlahov");
                System.out.println("Svrtete nalevo na Bulevar Krste Petkov Misirkov");
                System.out.println("Svrtete nadesno na Kej 13ti Noemvri");
                System.out.println("Firmata kje bide na levata strana");
            }
        }
    }
    public void nasokiDoFilharmonija(StudentiKoiTrebaDaSeNavigiraat student){
        if(dom.equals("Goce Delchev")){
            if(student.getNasoki().equals("Mitropolit Teodosij Gologanov")){
                System.out.println("Upatete se juzno na Moskovska kon Oslo");
                System.out.println("Blago svrtete nalevo na Bulevar Mitropolit Teodosij Gologanov");
                System.out.println("Prodolzete na Mitropolit Teodosij Gologanov");
                System.out.println("Blago svrtete nalevo za da ostanete na Mitropolit Teodosij Gologanov");
                System.out.println("Pominete niz eden kruzen tek");
                System.out.println("Prodolzete na Dimitrie Cuposki");
                System.out.println("Blago svrtete nalevo na Nikola Vapcarov");
                System.out.println("Svrtete nalevo kon Ul. Makedonija");
                System.out.println("Svrtete nalevo na Ul. Makedonija");
                System.out.println("Prodolzete na Kamen Most");
                System.out.println("Svrtete nadesno na 11ti Mart");
                System.out.println("Svrtete nalevo");
                System.out.println("Filharmonijata kje bide na desnata strana");
            }
            else if(student.getNasoki().equals("Bulevar Partizanski Odredi")){
                System.out.println("Upatete se severno na Moskovska kon Budimpestanska");
                System.out.println("Svrtete nadesno na Bulevar Partizanski Odredi");
                System.out.println("Prodolzete pravo za da ostanete na Bulevar Partizanski Odredi");
                System.out.println("Svrtete nalevo na Bulevar Blaze Koneski/Dame Gruev");
                System.out.println("Prodolzete da go sledite Bulevar Blaze Koneski");
                System.out.println("Prodolzete na Bulevar Goce Delcev");
                System.out.println("Blago svrtete nalevo za da ostanete na 11ti Mart");
                System.out.println("Svrtete nadesno za da ostanete na 11ti Mart");
                System.out.println("Svrtete nalevo");
                System.out.println("Filharmonijata kje bide na desnata strana");
            }
            else if(student.getNasoki().equals("Varsavska")){
                System.out.println("Upatete se severno na Moskovska kon Budimpestanska");
                System.out.println("Svrtete nadesno na Zenevska");
                System.out.println("Svrtete nalevo na Londonska");
                System.out.println("Svrtete nadesno na Varsavska");
                System.out.println("Pominete niz eden kruzen tek");
                System.out.println("Prodolzete na Drezdenska");
                System.out.println("Prodolzete na Vladimir Polezanovski");
                System.out.println("Svrtete nalevo na Leninova");
                System.out.println("Svrtete nadesno na Bulevar Partizanski Odredi");
                System.out.println("Svrtete nalevo na Bulevar Blaze Koneski/Dame Gruev");
                System.out.println("Prodolzete da go sledite Bulevar Blaze Koneski");
                System.out.println("Prodolzete na Bulevar Goce Delcev");
                System.out.println("Blago svrtete nadesno na 11ti Mart");
                System.out.println("Blago svrtete nalevo za da ostanete na 11ti Mart");
                System.out.println("Svrtete nadesno za da ostanete na 11ti Mart");
                System.out.println("Svrtete nalevo");
                System.out.println("Filharmonijata e na desnata strana");
            }
        }
        else if(dom.equals("Studentski Centar Skopje")){
            if(student.getNasoki().equals("Dimitrie Cuposki")){
                System.out.println("Upatete se istocno na Ul. Kosta Shahov kon Debarca");
                System.out.println("Na Ul. Kosta Shahov vrti nalevo na Debarca");
                System.out.println("Svrtete nadesno kon Bulevar Sveti Kliment Ohridski");
                System.out.println("Svrtete nadesno na Bulevar Sveti Kliment Ohridski");
                System.out.println("Svrtete nalevo na Dimitrie Cupovski");
                System.out.println("Blago svrtete nalevo na Nikola Vapcarov");
                System.out.println("Svrtete nalevo kon Ul. Makedonija");
                System.out.println("Svrtete nalevo na Ul. Makedonija");
                System.out.println("Prodolzete na Kamen Most");
                System.out.println("Svrtete nadesno na 11ti Mart");
                System.out.println("Svrtete nalevo");
                System.out.println("Filharmonijata e na desnata strana");
            }
            else if(student.getNasoki().equals("11ti Mart")){
                System.out.println("Upatete se istocno na Ul. Kosta Shahov kon Debarca");
                System.out.println("Na Ul. Kosta Shahov vrti nalevo na Debarca");
                System.out.println("Svrtete nadesno kon Bulevar Sveti Kliment Ohridski");
                System.out.println("Svrtete nalevo na Bulevar Sveti Kliment Ohridski");
                System.out.println("Odete preku peshackiot premin");
                System.out.println("Svrtete nadesno na Bulevar Partizanski Odredi");
                System.out.println("Svrtete nalevo na Bulevar Blaze Koneski/Dame Gruev");
                System.out.println("Prodolzete da go sledite Bulevar Blaze Koneski");
                System.out.println("Prodolzete na Bulevar Goce Delcev");
                System.out.println("Blago svrtete nadesno na 11ti Mart");
                System.out.println("Blago svrtete nalevo za da ostanete na 11ti Mart");
                System.out.println("Svrtete nadesno za da ostanete na 11ti Mart");
                System.out.println("Svrtete nalevo");
                System.out.println("Filharmonijata kje bide na desnata strana");
            }
            else if(student.getNasoki().equals("Bulevar Sveti Kliment Ohridski")){
                System.out.println("Upatete se istocno na Ul. Kosta Shahov kon Debarca");
                System.out.println("Na Ul. Kosta Shahov vrti nalevo na Debarca");
                System.out.println("Svrtete nadesno kon Bulevar Sveti Kliment Ohridski");
                System.out.println("Svrtete nalevo na Bulevar Sveti Kliment Ohridski");
                System.out.println("Svrtete nadesno na Bulevar Ilinden");
                System.out.println("Prodolzete na Bulevar Goce Delcev");
                System.out.println("Blago svrtete nadesno na 11ti Mart");
                System.out.println("Blago svrtete nalevo za da ostanete na 11ti Mart");
                System.out.println("Svrtete nadesno za da ostanete na 11ti Mart");
                System.out.println("Svrtete nalevo");
                System.out.println("Filharmonijata e na desnata strana");
            }
        }
        else if(dom.equals("Pance Karargjozov")){
            if(student.getNasoki().equals("Dimitrie Cupovski")){
                System.out.println("Upatete se severozapadno na 50ta Divizija kon Majka Tereza");
                System.out.println("Svrtete nadesno na Majka Tereza");
                System.out.println("Prodolzete na Bul. Sveti Kliment Ohridski");
                System.out.println("Svrtete nadesno na Dimitrie Cupovski");
                System.out.println("Blago svrtete nalevo na Nikola Vapcarov");
                System.out.println("Svrtete nalevo kon Ul. Makedonija");
                System.out.println("Svrtete nalevo na Ul. Makedonija");
                System.out.println("Prodolzete na Kamen Most");
                System.out.println("Svrtete nadesno na 11ti Mart");
                System.out.println("Svrtete nalevo");
                System.out.println("Filharmonijata e na desnata strana");
            }
            else if(student.getNasoki().equals("Ul. Makedonija")){
                System.out.println("Upatete se severozapadno na 50ta Divizija kon Majka Tereza");
                System.out.println("Svrtete nadesno na Majka Tereza");
                System.out.println("Svrtete nadesno na Sv. Kiril i Metodij");
                System.out.println("Svrtete nalevo na Ul. Makedonija");
                System.out.println("Prodolzete na Ul. Makedonija");
                System.out.println("Svrtete nadesno kon Ul. Makedonija");
                System.out.println("Svrtete nadesno na Ul. Makedonija");
                System.out.println("Prodolzete na Kamen Most");
                System.out.println("Svrtete nadesno na 11ti Mart");
                System.out.println("Svrtete nalevo");
                System.out.println("Filharmonijata kje bide na desnata strana");
            }
            else if(student.getNasoki().equals("11ti Mart")){
                System.out.println("Upatete se severozapadno na 50ta Divizija kon Majka Tereza");
                System.out.println("Svrtete nadesno na Majka Tereza");
                System.out.println("Prodolzete na Bul. Sveti Kliment Ohridski");
                System.out.println("Svrtete nadesno na Dimitrie Cupovski");
                System.out.println("Svrtete nalevo na Dame Gruev");
                System.out.println("Blago svrtete nadesno za da ostanete na Dame Gruev");
                System.out.println("Prodolzete na Bul. Blaze Koneski/Bul. Goce Delcev");
                System.out.println("Prodolzete na Bul. Goce Delcev");
                System.out.println("Blago svrtete nadesno na 11ti Mart");
                System.out.println("Blago svrtete nalevo za da ostanete na 11ti Mart");
                System.out.println("Svrtete nadesno za da ostanete na 11ti Mart");
                System.out.println("Svrtete nalevo");
                System.out.println("Filharmonijata e na desnata strana");
            }
        }
        else if(dom.equals("Stiv Naumov")){
            if(student.getNasoki().equals("Arhimedova")){
                System.out.println("Upatete se zapadno kon Arhimedova");
                System.out.println("Blago svrtete nalevo na Arhimedova");
                System.out.println("Prodolzete na Petre Georgiev");
                System.out.println("Blago svrtete nalevo kon Kiril Pejcinovikj");
                System.out.println("Odete po nadvoznikot za peshaci");
                System.out.println("Svrtete nalevo na Kiril Pejcinovikj");
                System.out.println("Svrtete nadesno na Bitpazarska");
                System.out.println("Blago svrtete nadesno na Arhiepiskip Angelarij");
                System.out.println("Svrtete nalevo za da ostanete na Arhiepiskop Angelarij");
                System.out.println("Svrtete nalevo na Jorgandziska/Arhiepiskop Angelarij");
                System.out.println("Svrtete nalevo");
                System.out.println("Filharmonijata e na levata strana");
            }
            else if(student.getNasoki().equals("Bulevar Goce Delcev")){
                System.out.println("Upatete se severoistocno kon Arhimedova");
                System.out.println("Blago svrtete nadesno na Arhimedova");
                System.out.println("Svrtete nadesno kon 16ta Makedonska Brigada");
                System.out.println("Svrtete nadesno na 16ta Makedonska Brigada");
                System.out.println("Svrtete nadesno na Bul. Aleksandar Makedonski");
                System.out.println("Blago svrtete nalevo");
                System.out.println("Blago svrtete nalevo na Belasica");
                System.out.println("Svrtete nadesno na Bul. Goce Delcev");
                System.out.println("Svrtete nadesno na Bul. Filip Vtori Makedonski/Stiv Naumov");
                System.out.println("Svrtete nalevo kon Kazandjiska");
                System.out.println("Svrtete nadesno na Kazandjiska");
                System.out.println("Svrtete nalevo za da ostanete na Kazandjiska");
                System.out.println("Blago svrtete nalevo na Salih Asim");
                System.out.println("Svrtete nalevo na Arhiepiskop Angelarij/Podgragje");
                System.out.println("Svrtete nalevo");
                System.out.println("Filharmonijata e na levata strana");
            }
        }
    }
    public void daliStudentotMozeDaOdbraniTrud(StudentiKoiTrebaDaSeNavigiraat student){
        if(student.getDaliStudentotZapishalTrud()==true){
           nasokiDoFilharmonija(student);
        }
        else{
            System.out.println("Studentot nema pravo da dobie diploma");
        }
    }
    public int getBrojNaDomasni(String kurs){
        int [] brojNaDomasni=new int[5];
        for(int brojac=0;brojac<5;brojac++){
            brojNaDomasni[brojac]=0;
        }
        for(int brojac=0;brojac<getProverkiOdProfesori();brojac++){
            for(int novBrojac=0;novBrojac<5;novBrojac++){
                if(brojNaDomasni[novBrojac]<(brojNaDomasni[novBrojac+1]+1)){
                    brojNaDomasni[novBrojac]++;
                    return brojNaDomasni[novBrojac];
                }
            }
        }
    }
    public void serverNaFakultetot(String [] kursevi){
        for(int brojac=0;brojac<5;brojac++){
            if(kursevi[brojac].equals(getKursevi(brojac))){
                getBrojNaDomasni(kursevi[brojac]);
            }
        }
    }
}
