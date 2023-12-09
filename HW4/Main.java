package OOPHW.HW4;

public class Main {
    public static void main(String[] args) {
        TeacherControler controler = new TeacherControler();
        controler.create("bbb", "bbb", "bbb");
        controler.create("ccc", "ccc", "ccc");
        controler.create("Caa", "Caa", "Caa");
        controler.create("ccc", "ccc", "ccc");
        controler.sendOnConsole();
    }
}