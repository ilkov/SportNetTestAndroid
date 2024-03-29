package sportnet;


public class PictureGroupActivity
	extends android.app.ActivityGroup
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"n_finishActivityFromChild:(Landroid/app/Activity;I)V:GetFinishActivityFromChild_Landroid_app_Activity_IHandler\n" +
			"n_onKeyDown:(ILandroid/view/KeyEvent;)Z:GetOnKeyDown_ILandroid_view_KeyEvent_Handler\n" +
			"n_onKeyUp:(ILandroid/view/KeyEvent;)Z:GetOnKeyUp_ILandroid_view_KeyEvent_Handler\n" +
			"n_onBackPressed:()V:GetOnBackPressedHandler\n" +
			"";
		mono.android.Runtime.register ("SportNet.PictureGroupActivity, SportNet, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", PictureGroupActivity.class, __md_methods);
	}


	public PictureGroupActivity () throws java.lang.Throwable
	{
		super ();
		if (getClass () == PictureGroupActivity.class)
			mono.android.TypeManager.Activate ("SportNet.PictureGroupActivity, SportNet, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public PictureGroupActivity (boolean p0) throws java.lang.Throwable
	{
		super (p0);
		if (getClass () == PictureGroupActivity.class)
			mono.android.TypeManager.Activate ("SportNet.PictureGroupActivity, SportNet, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "System.Boolean, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new java.lang.Object[] { p0 });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);


	public void finishActivityFromChild (android.app.Activity p0, int p1)
	{
		n_finishActivityFromChild (p0, p1);
	}

	private native void n_finishActivityFromChild (android.app.Activity p0, int p1);


	public boolean onKeyDown (int p0, android.view.KeyEvent p1)
	{
		return n_onKeyDown (p0, p1);
	}

	private native boolean n_onKeyDown (int p0, android.view.KeyEvent p1);


	public boolean onKeyUp (int p0, android.view.KeyEvent p1)
	{
		return n_onKeyUp (p0, p1);
	}

	private native boolean n_onKeyUp (int p0, android.view.KeyEvent p1);


	public void onBackPressed ()
	{
		n_onBackPressed ();
	}

	private native void n_onBackPressed ();

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
