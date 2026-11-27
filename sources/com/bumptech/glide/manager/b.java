package com.bumptech.glide.manager;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.g;
import defpackage.C1228In0;
import defpackage.C1589Ne;
import defpackage.C2004Sl0;
import defpackage.C2320Wl0;
import defpackage.C5207m;
import defpackage.C6177qc2;
import defpackage.C8092zj;
import defpackage.ComponentCallbacks2C0889Ee0;
import defpackage.ComponentCallbacks2C1166Hs1;
import defpackage.FragmentC1244Is1;
import defpackage.InterfaceC1322Js1;
import defpackage.InterfaceC2780aj0;
import defpackage.InterfaceC7604xP0;
import defpackage.N7;
import io.sentry.android.core.b0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Handler.Callback {
    public static final a k = new a();
    public volatile ComponentCallbacks2C1166Hs1 a;
    public final Handler d;
    public final InterfaceC0305b e;
    public final InterfaceC2780aj0 i;
    public final com.bumptech.glide.manager.a j;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final C8092zj<View, Fragment> f = new C8092zj<>();
    public final C8092zj<View, android.app.Fragment> g = new C8092zj<>();
    public final Bundle h = new Bundle();

    public class a implements InterfaceC0305b {
        @Override // com.bumptech.glide.manager.b.InterfaceC0305b
        @NonNull
        public final ComponentCallbacks2C1166Hs1 a(@NonNull com.bumptech.glide.a aVar, @NonNull InterfaceC7604xP0 interfaceC7604xP0, @NonNull InterfaceC1322Js1 interfaceC1322Js1, @NonNull Context context) {
            return new ComponentCallbacks2C1166Hs1(aVar, interfaceC7604xP0, interfaceC1322Js1, context);
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.manager.b$b, reason: collision with other inner class name */
    public interface InterfaceC0305b {
        @NonNull
        ComponentCallbacks2C1166Hs1 a(@NonNull com.bumptech.glide.a aVar, @NonNull InterfaceC7604xP0 interfaceC7604xP0, @NonNull InterfaceC1322Js1 interfaceC1322Js1, @NonNull Context context);
    }

    public b(InterfaceC0305b interfaceC0305b, C2320Wl0 c2320Wl0) {
        interfaceC0305b = interfaceC0305b == null ? k : interfaceC0305b;
        this.e = interfaceC0305b;
        this.d = new Handler(Looper.getMainLooper(), this);
        this.j = new com.bumptech.glide.manager.a(interfaceC0305b);
        this.i = (C1228In0.h && C1228In0.g) ? c2320Wl0.a.containsKey(C2004Sl0.class) ? new ComponentCallbacks2C0889Ee0() : new C5207m() : new N7();
    }

    public static Activity a(@NonNull Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void c(List list, @NonNull C8092zj c8092zj) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null && fragment.getView() != null) {
                c8092zj.put(fragment.getView(), fragment);
                c(fragment.getChildFragmentManager().c.f(), c8092zj);
            }
        }
    }

    @TargetApi(26)
    @Deprecated
    public final void b(@NonNull FragmentManager fragmentManager, @NonNull C8092zj<View, android.app.Fragment> c8092zj) {
        android.app.Fragment fragment;
        if (Build.VERSION.SDK_INT >= 26) {
            for (android.app.Fragment fragment2 : fragmentManager.getFragments()) {
                if (fragment2.getView() != null) {
                    c8092zj.put(fragment2.getView(), fragment2);
                    b(fragment2.getChildFragmentManager(), c8092zj);
                }
            }
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            Bundle bundle = this.h;
            bundle.putInt("key", i);
            try {
                fragment = fragmentManager.getFragment(bundle, "key");
            } catch (Exception unused) {
                fragment = null;
            }
            if (fragment == null) {
                return;
            }
            if (fragment.getView() != null) {
                c8092zj.put(fragment.getView(), fragment);
                b(fragment.getChildFragmentManager(), c8092zj);
            }
            i = i2;
        }
    }

    @NonNull
    @Deprecated
    public final ComponentCallbacks2C1166Hs1 d(@NonNull Activity activity) {
        if (C6177qc2.i()) {
            return e(activity.getApplicationContext());
        }
        if (activity instanceof g) {
            return f((g) activity);
        }
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        this.i.getClass();
        FragmentManager fragmentManager = activity.getFragmentManager();
        Activity activityA = a(activity);
        boolean z = activityA == null || !activityA.isFinishing();
        FragmentC1244Is1 fragmentC1244Is1G = g(fragmentManager, null);
        ComponentCallbacks2C1166Hs1 componentCallbacks2C1166Hs1 = fragmentC1244Is1G.h;
        if (componentCallbacks2C1166Hs1 != null) {
            return componentCallbacks2C1166Hs1;
        }
        ComponentCallbacks2C1166Hs1 componentCallbacks2C1166Hs1A = this.e.a(com.bumptech.glide.a.a(activity), fragmentC1244Is1G.d, fragmentC1244Is1G.e, activity);
        if (z) {
            componentCallbacks2C1166Hs1A.onStart();
        }
        fragmentC1244Is1G.h = componentCallbacks2C1166Hs1A;
        return componentCallbacks2C1166Hs1A;
    }

    @NonNull
    public final ComponentCallbacks2C1166Hs1 e(@NonNull Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = C6177qc2.a;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof g) {
                return f((g) context);
            }
            if (context instanceof Activity) {
                return d((Activity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return e(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.a == null) {
            synchronized (this) {
                try {
                    if (this.a == null) {
                        this.a = this.e.a(com.bumptech.glide.a.a(context.getApplicationContext()), new C1589Ne(), new C1589Ne(), context.getApplicationContext());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.a;
    }

    @NonNull
    public final ComponentCallbacks2C1166Hs1 f(@NonNull g gVar) {
        if (C6177qc2.i()) {
            return e(gVar.getApplicationContext());
        }
        if (gVar.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        this.i.getClass();
        Activity activityA = a(gVar);
        return this.j.a(gVar, com.bumptech.glide.a.a(gVar.getApplicationContext()), gVar.getLifecycle(), gVar.getSupportFragmentManager(), activityA == null || !activityA.isFinishing());
    }

    @NonNull
    public final FragmentC1244Is1 g(@NonNull FragmentManager fragmentManager, android.app.Fragment fragment) {
        HashMap map = this.b;
        FragmentC1244Is1 fragmentC1244Is1 = (FragmentC1244Is1) map.get(fragmentManager);
        if (fragmentC1244Is1 != null) {
            return fragmentC1244Is1;
        }
        FragmentC1244Is1 fragmentC1244Is2 = (FragmentC1244Is1) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (fragmentC1244Is2 == null) {
            fragmentC1244Is2 = new FragmentC1244Is1();
            fragmentC1244Is2.j = fragment;
            if (fragment != null && fragment.getActivity() != null) {
                fragmentC1244Is2.a(fragment.getActivity());
            }
            map.put(fragmentManager, fragmentC1244Is2);
            fragmentManager.beginTransaction().add(fragmentC1244Is2, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.d.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return fragmentC1244Is2;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        Object obj;
        Object obj2;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = message.arg1 == 1;
        int i = message.what;
        Handler handler = this.d;
        Object objRemove = null;
        if (i != 1) {
            if (i != 2) {
                z = false;
            } else {
                androidx.fragment.app.FragmentManager fragmentManager = (androidx.fragment.app.FragmentManager) message.obj;
                HashMap map = this.c;
                SupportRequestManagerFragment supportRequestManagerFragment = (SupportRequestManagerFragment) map.get(fragmentManager);
                SupportRequestManagerFragment supportRequestManagerFragment2 = (SupportRequestManagerFragment) fragmentManager.B("com.bumptech.glide.manager");
                if (supportRequestManagerFragment2 != supportRequestManagerFragment) {
                    if (z3 || fragmentManager.I) {
                        if (fragmentManager.I) {
                            if (Log.isLoggable("RMRetriever", 5)) {
                                b0.e("RMRetriever", "Parent was destroyed before our Fragment could be added, all requests for the destroyed parent are cancelled");
                            }
                        } else if (Log.isLoggable("RMRetriever", 6)) {
                            b0.c("RMRetriever", "ERROR: Tried adding Fragment twice and failed twice, giving up and cancelling all associated requests! This probably means you're starting loads in a unit test with an Activity that you haven't created and never create. If you're using Robolectric, create the Activity as part of your test setup");
                        }
                        supportRequestManagerFragment.d.b();
                    } else {
                        androidx.fragment.app.a aVar = new androidx.fragment.app.a(fragmentManager);
                        aVar.c(0, supportRequestManagerFragment, "com.bumptech.glide.manager", 1);
                        if (supportRequestManagerFragment2 != null) {
                            aVar.i(supportRequestManagerFragment2);
                        }
                        if (aVar.g) {
                            throw new IllegalStateException("This transaction is already being added to the back stack");
                        }
                        aVar.h = false;
                        aVar.q.y(aVar, true);
                        handler.obtainMessage(2, 1, 0, fragmentManager).sendToTarget();
                        Log.isLoggable("RMRetriever", 3);
                        z2 = true;
                        z = false;
                    }
                }
                objRemove = map.remove(fragmentManager);
                obj = fragmentManager;
                z2 = true;
                obj2 = obj;
            }
            obj2 = null;
        } else {
            FragmentManager fragmentManager2 = (FragmentManager) message.obj;
            HashMap map2 = this.b;
            FragmentC1244Is1 fragmentC1244Is1 = (FragmentC1244Is1) map2.get(fragmentManager2);
            FragmentC1244Is1 fragmentC1244Is2 = (FragmentC1244Is1) fragmentManager2.findFragmentByTag("com.bumptech.glide.manager");
            if (fragmentC1244Is2 != fragmentC1244Is1) {
                if (fragmentC1244Is2 != null && fragmentC1244Is2.h != null) {
                    throw new IllegalStateException("We've added two fragments with requests! Old: " + fragmentC1244Is2 + " New: " + fragmentC1244Is1);
                }
                if (z3 || fragmentManager2.isDestroyed()) {
                    if (Log.isLoggable("RMRetriever", 5)) {
                        if (fragmentManager2.isDestroyed()) {
                            b0.e("RMRetriever", "Parent was destroyed before our Fragment could be added");
                        } else {
                            b0.e("RMRetriever", "Tried adding Fragment twice and failed twice, giving up!");
                        }
                    }
                    fragmentC1244Is1.d.b();
                } else {
                    FragmentTransaction fragmentTransactionAdd = fragmentManager2.beginTransaction().add(fragmentC1244Is1, "com.bumptech.glide.manager");
                    if (fragmentC1244Is2 != null) {
                        fragmentTransactionAdd.remove(fragmentC1244Is2);
                    }
                    fragmentTransactionAdd.commitAllowingStateLoss();
                    handler.obtainMessage(1, 1, 0, fragmentManager2).sendToTarget();
                    Log.isLoggable("RMRetriever", 3);
                    z2 = true;
                    z = false;
                    obj2 = null;
                }
            }
            objRemove = map2.remove(fragmentManager2);
            obj = fragmentManager2;
            z2 = true;
            obj2 = obj;
        }
        if (Log.isLoggable("RMRetriever", 5) && z && objRemove == null) {
            b0.e("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj2);
        }
        return z2;
    }
}
