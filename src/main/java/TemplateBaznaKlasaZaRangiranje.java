package org.example;

abstract class TemplateKlasaZaRangiranje {
        private String lokal;
        private String opcija;
        private int rang;
        public abstract String getLokacija(String lokal);
        public abstract String getOpcijaZaDaSeRangira(String opcija);
        public abstract int getRezultatZaKvalitet(int rang);
        public final void buildRang(){
                getLokacija(lokal);
                getOpcijaZaDaSeRangira(opcija);
                getRezultatZaKvalitet(rang);
        }
}
