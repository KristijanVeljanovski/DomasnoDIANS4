import java.util.Scanner;
public class ServiceRegistrationServer {
   public static void templateMain(){
       Scanner skener=new Scanner(System.in);
       TemplateBaznaKlasaZaNavigacii navigacii=new TemplateBaznaKlasaZaNavigacii() {
           @Override
           public String getPocetnaLokacija(String pocetnaLokacija) {
               return pocetnaLokacija;
           }

           @Override
           public String getKrajnaLokacija(String destinacija) {
               return destinacija;
           }

           @Override
           public String getNasoki() {
               String pocetnaLokacija=skener.nextLine();
               String destinacija=skener.nextLine();
               if((getPocetnaLokacija(pocetnaLokacija).equals("FINKI") || getPocetnaLokacija(pocetnaLokacija).equals("FEIT") || getPocetnaLokacija(pocetnaLokacija).equals("MFS") || getPocetnaLokacija(pocetnaLokacija).equals("TMF")) && (getKrajnaLokacija(destinacija).equals("1000 Knigi") || getKrajnaLokacija(destinacija).equals("Braka Miladinovci") || getKrajnaLokacija(destinacija).equals("Jordan Hadzi Konstantinov-Dzinot") || getKrajnaLokacija(destinacija).equals("Dom na Kultura-Ilinden"))){
                   patekaOdFakultetDoBiblioteka(getPocetnaLokacija<String>(pocetnaLokacija),getKrajnaLokacija(destinacija));
               }
               else if((getPocetnaLokacija(pocetnaLokacija).equals("FINKI") || getPocetnaLokacija(pocetnaLokacija).equals("FEIT") || getPocetnaLokacija(pocetnaLokacija).equals("MFS") || getPocetnaLokacija(pocetnaLokacija).equals("TMF")) && (getKrajnaLokacija(destinacija).equals("Sterna") || getKrajnaLokacija(destinacija).equals("Ekvus") || getKrajnaLokacija(destinacija).equals("Libro") || getKrajnaLokacija(destinacija).equals("Impegna"))){
                   patekaOdFakultetDoKnizarnica(getPocetnaLokacija<String>(pocetnaLokacija),getKrajnaLokacija(destinacija));
               }
               else if((getPocetnaLokacija(pocetnaLokacija).equals("Goce Delcev") || getPocetnaLokacija(pocetnaLokacija).equals("Studentski Centar Skopje") || getPocetnaLokacija(pocetnaLokacija).equals("Pance Karagjozov") || getPocetnaLokacija(pocetnaLokacija).equals("Stiv Naumov")) && (getKrajnaLokacija(destinacija).equals("Dzovani") || getKrajnaLokacija(destinacija).equals("Broz Kafe") || getKrajnaLokacija(destinacija).equals("Cresha Bar") || getKrajnaLokacija(destinacija).equals("Kafe Li"))){
                   odDomDoKafic(getPocetnaLokacija<StudentskiDomovi>(pocetnaLokacija),getKrajnaLokacija(destinacija));
               }
           }
       }

   }
}
