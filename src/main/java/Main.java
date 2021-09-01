class Main implements Animals{
    public Main() {
        System.out.println("constructor");
    }

    @Override
    public String runFast(int speed) {
        return "overrided method" + speed;
    }

    public static void main(String[] args) {
        Main mainRR = new Main();
        System.out.println(mainRR.runFast(300));
        printQuality();
    }

    enum myEnum {
        good,
        bad,
        noOpinion
    }

    public static void printQuality() {
        System.out.println(myEnum.bad);
    }

}