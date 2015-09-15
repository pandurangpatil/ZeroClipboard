/**
 * 
 */
package com.agnie.gwt.zeroclipboard.client;

import com.agnie.gwt.zeroclipboard.client.resources.Resources;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.ScriptInjector;

/**
 * @author rajgaurav
 *
 */
public class ZeroClipBoardEntryPoint implements EntryPoint {

    @Override
    public void onModuleLoad() {
        ScriptInjector.fromString(Resources.INSTANCE.zeroClipBoard().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
        Config config = (Config) Config.createObject();
        config.setSwfPath(GWT.getModuleBaseURL() + "ZeroClipboard.swf");
        ZeroClipBoard.getInstance().config(config);
    }
}
