package first.project.first_spring_project.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FirstService {

    public MyFirstClass myFirstClass;

    @Autowired
    public FirstService(MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }

    public void sayHero() {
        System.out.println("Hero from first Service" + myFirstClass.sayHero());
    }

}
