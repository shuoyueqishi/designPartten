package chainOfResponsibility.askForLeave;

public class Teacher extends AbstractLeader{
    @Override
    void approve(int days) {
        if (days<5) {
            System.out.println("您的"+days+"天请假已经被老师批准");
        } else if (this.getNext()!=null){
            this.getNext().approve(days);
        } else {
            System.out.println("您的"+days+"天请假超出范围，无法被处理。");
        }
    }
}
