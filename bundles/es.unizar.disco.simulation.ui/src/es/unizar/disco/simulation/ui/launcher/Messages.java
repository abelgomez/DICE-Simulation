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
package es.unizar.disco.simulation.ui.launcher;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "es.unizar.disco.simulation.ui.launcher.messages"; //$NON-NLS-1$
	public static String MainLaunchConfigurationTab_browseLabel;
	public static String MainLaunchConfigurationTab_mainTabTitle;
	public static String MainLaunchConfigurationTab_modelLabel;
	public static String MainLaunchConfigurationTab_NFPtoCalculate;
	public static String MainLaunchConfigurationTab_Performance;
	public static String MainLaunchConfigurationTab_Reliability;
	public static String SimulationLaunchShortcut_unexpectedArgError;
	public static String SimulationLaunchShortcut_unknownModeError;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
