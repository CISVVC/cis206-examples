import java.util.Comparator;

public class PersonComparator implements Comparator<Person>{ 

    @Override
    public int compare(Person person1, Person person2) {

        //String name1 = person1.getLastName();
        //String name2 = person2.getLastName();
        return person1.getLastName().compareTo(person2.getLastName());
        //if (name1 > name2){
        //    return +1;
        //}else if (name1 < name2){
        //    return -1;
        //}else{
        //    return 0;
       // }
    }
}
