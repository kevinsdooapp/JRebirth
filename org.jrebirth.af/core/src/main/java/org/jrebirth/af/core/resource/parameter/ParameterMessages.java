/**
 * Get more info at : www.jrebirth.org .
 * Copyright JRebirth.org © 2011-2013
 * Contact : sebastien.bordes@jrebirth.org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jrebirth.af.core.resource.parameter;

import org.jrebirth.af.core.log.JRLevel;
import org.jrebirth.af.core.log.JRebirthMarkers;
import org.jrebirth.af.core.resource.i18n.LogMessage;
import org.jrebirth.af.core.resource.i18n.MessageContainer;
import org.jrebirth.af.core.resource.i18n.MessageItem;

import static org.jrebirth.af.core.resource.Resources.create;

/**
 * The class <strong>ParameterMessages</strong>.
 *
 * Messages used by the Parameter package.
 *
 * @author Sébastien Bordes
 */
public interface ParameterMessages extends MessageContainer {

    /** "Configuration Loading is skipped". */
    MessageItem SKIP_CONF_LOADING = create(new LogMessage("jrebirth.parameter.skipConfLoading", JRLevel.Info, JRebirthMarkers.PARAMETER));

    /** "{} configuration file{} found.". */
    MessageItem CONFIG_FOUND = create(new LogMessage("jrebirth.parameter.configFound", JRLevel.Info, JRebirthMarkers.PARAMETER));

    /** "Read configuration file : {} ". */
    MessageItem READ_CONF_FILE = create(new LogMessage("jrebirth.parameter.readConfFile", JRLevel.Info, JRebirthMarkers.PARAMETER));

    /** "Update key {} with value= {}". */
    MessageItem UPDATE_PARAMETER = create(new LogMessage("jrebirth.parameter.updateParameter", JRLevel.Trace, JRebirthMarkers.PARAMETER));

    /** "Store key {} with value= {}". */
    MessageItem STORE_PARAMETER = create(new LogMessage("jrebirth.parameter.storeParameter", JRLevel.Trace, JRebirthMarkers.PARAMETER));

    /** "Impossible to read the properties file : {}". */
    MessageItem CONF_READING_ERROR = create(new LogMessage("jrebirth.parameter.confReadingError", JRLevel.Error, JRebirthMarkers.PARAMETER));
}
