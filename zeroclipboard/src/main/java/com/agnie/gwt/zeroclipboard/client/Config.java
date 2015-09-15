/**
 * 
 */
package com.agnie.gwt.zeroclipboard.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * @author rajgaurav
 *
 */
public class Config extends JavaScriptObject {

    protected Config() {

    }

    public final native void setSwfPath(String path)/*-{
		this.swfPath = path;
    }-*/;
}
