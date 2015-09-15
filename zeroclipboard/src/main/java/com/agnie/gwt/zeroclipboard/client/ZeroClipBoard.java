package com.agnie.gwt.zeroclipboard.client;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

/**
 * @author rajgaurav
 *
 */
public class ZeroClipBoard extends JavaScriptObject {

    protected ZeroClipBoard() {

    }

    public static native ZeroClipBoard getInstance()/*-{
		return $wnd.ZeroClipboard;
    }-*/;

    public final ZeroClipBoardClient getNewClient(Element copyElement) {
        return new ZeroClipBoardClient(getNewInternalClient(copyElement));
    }

    private final native Client getNewInternalClient(Element copyElement)/*-{
		return new $wnd.ZeroClipboard(copyElement);
    }-*/;

    public final native void config(Config config)/*-{
		this.config(config);
    }-*/;

    public final native void setClipBoardData(String mimeType, String data)/*-{
		this.setData(mimeType, data);
    }-*/;

}
