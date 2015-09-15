package com.agnie.gwt.zeroclipboard.client;

import com.google.gwt.event.shared.GwtEvent;

/**
 * 
 * @author Pandurang Patil 26-Nov-2014
 *
 */
public class CopyEvent extends GwtEvent<CopyHandler> {

    public static Type<CopyHandler> TYPE = new Type<CopyHandler>();

    @Override
    public com.google.gwt.event.shared.GwtEvent.Type<CopyHandler> getAssociatedType() {
        return TYPE;
    }

    @Override
    protected void dispatch(CopyHandler handler) {
        handler.onSelection(this);
    }

}
