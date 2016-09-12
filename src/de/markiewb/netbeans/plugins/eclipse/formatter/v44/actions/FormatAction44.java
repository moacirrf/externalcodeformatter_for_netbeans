/*
 * Copyright (c) 2013 markiewb.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    markiewb - initial API and implementation and/or initial documentation
 *    Saad Mufti <saad.mufti@teamaol.com> 
 */
package de.markiewb.netbeans.plugins.eclipse.formatter.v44.actions;

import de.markiewb.netbeans.plugins.eclipse.formatter.strategies.FormatterStrategyDispatcher;
import de.markiewb.netbeans.plugins.eclipse.formatter.strategies.ParameterObject;

import java.awt.event.ActionEvent;
import java.util.logging.Logger;

import javax.swing.text.JTextComponent;
import javax.swing.text.StyledDocument;

import org.netbeans.api.editor.EditorActionRegistration;
import org.openide.util.NbBundle;

/**
 * Registration analog to
 * http://hg.netbeans.org/jet-main/file/01c13d4da2da/java.hints/src/org/netbeans
 * /modules /java/hints/OrganizeMembers.java
 *
 * @author markiewb
 */
@NbBundle.Messages({ "CTL_EclipseFormatter=Format with Eclipse formatter 4.4",
	"eclipse-format=Format with Eclipse formatter 4.4" })
@EditorActionRegistration(name = FormatAction44.MACRONAME, mimeType = "text/x-java", menuPath = "Source", menuPosition = 0, menuText = "#CTL_EclipseFormatter")
public class FormatAction44 extends org.netbeans.editor.BaseAction {
    public static final String ID = "org.netbeans.eclipse.formatter.ReformatWithEclipseBeforeSaveTask44";
    public static final String MACRONAME = "eclipse-format";

    private static final Logger LOG = Logger.getLogger(FormatAction44.class.getName());

    @Override
    public void actionPerformed(ActionEvent e, JTextComponent component) {
	if (component == null || !component.isEditable() || !component.isEnabled()) {
	    return;
	}

	int start = component.getSelectionStart();
	int end = component.getSelectionEnd();
	int caret = component.getCaretPosition();

	final StyledDocument document = (StyledDocument) component.getDocument();

	ParameterObject po = new ParameterObject();
	po.styledDoc = document;
	po.changedElements = null;
	po.forSave = false;
	po.selectionStart = start;
	po.selectionEnd = end;
	po.caret = caret;
	po.editor = component;

	new FormatterStrategyDispatcher().format(po);
    }

}