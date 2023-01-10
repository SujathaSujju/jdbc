package com.xworkz.institute;

public class InstituteDto {

	private String name;
	private String location;
	private int noOfTrainers;
	private int noOfStudents;
	private String course;
	private int rating;
	
	
	public InstituteDto() {
		System.out.println("default constructor");
		}
	
	
	public InstituteDto(String name, String location, int noOfTrainers, int noOfStudents, String course, int rating) {
		super();
		this.name = name;
		this.location = location;
		this.noOfTrainers = noOfTrainers;
		this.noOfStudents = noOfStudents;
		this.course = course;
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getNoOfTrainers() {
		return noOfTrainers;
	}
	public void setNoOfTrainers(int noOfTrainers) {
		this.noOfTrainers = noOfTrainers;
	}
	public int getNoOfStudents() {
		return noOfStudents;
	}
	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}


	@Override
	public String toString() {
		return "InstituteDto [name=" + name + ", location=" + location + ", noOfTrainers=" + noOfTrainers
				+ ", noOfStudents=" + noOfStudents + ", course=" + course + ", rating=" + rating + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((course == null) ? 0 : course.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + noOfStudents;
		result = prime * result + noOfTrainers;
		result = prime * result + rating;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InstituteDto other = (InstituteDto) obj;
		if (course == null) {
			if (other.course != null)
				return false;
		} else if (!course.equals(other.course))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (noOfStudents != other.noOfStudents)
			return false;
		if (noOfTrainers != other.noOfTrainers)
			return false;
		if (rating != other.rating)
			return false;
		return true;
	}


	
	
}
