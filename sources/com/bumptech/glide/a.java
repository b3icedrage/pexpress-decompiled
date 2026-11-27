package com.bumptech.glide;

import android.R;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.g;
import com.appsflyer.sdk_base.referrer.Payload;
import com.bumptech.glide.manager.b;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import defpackage.AbstractC0972Fg;
import defpackage.C1008Fs;
import defpackage.C2082Tl0;
import defpackage.C2320Wl0;
import defpackage.C2728aV;
import defpackage.C2823ar1;
import defpackage.C2965bZ0;
import defpackage.C3686f;
import defpackage.C4004gW0;
import defpackage.C6177qc2;
import defpackage.C8092zj;
import defpackage.ComponentCallbacks2C1166Hs1;
import defpackage.ExecutorServiceC2238Vl0;
import defpackage.FragmentC1244Is1;
import defpackage.InterfaceC0930Es;
import defpackage.InterfaceC2780aj0;
import defpackage.InterfaceC3644em0;
import defpackage.NK0;
import defpackage.OU0;
import defpackage.PU0;
import defpackage.Q60;
import defpackage.QO;
import defpackage.SU0;
import defpackage.UE;
import defpackage.ZB0;
import io.sentry.android.core.b0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ComponentCallbacks2 {
    public static volatile a l;
    public static volatile boolean m;
    public final InterfaceC0930Es d;
    public final SU0 e;
    public final C2082Tl0 g;
    public final OU0 h;
    public final b i;
    public final C2728aV j;
    public final ArrayList k = new ArrayList();

    public a(@NonNull Context context, @NonNull Q60 q60, @NonNull SU0 su0, @NonNull InterfaceC0930Es interfaceC0930Es, @NonNull OU0 ou0, @NonNull b bVar, @NonNull C2728aV c2728aV, int i, @NonNull C3686f c3686f, @NonNull C8092zj c8092zj, @NonNull List list, @NonNull List list2, AbstractC0972Fg abstractC0972Fg, @NonNull C2320Wl0 c2320Wl0) {
        this.d = interfaceC0930Es;
        this.h = ou0;
        this.e = su0;
        this.i = bVar;
        this.j = c2728aV;
        this.g = new C2082Tl0(context, ou0, new C2823ar1(this, list2, abstractC0972Fg), new QO(11), c3686f, c8092zj, list, q60, c2320Wl0, i);
    }

    @NonNull
    public static a a(@NonNull Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (l == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    b0.e("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
            } catch (InstantiationException e2) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e2);
            } catch (NoSuchMethodException e3) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e3);
            } catch (InvocationTargetException e4) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
            }
            synchronized (a.class) {
                if (l == null) {
                    if (m) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    m = true;
                    try {
                        b(context, generatedAppGlideModule);
                        m = false;
                    } catch (Throwable th) {
                        m = false;
                        throw th;
                    }
                }
            }
        }
        return l;
    }

    public static void b(@NonNull Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        List list;
        C8092zj c8092zj = new C8092zj();
        C2320Wl0.a aVar = new C2320Wl0.a();
        C3686f c3686f = new C3686f();
        Context applicationContext = context.getApplicationContext();
        List list2 = Collections.EMPTY_LIST;
        if (generatedAppGlideModule == null || generatedAppGlideModule.c()) {
            Log.isLoggable("ManifestParser", 3);
            ArrayList arrayList = new ArrayList();
            try {
                ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN);
                if (applicationInfo == null || applicationInfo.metaData == null) {
                    Log.isLoggable("ManifestParser", 3);
                } else {
                    if (Log.isLoggable("ManifestParser", 2)) {
                        Objects.toString(applicationInfo.metaData);
                    }
                    for (String str : applicationInfo.metaData.keySet()) {
                        if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                            arrayList.add(C4004gW0.a(str));
                            Log.isLoggable("ManifestParser", 3);
                        }
                    }
                    Log.isLoggable("ManifestParser", 3);
                }
                list = arrayList;
            } catch (PackageManager.NameNotFoundException e) {
                throw new RuntimeException("Unable to find metadata to parse GlideModules", e);
            }
        } else {
            list = list2;
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.d().isEmpty()) {
            Set<Class<?>> setD = generatedAppGlideModule.d();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InterfaceC3644em0 interfaceC3644em0 = (InterfaceC3644em0) it.next();
                if (setD.contains(interfaceC3644em0.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        interfaceC3644em0.toString();
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((InterfaceC3644em0) it2.next()).getClass().toString();
            }
        }
        b.InterfaceC0305b interfaceC0305bE = generatedAppGlideModule != null ? generatedAppGlideModule.e() : null;
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            ((InterfaceC3644em0) it3.next()).b();
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.b();
        }
        ExecutorServiceC2238Vl0.a aVar2 = new ExecutorServiceC2238Vl0.a();
        if (ExecutorServiceC2238Vl0.g == 0) {
            ExecutorServiceC2238Vl0.g = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i = ExecutorServiceC2238Vl0.g;
        if (TextUtils.isEmpty(Payload.SOURCE)) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
        }
        ExecutorServiceC2238Vl0 executorServiceC2238Vl0 = new ExecutorServiceC2238Vl0(new ThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ExecutorServiceC2238Vl0.b(aVar2, Payload.SOURCE, false)));
        int i2 = ExecutorServiceC2238Vl0.g;
        ExecutorServiceC2238Vl0.a aVar3 = new ExecutorServiceC2238Vl0.a();
        if (TextUtils.isEmpty("disk-cache")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
        }
        ExecutorServiceC2238Vl0 executorServiceC2238Vl1 = new ExecutorServiceC2238Vl0(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ExecutorServiceC2238Vl0.b(aVar3, "disk-cache", true)));
        if (ExecutorServiceC2238Vl0.g == 0) {
            ExecutorServiceC2238Vl0.g = Math.min(4, Runtime.getRuntime().availableProcessors());
        }
        int i3 = ExecutorServiceC2238Vl0.g >= 4 ? 2 : 1;
        ExecutorServiceC2238Vl0.a aVar4 = new ExecutorServiceC2238Vl0.a();
        if (TextUtils.isEmpty("animation")) {
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
        }
        ExecutorServiceC2238Vl0 executorServiceC2238Vl2 = new ExecutorServiceC2238Vl0(new ThreadPoolExecutor(i3, i3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ExecutorServiceC2238Vl0.b(aVar4, "animation", true)));
        C2965bZ0 c2965bZ0 = new C2965bZ0(new C2965bZ0.a(applicationContext));
        C2728aV c2728aV = new C2728aV();
        int i4 = c2965bZ0.a;
        InterfaceC0930Es pu0 = i4 > 0 ? new PU0(i4) : new C1008Fs();
        OU0 ou0 = new OU0(c2965bZ0.c);
        SU0 su0 = new SU0(c2965bZ0.b);
        ZB0 zb0 = new ZB0(applicationContext);
        NK0 nk0 = new NK0();
        nk0.d = zb0;
        Q60 q60 = new Q60(su0, nk0, executorServiceC2238Vl1, executorServiceC2238Vl0, new ExecutorServiceC2238Vl0(new ThreadPoolExecutor(0, Api.BaseClientBuilder.API_PRIORITY_OTHER, ExecutorServiceC2238Vl0.e, TimeUnit.MILLISECONDS, new SynchronousQueue(), new ExecutorServiceC2238Vl0.b(new ExecutorServiceC2238Vl0.a(), "source-unlimited", false))), executorServiceC2238Vl2);
        List list3 = Collections.EMPTY_LIST;
        C2320Wl0 c2320Wl0 = new C2320Wl0(aVar);
        a aVar5 = new a(applicationContext, q60, su0, pu0, ou0, new b(interfaceC0305bE, c2320Wl0), c2728aV, 4, c3686f, c8092zj, list3, list, generatedAppGlideModule, c2320Wl0);
        applicationContext.registerComponentCallbacks(aVar5);
        l = aVar5;
    }

    @NonNull
    public static ComponentCallbacks2C1166Hs1 c(@NonNull Context context) {
        UE.e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return a(context).i.e(context);
    }

    @NonNull
    public static ComponentCallbacks2C1166Hs1 d(@NonNull View view) {
        Context context = view.getContext();
        UE.e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        b bVar = a(context).i;
        bVar.getClass();
        if (C6177qc2.i()) {
            return bVar.e(view.getContext().getApplicationContext());
        }
        UE.e(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activityA = b.a(view.getContext());
        if (activityA == null) {
            return bVar.e(view.getContext().getApplicationContext());
        }
        boolean z = activityA instanceof g;
        InterfaceC2780aj0 interfaceC2780aj0 = bVar.i;
        if (z) {
            g gVar = (g) activityA;
            C8092zj<View, Fragment> c8092zj = bVar.f;
            c8092zj.clear();
            b.c(gVar.getSupportFragmentManager().c.f(), c8092zj);
            View viewFindViewById = gVar.findViewById(R.id.content);
            Fragment orDefault = null;
            while (!view.equals(viewFindViewById) && (orDefault = c8092zj.getOrDefault(view, null)) == null && (view.getParent() instanceof View)) {
                view = (View) view.getParent();
            }
            c8092zj.clear();
            if (orDefault == null) {
                return bVar.f(gVar);
            }
            UE.e(orDefault.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
            if (C6177qc2.i()) {
                return bVar.e(orDefault.getContext().getApplicationContext());
            }
            if (orDefault.getActivity() != null) {
                orDefault.getActivity();
                interfaceC2780aj0.getClass();
            }
            FragmentManager childFragmentManager = orDefault.getChildFragmentManager();
            Context context2 = orDefault.getContext();
            return bVar.j.a(context2, a(context2.getApplicationContext()), orDefault.getLifecycle(), childFragmentManager, orDefault.isVisible());
        }
        C8092zj<View, android.app.Fragment> c8092zj2 = bVar.g;
        c8092zj2.clear();
        bVar.b(activityA.getFragmentManager(), c8092zj2);
        View viewFindViewById2 = activityA.findViewById(R.id.content);
        android.app.Fragment orDefault2 = null;
        while (!view.equals(viewFindViewById2) && (orDefault2 = c8092zj2.getOrDefault(view, null)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        c8092zj2.clear();
        if (orDefault2 == null) {
            return bVar.d(activityA);
        }
        if (orDefault2.getActivity() == null) {
            throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
        }
        if (C6177qc2.i()) {
            return bVar.e(orDefault2.getActivity().getApplicationContext());
        }
        if (orDefault2.getActivity() != null) {
            orDefault2.getActivity();
            interfaceC2780aj0.getClass();
        }
        android.app.FragmentManager childFragmentManager2 = orDefault2.getChildFragmentManager();
        Activity activity = orDefault2.getActivity();
        boolean zIsVisible = orDefault2.isVisible();
        FragmentC1244Is1 fragmentC1244Is1G = bVar.g(childFragmentManager2, orDefault2);
        ComponentCallbacks2C1166Hs1 componentCallbacks2C1166Hs1 = fragmentC1244Is1G.h;
        if (componentCallbacks2C1166Hs1 != null) {
            return componentCallbacks2C1166Hs1;
        }
        ComponentCallbacks2C1166Hs1 componentCallbacks2C1166Hs1A = bVar.e.a(a(activity), fragmentC1244Is1G.d, fragmentC1244Is1G.e, activity);
        if (zIsVisible) {
            componentCallbacks2C1166Hs1A.onStart();
        }
        fragmentC1244Is1G.h = componentCallbacks2C1166Hs1A;
        return componentCallbacks2C1166Hs1A;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        C6177qc2.a();
        this.e.e(0L);
        this.d.e();
        this.h.a();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        long j;
        C6177qc2.a();
        synchronized (this.k) {
            try {
                Iterator it = this.k.iterator();
                while (it.hasNext()) {
                    ((ComponentCallbacks2C1166Hs1) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        SU0 su0 = this.e;
        su0.getClass();
        if (i >= 40) {
            su0.e(0L);
        } else if (i >= 20 || i == 15) {
            synchronized (su0) {
                j = su0.b;
            }
            su0.e(j / 2);
        }
        this.d.a(i);
        OU0 ou0 = this.h;
        synchronized (ou0) {
            try {
                if (i >= 40) {
                    ou0.a();
                } else if (i >= 20 || i == 15) {
                    ou0.c(ou0.e / 2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
