package gmi.accounts;

public class AccountsApiMethodConstants{
    /* <apiBaseUri> */
    static final String GMI_ACCOUNTS_URL = "https://api.getmyinvoices.com/accounts/v2";
    /* </apiBaseUri> */

    /* <parameters> */
    static final String STATUS_SUCCESS = "success";

    public static final String PRIMARY_UNIQUE_ID = "prim_uid";
    public static final String COMPANY_ID = "company_id";
    public static final String NAME = "name";
    public static final String COMPANY_TYPE = "company_type";
    public static final String NOTE = "note";
    public static final String TAGS = "tags";
    public static final String STREET = "street";
    public static final String ZIP = "zip";
    public static final String CITY = "city";
    public static final String EMAIL = "email";
    public static final String PHONE = "phone";
    public static final String FAX = "fax";
    public static final String TAX_NUMBER = "tax_number";
    public static final String VAT_ID = "vat_id";
    public static final String COMMERCIAL_REGISTER = "commercial_register";
    public static final String IBAN = "iban";
    public static final String BIC = "bic";
    public static final String URL = "url";
    public static final String API_KEY = "api_key";
    /* </parameters> */

    /* <methodPaths> */
    static final String METHOD_API_STATUS = "/apiStatus";
    static final String METHOD_LIST_COMPANIES = "/listCompanies";
    static final String METHOD_GET_COMPANY = "/getCompany";
    static final String METHOD_LIST_DOCUMENTS = "/listDocuments";
    static final String METHOD_GET_DOCUMENT = "/getDocument";
    static final String METHOD_UPLOAD_NEW_DOCUMENT = "/uploadNewDocument";
    static final String METHOD_GET_COUNTRIES = "/getCountries";
    static final String METHOD_GET_CURRENCIES = "/getCurrencies";
    static final String METHOD_ADD_CUSTOM_COMPANY = "/addCustomCompany";
    static final String METHOD_UPDATE_CUSTOM_COMPANY = "/updateCustomCompany";
    static final String METHOD_DELETE_CUSTOM_COMPANY = "/deleteCustomCompany";
    static final String METHOD_LIST_ATTACHMENTS = "/listAttachments";
    static final String METHOD_UPLOAD_ATTACHMENT = "/uploadAttachment";
    static final String METHOD_DELETE_ATTACHMENT = "/deleteAttachment";
    static final String METHOD_UPDATE_DOCUMENT = "/updateDocument";
    /* </methodPaths>*/
}
