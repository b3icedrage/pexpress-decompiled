package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import androidx.lifecycle.l;
import androidx.lifecycle.s;
import androidx.lifecycle.w;
import androidx.savedstate.a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Ti0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2073Ti0 implements e, OC1, Wd2 {
    public final Fragment d;
    public final Vd2 e;
    public final RunnableC2818aq g;
    public l h = null;
    public NC1 i = null;

    public C2073Ti0(@NonNull Fragment fragment, @NonNull Vd2 vd2, @NonNull RunnableC2818aq runnableC2818aq) {
        this.d = fragment;
        this.e = vd2;
        this.g = runnableC2818aq;
    }

    public final void a(@NonNull g.a aVar) {
        this.h.f(aVar);
    }

    public final void b() {
        if (this.h == null) {
            this.h = new l(this);
            Intrinsics.checkNotNullParameter(this, "owner");
            NC1 nc1 = new NC1(this);
            this.i = nc1;
            nc1.a();
            this.g.run();
        }
    }

    @Override // androidx.lifecycle.e
    @NonNull
    public final VP getDefaultViewModelCreationExtras() {
        Application application;
        Fragment fragment = this.d;
        Context applicationContext = fragment.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        U11 u11 = new U11(0);
        if (application != null) {
            u11.b(w.a, application);
        }
        u11.b(s.a, fragment);
        u11.b(s.b, this);
        if (fragment.getArguments() != null) {
            u11.b(s.c, fragment.getArguments());
        }
        return u11;
    }

    @Override // defpackage.FP0
    @NonNull
    public final g getLifecycle() {
        b();
        return this.h;
    }

    @Override // defpackage.OC1
    @NonNull
    public final a getSavedStateRegistry() {
        b();
        return this.i.b;
    }

    @Override // defpackage.Wd2
    @NonNull
    public final Vd2 getViewModelStore() {
        b();
        return this.e;
    }
}
