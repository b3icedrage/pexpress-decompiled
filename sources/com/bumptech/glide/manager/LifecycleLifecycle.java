package com.bumptech.glide.manager;

import androidx.annotation.NonNull;
import androidx.lifecycle.g;
import androidx.lifecycle.m;
import defpackage.C6177qc2;
import defpackage.DP0;
import defpackage.EP0;
import defpackage.FP0;
import defpackage.InterfaceC7604xP0;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class LifecycleLifecycle implements InterfaceC7604xP0, EP0 {

    @NonNull
    public final HashSet d = new HashSet();

    @NonNull
    public final g e;

    public LifecycleLifecycle(g gVar) {
        this.e = gVar;
        gVar.a(this);
    }

    @Override // defpackage.InterfaceC7604xP0
    public final void a(@NonNull DP0 dp0) {
        this.d.remove(dp0);
    }

    @Override // defpackage.InterfaceC7604xP0
    public final void c(@NonNull DP0 dp0) {
        this.d.add(dp0);
        g gVar = this.e;
        if (gVar.b() == g.b.d) {
            dp0.onDestroy();
        } else if (gVar.b().b(g.b.h)) {
            dp0.onStart();
        } else {
            dp0.onStop();
        }
    }

    @m(g.a.ON_DESTROY)
    public void onDestroy(@NonNull FP0 fp0) {
        Iterator it = C6177qc2.e(this.d).iterator();
        while (it.hasNext()) {
            ((DP0) it.next()).onDestroy();
        }
        fp0.getLifecycle().c(this);
    }

    @m(g.a.ON_START)
    public void onStart(@NonNull FP0 fp0) {
        Iterator it = C6177qc2.e(this.d).iterator();
        while (it.hasNext()) {
            ((DP0) it.next()).onStart();
        }
    }

    @m(g.a.ON_STOP)
    public void onStop(@NonNull FP0 fp0) {
        Iterator it = C6177qc2.e(this.d).iterator();
        while (it.hasNext()) {
            ((DP0) it.next()).onStop();
        }
    }
}
