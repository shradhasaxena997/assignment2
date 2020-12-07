import java.util.List;
import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.stream.Collectors;

class User {
    int stuId;
    int stuAge;
    String stuName;
    String stuAddress;

    User(int id, int age, String name, String address) {
        this.stuId = id;
        this.stuAge = age;
        this.stuName = name;
        this.stuAddress = address;
    }

    public int getStuId() {
        return stuId;
    }

    public int getStuAge() {
        return stuAge;
    }

    public String getStuName() {
        return stuName;
    }

    public String getStuAddress() {
        return stuAddress;
    }

}

public class UserInfo {
    public static void main(String[] args) {
        List<User> list = new ArrayList<>();
        list.add(new User(11, 27, "Lucy", "bareilly"));
        list.add(new User(28, 26, "Kiku", "agra"));
        list.add(new User(32, 18, "Dani", "delhi"));
        list.add(new User(49, 27, "Steve", "delhi"));


        List<String> list1 = new ArrayList<>();
        list1 = list.stream()

                .filter(pair -> pair.stuName.startsWith("S"))
                .map(s -> s.getStuName())
                .collect(Collectors.toList());


        System.out.println(list1);


        List<String> list2 = new ArrayList<>();
        list2 = list.stream()
                .filter(pair -> pair.stuAge > 18 && pair.stuAddress.equals("delhi"))
                .map(s -> s.getStuName())
                .collect(Collectors.toList());

        System.out.println(list2);

        List<String> list3 = new ArrayList<>();
        list3 = list.stream()
                .filter(pair -> pair.stuId > 10 && pair.stuAge < 20)
                .map(s -> s.getStuName())
                .collect(Collectors.toList());
        System.out.println(list3);


        List<String> list4 = new ArrayList<>();
        list4 = list.stream()
                .filter(pair -> (pair.stuAge % 2) == 0)
                .map(s -> s.getStuName())

                .collect(Collectors.toList());
        System.out.println(list4);


        List<String> list5 = new ArrayList<>();
        list5 = list.stream()
                .filter(pair -> pair.stuAge == 18 && pair.stuAddress == "delhi")
                .map(s -> s.getStuName())
                .collect(Collectors.toList());

        System.out.println(list5);


    }
}