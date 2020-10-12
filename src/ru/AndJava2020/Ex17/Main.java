package ru.AndJava2020.Ex17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File f = new File("C:\\Users\\Saint\\IdeaProjects\\Ex17\\text.txt");
        String s=new Scanner(System.in).nextLine();
        //1
        try {
            FileWriter writer= new FileWriter(f);
            writer.write(s);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        //2
        try {
            System.out.println(new Scanner(new File("C:\\Users\\Saint\\IdeaProjects\\Ex17\\text.txt")).nextLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //3
        s=new Scanner(System.in).nextLine();
        try {
            FileWriter writer= new FileWriter(f);
            writer.write(s);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(new Scanner(new File("C:\\Users\\Saint\\IdeaProjects\\Ex17\\text.txt")).nextLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //4
        s=new Scanner(System.in).nextLine();
        try {
            FileWriter writer= new FileWriter(f,true);
            writer.append(s);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(new Scanner(new File("C:\\Users\\Saint\\IdeaProjects\\Ex17\\text.txt")).nextLine());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
