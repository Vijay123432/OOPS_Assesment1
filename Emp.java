public class Emp{
// Take 4 Variables of Emp Data With an Access Modifier Private
  // Prepare toString()
  public class student {
    private int id;
    private String name;
    private long number;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public long getNumber() {
        return number;
    }
    public void setNumber(long number) {
        this.number = number;
    }
    public student(int id, String name) {
        this.id = id;
        this.name = name;
    }
  
    public student(int id, String name, long number) {
        this.id = id;
        this.name = name;
        this.number = number;
    }
    public student(){

    }
    @Override
    public String toString() {
        return "student [id=" + id + ", name=" + name + ", number=" + number + "]";
    }

    }
}
