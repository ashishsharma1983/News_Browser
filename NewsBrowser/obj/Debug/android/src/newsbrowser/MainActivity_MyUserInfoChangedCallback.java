package newsbrowser;


public class MainActivity_MyUserInfoChangedCallback
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.facebook.widget.LoginButton.UserInfoChangedCallback
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onUserInfoFetched:(Lcom/facebook/model/GraphUser;)V:GetOnUserInfoFetched_Lcom_facebook_model_GraphUser_Handler:Xamarin.Facebook.Widget.LoginButton/IUserInfoChangedCallbackInvoker, Xamarin.Facebook\n" +
			"";
		mono.android.Runtime.register ("NewsBrowser.MainActivity/MyUserInfoChangedCallback, NewsBrowser, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MainActivity_MyUserInfoChangedCallback.class, __md_methods);
	}


	public MainActivity_MyUserInfoChangedCallback () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MainActivity_MyUserInfoChangedCallback.class)
			mono.android.TypeManager.Activate ("NewsBrowser.MainActivity/MyUserInfoChangedCallback, NewsBrowser, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}

	public MainActivity_MyUserInfoChangedCallback (newsbrowser.MainActivity p0) throws java.lang.Throwable
	{
		super ();
		if (getClass () == MainActivity_MyUserInfoChangedCallback.class)
			mono.android.TypeManager.Activate ("NewsBrowser.MainActivity/MyUserInfoChangedCallback, NewsBrowser, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "NewsBrowser.MainActivity, NewsBrowser, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", this, new java.lang.Object[] { p0 });
	}


	public void onUserInfoFetched (com.facebook.model.GraphUser p0)
	{
		n_onUserInfoFetched (p0);
	}

	private native void n_onUserInfoFetched (com.facebook.model.GraphUser p0);

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
