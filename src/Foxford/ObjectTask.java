package Foxford;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ObjectTask implements Cloneable {

    private String name;
    private int id;
    private List<String> tasks;

    public ObjectTask(String name, int id, List<String> tasks) {
        this.name = name;
        this.id = id;
        this.tasks = tasks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void setTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id, tasks);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ObjectTask that = (ObjectTask) obj;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(tasks, that.tasks);
    }

    @Override
    public String toString() {
        return getClass() + " name: " + getName() + " id: " + getId() + " tasks: " + getTasks();
    }
    /**
     * The clone() method must be overridden if you need to create a deep copy of an object, rather than just the default shallow copy.
     * <p>
     * A shallow copy of an object is created by the Object.clone() method without overriding, and it only copies primitive type values
     * and object references, while a deep copy copies all fields, including fields of reference types.
     * <p>
     * If the class contains fields of reference types that are to be copied, then the clone() method must be overridden to create a deep
     * copy of the object. When doing this, you should make sure that all fields are correctly copied, including all fields of reference types.
     * <p>
     * Also keep in mind that when overriding the clone() method, you need to make sure that it will work correctly with any descendants
     * of your class, otherwise there may be a problem when the clone() method does not create a complete copy of the object, and this may
     * lead to errors in your work. applications.
     **/
    @Override
    public ObjectTask clone() throws CloneNotSupportedException {
        ObjectTask cloned = (ObjectTask) super.clone();
        cloned.tasks = new ArrayList<>(tasks); // create a new task list
        return cloned;
    }

    /**
     * DON'T USE THIS METHOD, because garbage collector not make guarantees that this method will be called before obj been deleted
     **/
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
