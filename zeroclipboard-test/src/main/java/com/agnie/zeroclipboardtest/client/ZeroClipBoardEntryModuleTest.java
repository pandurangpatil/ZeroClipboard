/**
 * 
 */
package com.agnie.zeroclipboardtest.client;

import com.agnie.gwt.zeroclipboard.client.CopyEvent;
import com.agnie.gwt.zeroclipboard.client.CopyHandler;
import com.agnie.gwt.zeroclipboard.client.ZeroClipBoard;
import com.agnie.gwt.zeroclipboard.client.ZeroClipBoardClient;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * @author rajgaurav
 *
 */
public class ZeroClipBoardEntryModuleTest implements EntryPoint {

    @Override
    public void onModuleLoad() {
        Button copyMyText = new Button("Copy My Text");
        RootPanel.get().add(copyMyText);
        final ZeroClipBoardClient client = ZeroClipBoard.getInstance().getNewClient(copyMyText.getElement());
        client.addCopyClickHandler(new CopyHandler() {

            @Override
            public void onSelection(CopyEvent event) {
                client.getClient().setText("This our GWT Copy Text");
            }
        });

    }
}
