public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        ObjectClone objectClone = new ObjectClone("ulan", 27);
        ObjectClone clonedObjectClone = objectClone.clone();//метод clone(), который создает копию объекта
        clonedObjectClone.setAge(25);
        clonedObjectClone.setName("aika");
        System.out.println(objectClone.getAge() + " " + objectClone.getName());
        System.out.println(clonedObjectClone.getAge() + " " + clonedObjectClone.getName());
    }
}
