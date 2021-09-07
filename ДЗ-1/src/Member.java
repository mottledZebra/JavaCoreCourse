public class Member {
    private String name;
    private int power;
    private boolean isWin;

    public Member(String name, int power) {
        this.name = name;
        this.power = power;
        this.isWin = false;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public boolean isWin() {
        return isWin;
    }

    public boolean jump(int distance) {
        if (power >= distance) {
            power -= distance;
            isWin = true;
        }
        else isWin = false;

        return isWin;
    }
}
