package com.LeXiang.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Message  implements Serializable {
    private Long id;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createddate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date lastmodifieddate;

    private Long version;

    private String ip;

    private Boolean isdraft;

    private Boolean receiverdelete;

    private Boolean receiverread;

    private Boolean senderdelete;

    private Boolean senderread;

    private String title;

    private Long formessageId;

    private Long receiverId;

    private Long senderId;

    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public Date getLastmodifieddate() {
        return lastmodifieddate;
    }

    public void setLastmodifieddate(Date lastmodifieddate) {
        this.lastmodifieddate = lastmodifieddate;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Boolean getIsdraft() {
        return isdraft;
    }

    public void setIsdraft(Boolean isdraft) {
        this.isdraft = isdraft;
    }

    public Boolean getReceiverdelete() {
        return receiverdelete;
    }

    public void setReceiverdelete(Boolean receiverdelete) {
        this.receiverdelete = receiverdelete;
    }

    public Boolean getReceiverread() {
        return receiverread;
    }

    public void setReceiverread(Boolean receiverread) {
        this.receiverread = receiverread;
    }

    public Boolean getSenderdelete() {
        return senderdelete;
    }

    public void setSenderdelete(Boolean senderdelete) {
        this.senderdelete = senderdelete;
    }

    public Boolean getSenderread() {
        return senderread;
    }

    public void setSenderread(Boolean senderread) {
        this.senderread = senderread;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Long getFormessageId() {
        return formessageId;
    }

    public void setFormessageId(Long formessageId) {
        this.formessageId = formessageId;
    }

    public Long getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(Long receiverId) {
        this.receiverId = receiverId;
    }

    public Long getSenderId() {
        return senderId;
    }

    public void setSenderId(Long senderId) {
        this.senderId = senderId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}