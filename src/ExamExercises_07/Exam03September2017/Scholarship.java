package ExamExercises_07.Exam03September2017;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Scholarship {
    public static void main(String[] args) throws IOException {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));

        double income = Double.parseDouble(scan.readLine());
        double grade = Double.parseDouble(scan.readLine());
        double minPay = Double.parseDouble(scan.readLine());

        double scholarshipSocial = minPay * 0.35;
        double scholarshipGrade = grade * 25;


        if (grade < 4.50) {
            System.out.println("You cannot get a scholarship!");

        } else if (grade < 5.50 & income < minPay) {

            System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(scholarshipSocial));

        } else if (income < minPay) {

            double sClr = Math.max(scholarshipSocial, scholarshipGrade);

            if (sClr == scholarshipGrade) {
                System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(sClr));

            } else if (sClr == scholarshipSocial) {
                System.out.printf("You get a Social scholarship %.0f BGN", Math.floor(sClr));

            }
        } else if (grade >= 5.50){
            System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(scholarshipGrade));

                }else
                 System.out.println("You cannot get a scholarship!");
            }
        }