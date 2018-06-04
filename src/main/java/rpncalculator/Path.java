package rpncalculator;






public interface Path<T> {
    
    T getFirst();
    Path<T> getRest();
    
}
