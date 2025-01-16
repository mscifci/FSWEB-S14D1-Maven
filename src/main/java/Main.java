import com.workintech.cylinder.Circle;
import com.workintech.cylinder.Cylinder;
import com.workintech.developers.Employee;
import com.workintech.developers.HRManager;
import com.workintech.developers.JuniorDeveloper;
import com.workintech.developers.MidDeveloper;
import com.workintech.developers.SeniorDeveloper;
import com.workintech.pool.Cuboid;
import com.workintech.pool.Rectangle;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());
        Rectangle rectangle = new Rectangle(5.0, 10.0);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5.0, 10.0, 5.0);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());
        Employee employee = new Employee(1, "John Doe", 5000.0);
        employee.work();
        HRManager hrManager = new HRManager(2, "Jane Doe", 6000.0);
        hrManager.work();
        JuniorDeveloper juniorDeveloper = new JuniorDeveloper(3, "Bob Smith", 4000.0);
        juniorDeveloper.work();
        MidDeveloper midDeveloper = new MidDeveloper(4, "Alice Johnson", 5500.0);
        midDeveloper.work();
        SeniorDeveloper seniorDeveloper = new SeniorDeveloper(5, "Mike Brown", 7000.0);
        seniorDeveloper.work();
        hrManager.addEmployee(juniorDeveloper);
        hrManager.addEmployee(midDeveloper);
        hrManager.addEmployee(seniorDeveloper);
    }
}
