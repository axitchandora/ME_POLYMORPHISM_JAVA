package com.crio.messaging.message;

// Message class contains all message related variables/functions.
public class Message {
    private String messageId;
    private String senderId;
    private String receiverId;
    private MessageType messageType;

    // Some Common fields, can be extended to many more.
    private MessageStatus messageStatus;

    public Message() {
        this.messageStatus = MessageStatus.SENT;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(String receiverId) {
        this.receiverId = receiverId;
    }

    public MessageStatus getMessageStatus() {
        return messageStatus;
    }

    public void setMessageStatus(MessageStatus messageStatus) {
        this.messageStatus = messageStatus;
    }

    public MessageType getMessageType() {
        return messageType;
    }

    protected void setMessageType(MessageType messageType) {
        this.messageType = messageType;
    }

    public String getMessageId() {
        return messageId;
    }

    protected void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    @Override
    public String toString() {
        return "Message [messageId=" + messageId + ", messageStatus="
                + messageStatus + ", receiverId=" + receiverId + ", senderId=" + senderId + "]";
    }


}
