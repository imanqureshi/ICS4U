package testThree;

public abstract class Animal {
private String name;
private int age;

public Animal(String n, int a) {
	name = n;
	age = a;
}

public void setName(String n) {
	name = n;
}
public String getName() {
	return name;
}
public void setAge(int a) {
	age = a;
}
public int getAge() {
	return age;
}

public abstract String playWith();

public String toString() {
	String info;
	info = "Name: " + getName() + "\nAge: " + getAge() + "\n" + playWith();
	return info;
}
}
