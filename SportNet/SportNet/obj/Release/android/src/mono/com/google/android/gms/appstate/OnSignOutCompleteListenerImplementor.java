package mono.com.google.android.gms.appstate;


public class OnSignOutCompleteListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.gms.appstate.OnSignOutCompleteListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onSignOutComplete:()V:GetOnSignOutCompleteHandler:Android.Gms.AppStates.IOnSignOutCompleteListenerInvoker, GooglePlayServicesLib\n" +
			"";
		mono.android.Runtime.register ("Android.Gms.AppStates.IOnSignOutCompleteListenerImplementor, GooglePlayServicesLib, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", OnSignOutCompleteListenerImplementor.class, __md_methods);
	}


	public void onSignOutComplete ()
	{
		n_onSignOutComplete ();
	}

	private native void n_onSignOutComplete ();

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
