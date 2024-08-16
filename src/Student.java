public class Student {
    private String name;
    private int age;
    private String department;
    private String section;
    private String college;
    private int percentage;

    private Student(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.department = builder.department;
        this.section = builder.section;
        this.college = builder.college;
        this.percentage = builder.percentage;
    }

    public static Builder getBuilder(){
        return new Builder();
    }

    public static class Builder{
        private String name;
        private int age;
        private String department;
        private String section;
        private String college;
        private int percentage;
        public Builder name(String name){
            this.name = name;
            return this;
        }
        public Builder age(int age){
            this.age = age;
            return this;
        }
        public Builder department(String department){
            this.department = department;
            return this;
        }
        public Builder section(String section){
            this.section = section;
            return this;
        }
        public Builder college(String college){
            this.college = college;
            return this;
        }
        public Builder percentage(int percentage){
            this.percentage = percentage;
            return this;
        }
        public Student build(){
            if(age < 18){
                throw new RuntimeException("Not Eligible");
            }
            if(!department.equals("ECE")){
                throw new RuntimeException("Not Eligible");
            }
           return new Student(this);
        }
    }

}
