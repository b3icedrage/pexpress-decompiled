package io.sentry.android.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import defpackage.C0702Bu;
import defpackage.C0841Do0;
import defpackage.C3027bp1;
import defpackage.C7724xz;
import defpackage.C8100zl;
import defpackage.EnumC4869kO1;
import defpackage.InterfaceC2347Wu0;
import defpackage.NG1;
import defpackage.SD1;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends FragmentManager.FragmentLifecycleCallbacks {

    @NotNull
    public final SD1 a;

    @NotNull
    public final Set<a> b;
    public final boolean c;

    @NotNull
    public final WeakHashMap<Fragment, InterfaceC2347Wu0> d;

    public b(@NotNull SD1 scopes, @NotNull Set filterFragmentLifecycleBreadcrumbs, boolean z) {
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        Intrinsics.checkNotNullParameter(filterFragmentLifecycleBreadcrumbs, "filterFragmentLifecycleBreadcrumbs");
        this.a = scopes;
        this.b = filterFragmentLifecycleBreadcrumbs;
        this.c = z;
        this.d = new WeakHashMap<>();
    }

    public static String b(Fragment fragment) {
        String canonicalName = fragment.getClass().getCanonicalName();
        if (canonicalName != null) {
            return canonicalName;
        }
        String simpleName = fragment.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    public final void a(Fragment fragment, a aVar) {
        if (this.b.contains(aVar)) {
            C0702Bu c0702Bu = new C0702Bu();
            c0702Bu.i = "navigation";
            c0702Bu.f(aVar.getBreadcrumbName(), "state");
            c0702Bu.f(b(fragment), "screen");
            c0702Bu.k = "ui.fragment.lifecycle";
            c0702Bu.m = NG1.INFO;
            C0841Do0 c0841Do0 = new C0841Do0();
            c0841Do0.d(fragment, "android:fragment");
            this.a.l(c0702Bu, c0841Do0);
        }
    }

    public final void c(Fragment fragment) {
        InterfaceC2347Wu0 interfaceC2347Wu0;
        if (this.a.p().isTracingEnabled() && this.c) {
            WeakHashMap<Fragment, InterfaceC2347Wu0> weakHashMap = this.d;
            if (weakHashMap.containsKey(fragment) && (interfaceC2347Wu0 = weakHashMap.get(fragment)) != null) {
                EnumC4869kO1 status = interfaceC2347Wu0.getStatus();
                if (status == null) {
                    status = EnumC4869kO1.OK;
                }
                interfaceC2347Wu0.A(status);
                weakHashMap.remove(fragment);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public final void onFragmentAttached(@NotNull FragmentManager fragmentManager, @NotNull Fragment fragment, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(context, "context");
        a(fragment, a.ATTACHED);
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public final void onFragmentCreated(@NotNull FragmentManager fragmentManager, @NotNull Fragment fragment, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        a(fragment, a.CREATED);
        if (fragment.isAdded()) {
            SD1 sd1 = this.a;
            if (sd1.p().isEnableScreenTracking()) {
                sd1.A(null, new C8100zl(this, fragment));
            }
            if (sd1.p().isTracingEnabled() && this.c) {
                WeakHashMap<Fragment, InterfaceC2347Wu0> weakHashMap = this.d;
                if (weakHashMap.containsKey(fragment)) {
                    return;
                }
                C3027bp1 c3027bp1 = new C3027bp1();
                sd1.A(null, new C7724xz(c3027bp1));
                String strB = b(fragment);
                InterfaceC2347Wu0 interfaceC2347Wu0 = (InterfaceC2347Wu0) c3027bp1.d;
                InterfaceC2347Wu0 interfaceC2347Wu0Y = interfaceC2347Wu0 != null ? interfaceC2347Wu0.y("ui.load", strB) : null;
                if (interfaceC2347Wu0Y != null) {
                    weakHashMap.put(fragment, interfaceC2347Wu0Y);
                    interfaceC2347Wu0Y.w().m = "auto.ui.fragment";
                }
            }
        }
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public final void onFragmentDestroyed(@NotNull FragmentManager fragmentManager, @NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        a(fragment, a.DESTROYED);
        c(fragment);
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public final void onFragmentDetached(@NotNull FragmentManager fragmentManager, @NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        a(fragment, a.DETACHED);
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public final void onFragmentPaused(@NotNull FragmentManager fragmentManager, @NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        a(fragment, a.PAUSED);
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public final void onFragmentResumed(@NotNull FragmentManager fragmentManager, @NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        a(fragment, a.RESUMED);
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public final void onFragmentSaveInstanceState(@NotNull FragmentManager fragmentManager, @NotNull Fragment fragment, @NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(outState, "outState");
        a(fragment, a.SAVE_INSTANCE_STATE);
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public final void onFragmentStarted(@NotNull FragmentManager fragmentManager, @NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        a(fragment, a.STARTED);
        c(fragment);
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public final void onFragmentStopped(@NotNull FragmentManager fragmentManager, @NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        a(fragment, a.STOPPED);
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public final void onFragmentViewCreated(@NotNull FragmentManager fragmentManager, @NotNull Fragment fragment, @NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(view, "view");
        a(fragment, a.VIEW_CREATED);
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public final void onFragmentViewDestroyed(@NotNull FragmentManager fragmentManager, @NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        a(fragment, a.VIEW_DESTROYED);
    }
}
