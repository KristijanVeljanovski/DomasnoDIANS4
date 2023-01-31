public interface Filter<T, O>{
    T izvrshuvaj(T vnes);
    T izvrshuvajStudentskiDomKafic(T vnes);
    T izvrshuvajFakultetKopirnica(T vnes);
    T izvrshuvajFakultetBiblioteki(T vnes);
}
