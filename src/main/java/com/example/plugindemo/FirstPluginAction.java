package com.example.plugindemo;

import com.intellij.notification.Notification;
import com.intellij.notification.NotificationDisplayType;
import com.intellij.notification.NotificationGroup;
import com.intellij.notification.Notifications;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.ui.MessageType;

/**
 * @Author: zxz
 * @Date: 2023/4/16
 * @Description: com.example.plugindemo
 */
public class FirstPluginAction extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        // TODO: insert action logic here
        NotificationGroup notificationGroup = new NotificationGroup("firstplugin_id", NotificationDisplayType.BALLOON, true);
        Notification notification = notificationGroup.createNotification("点击测试", MessageType.INFO);
        Notifications.Bus.notify(notification);
    }
}
