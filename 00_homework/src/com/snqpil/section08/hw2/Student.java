package com.snqpil.section08.hw2;

public class Student {
	
	private int grade;		// 학년
	private int classroom;	// 반
	private String name;	// 이름
	private int kor;		// 국어점수
	private int eng;		// 영어점수
	private int math;		// 수학점수
	
	public Student() {}
	
	
	public Student(int grade, int classroom, String name, int kor, int eng, int math) {
		this.grade = grade;
		this.classroom = classroom;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	
	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	public int getClassroom() {
		return classroom;
	}


	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getKor() {
		return kor;
	}


	public void setKor(int kor) {
		this.kor = kor;
	}


	public int getEng() {
		return eng;
	}


	public void setEng(int eng) {
		this.eng = eng;
	}


	public int getMath() {
		return math;
	}


	public void setMath(int math) {
		this.math = math;
	}


	public String information() {
		return (grade + "학년 " + classroom + "반 " + name + "의 국어점수는 " + kor + "점, 영어점수는 " + eng + "점, 수학점수는 " + math + "점입니다.");
	}
	
	
}
