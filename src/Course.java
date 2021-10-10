public class Course {
    private Obstacle[] obstacles;
    public Course(Obstacle[] obstacles){
        this.obstacles = obstacles;
    }
    public void passCourse(Team team){
        for (TeamMember member:
             team.getMembers()) {
            boolean passedCourse = true;
            for (Obstacle obstacle :
                    obstacles) {
                if (!member.passObstacle(obstacle))
                {
                    passedCourse = false;
                    break;
                }
            }
            member.setPassedCourse(passedCourse);
        }
    }//
}
