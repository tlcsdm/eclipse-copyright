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
package com.tlcsdm.eclipse.copyright.viewers;

import java.util.List;

import com.tlcsdm.eclipse.copyright.model.Copyright;
import com.tlcsdm.eclipse.copyright.model.CopyrightException;
import com.tlcsdm.eclipse.copyright.model.CopyrightManager;

public class CopyrightsInput {
  protected List<Copyright> copyrights;

  public CopyrightsInput(boolean addCustom) {
    copyrights = CopyrightManager.listCopyrights(addCustom);
  }

  public boolean addCopyright(Copyright copyright) {
    if ( exists(copyright.getLabel()) ) {
      return false;
    }
    copyrights.add(copyright);
    return true;
  }

  public boolean deleteCopyright(Copyright copyright) {
    return copyrights.remove(copyright);
  }

  public void defaults() {
    copyrights = CopyrightManager.getDefaultCopyrights();
  }

  public boolean exists(String label) {
    for (Copyright c : copyrights) {
      if ( c.getLabel().equalsIgnoreCase(label) ) {
        return true;
      }
    }
    return false;
  }

  public Copyright[] getCopyrights() {
    return copyrights.toArray(new Copyright[] {});
  }

  public void save() throws CopyrightException {
    CopyrightManager.saveCopyrights(copyrights);
  }
}
