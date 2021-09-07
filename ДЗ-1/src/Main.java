public class Main {

    public static void main(String[] args) {
        Member[] members = new Member[4];
        members[0] = new Member("Иванов", 42);
        members[1] = new Member("Петров", 38);
        members[2] = new Member("Сидоров", 40);
        members[3] = new Member("Кузнецов", 45);

        Team team = new Team("Чемпионы", members);
        System.out.println(team);

        int[] barriers = {8, 9, 7, 6, 10};
        Course course = new Course(barriers);
        System.out.println("Полоса препятствий: " + course);

        course.doIt(team);
        team.showResults();
    }
}
