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
package ui;

import javafx.scene.layout.StackPane;

import org.jrebirth.core.exception.CoreException;
import org.jrebirth.core.ui.AbstractView;

/**
 * 
 * The class <strong>TransitionView</strong>.
 * 
 * @author Sébastien Bordes
 */
public final class TransitionView extends AbstractView<TransitionModel, StackPane, TransitionController> {

    /**
     * Default Constructor.
     * 
     * @param model the view model
     * 
     * @throws CoreException if build fails
     */
    public TransitionView(final TransitionModel model) throws CoreException {
        super(model);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void customInitializeComponents() {

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void doStart() {

        getRootNode().setPrefWidth(getModel().getService().getImage().getWidth());
        getRootNode().setPrefHeight(getModel().getService().getImage().getHeight());

        getRootNode().getChildren().addAll(getModel().getService().getSlices());

        // getModel().getService2().getTimeline().play();

        getModel().getService2().getFullTransition().play();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void doHide() {
        // Nothing to do yet

    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void doReload() {
        // Nothing to do yet

    }
}
