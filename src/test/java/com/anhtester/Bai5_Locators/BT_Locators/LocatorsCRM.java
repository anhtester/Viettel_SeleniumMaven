package com.anhtester.Bai5_Locators.BT_Locators;

public class LocatorsCRM {

    //Trang Login CRM
    public static String headerLoginPage = "//h1[normalize-space()='Login']";
    public static String inputEmail = "//input[@id='email']";
    public static String inputPassword = "//input[@id='password']";
    public static String buttonLogin = "//button[normalize-space()='Login']";
    public static String linkForgotPassword = "//a[normalize-space()='Forgot Password?']";

    //Trang Dashboard
    public static String menuDashboard = "//ul[@id='side-menu']//span[normalize-space()='Dashboard']";
    public static String menuCustomers = "//ul[@id='side-menu']//span[normalize-space()='Customers']";
    public static String menuProjects = "//ul[@id='side-menu']//span[normalize-space()='Projects']";
    public static String menuTasks = "//ul[@id='side-menu']//span[normalize-space()='Tasks']";

    //Trang Customers List
    public static String buttonAddNewCustomer = "//a[normalize-space()='New Customer']";
    public static String buttonImportCustomer = "//a[normalize-space()='Import Customers']";
    public static String buttonContacts = "//a[contains(@href, 'clients/all_contacts')]";
    public static String headerCustomerPage = "//h4[normalize-space()='Customers Summary']";
    public static String inputSearchCustomers = "//div[@id='DataTables_Table_0_filter']//input";
    //Add New Customer
    public static String inputCompany = "//input[@id='company']";
    public static String inputVatNumber = "//input[@id='vat']";
    public static String inputPhone = "//input[@id='phonenumber']";
    public static String inputWebsite = "//input[@id='website']";
    public static String dropdownGroups = "//button[@data-id='groups_in[]']";
    public static String inputSearchGroups = "//div[@app-field-wrapper='groups_in[]']//input[@type='search']";
    public static String dropdownCurrency = "//button[@data-id='default_currency']";
    public static String inputSearchCurrency = "//div[@app-field-wrapper='default_currency']//input";


    //Trang Project (6-10)
    public static String inputProjectName = "//label[@for='name']/following-sibling::input";

}