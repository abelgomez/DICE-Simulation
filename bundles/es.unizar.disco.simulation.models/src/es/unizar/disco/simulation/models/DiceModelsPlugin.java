/*******************************************************************************
 * Copyright (c) 2020 DisCo Group - Universidad de Zaragoza.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 1.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-1.0/
 *
 * SPDX-License-Identifier: EPL-1.0
 *
 * Contributors:
 *     Abel Gómez
 *     Ignacio Requeno
 *     Diego Pérez
 *******************************************************************************/
package es.unizar.disco.simulation.models;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

public class DiceModelsPlugin extends Plugin {
	
	public static final String PLUGIN_ID = "es.unizar.disco.simulation.models"; //$NON-NLS-1$

	private static DiceModelsPlugin plugin;

	/**
	 * The constructor.
	 */
	public DiceModelsPlugin() {
		plugin = this;
	}

	/**
	 * This method is called upon plug-in activation
	 */
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
	}

	/**
	 * This method is called when the plug-in is stopped
	 */
	@Override
	public void stop(BundleContext context) throws Exception {
		super.stop(context);
		plugin = null;
	}

	/**
	 * Returns the shared instance.
	 */
	public static DiceModelsPlugin getDefault() {
		return plugin;
	}
}
