package com.hoshino.reggie.utils;

import org.springframework.mail.SimpleMailMessage;

/**
 * 发送邮箱
 */
public class SendMail {
    public void sendSimpleMail(String fromAddress,String to, String subject, String content) {
        // 编辑发送邮件的一些信息，有-->发件人地址，收件人地址，邮件标题，邮件正文
        SimpleMailMessage message = new SimpleMailMessage();
        // 发件人地址
        message.setFrom(fromAddress);
        // 收件人地址
        message.setTo(to);
        // 邮件标题
        message.setSubject(subject);
        // 邮件正文
        message.setText(content);
    }

}
