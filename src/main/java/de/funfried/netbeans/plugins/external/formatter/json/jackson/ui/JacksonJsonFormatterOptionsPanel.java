/*
 * Copyright (c) 2020 bahlef.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * Contributors:
 * bahlef - initial API and implementation and/or initial documentation
 */

package de.funfried.netbeans.plugins.external.formatter.json.jackson.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.prefs.Preferences;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.LayoutStyle;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.apache.commons.lang3.StringUtils;
import org.openide.awt.Mnemonics;
import org.openide.util.NbBundle;

import de.funfried.netbeans.plugins.external.formatter.json.jackson.JacksonJsonFormatterSettings;
import de.funfried.netbeans.plugins.external.formatter.ui.options.AbstractFormatterOptionsPanel;

/**
 *
 * @author bahlef
 */
public class JacksonJsonFormatterOptionsPanel extends AbstractFormatterOptionsPanel {
	/** Creates new form {@link RevelcXmlFormatterOptionsPanel}. */
	public JacksonJsonFormatterOptionsPanel() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        linefeedLbl = new JLabel();
        linefeedCmbBox = new JComboBox<>();
        spacesPerTabLbl = new JLabel();
        spacesPerTabSpn = new JSpinner();
        expandTabsToSpacesChkBox = new JCheckBox();
        spacesBeforeSeparatorChkBox = new JCheckBox();
        indentSizeLbl = new JLabel();
        indentSizeSpn = new JSpinner();

        Mnemonics.setLocalizedText(linefeedLbl, NbBundle.getMessage(JacksonJsonFormatterOptionsPanel.class, "JacksonJsonFormatterOptionsPanel.linefeedLbl.text")); // NOI18N
        linefeedLbl.setToolTipText(NbBundle.getMessage(JacksonJsonFormatterOptionsPanel.class, "JacksonJsonFormatterOptionsPanel.linefeedLbl.toolTipText")); // NOI18N

        linefeedCmbBox.setModel(new DefaultComboBoxModel<>(new String[] { "System", "\\n", "\\r\\n", "\\r" }));
        linefeedCmbBox.setToolTipText(NbBundle.getMessage(JacksonJsonFormatterOptionsPanel.class, "JacksonJsonFormatterOptionsPanel.linefeedCmbBox.toolTipText")); // NOI18N
        linefeedCmbBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                linefeedCmbBoxActionPerformed(evt);
            }
        });

        Mnemonics.setLocalizedText(spacesPerTabLbl, NbBundle.getMessage(JacksonJsonFormatterOptionsPanel.class, "JacksonJsonFormatterOptionsPanel.spacesPerTabLbl.text")); // NOI18N

        spacesPerTabSpn.setModel(new SpinnerNumberModel(2, 1, null, 1));
        spacesPerTabSpn.setToolTipText(NbBundle.getMessage(JacksonJsonFormatterOptionsPanel.class, "JacksonJsonFormatterOptionsPanel.spacesPerTabSpn.toolTipText")); // NOI18N
        spacesPerTabSpn.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                spacesPerTabSpnStateChanged(evt);
            }
        });

        expandTabsToSpacesChkBox.setSelected(true);
        Mnemonics.setLocalizedText(expandTabsToSpacesChkBox, NbBundle.getMessage(JacksonJsonFormatterOptionsPanel.class, "JacksonJsonFormatterOptionsPanel.expandTabsToSpacesChkBox.text")); // NOI18N
        expandTabsToSpacesChkBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                expandTabsToSpacesChkBoxActionPerformed(evt);
            }
        });

        Mnemonics.setLocalizedText(spacesBeforeSeparatorChkBox, NbBundle.getMessage(JacksonJsonFormatterOptionsPanel.class, "JacksonJsonFormatterOptionsPanel.spacesBeforeSeparatorChkBox.text")); // NOI18N
        spacesBeforeSeparatorChkBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                spacesBeforeSeparatorChkBoxActionPerformed(evt);
            }
        });

        Mnemonics.setLocalizedText(indentSizeLbl, NbBundle.getMessage(JacksonJsonFormatterOptionsPanel.class, "JacksonJsonFormatterOptionsPanel.indentSizeLbl.text")); // NOI18N

        indentSizeSpn.setModel(new SpinnerNumberModel(2, 0, null, 1));
        indentSizeSpn.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                indentSizeSpnStateChanged(evt);
            }
        });

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(expandTabsToSpacesChkBox)
                    .addComponent(spacesBeforeSeparatorChkBox))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(spacesPerTabLbl, GroupLayout.Alignment.TRAILING)
                            .addComponent(indentSizeLbl, GroupLayout.Alignment.TRAILING))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addComponent(spacesPerTabSpn, GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(indentSizeSpn)))
                    .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(linefeedLbl)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(linefeedCmbBox, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(indentSizeLbl)
                            .addComponent(indentSizeSpn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(spacesPerTabLbl)
                            .addComponent(spacesPerTabSpn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(linefeedLbl)
                            .addComponent(linefeedCmbBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(expandTabsToSpacesChkBox)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spacesBeforeSeparatorChkBox)))
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void linefeedCmbBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_linefeedCmbBoxActionPerformed
        fireChangedListener();
    }//GEN-LAST:event_linefeedCmbBoxActionPerformed

    private void expandTabsToSpacesChkBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_expandTabsToSpacesChkBoxActionPerformed
        fireChangedListener();
    }//GEN-LAST:event_expandTabsToSpacesChkBoxActionPerformed

    private void spacesBeforeSeparatorChkBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_spacesBeforeSeparatorChkBoxActionPerformed
        fireChangedListener();
    }//GEN-LAST:event_spacesBeforeSeparatorChkBoxActionPerformed

    private void indentSizeSpnStateChanged(ChangeEvent evt) {//GEN-FIRST:event_indentSizeSpnStateChanged
        fireChangedListener();
    }//GEN-LAST:event_indentSizeSpnStateChanged

    private void spacesPerTabSpnStateChanged(ChangeEvent evt) {//GEN-FIRST:event_spacesPerTabSpnStateChanged
        fireChangedListener();
    }//GEN-LAST:event_spacesPerTabSpnStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JCheckBox expandTabsToSpacesChkBox;
    private JLabel indentSizeLbl;
    private JSpinner indentSizeSpn;
    private JComboBox<String> linefeedCmbBox;
    private JLabel linefeedLbl;
    private JCheckBox spacesBeforeSeparatorChkBox;
    private JLabel spacesPerTabLbl;
    private JSpinner spacesPerTabSpn;
    // End of variables declaration//GEN-END:variables

	private String getLinefeed() {
		if (0 == linefeedCmbBox.getSelectedIndex()) {
			return "";
		}
		return linefeedCmbBox.getSelectedItem().toString();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void load(Preferences preferences) {
		boolean expandTabsToSpaces = preferences.getBoolean(JacksonJsonFormatterSettings.EXPAND_TABS_TO_SPACES, true);
		boolean spacesBeforeSeparator = preferences.getBoolean(JacksonJsonFormatterSettings.SPACE_BEFORE_SEPARATOR, false);
		int indentSize = preferences.getInt(JacksonJsonFormatterSettings.INDENT_SIZE, 2);
		int spacesPerTab = preferences.getInt(JacksonJsonFormatterSettings.SPACES_PER_TAB, 2);
		String lineFeed = preferences.get(JacksonJsonFormatterSettings.LINEFEED, "");

		expandTabsToSpacesChkBox.setSelected(expandTabsToSpaces);
		spacesBeforeSeparatorChkBox.setSelected(spacesBeforeSeparator);
		indentSizeSpn.setValue(indentSize);
		spacesPerTabSpn.setValue(spacesPerTab);

		if (StringUtils.isBlank(lineFeed)) {
			//default = system-dependend LF
			linefeedCmbBox.setSelectedIndex(0);
		} else {
			linefeedCmbBox.setSelectedItem(lineFeed);
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public void store(Preferences preferences) {
		preferences.putBoolean(JacksonJsonFormatterSettings.EXPAND_TABS_TO_SPACES, expandTabsToSpacesChkBox.isSelected());
		preferences.putBoolean(JacksonJsonFormatterSettings.SPACE_BEFORE_SEPARATOR, spacesBeforeSeparatorChkBox.isSelected());
		preferences.putInt(JacksonJsonFormatterSettings.INDENT_SIZE, (int) indentSizeSpn.getValue());
		preferences.putInt(JacksonJsonFormatterSettings.SPACES_PER_TAB, (int) spacesPerTabSpn.getValue());
		preferences.put(JacksonJsonFormatterSettings.LINEFEED, getLinefeed());
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean valid() {
		return true;
	}
}
