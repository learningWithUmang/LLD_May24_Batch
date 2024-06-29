package builder;

public class Student {
    String name;
    int age;
    int gradYear;
    String batch;
    String universityName;
    String phoneNo;
    double psp;

    public static Builder getBuilder(){
        return new Builder();
    }

    private Student(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.psp = builder.psp;
        this.gradYear = builder.gradYear;
        this.phoneNo = builder.phoneNo;
        this.batch = builder.batch;
        this.universityName = builder.universityName;
    }
    public static class Builder {
        String name;
        int age;
        int gradYear;
        String batch;
        String universityName;
        String phoneNo;
        double psp;

        /*
        All setter methods should return Students.Builder
         */

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }
        /*

        Students.Builder setGradYear
         */

        public String getBatch() {
            return batch;
        }

        public void setBatch(String batch) {
            this.batch = batch;
        }

        public String getUniversityName() {
            return universityName;
        }

        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public String getPhoneNo() {
            return phoneNo;
        }

        public void setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        /*

         */
        public Student build(){
            /*
            Validations
            */
            if(this.gradYear <= 2020){
                throw new RuntimeException("grad year is not greater than 2020");
            }
            if(this.psp < 85){
                throw new RuntimeException("psp is less than 85");
            }
            return new Student(this);
        }
    }

}
