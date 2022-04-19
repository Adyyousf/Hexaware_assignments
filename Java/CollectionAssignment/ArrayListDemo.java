import java.util.ArrayList;
import java.lang.Exception;
import java.util.Iterator;

class Students {
    public static ArrayList students = new ArrayList();
    public String name;

    public Students(String name) {
        this.name = name;
    }

    public void setNames() {
        students.add(this.name);
    }

    public void searchName(String name) {
        if (students.contains((String) name)) {
            System.out.println("found " + (name));
        } else {
            System.out.println("Not found " + (name));
        }
    }

    public void searchName(int index) {
        try {
            System.out.println("Search complete " + students.get(index));

        } catch (Exception e) {
            System.out.println("Not in the list");
        }

    }

    public void printNames() {
        Iterator it = students.iterator();
        while (it.hasNext()) {
            System.out.println(it.next() + " ");
        }
    }

    // public void removeName(String stuName) {
    //     for (String student : students) {
    //         if (student.equals(stuName)) {
    //             students.remove((String) student);
    //             break;
    //         } else {
    //             System.out.println("Name is not in the list");
    //         }
    //     }

    // }

}

public class ArrayListDemo {
    public static void main(String[] args) {
        Students st = new Students("HEBI");
        Students st1 = new Students("MARY");
        Students st2 = new Students("JENI");
        st.setNames();
        st1.setNames();
        st1.printNames();
        // st1.removeName("HEBI");
        st1.setNames();
        st2.setNames();
        st2.searchName(3);
        st2.searchName("MARY");
    }

}