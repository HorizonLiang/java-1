class Father{
    protected String name = "Fa";
    public int age = 50;

    protected String getName(){
        return this.name;
    }
}

public class TestExtend extends Father{

    public String getName(){
        return super.getName();
    }

    public int getAge(){
        return age;
    }

    public static void main(String[] args) {
        TestExtend testExtend = new TestExtend();
        System.out.println(testExtend.getName());
        System.out.println(new TestExtend().getAge());
    }
}
