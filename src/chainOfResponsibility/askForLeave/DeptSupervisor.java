package chainOfResponsibility.askForLeave;

public class DeptSupervisor extends AbstractLeader{
    @Override
    void approve(int days) {
        if (days<30) {
            System.out.println("您的"+days+"天请假已经被教导主任批准");
        } else if (this.getNext()!=null){
            this.getNext().approve(days);
        } else {
            System.out.println("您的"+days+"天请假超出范围，无法被处理。");
        }
    }
}
