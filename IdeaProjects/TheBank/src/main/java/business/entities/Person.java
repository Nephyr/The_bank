package business.entities;
public abstract class Person {
    String firstName;
    String lastName;
    int ssn;
    String location;
    int yearOfBirth;



////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        // GETTERS AND SETTERS
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public void setSsn(int ssn) {
            this.ssn = ssn;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public void setYearOfBirth(int yearOfBirth) {
            this.yearOfBirth = yearOfBirth;
        }


    public Person(String firstName, String lastName, int ssn, String location, int yearOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
        this.location = location;
        this.yearOfBirth = yearOfBirth;


    }
}
