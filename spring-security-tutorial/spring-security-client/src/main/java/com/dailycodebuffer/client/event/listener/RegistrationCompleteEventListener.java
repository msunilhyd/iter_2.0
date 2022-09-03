package com.dailycodebuffer.client.event.listener;

import com.dailycodebuffer.client.entity.User;
import com.dailycodebuffer.client.event.RegistrationCompleteEvent;
import org.springframework.context.ApplicationListener;

import java.util.UUID;

public class RegistrationCompleteEventListener implements ApplicationListener<RegistrationCompleteEvent> {


    @Override
    public void onApplicationEvent(RegistrationCompleteEvent event) {
        // Create the verification token for the user
        User user = event.getUser();
        String token = UUID.randomUUID().toString();
        // send mail to user
    }
}
