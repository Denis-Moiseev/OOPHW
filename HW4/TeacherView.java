package OOPHW.HW4;

import java.util.List;

public class TeacherView implements UserView<Teacher> {

    @Override
    public void sendOnConsole(List<Teacher> List) {
        for (Teacher i : List)
            System.out.println(i);
    }
}