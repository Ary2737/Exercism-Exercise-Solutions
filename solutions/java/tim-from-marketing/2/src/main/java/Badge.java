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
            badge = name + " - " + department;
        } else {
            badge = "[" + id + "] - " + name + " - " + department;
        }

        return badge;

    }
}
