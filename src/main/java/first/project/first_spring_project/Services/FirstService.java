package first.project.first_spring_project.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class FirstService {

    public MyFirstClass myFirstClass;
    public Environment environment;

    @Autowired
    public FirstService(MyFirstClass myFirstClass) {
        this.myFirstClass = myFirstClass;
    }

    public void sayHero() {
        System.out.println("Hero from first Service" + myFirstClass.sayHero());
    }

    @Autowired
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    public String getjavaVersion() {
        return environment.getProperty("java.version");
    }

    public String getOsName() {
        return environment.getProperty("os.name");
    }

}
