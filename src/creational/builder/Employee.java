package creational.builder;

public class Employee {

    private String name;
    private String email;
    private String phone;
    private String address;
    private String department;
    private double salary;

    private Employee(EmployeeBuilder builder) {
        this.name = builder.name;
        this.email = builder.email;
        this.phone = builder.phone;
        this.address = builder.address;
        this.department = builder.department;
        this.salary = builder.salary;
    }

    public static class EmployeeBuilder {
        private String name;
        private String email;
        private String phone;
        private String address;
        private String department;
        private double salary;

        public EmployeeBuilder name(String name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder email(String email) {
            this.email = email;
            return this;
        }

        public EmployeeBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public EmployeeBuilder address(String address) {
            this.address = address;
            return this;
        }
        public EmployeeBuilder department(String department) {
            this.department = department;
            return this;
        }
        public EmployeeBuilder salary(double salary) {
            this.salary = salary;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }

    }


    static void main(String[] args) {
        Employee builder = new EmployeeBuilder()
                .address("Test address")
                .department("Test department")
                .salary(1200)
                .email("Test email")
                .build();
        System.out.println(builder.address);
    }




}
