package com.agnie.gwt.zeroclipboard.client;

import com.google.gwt.event.shared.GwtEvent;

/**
 * 
 * @author Pandurang Patil 26-Nov-2014
 *
 */
public class AfterCopyEvent extends GwtEvent<AfterCopyHandler> {

    public static Type<AfterCopyHandler> TYPE = new Type<AfterCopyHandler>();

    @Override
    public com.google.gwt.event.shared.GwtEvent.Type<AfterCopyHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(AfterCopyHandler handler) {
        handler.onSelection(this);
    }

}
