package rpncalculator;




public class PathStack<T> {

    private Path<T> data = null;

    public PathStack() {
    }

    public PathStack(NumberPath path) {
        data = new NumberPath(path.getFirst(), path);
    }

    public void push(T element) {
        data = new NumberPath(element, data);
    }

    public T pop() {
        T element = data.getFirst();
        data = data.getRest();
        return element;
    }

    public boolean isEmpty() {
        return data.getFirst() == null;
    }

    public Path<T> getData() {
        return data;
    }

    
}
