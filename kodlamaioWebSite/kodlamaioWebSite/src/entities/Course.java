package entities;

public class Course {
    private int id;
    private String name;
    private double unitprice;
    private String instructor;
    private String category;
    private String courseImg;


    public Course() {
    }

    public Course(int id, String name, double unitprice, String instructor, String category, String courseImg) {
        this.id = id;
        this.name = name;
        this.unitprice = unitprice;
        this.instructor = instructor;
        this.category = category;
        this.courseImg = courseImg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(double unitprice) {
        this.unitprice = unitprice;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCourseImg() {
        return courseImg;
    }

    public void setCourseImg(String courseImg) {
        this.courseImg = courseImg;
    }
}
