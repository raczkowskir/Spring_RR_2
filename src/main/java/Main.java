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
    }



}