package com.esri.geoevent.solutions.transport.irc.jerklib.events.impl;

import com.esri.geoevent.solutions.transport.irc.jerklib.Channel;
import com.esri.geoevent.solutions.transport.irc.jerklib.Session;
import com.esri.geoevent.solutions.transport.irc.jerklib.events.IRCEvent;
import com.esri.geoevent.solutions.transport.irc.jerklib.events.JoinEvent;

/**
 * @author mohadib
 * @see JoinEvent
 *
 */
public class JoinEventImpl implements JoinEvent
{

	private final Type type = IRCEvent.Type.JOIN;
	private final String rawEventData, who, channelName, hostName, username;
	private final Session session;
	private final Channel chan;

	public JoinEventImpl
	(
		String rawEventData, 
		Session session, 
		String who, 
		String username, 
		String hostName, 
		String channelName, 
		Channel chan
	)
	{
		this.rawEventData = rawEventData;
		this.session = session;
		this.who = who;
		this.username = username;
		this.hostName = hostName;
		this.channelName = channelName;
		this.chan = chan;
	}

	/* (non-Javadoc)
	 * @see com.esri.ges.transport.Irc.jerklib.events.JoinEvent#getNick()
	 */
	public final String getNick()
	{
		return who;
	}

	/* (non-Javadoc)
	 * @see com.esri.ges.transport.Irc.jerklib.events.JoinEvent#getHostName()
	 */
	public String getHostName()
	{
		return hostName;
	}

	/* (non-Javadoc)
	 * @see com.esri.ges.transport.Irc.jerklib.events.JoinEvent#getChannelName()
	 */
	public final String getChannelName()
	{
		return channelName;
	}

	/* (non-Javadoc)
	 * @see com.esri.ges.transport.Irc.jerklib.events.JoinEvent#getChannel()
	 */
	public final Channel getChannel()
	{
		return chan;
	}

	/* (non-Javadoc)
	 * @see com.esri.ges.transport.Irc.jerklib.events.IRCEvent#getType()
	 */
	public final Type getType()
	{
		return type;
	}

	/* (non-Javadoc)
	 * @see com.esri.ges.transport.Irc.jerklib.events.IRCEvent#getRawEventData()
	 */
	public final String getRawEventData()
	{
		return rawEventData;
	}

	public final Session getSession()
	{
		return session;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		return rawEventData;
	}

	/* (non-Javadoc)
	 * @see com.esri.ges.transport.Irc.jerklib.events.JoinEvent#getUserName()
	 */
	public String getUserName()
	{
		return username;
	}
}
