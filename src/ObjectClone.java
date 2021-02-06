public class ObjectClone implements Cloneable{//Для реализации клонирования класс Person должен применить интерфейс Cloneable
    private String name;
    private int age;


    public ObjectClone(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public ObjectClone clone() throws CloneNotSupportedException {//Object.clone() выбрасывает исключение CloneNotSupportedException при попытке клонировать объект не реализующий интерфейс Cloneable.

        return (ObjectClone) super.clone();
    }
}
