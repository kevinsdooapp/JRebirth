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
package org.jrebirth.af.showcase.analyzer.ui.editor;

import java.io.File;
import java.util.List;

import org.jrebirth.af.core.facade.JRebirthEvent;
import org.jrebirth.af.core.wave.WaveItem;
import org.jrebirth.af.core.wave.WaveType;

/**
 * The class <strong>EditorWaves</strong>.
 *
 * @author Sébastien Bordes
 */
public interface EditorWaves {

    /*************************************************************************/
    /** Wave Types **/
    /*************************************************************************/

    /** Trigger a Unload wave. */
    WaveType DO_UNLOAD = WaveType.create("UNLOAD");

    /** Trigger a Play wave. */
    WaveType DO_PLAY = WaveType.create("PLAY");

    /** Trigger a Next wave. */
    WaveType DO_NEXT = WaveType.create("NEXT");

    /** Trigger a Previous wave. */
    WaveType DO_PREVIOUS = WaveType.create("PREVIOUS");

    /** Trigger a Stop wave. */
    WaveType DO_STOP = WaveType.create("STOP");

    /** The WaveType key usabe by OnWave annotation. */
    String DO_SELECT_EVENT_ACTION = "EVENT_SELECTED";

    /** Wave used to display info into the properties view. */
    WaveType DO_SELECT_EVENT = WaveType.create(DO_SELECT_EVENT_ACTION);

    /** Wave type used to return the event currently processed. */
    WaveType RE_EVENT_PROCESSED = WaveType.create("EVENT_PROCESSED");

    /*************************************************************************/
    /** Wave Items **/
    /*************************************************************************/

    /** The file containing all events serialized. */
    WaveItem<File> EVENTS_FILE = new WaveItem<File>() {
    };

    /** The name of the events. */
    WaveItem<List<JRebirthEvent>> EVENTS = new WaveItem<List<JRebirthEvent>>() {
    };

    /** An event unserialized. */
    WaveItem<JRebirthEvent> EVENT = new WaveItem<JRebirthEvent>() {
    };

}
