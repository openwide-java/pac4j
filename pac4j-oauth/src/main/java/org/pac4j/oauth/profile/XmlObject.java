/*
  Copyright 2012 - 2013 Jerome Leleu

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package org.pac4j.oauth.profile;

import java.io.Serializable;

import org.pac4j.core.profile.RawDataObject;

/**
 * This class is an object which can be built from XML.
 * 
 * @author Jerome Leleu
 * @since 1.4.1
 */
public abstract class XmlObject extends RawDataObject implements Serializable {
    
    private static final long serialVersionUID = -4572005373483625065L;
    
    protected String xml = "";
    
    /**
     * Build an object from XML.
     * 
     * @param json
     */
    public final void buildFrom(final String xml) {
        if (keepRawData) {
            this.xml = xml;
        }
        buildFromXml(xml);
    }
    
    /**
     * Build an object from a XML text.
     * 
     * @param text
     */
    protected abstract void buildFromXml(String xml);
    
    @Override
    public String toString() {
        return this.xml;
    }
}
