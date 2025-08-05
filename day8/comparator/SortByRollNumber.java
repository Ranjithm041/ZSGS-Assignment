package com.day8.comparator;
import java.util.Comparator;
public class SortByRollNumber implements Comparator<Student> {
	@Override
	public int compare(Student a, Student b) {
		return a.rollNumber-b.rollNumber;
	}
}
