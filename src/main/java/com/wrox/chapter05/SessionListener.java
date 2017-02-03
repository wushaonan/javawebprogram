package com.wrox.chapter05;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionIdListener;
import javax.servlet.http.HttpSessionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by nan on 17-2-3.
 */
@WebListener
public class SessionListener implements HttpSessionListener,HttpSessionIdListener {
    private SimpleDateFormat formatter =
            new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss");
    @Override
    public void sessionIdChanged(HttpSessionEvent httpSessionEvent, String oldSessionId) {
        System.out.println(this.date() + ": Session ID " + oldSessionId +
                " changed to " + httpSessionEvent.getSession().getId());
        SessionRegistry.updateSessionId(httpSessionEvent.getSession(), oldSessionId);
    }

    @Override
    public void sessionCreated(HttpSessionEvent httpSessionEvent) {
        System.out.println(this.date() + ": Session " + httpSessionEvent.getSession().getId() +
                " created.");
        SessionRegistry.addSession(httpSessionEvent.getSession());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent httpSessionEvent) {
        System.out.println(this.date() + ": Session " + httpSessionEvent.getSession().getId() +
                " destroyed.");
        SessionRegistry.removeSession(httpSessionEvent.getSession());
    }
    private String date()
    {
        return this.formatter.format(new Date());
    }
}
