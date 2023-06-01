package JavaOOP3.testcases;

import JavaOOP3.common.BaseTest;

public class TestCase extends BaseTest {
    String email;
    String passwd;
    public void Login(String email, String passwd){
        System.out.println("TestCase1: Login");
        System.out.println("Step1: Open Browser: ");
        createBrowser("https://cms.anhtester.com/login", true, true);
        System.out.println("Step2: Enter Email: " + email);
        System.out.println("Step3: Enter Password: " + passwd);
        System.out.println("Step4: Click on button Login ");
        System.out.println("Step5: Check login Successful");
        System.out.println("Step6: Close Browser");
        closeBrowser();
    }
    public void AddCategory(String categoryName){
        System.out.println("TestCase2: Add Category");
        System.out.println("Step1: Open Browser:");
        createBrowser("https://cms.anhtester.com/login", true, true);
        System.out.println("Step2: Click Button Add Category");
        System.out.println("Step3: Enter Category Name: " + categoryName);
        System.out.println("Step4: Click Button Save");
        System.out.println("Step5: Check Add Category Successful");
        System.out.println("Step6: Close Browser");
        closeBrowser();
    }
    public static void main(String[] args) {
        TestCase TC1 = new TestCase();
        TC1.Login("abc@gmail.com", "123456a@");
        System.out.println("============================================");
        TC1.AddCategory("JavaOOP");
    }
}