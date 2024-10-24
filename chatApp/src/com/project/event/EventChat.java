package com.project.event;

import com.project.model.Model_Receive_Message;
import com.project.model.Model_Send_Message;

public interface EventChat {

    public void sendMessage(Model_Send_Message data);

    public void receiveMessage(Model_Receive_Message data);
}
