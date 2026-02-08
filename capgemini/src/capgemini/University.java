package capgemini;
class User {

    String name;

    public void login() {
        System.out.println("User logged in");
    }

    public void logout() {
        System.out.println("User logged out");
    }

    public void updateProfile() {
        System.out.println("Profile updated");
    }
}
class Stu extends User {

	public void registerCourse(int count) {
        System.out.println("Courses successfully registered: " + count);
    }

	public void viewGrades() {
        System.out.println("Grades displayed");
    }

	public void payFees() {
        System.out.println("Fees paid successfully");
    }
}
class TeachingStaff extends User {
    
	public void uploadMarks() {
        System.out.println("Marks uploaded successfully");
    }

	public void createAssignment() {
        System.out.println("Assignment created");
    }

	public void takeAttendance() {
        System.out.println("Attendance taken");
    }
}
class NonTeachingStaff extends User {

	public void managePayroll() {
        System.out.println("Payroll managed");
    }

	public void approveLeave() {
        System.out.println("Leave approved successfully");
    }

	public void maintainRecords() {
        System.out.println("Records maintained");
    }
}

public class University {
	    public static void main(String[] args) {

	        Stu s = new Stu();
	        s.login();
	        s.registerCourse(3);
	        System.out.println();

	        TeachingStaff t = new TeachingStaff();
	        t.uploadMarks();
	        System.out.println();
	        
	        NonTeachingStaff n = new NonTeachingStaff();
	        n.approveLeave();

	    }
	}



