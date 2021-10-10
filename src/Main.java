public class Main {
    public static void main(String[] args) {
        Team team = new Team(
                "Red team",
                new TeamMember[]{
                        new TeamMember("Ivan Golikov"),
                        new TeamMember("Petya Djura"),
                        new TeamMember("Lesha Zubov")
                }
        );
        team.printMembers();
        Course course = new Course(
                new Obstacle[]{
                        new Obstacle("River"),
                        new Obstacle("Sea"),
                        new Obstacle("Desert")
                }
        );
        course.passCourse(team);
        team.printResults();
    }//
}
