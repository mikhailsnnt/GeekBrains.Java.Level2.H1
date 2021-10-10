public class Team {
    private  String name;
    private  TeamMember[] members;

    public   String getName() {
        return name;
    }

    public TeamMember[] getMembers() {
        return members;
    }

    public Team(String name, TeamMember[] members){
        this.name = name;
        this.members = members;
    }
    public void printMembers(){
        System.out.println("Team '"+name+"' members:");
        for (TeamMember member :
                members) {
            member.printName();
        }
    }
    public void printResults(){
        System.out.println("Team '"+name+"' results:");
        for (TeamMember member:
             members) {
            member.printResult();
        }//
    }
}
