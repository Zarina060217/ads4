public class Vertex {
    private int id;
    public Vertex(int id) {
        this.id = id;
    }
    public int getId() {return id;}

    @Override
    public String toString() { // [cite: 21]
        return String.valueOf(id);
    }
}
