public class Student {
    private String studentID;
    private String studentName;
    private String[] extraActivities;

    public Student(String studentID, String studentName, int activityCount) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.extraActivities = new String[activityCount];
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String[] getExtraActivities() {
        return extraActivities;
    }

    public void setExtraActivities(String[] extraActivities) {
        this.extraActivities = extraActivities;
    }

    public void addExtraActivity(String activity, int index) {
        if (index >= 0 && index < this.extraActivities.length) {
            this.extraActivities[index] = activity;
        }
    }

    @Override
    public String toString() {
        StringBuilder activities = new StringBuilder();
        for (String activity : extraActivities) {
            if (activity != null) {
                activities.append(activity).append(", ");
            }
        }
        if (activities.length() > 0) {
            activities.setLength(activities.length() - 2);
        }
        return "Student ID: " + studentID + ", Name: " + studentName + ", Extra Activities: [" + activities.toString() + "]";
    }
}
