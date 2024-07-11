package com.cyan;

import com.cyan.HallowedStatuesPlugin;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class HallowedStatuesTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(HallowedStatuesPlugin.class);
		RuneLite.main(args);
	}
}