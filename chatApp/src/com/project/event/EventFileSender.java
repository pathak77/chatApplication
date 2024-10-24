package com.project.event;

public interface EventFileSender {

    public void onSending(double percentage);

    public void onStartSending();

    public void onFinish();
}
