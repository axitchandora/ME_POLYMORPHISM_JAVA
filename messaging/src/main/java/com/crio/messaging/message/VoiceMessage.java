package com.crio.messaging.message;

public class VoiceMessage extends Message{

    private String voiceMessageContent;
    private Integer durationInSec;
    private Integer voiceQualityInKbps;

    public VoiceMessage(){
        super();
        this.setMessageType(MessageType.VOICE);
    }

    public String getVoiceMessageContent() {
        return voiceMessageContent;
    }
    
    public void setVoiceMessageContent(String voiceMessageContent, Integer durationInSec, Integer voiceQualityInKbps) {
        this.voiceMessageContent = voiceMessageContent;
        this.durationInSec = durationInSec;
        this.voiceQualityInKbps = voiceQualityInKbps;
    }

    @Override
    public String toString() {
        return "VoiceMessage [VoiceMessageContent=" + voiceMessageContent + "messageId=" + this.getMessageId() + ", voiceQualityInKbps=" + voiceQualityInKbps  + 
        ", durationInSec=" + durationInSec +  ", messageStatus="
        + this.getMessageStatus() + ", receiverId=" + this.getReceiverId() + ", senderId=" + this.getSenderId() + "]";
    }

}
