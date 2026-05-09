package Week1_Student_management_console_app.Day1;

public enum Class_lvl {
    First(1),Second(2),Third(3),Fourth(4);
    private final int level;
    Class_lvl(int level) {
    this.level=level;
    }
    public int getLevel(){
        return level;
    }
}
