package com.agnie.gwt.zeroclipboard.client;

import com.google.gwt.event.shared.EventHandler;

/**
 * 
 * @author Pandurang Patil 26-Nov-2014
 *
 */
public interface AfterCopyHandler extends EventHandler {

    void onSelection(AfterCopyEvent event);
}
