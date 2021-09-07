import java.util.Arrays;

public class Course {
    private int[] barriers;

    public Course(int[] barriers) {
        this.barriers = barriers;
    }

    public String toString() {
        return Arrays.toString(this.barriers);
    }

    public void doIt(Team team) {
        for (Member member : team.getMembers()) {
            for (int barrier : barriers) {
                if (!member.jump(barrier)) break;
            }
        }
    }
}
