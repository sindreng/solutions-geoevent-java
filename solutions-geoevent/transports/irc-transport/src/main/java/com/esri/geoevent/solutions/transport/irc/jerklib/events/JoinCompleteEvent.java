package com.esri.geoevent.solutions.transport.irc.jerklib.events;

import com.esri.geoevent.solutions.transport.irc.jerklib.Channel;

/**
 * Event that occurs when a join to a channel is complete
 *
 * @author mohadib
 */
public interface JoinCompleteEvent extends IRCEvent
{

    /**
     * getChannel() returns Channel object for event
     *
     * @return <code>Channel</code>
     * @see Channel
     */
    public Channel getChannel();
}
