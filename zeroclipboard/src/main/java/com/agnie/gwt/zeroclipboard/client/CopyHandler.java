package com.agnie.gwt.zeroclipboard.client;

import com.google.gwt.event.shared.EventHandler;

/**
 * 
 * @author Pandurang Patil 26-Nov-2014
 *
 */
public interface CopyHandler extends EventHandler {

	void onSelection(CopyEvent event);
}
