
 class SY2022bit014 {
    public static void main(String[] args) {
        String[] regno = {"2022bit001", "2022bcs002", "2022bme003", "2022bch004"};
        int num = getValidRegistrationsCount(regno);
        System.out.println("Count: " + num);
    }

    static int getValidRegistrationsCount(String[] registrations) {
        String[] validDepartments = {"bit", "bcs", "bme", "bch"};

        int count = 0;

        for (String regNumber : registrations) {
            String department = regNumber.substring(4, 7);

            for (String validDepartment : validDepartments) {
                if (department.equals(validDepartment)) {
                    count++;
                    break;
                } 
            }
        }

        return count;
    }
}
