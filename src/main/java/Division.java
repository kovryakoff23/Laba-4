public class Division {
    int id;
    String name;

    public Division(String name) {
        this.id = (int)(Math.random()*100);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Division{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
