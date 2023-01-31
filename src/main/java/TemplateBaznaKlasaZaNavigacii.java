public abstract class TemplateBaznaKlasaZaNavigacii<E> {
        private E pocetnaLokacija;
        private String krajnaLokacija;
        public abstract String getPocetnaLokacija<E>(E pocetnaLokacija);
        public abstract String getKrajnaLokacija(String destinacija);
        public abstract String getNasoki();
        public final void buildNasoki(){
                getPocetnaLokacija<E>(pocetnaLokacija);
                getKrajnaLokacija(krajnaLokacija);
                getNasoki();
        }
}
