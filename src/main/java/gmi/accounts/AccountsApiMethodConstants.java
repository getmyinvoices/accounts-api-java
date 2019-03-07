package gmi.accounts;

public class AccountsApiMethodConstants{
    /* <apiBaseUri> */
    static final String GMI_ACCOUNTS_URL = "https://api.getmyinvoices.com/accounts/v2";
    /* </apiBaseUri> */

    /* <response> */
    // status
    static final String STATUS_SUCCESS = "success";

    // company
    static final String PARAM_PRIMARY_UNIQUE_ID = "prim_uid";
    static final String PARAM_NAME = "name";
    static final String PARAM_COMPANY_TYPE = "company_type";
    static final String PARAM_NOTE = "note";
    static final String PARAM_TAGS = "tags";

    /* </response> */

    /* <request> */
    static final String API_KEY = "api_key";
    /* </request> */

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
    /* </methodPaths>*/
}
