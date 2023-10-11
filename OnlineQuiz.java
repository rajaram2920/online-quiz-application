import java.util.Scanner;

public class OnlineQuiz {
public static void main (String[] args)
{
	System.out.println("____________________________________________________________________________________________");
    System.out.println();
    System.out.println("Instructions :");
    System.out.println();
    System.out.println("->Read the questions and choose the option carefully");
    System.out.println("->Choose the option from (a),(b),(c)");
    System.out.println("->Score above 40 to pass ");
    System.out.println("____________________________________________________________________________________________");
    System.out.println();
    
    Scanner sc = new Scanner(System.in);
   
    System.out.println("Press enter to start ");
    String start = sc.nextLine();
    System.out.println("                      Assessment-1 (Quiz) ");
    System.out.println();
    System.out.println("Details ");
    System.out.println();
    System.out.println("Enter your name ");
    String name = sc.next();
    System.out.println("Enter Date (dd/mm/yy) : ");
    String date = sc.next();
    System.out.println("Enter your Enrollment Number ");
    int enRollNo =sc.nextInt();
    System.out.println("Enter your BatchCode  ");
    int batchCode = sc.nextInt();   
    System.out.println();
   
   
    
    System.out.println();
    System.out.println();
    //Question - 1
    System.out.println("Question 1 of 5 :");
    String question1 = "What does the expression float a = 35/0 return?";
    String optA1 = "a) 0";
    String optA2 = "b) Run time Exception ";
    String optA3 = "c) infinity";
    System.out.println(question1);
    System.out.println(optA1);
    System.out.println(optA2);
    System.out.println(optA3);
    System.out.println("Choose and Enter the correct option(a,b,c) ");
    char  ans1 = sc.next().charAt(0);
    System.out.println();
    //Question - 2
    System.out.println("Question 2 of 5 :");
    String question2 = "In which process, a local variable has the same name as one of the instance variables?";
    String optB1 = "a) Serialization";
    String optB2 = "b) MultiThreading ";
    String optB3 = "c) Variable Shadowing";
    System.out.println(question2);
    System.out.println(optB1);
    System.out.println(optB2);
    System.out.println(optB3);
    System.out.println("Choose and Enter the correct choice(a,b,c) ");
    char ans2 = sc.next().charAt(0);
    System.out.println();
    //Question-3
    System.out.println("Question 3 of 5 :");
    String question3 = "An interface with no fields or methods is known as _? ";
    String optC1 = "a) Abstract Interface";
    String optC2 = "b) Runnable Interface ";
    String optC3 = "c) marker Interface ";
    System.out.println(question3);
    System.out.println(optC1);
    System.out.println(optC2);
    System.out.println(optC3);
    System.out.println("Choose and Enter the correct choice(a,b,c) ");
    char ans3 = sc.next().charAt(0);
    System.out.println();
    
    //question -4
    System.out.println("Question 4 of 5 :");
    String question4 = "JVM in java stands for__? ";
    String optD1 = "a) Java Virtual Machine";
    String optD2 = "b) Java Virtual Money ";
    String optD3 = "c) None of these ";
    System.out.println(question4);
    System.out.println(optD1);
    System.out.println(optD2);
    System.out.println(optD3);
    System.out.println("Choose and Enter the correct choice(a,b,c) ");
    char ans4 = sc.next().charAt(0);
    System.out.println();
     //Question - 5
    System.out.println("Question 5 of 5 :");
    String question5 = "How many threads can be executed at a time? ";
    String optE1 = "a) Only one thread";
    String optE2 = "b) Multiple threads";
    String optE3 = "c) Two threads ";
    System.out.println(question5);
    System.out.println(optE1);
    System.out.println(optE2);
    System.out.println(optE3);
    System.out.println("Choose and Enter the correct choice(a,b,c) ");
    char ans5 = sc.next().charAt(0);
    System.out.println();

    System.out.print("Processing Your result.");
    double Marks = 0;
    
    for(int i =0;i<10;i++)
    {
      System.out.print(".");
    try{
    Thread.sleep(01000);
    }catch(Exception e)
    {

    }
  }
    System.out.println();
    System.out.println("______________________________________________________________________________________________");
    System.out.println("");
    System.out.println( "                            "+name  );
    
    System.out.println("                      Assessment-1(quiz)");
    System.out.println("                  Detailed Report(Solutions)");
    System.out.println("                    Submitted on "+date);
    System.out.println("______________________________________________________________________________________________");
    System.out.println();
    
    //Question 1(Report)
    if(ans1 == 'c')
    {
      Marks ++;
      System.out.println("Question 1 of 5");
      System.out.println(question1);
      System.out.println(optA1);
      System.out.println(optA2);
      System.out.println(optA3 + " (Correct Answer)");
    }
    else if(ans1 == 'b')
    {
      System.out.println("Question 1 of 5");
      System.out.println(question1);
      System.out.println(optA1);
      System.out.println(optA2+" (Candidate's Answer)");
      System.out.println(optA3+" (Correct Answer)");
    }
     else if (ans1=='a')
     {
      System.out.println("Question 1 of 5");
      System.out.println(question1);
      System.out.println(optA1+" (Candidate's Answer)");
      System.out.println(optA2);
      System.out.println(optA3+" (Correct Answer)");
     }
      
     System.out.println();
   
     //Question 2(Report)

    if(ans2 == 'c')
    {
      Marks ++;
      System.out.println("Question 2 of 5");
      System.out.println(question2);
      System.out.println(optB1);
      System.out.println(optB2);
      System.out.println(optB3 + " (Correct Answer)");
    }
    else if(ans2 == 'b')
    {
      System.out.println("Question 2 of 5");
      System.out.println(question2);
      System.out.println(optB1);
      System.out.println(optB2+ " (Candidate's Answer)");
      System.out.println(optB3+" (Correct Answer)");
    }
     else if(ans2 =='a')
     {
      System.out.println("Question 2 of 5");
      System.out.println(question2);
      System.out.println(optB1+" (Candidate's Answer)");
      System.out.println(optB2);
      System.out.println(optB3+" (Correct Answer)");
     }
      
     System.out.println();

     //Question 3(Report)
    if(ans3 == 'c')
    {
      Marks++;
      System.out.println("Question 3 of 5");
      System.out.println(question3);
      System.out.println(optC1);
      System.out.println(optC2);
      System.out.println(optC3 + " (Correct Answer)");
    }
    else if(ans3 == 'b')
    {
      System.out.println("Question 3 of 5");
      System.out.println(question3);
      System.out.println(optC1);
      System.out.println(optC2+" (Candidate's Answer)");
      System.out.println(optC3+" (correct Answer)");
    }
     else if(ans3 =='a')
     {
      System.out.println("Question 3 of 5");
      System.out.println(question3);
      System.out.println(optC1+" (Candidates Answer)");
      System.out.println(optC2);
      System.out.println(optC3+" (correct Answer)");
     }
       System.out.println();

       //Question -4(Report)
      if(ans4 == 'a')
    {
      Marks ++;
      System.out.println("Question 4 of 5");
      System.out.println(question4);
      System.out.println(optD1+ " (Correct Answer)");
      System.out.println(optD2);
      System.out.println(optD3 );
    }
    else if(ans4 == 'b')
    {
      System.out.println("Question 4 of 5");
      System.out.println(question4);
      System.out.println(optD1+ " (Correct Answer)");
      System.out.println(optD2+" (Candidates Answer)");
      System.out.println(optD3);
    }
     else if (ans4=='c')
     {
      System.out.println("Question 4 of 5");
      System.out.println(question4);
      System.out.println(optD1+" (Correct Answer)");
      System.out.println(optD2);
      System.out.println(optD3+" (Candidate's Answer)");
     }
      
     System.out.println();


     //Question - 5(Report)
      if(ans5 == 'a')
    {
      
      System.out.println("Question 5 of 5");
      System.out.println(question5);
      System.out.println(optE1+" (Candidate's Answer)");
      System.out.println(optE2+ " (Correct Answer)");
      System.out.println(optE3 );
    }
    else if(ans5 == 'b')
    {
      Marks ++;
      System.out.println("Question 5 of 5");
      System.out.println(question5);
      System.out.println(optE1);
      System.out.println(optE2+" (Correct Answer)");
      System.out.println(optE3);
    }
     else if (ans5=='c')
     {
      System.out.println("Question 5 of 5");
      System.out.println(question5);
      System.out.println(optE1);
      System.out.println(optE2+" (Correct Answer)");
      System.out.println(optE3+" (Candidate's Answer)");
     }
      
     System.out.println();

       //Report

      System.out.println();
      

      
      System.out.println("                     Report ");
      
      System.out.println();
      System.out.println((int)Marks+" out of 5 Questions are correct");
      System.out.println("Your Score : "+(int)Marks);
      double  percentage =Marks/5*100;
      System.out.println("percentage : "+(int)percentage+" %");

      //Grade
      // System.out.print("Grade : ");
      // if(percentage ==0)
      // {
      //   System.out.println("F");
      // }
      System.out.print("Grade      : ");
      if (percentage<40)
      {
        System.out.println("F");
      }
        else if (percentage==40)
      {
        System.out.println("C");
      }
         else if (percentage==60)
      {
        System.out.println("B");
      }
        else if (percentage==80)
      {
        System.out.println("A");
      }
        else if (percentage==100)
      {
        System.out.println("A+");
      }

      //Result - pass/fail
      if(percentage < 40)
      {
        System.out.println("Result     : Failed");
      }
      else
      {
        System.out.println("Result     : passed");
      }
	
}
	
}
