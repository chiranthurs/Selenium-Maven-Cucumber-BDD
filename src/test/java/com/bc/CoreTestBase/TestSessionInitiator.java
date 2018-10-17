package com.bc.CoreTestBase;

import static com.bc.Utilities.YamlReader.*;

public class TestSessionInitiator{
	
	/** The browser. */
	String browser;
	/** The seleniumserver. */
	String seleniumserver;
	/** The seleniumserverhost. */
	String seleniumserverhost;
	/** The appbaseurl. */
	String appbaseurl;
	/** The applicationpath. */
	String applicationpath;
	/** The timeout. */
	long timeout;
	
	public TestSessionInitiator(String datafilelocator)
	{
		setYamlFilePath(datafilelocator);
		_getSessionConfig();
	}
	
	/**
	 * _get session config.
	 */
	private void _getSessionConfig() {
		browser = getYamlValue("selenium.browser");
		seleniumserver = getYamlValue("selenium.server");
		seleniumserverhost = getYamlValue("selenium.remote.host");
		appbaseurl = getYamlValue("executeAutomationUrl");
		applicationpath = appbaseurl;
		timeout = Integer.parseInt(getYamlValue("selenium.timeout"));
	}

}
