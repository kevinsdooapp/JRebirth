package org.jrebirth.af.core.ui.object;

import org.jrebirth.af.core.ui.Model;

public interface ModelObject<O> extends Model {

    /**
     * Return the bindable object and create it if null.
     *
     * @return the bindable object
     */
    O getObject();

    /**
     * @param object The object to set.
     */
    void setObject(final O object);

}
