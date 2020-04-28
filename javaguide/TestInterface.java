interface eat {
    public String eat();

    abstract void walk();
}

class Cat implements eat{

    @Override
    public String eat() {
        return "fish";
    }

    @Override
    public void walk() {

    }
}