package io.sentry.android.fragment;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.g;
import defpackage.C2688aH1;
import defpackage.C6702t60;
import defpackage.LG1;
import defpackage.NG1;
import defpackage.OB0;
import defpackage.SD1;
import io.sentry.util.j;
import java.io.Closeable;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B%\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\rB!\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lio/sentry/android/fragment/FragmentLifecycleIntegration;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "LOB0;", "Ljava/io/Closeable;", "Landroid/app/Application;", "application", "", "Lio/sentry/android/fragment/a;", "filterFragmentLifecycleBreadcrumbs", "", "enableAutoFragmentLifecycleTracing", "<init>", "(Landroid/app/Application;Ljava/util/Set;Z)V", "(Landroid/app/Application;)V", "enableFragmentLifecycleBreadcrumbs", "(Landroid/app/Application;ZZ)V", "sentry-android-fragment_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FragmentLifecycleIntegration implements Application.ActivityLifecycleCallbacks, OB0, Closeable {

    @NotNull
    public final Application d;

    @NotNull
    public final Set<a> e;
    public final boolean g;
    public SD1 h;
    public C2688aH1 i;

    static {
        LG1.d().b("maven:io.sentry:sentry-android-fragment", "8.35.0");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FragmentLifecycleIntegration(@NotNull Application application, @NotNull Set<? extends a> filterFragmentLifecycleBreadcrumbs, boolean z) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(filterFragmentLifecycleBreadcrumbs, "filterFragmentLifecycleBreadcrumbs");
        this.d = application;
        this.e = filterFragmentLifecycleBreadcrumbs;
        this.g = z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.unregisterActivityLifecycleCallbacks(this);
        C2688aH1 c2688aH1 = this.i;
        if (c2688aH1 != null) {
            if (c2688aH1 != null) {
                c2688aH1.getLogger().a(NG1.DEBUG, "FragmentLifecycleIntegration removed.", new Object[0]);
            } else {
                Intrinsics.l("options");
                throw null;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        FragmentManager supportFragmentManager;
        Intrinsics.checkNotNullParameter(activity, "activity");
        g gVar = activity instanceof g ? (g) activity : null;
        if (gVar == null || (supportFragmentManager = gVar.getSupportFragmentManager()) == null) {
            return;
        }
        SD1 sd1 = this.h;
        if (sd1 != null) {
            supportFragmentManager.R(new b(sd1, this.e, this.g), true);
        } else {
            Intrinsics.l("scopes");
            throw null;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // defpackage.OB0
    public final void t(@NotNull C2688aH1 options) {
        SD1 scopes = SD1.a;
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        Intrinsics.checkNotNullParameter(options, "options");
        this.h = scopes;
        this.i = options;
        this.d.registerActivityLifecycleCallbacks(this);
        options.getLogger().a(NG1.DEBUG, "FragmentLifecycleIntegration installed.", new Object[0]);
        j.a("FragmentLifecycle");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentLifecycleIntegration(@NotNull Application application) {
        this(application, (Set<? extends a>) a.states, false);
        Intrinsics.checkNotNullParameter(application, "application");
        a.INSTANCE.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FragmentLifecycleIntegration(@NotNull Application application, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(application, "application");
        a.INSTANCE.getClass();
        Set set = z ? a.states : null;
        this(application, (Set<? extends a>) (set == null ? C6702t60.d : set), z2);
    }
}
