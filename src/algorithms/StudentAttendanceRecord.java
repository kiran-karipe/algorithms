package algorithms;

public class StudentAttendanceRecord {
	public boolean checkRecord(String string) {
		int absentCount = 0;
		for(int i=0;i<string.length(); i++) {
			if(string.charAt(i) == 'A') {
				absentCount += 1;
				if(absentCount > 1) {
					return false;
				}
			} 
			if(i > 0 && i < string.length() - 1) {
				if(string.charAt(i-1) == 'L' && string.charAt(i) == 'L' && string.charAt(i+1) == 'L') {
					return false;
				}
			}
		}
		return true;
	}
	
	
	public static void main(String args[]) {
		StudentAttendanceRecord record = new StudentAttendanceRecord();
		System.out.println(record.checkRecord("PPALL"));
	}
}
