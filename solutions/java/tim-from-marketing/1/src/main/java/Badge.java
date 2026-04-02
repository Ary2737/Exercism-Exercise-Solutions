class Badge {
    public String print(Integer id, String name, String department) {

        String badge;

        // Check if employee is the owner
        if(department == null) {
            department = "OWNER";
        } else {
            department = department.toUpperCase();
        }

        // Check if the employee is new
        if(id == null) {
            badge = String.format("%s - %s", name, department);
        } else {
            badge = String.format("[%s] - %s - %s", id, name, department);
        }

        return badge;

    }
}
