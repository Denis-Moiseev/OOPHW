package OOPHW.HW3;

public class StudyGroup {
    private int groupNumber;

    public StudyGroup(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Override
    public String toString() {
        return "StudyGroup ("
                + groupNumber +
                ')';
    }
}
