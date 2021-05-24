package pageUi;

public class AbstractPageUI {
	public static final String DYNAMIC_PAGE_LINK = "//a[text()='%s']";
	public static final String DYNAMIC_PAGE_BUTTON_TEXTBOX = "//*[@name='%s']";
	public static final String DYNAMIC_PAGE_BUTTON_RADIO = "//input[@value='%s']";
	public static final String DYNAMIC_SELECT_DROPDOWN = "//select[@name='%s']";
	public static final String DYNAMIC_SUCCESS_XPATH = "//p[@class='heading3' and text()='%s']";
	public static final String DYNAMIC_PAGE_LABEL= "//*[@name='%s']/ancestor::tr[position()=1]/td";
	public static final String DYNAMIC_CUSTOMER_VERIFICATION_TABLE_XPATH = "//table//td[text()='%s']/following-sibling::td";
	public static final String DYNAMIC_CUSTOMER_INLINE_MESSAGE_XPATH ="//*[@name='%s']/following-sibling::label";
	public static final String SUCCESSFULL_TEXT_XPATH = "//p[@class='heading3']";
	
	public static final String PAGE_NEW_CUSTOMER_NAME = "New Customer";
	public static final String PAGE_EDIT_CUSTOMER_NAME = "Edit Customer";
	public static final String PAGE_NEW_ACCOUNT_NAME = "New Account";
	public static final String PAGE_EDIT_ACCOUNT_NAME = "Edit Account";
	public static final String PAGE_WITHDRAW_NAME = "Withdrawal";
	public static final String PAGE_DEPOSIT_NAME = "Deposit";
	public static final String PAGE_FUND_TRANSFER_NAME = "Fund Transfer";
	public static final String PAGE_BALANCE_ENQUIRY_NAME = "Balance Enquiry";
	public static final String PAGE_DELETE_ACCOUNT_NAME = "Delete Account";
	public static final String PAGE_DELETE_CUSTOMER_NAME = "Delete Customer";
	public static final String CUSTOMERID_NAME = "cusid";
	public static final String SUBMIT_BUTTON_NAME = "AccSubmit";
	public static final String ACCOUNT_NO_NAME = "accountno";
	public static final String CUSTOMER_ID_TEXT = "Customer ID";
	public static final String CUSTOMER_NAME_TEXT = "Customer Name";
	public static final String CUSTOMER_GENDER_TEXT = "Gender";
	public static final String CUSTOMER_BIRTHDAY_TEXT = "Birthdate";
	public static final String CUSTOMER_ADDRESS_TEXT = "Address";
	public static final String CUSTOMER_CITY_TEXT = "City";
	public static final String CUSTOMER_STATE_TEXT = "State";
	public static final String CUSTOMER_PIN_TEXT = "Pin";
	public static final String CUSTOMER_MOBILE_TEXT = "Mobile No.";
	public static final String CUSTOMER_EMAIL_TEXT = "Email";
	public static final String ACCOUNT_ID_TEXT = "Account ID";
	public static final String ACCOUNT_TYPE_TEXT = "Account Type";
	public static final String DATE_OF_OPENING_TEXT = "Date of Opening";
	public static final String CURRENT_AMOUNT_TEXT = "Current Amount";
	public static final String TRANSACTION_ID_TEXT = "Transaction ID";
	public static final String AMOUNT_CREDITED_TEXT = "Amount Credited";
	public static final String TYPE_OF_TRANSACTION_TEXT = "Type of Transaction";
	public static final String DESCRIPTION_TEXT = "Description";
	public static final String CURRENT_BALANCE_TEXT = "Current Balance";
	public static final String AMOUNT_TRANSFER_TEXT = "Amount";
	public static final String ACCOUNT_NO_TEXT = "Account No";
	public static final String TYPE_OF_ACCOUNT_TEXT = "Type of Account";
	public static final String BALANCE_TEXT = "Balance";
	public static final String CUSTOMER_PASSWORD_TEXT = "Password";
	public static final String CUSTOMER_ADD_EMAIL_TEXT = "E-mail";
}
