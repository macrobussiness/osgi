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

package org.omg.IOP;
public interface CodecOperations {
	org.omg.CORBA.Any decode(byte[] var0) throws org.omg.IOP.CodecPackage.FormatMismatch;
	org.omg.CORBA.Any decode_value(byte[] var0, org.omg.CORBA.TypeCode var1) throws org.omg.IOP.CodecPackage.FormatMismatch, org.omg.IOP.CodecPackage.TypeMismatch;
	byte[] encode(org.omg.CORBA.Any var0) throws org.omg.IOP.CodecPackage.InvalidTypeForEncoding;
	byte[] encode_value(org.omg.CORBA.Any var0) throws org.omg.IOP.CodecPackage.InvalidTypeForEncoding;
}
