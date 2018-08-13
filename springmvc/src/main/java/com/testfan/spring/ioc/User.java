package com.testfan.spring.ioc;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class User {
	
	private String name;
	private int age;
	
	private Car car;
	
	private List<Car> carList;
	
	private Set<Car> setlist;
	
	private Map<String, Object> map;
	
	
	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}

	public Set<Car> getSetlist() {
		return setlist;
	}

	public void setSetlist(Set<Car> setlist) {
		this.setlist = setlist;
	}

	public List<Car> getCarList() {
		return carList;
	}

	public void setCarList(List<Car> carList) {
		this.carList = carList;
	}

	public User() {
		System.out.println(" create ");
	}
	
	public void init() {
		System.out.println("init---");
	}
	
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		User other = (User) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
//	private Car car;
//	
//	private List<Car> carlsit;
//	private Set<Car> setlist;
//	
//	private Map<Object, Object> maptest;
//	
//	
//	public Map<Object, Object> getMaptest() {
//		return maptest;
//	}
//	public void setMaptest(Map<Object, Object> maptest) {
//		this.maptest = maptest;
//	}
//	public Set<Car> getSetlist() {
//		return setlist;
//	}
//	public void setSetlist(Set<Car> setlist) {
//		this.setlist = setlist;
//	}
//	public List<Car> getCarlsit() {
//		return carlsit;
//	}
//	public void setCarlsit(List<Car> carlsit) {
//		this.carlsit = carlsit;
//	}
//	public Car getCar() {
//		return car;
//	}
//	public void setCar(Car car) {
//		this.car = car;
//	}

//	
//	
//	@Override
//	public String toString() {
//		return "User [name=" + name + ", age=" + age + "]";
//	}
//	public static void main(String[] args) {
//		User usero = new User();
//		
//		try {
//			Class clz= Class.forName("com.spring.User"); //����
//			User user = (User) clz.newInstance();
//			user.test();
//		} catch (Exception e) {
//			e.printStackTrace();
//		} 
//	}
	
	
	public static void main(String[] args) {
		try {
			Class clz= Class.forName("com.testfan.spring.ioc.User");
			User  object =(User) clz.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
