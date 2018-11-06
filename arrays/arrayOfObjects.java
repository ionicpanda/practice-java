class Student
{
    public int roll_no;
    public String name;
    Student(int roll_no, String name)
    {
        this.roll_no = roll_no;
        this.name = name;
    }
}

public class arrayOfObjects
{
    public static void main (String[] args)
    {
        //Declare an array of integers
        Student[] arr;

        //allocate memory for 5 objects of type Student
        arr = new Student[5];

        //initialize first elements of array
        arr[0] = new Student(1,"billy");

        arr[1] = new Student(2, "bob");
        arr[2] = new Student(3, "Hermie");
        arr[3] = new Student(4, "Scout");
        arr[4] = new Student(5, "Rupert");

        // access elements
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at " +  i + " : "
            + arr[i].roll_no + " " + arr[i].name);


    }
}
