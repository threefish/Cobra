/*
    GNU GENERAL PUBLIC LICENSE
    Copyright (C) 2006 The Lobo Project

    This program is free software; you can redistribute it and/or
    modify it under the terms of the GNU General Public
    License as published by the Free Software Foundation; either
    version 2 of the License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
    General Public License for more details.

    You should have received a copy of the GNU General Public
    License along with this library; if not, write to the Free Software
    Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA

    Contact info: lobochief@users.sourceforge.net
 */
package org.cobraparser.main;

import java.net.URL;
import java.net.URLClassLoader;
import java.net.URLStreamHandlerFactory;

public class ExtensionClassLoader extends URLClassLoader {
  public ExtensionClassLoader(final URL[] urls, final ClassLoader parent, final URLStreamHandlerFactory factory) {
    super(urls, parent, factory);
  }

  public ExtensionClassLoader(final URL[] urls, final ClassLoader parent) {
    super(urls, parent);
  }

  public ExtensionClassLoader(final URL[] urls) {
    super(urls);
  }
}
