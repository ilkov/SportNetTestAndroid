package mono.com.google.android.gms.appstate;


public class OnStateDeletedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.gms.appstate.OnStateDeletedListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onStateDeleted:(II)V:GetOnStateDeleted_IIHandler:Android.Gms.AppStates.IOnStateDeletedListenerInvoker, GooglePlayServicesLib\n" +
			"";
		mono.android.Runtime.register ("Android.Gms.AppStates.IOnStateDeletedListenerImplementor, GooglePlayServicesLib, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", OnStateDeletedListenerImplementor.class, __md_methods);
	}


	public void onStateDeleted (int p0, int p1)
	{
		n_onStateDeleted (p0, p1);
	}

	private native void n_onStateDeleted (int p0, int p1);

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
