package org.omg.PortableInterceptor;

/**
* org/omg/PortableInterceptor/ObjectReferenceFactoryHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u231/13620/corba/src/share/classes/org/omg/PortableInterceptor/Interceptors.idl
* Saturday, October 5, 2019 3:13:32 AM PDT
*/


/** The object reference factory.  This provides the capability of
  * creating an object reference.
  */
public final class ObjectReferenceFactoryHolder implements org.omg.CORBA.portable.Streamable
{
  public org.omg.PortableInterceptor.ObjectReferenceFactory value = null;

  public ObjectReferenceFactoryHolder ()
  {
  }

  public ObjectReferenceFactoryHolder (org.omg.PortableInterceptor.ObjectReferenceFactory initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = org.omg.PortableInterceptor.ObjectReferenceFactoryHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    org.omg.PortableInterceptor.ObjectReferenceFactoryHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return org.omg.PortableInterceptor.ObjectReferenceFactoryHelper.type ();
  }

}
