import java.util.Comparator;

class StudentComparator implements Comparator<Student> {
        public int compare(Student s1, Student s2) {

            if (s1.getCGPA() > s2.getCGPA())
                return -1;
            else if (s1.getCGPA() < s2.getCGPA())
                return 1;
            else if(s1.getCGPA() == s2.getCGPA()){
                if(s2.getName().compareTo(s1.getName())>0)
                    return -1;
                else if(s1.getName().compareTo(s2.getName()) > 0)
                    return 1;
                else if(s1.getName().compareTo(s2.getName()) == 0){
                    if (s1.getToken() < s2.getToken())
                        return -1;
                    else if (s1.getCGPA() > s2.getCGPA())
                        return 1;
                }
            }
            return 0;
        }
    }


