package com.bumptech.glide.manager;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.g;
import defpackage.C6177qc2;
import defpackage.ComponentCallbacks2C1166Hs1;
import defpackage.DP0;
import defpackage.InterfaceC1322Js1;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final HashMap a = new HashMap();

    @NonNull
    public final com.bumptech.glide.manager.b.InterfaceC0305b b;

    /* JADX INFO: renamed from: com.bumptech.glide.manager.a$a, reason: collision with other inner class name */
    public class C0304a implements DP0 {
        public final /* synthetic */ g d;

        public C0304a(g gVar) {
            this.d = gVar;
        }

        @Override // defpackage.DP0
        public final void onDestroy() {
            a.this.a.remove(this.d);
        }

        @Override // defpackage.DP0
        public final void onStart() {
        }

        @Override // defpackage.DP0
        public final void onStop() {
        }
    }

    public final class b implements InterfaceC1322Js1 {
    }

    public a(@NonNull com.bumptech.glide.manager.b.InterfaceC0305b interfaceC0305b) {
        this.b = interfaceC0305b;
    }

    public final ComponentCallbacks2C1166Hs1 a(Context context, com.bumptech.glide.a aVar, g gVar, FragmentManager fragmentManager, boolean z) {
        C6177qc2.a();
        C6177qc2.a();
        HashMap map = this.a;
        ComponentCallbacks2C1166Hs1 componentCallbacks2C1166Hs1 = (ComponentCallbacks2C1166Hs1) map.get(gVar);
        if (componentCallbacks2C1166Hs1 != null) {
            return componentCallbacks2C1166Hs1;
        }
        LifecycleLifecycle lifecycleLifecycle = new LifecycleLifecycle(gVar);
        ComponentCallbacks2C1166Hs1 componentCallbacks2C1166Hs1A = this.b.a(aVar, lifecycleLifecycle, new b(), context);
        map.put(gVar, componentCallbacks2C1166Hs1A);
        lifecycleLifecycle.c(new C0304a(gVar));
        if (z) {
            componentCallbacks2C1166Hs1A.onStart();
        }
        return componentCallbacks2C1166Hs1A;
    }
}
