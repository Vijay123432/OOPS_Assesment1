public class Emp{
// Take 4 Variables of Emp Data With an Access Modifier Private
  // Prepare toString()
  public class student {
    private int id;
    private String name;
    private long number;
    private double points;
    public int getId() {
      return id;
    }
    public void setId(int id) {
      this.id = id;
    }
    public String getName() {
      return name;
    }
    public void setName(String name) {
      this.name = name;
    }
    public long getNumber() {
      return number;
    }
    public void setNumber(long number) {
      this.number = number;
    }
    public double getPoints() {
      return points;
    }
    public void setPoints(double points) {
      this.points = points;
    }
    @Override
    public String toString() {
      return "student [id=" + id + ", name=" + name + ", number=" + number + ", points=" + points + "]";
    }
    
  
  }
}