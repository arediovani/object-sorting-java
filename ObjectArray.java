package pkg2d.array.sorting;

import java.util.Scanner;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class ObjectArray {

    public File[] ObjectArray;
    public Scanner sc;
    public Sorting Sorting;
    public Date currentDate;
    private static DateFormat dateFormat;
    public Random rd;

    public ObjectArray() {
        this.sc = new Scanner(System.in);
        this.Sorting = new Sorting();
        this.currentDate = new Date();
        this.rd = new Random();
        dateFormat = new SimpleDateFormat("HH:mm:ss");
    }

    public void SortName() {
        this.Sorting.SortName(this.ObjectArray);
    }

    public void SortType() {
        this.Sorting.SortType(this.ObjectArray);
    }

    public void SortDate() {
        this.Sorting.SortDate(this.ObjectArray);
    }

    public void SortSize() {
        this.Sorting.SortSize(this.ObjectArray);
    }

    public void Reverse() {
        for (int i = 0; i < this.ObjectArray.length / 2; i++) {
            File temp = this.ObjectArray[i];
            this.ObjectArray[i] = this.ObjectArray[this.ObjectArray.length - i - 1];
            this.ObjectArray[this.ObjectArray.length - i - 1] = temp;
        }
    }

    public void AddFiles() {
        System.out.println("Enter the ammount of files you want!");
        int size = sc.nextInt();
        this.ObjectArray = new File[size];
        this.Sorting = new Sorting(this.ObjectArray);
        for (int i = 0; i < this.ObjectArray.length; i++) {
            this.ObjectArray[i] = CreateFiles();
        }
    }

    public File CreateFiles() {
        System.out.println("Enter the name:");
        String name = sc.next();
        System.out.println("Enter the FileType:");
        String type = sc.next();
        String date = dateFormat.format(this.currentDate);
        System.out.println("Time of creation: " + date);
        int size = rd.nextInt(9999);
        System.out.println("Size in Kb:" + size);
        System.out.println("-----------------");
        return new File(name, type, date, size);
    }

    public void Print() {
        System.out.format("%-15s %6s %20s %10s%n", "Name", "Type", "Date Of Creation", "Size");
        for (int i = 0; i < this.ObjectArray.length; i++) {
            System.out.format("%-15s %6s %20s %10d%n", this.ObjectArray[i].getName(), this.ObjectArray[i].getType(), this.ObjectArray[i].getDate(), this.ObjectArray[i].getSize());
        }
    }

    public String ReturnString(int index) {
        return this.ObjectArray[index].getName();

    }

    public int ReturnInt(int index) {

        return this.ObjectArray[index].getSize();
    }
}
