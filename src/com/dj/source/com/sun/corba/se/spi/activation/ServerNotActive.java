package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/ServerNotActive.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-windows-amd64-cygwin/jdk8u231/13620/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Saturday, October 5, 2019 3:13:31 AM PDT
*/

public final class ServerNotActive extends org.omg.CORBA.UserException
{
  public int serverId = (int)0;

  public ServerNotActive ()
  {
    super(ServerNotActiveHelper.id());
  } // ctor

  public ServerNotActive (int _serverId)
  {
    super(ServerNotActiveHelper.id());
    serverId = _serverId;
  } // ctor


  public ServerNotActive (String $reason, int _serverId)
  {
    super(ServerNotActiveHelper.id() + "  " + $reason);
    serverId = _serverId;
  } // ctor

} // class ServerNotActive
