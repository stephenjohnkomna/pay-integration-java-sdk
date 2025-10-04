package core;

public class Endpoint {
   /* These are definition of all the endpoints required
        for the pay integrations.*/

    //CHECKOUT ENDPOINTS
    public static String PAY_PROVIDER_CHECKOUT_INITIALIZE_TRANSACTION ="/cashier/initialize";
    public static String PAY_PROVIDER_CHECKOUT_TRANSACTION_STATUS ="/cashier/status";
    public static String PAY_PROVIDER_CHECKOUT_CLOSE_TRANSACTION ="/cashier/status";

    //TRANSFER TO OPAY WALLET ENDPOINTS
    public static String PAY_PROVIDER_TRANSFER_TOWALLET ="/transfer/toWallet";
    public static String PAY_PROVIDER_TRANSFER_STATUS_TOWALLET ="/transfer/status/toWallet";

    // ENDPOINT TO TRANSFER TO BANK
    public static String PAY_PROVIDER_TRANSFER_TOBANKS ="/transfer/toBank";
    public static String PAY_PROVIDER_TRANSFER_STATUS_TOBANKS ="/transfer/status/toBank";

    //ENDPOINT FOR TRANSFER COUNTRIES THAT OPAY CURRENTLY SUPPORT
    public static String PAY_PROVIDER_TRANSFER_SUPPORT_COUNTRIES ="/countries";

    //ENDPOINT FOR BANKS THAT OPAY CURRENTLY SUPPORTS
    public static String PAY_PROVIDER_TRANSFER_SUPPORT_BANKS ="/banks";


  // ENDPOINT FOR THE BALANCES OF ALL YOUR OPAY ACCOUNTS
    public static String PAY_PROVIDER_INQUIRY_BALANCE_FOR_ALL_ACCOUNT ="/balance";

    // ENDPOINT TO VALIDATE(QUERY) OPAY USER
    public static String PAY_PROVIDER_INQUIRY_VALIDATE_USER ="/info/user";

    // ENDPOINT TO VALIDATE(QUERY) OPAY MERCHANT
    public static String PAY_PROVIDER_INQUIRY_VALIDATE_MERCHANT ="/info/merchant";

    //  verifies specified account number and returns allocated account name.
    public static String PAY_PROVIDER_INQUIRY_VERIFY_ACCOUNT_AND_RETURN_ALLOCATEDACCOUNTNAME ="/verification/accountNumber/resolve";
}