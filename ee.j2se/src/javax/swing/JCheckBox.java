/*
 * Copyright (c) OSGi Alliance (2001, 2013). All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package javax.swing;
public class JCheckBox extends javax.swing.JToggleButton implements javax.accessibility.Accessible {
	protected class AccessibleJCheckBox extends javax.swing.JToggleButton.AccessibleJToggleButton {
		protected AccessibleJCheckBox() { } 
	}
	public final static java.lang.String BORDER_PAINTED_FLAT_CHANGED_PROPERTY = "borderPaintedFlat";
	public JCheckBox() { } 
	public JCheckBox(java.lang.String var0) { } 
	public JCheckBox(java.lang.String var0, javax.swing.Icon var1) { } 
	public JCheckBox(java.lang.String var0, javax.swing.Icon var1, boolean var2) { } 
	public JCheckBox(java.lang.String var0, boolean var1) { } 
	public JCheckBox(javax.swing.Action var0) { } 
	public JCheckBox(javax.swing.Icon var0) { } 
	public JCheckBox(javax.swing.Icon var0, boolean var1) { } 
	public boolean isBorderPaintedFlat() { return false; }
	public void setBorderPaintedFlat(boolean var0) { }
}
