import java.util.ArrayList;
import java.util.List;
public class Cevka<T>{
   private List<Filter<T, O>> filter=new ArrayList<>();
   public void addFilter(Filter<T, O> filter){
       filter.add(filter);
   }
   public T runFilters(T input){
       for(Filter<T, O> filters:filter){
           T vnes=filters.izvrshuvaj(vnes);
       }
       return vnes;
   }
}
