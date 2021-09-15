import java.util.Arrays;

public class GenericBox<T> {
    private T[] members;

    public GenericBox(T... members) {

        this.members = members;
    }

    public T[] getObj() {
        return members;
    }

    public void replaceMembers(int i1, int i2) {
        T tmp;
        tmp = this.members[i1];
        this.members[i1] = this.members[i2];
        this.members[i2] = tmp;
    }

    public String toString() {
        return Arrays.toString(members);
    }

    public static void main(String[] args) {
        GenericBox<Integer> intBox = new GenericBox<>(1, 2, 3, 4, 5);
        System.out.println(intBox);

        intBox.replaceMembers(2, 3);
        System.out.println(intBox);
    }
}
