/**
 * 
 */
package com.agnie.gwt.zeroclipboard.client;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * @author rajgaurav
 *
 */
public class Client extends JavaScriptObject {
    protected Client() {
    }

    public final native boolean isReady()/*-{
		return this.readyforcopy;
    }-*/;

    public final native void setText(String text)/*-{
		this.setText(text);
    }-*/;

    public final native void setHtml(String html)/*-{
		this.setHtml(html);
    }-*/;
}
