import java.util.Scanner;

public class TeamMember {
    private  String name;
    private  boolean passedCourse;
    TeamMember(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isPassedCourse() {
        return passedCourse;
    }
    public void setPassedCourse(boolean passedCourse){
        this.passedCourse = passedCourse;
    }

    public void printName(){
        System.out.println(name);
    }
    public void printResult() {
        System.out.println(name +
                (passedCourse?" -passed course ":" -failed course"));
    }
    public boolean passObstacle(Obstacle obstacle){
        System.out.println(name + " passes "+obstacle.getDescription()+"? (Y/N)");
        Scanner scanner = new Scanner(System.in);
        while(true){
            switch (scanner.next().toLowerCase()){
                case "yes":
                case "y":
                    return  true;
                case "no":
                case  "n":
                    return  false;
            }
        }
    }
}
