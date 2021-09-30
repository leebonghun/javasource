package shop;

//완전 추상화 => 상수 필드

public interface Ishop {
	void setTitle(String title); //public abstract 부분이 생략된것
	void genUser();
	void genProduct();
	void start();
}
