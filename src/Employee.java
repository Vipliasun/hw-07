public class Employee {

        // Fields
        private String firstName;
        private String lastName;
        private int age;
        private String title;

        public Employee(String firstName, String lastName, int age, String title) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.title = title;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }



    }

