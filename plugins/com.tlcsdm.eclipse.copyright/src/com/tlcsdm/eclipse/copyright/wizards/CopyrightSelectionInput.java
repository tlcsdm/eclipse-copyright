/*******************************************************************************
 * Copyright (c) 2008-2012 Eric Wuillai.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Eric Wuillai - initial API and implementation
 ******************************************************************************/
package com.tlcsdm.eclipse.copyright.wizards;

import com.tlcsdm.eclipse.copyright.model.CopyrightSelectionItem;

class CopyrightSelectionInput {
  protected CopyrightSelectionItem[] rootSelection;

  public CopyrightSelectionInput(CopyrightSelectionItem[] rootSelection) {
    this.rootSelection = rootSelection;
  }

  public CopyrightSelectionItem[] getRootSelection() {
    return rootSelection;
  }
}
