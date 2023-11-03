public class Author {
    private String name;
    private int age;

    public Author()
    {
        name = "";
        age = 0;
    }

    public Author(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        if (age < 0)
        {
            throw new RuntimeException("Age must be non-negative.");
        }

        this.age = age;
    }
}
