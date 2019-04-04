package gmi.accounts.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Attachment{
    @JsonProperty("attachment_uid")
    private int attachmentUid; //: "330250",
    @JsonProperty("file_name")
    private String fileName; //: "test.pdf",
    @JsonProperty("description")
    private String description; //: "",
    @JsonProperty("attached_at")
    private Date attachedAt; //: "2017-08-17T12:00"
}
