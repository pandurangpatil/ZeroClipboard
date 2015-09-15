/**
 * 
 */
package com.agnie.gwt.zeroclipboard.client;

import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.HandlerRegistration;
import com.google.web.bindery.event.shared.SimpleEventBus;

/**
 * @author rajgaurav
 *
 */
public class ZeroClipBoardClient {
    private EventBus eventBus = new SimpleEventBus();
    private Client   client;

    public ZeroClipBoardClient(Client client) {
        this.client = client;
        registerReady(client, this);
    }

    final native void registerReady(Client client, ZeroClipBoardClient zeroClip)/*-{
		client
				.on(
						'ready',
						function(event) {
							client.readyforcopy = true;
							client
									.on(
											'copy',
											function(event) {
												zeroClip.@com.agnie.gwt.zeroclipboard.client.ZeroClipBoardClient::fireCopy()();
											});
							client
									.on(
											'aftercopy',
											function(event) {
												zeroClip.@com.agnie.gwt.zeroclipboard.client.ZeroClipBoardClient::fireAfterCopy()();
											});
						});
    }-*/;

    void fireCopy() {
        eventBus.fireEvent(new CopyEvent());
    }

    void fireAfterCopy() {
        eventBus.fireEvent(new AfterCopyEvent());
    }

    public HandlerRegistration addCopyClickHandler(CopyHandler handler) {
        return eventBus.addHandler(CopyEvent.TYPE, handler);
    }

    public HandlerRegistration addAfterCopyClickHandler(AfterCopyHandler handler) {
        return eventBus.addHandler(AfterCopyEvent.TYPE, handler);
    }

    public Client getClient() {
        return client;
    }
}
