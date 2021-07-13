package chainOfResponsibility.askForLeave;

public class TestLeaderChain {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        ClassAdvisor classAdvisor = new ClassAdvisor();
        DeptSupervisor deptSupervisor = new DeptSupervisor();
        Dean dean = new Dean();
        teacher.setNext(classAdvisor);
        classAdvisor.setNext(deptSupervisor);
        deptSupervisor.setNext(dean);
        teacher.approve(3);
        teacher.approve(7);
        teacher.approve(14);
        teacher.approve(25);
        teacher.approve(45);
        teacher.approve(60);
        teacher.approve(10);
    }
}
