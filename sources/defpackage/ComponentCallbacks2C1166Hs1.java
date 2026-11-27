package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: Hs1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class ComponentCallbacks2C1166Hs1 implements ComponentCallbacks2, DP0 {
    public static final C1400Ks1 o = new C1400Ks1().g(Bitmap.class).l();
    public final com.bumptech.glide.a d;
    public final Context e;
    public final InterfaceC7604xP0 g;
    public final C2026Ss1 h;
    public final InterfaceC1322Js1 i;
    public final C6368rX1 j;
    public final a k;
    public final InterfaceC6118qK l;
    public final CopyOnWriteArrayList<InterfaceC1088Gs1<Object>> m;
    public C1400Ks1 n;

    /* JADX INFO: renamed from: Hs1$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ComponentCallbacks2C1166Hs1 componentCallbacks2C1166Hs1 = ComponentCallbacks2C1166Hs1.this;
            componentCallbacks2C1166Hs1.g.c(componentCallbacks2C1166Hs1);
        }
    }

    /* JADX INFO: renamed from: Hs1$b */
    public class b implements InterfaceC6118qK.a {
        public final C2026Ss1 a;

        public b(C2026Ss1 c2026Ss1) {
            this.a = c2026Ss1;
        }

        @Override // defpackage.InterfaceC6118qK.a
        public final void a(boolean z) {
            if (z) {
                synchronized (ComponentCallbacks2C1166Hs1.this) {
                    C2026Ss1 c2026Ss1 = this.a;
                    for (InterfaceC4762js1 interfaceC4762js1 : C6177qc2.e(c2026Ss1.a)) {
                        if (!interfaceC4762js1.l() && !interfaceC4762js1.j()) {
                            interfaceC4762js1.clear();
                            if (c2026Ss1.c) {
                                c2026Ss1.b.add(interfaceC4762js1);
                            } else {
                                interfaceC4762js1.k();
                            }
                        }
                    }
                }
            }
        }
    }

    static {
        new C1400Ks1().g(C0988Fl0.class).l();
    }

    public ComponentCallbacks2C1166Hs1(@NonNull com.bumptech.glide.a aVar, @NonNull InterfaceC7604xP0 interfaceC7604xP0, @NonNull InterfaceC1322Js1 interfaceC1322Js1, @NonNull Context context) {
        C1400Ks1 c1400Ks1;
        C2026Ss1 c2026Ss1 = new C2026Ss1();
        C2728aV c2728aV = aVar.j;
        this.j = new C6368rX1();
        a aVar2 = new a();
        this.k = aVar2;
        this.d = aVar;
        this.g = interfaceC7604xP0;
        this.i = interfaceC1322Js1;
        this.h = c2026Ss1;
        this.e = context;
        Context applicationContext = context.getApplicationContext();
        b bVar = new b(c2026Ss1);
        c2728aV.getClass();
        boolean z = C6333rM.checkSelfPermission(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0;
        Log.isLoggable("ConnectivityMonitor", 3);
        InterfaceC6118qK zu = z ? new ZU(applicationContext, bVar) : new C3088c71();
        this.l = zu;
        synchronized (aVar.k) {
            if (aVar.k.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            aVar.k.add(this);
        }
        if (C6177qc2.i()) {
            C6177qc2.f().post(aVar2);
        } else {
            interfaceC7604xP0.c(this);
        }
        interfaceC7604xP0.c(zu);
        this.m = new CopyOnWriteArrayList<>(aVar.g.e);
        C2082Tl0 c2082Tl0 = aVar.g;
        synchronized (c2082Tl0) {
            try {
                if (c2082Tl0.j == null) {
                    c2082Tl0.d.getClass();
                    C1400Ks1 c1400Ks2 = new C1400Ks1();
                    c1400Ks2.r = true;
                    c2082Tl0.j = c1400Ks2;
                }
                c1400Ks1 = c2082Tl0.j;
            } catch (Throwable th) {
                throw th;
            }
        }
        q(c1400Ks1);
    }

    @NonNull
    public <ResourceType> C6025ps1<ResourceType> c(@NonNull Class<ResourceType> cls) {
        return new C6025ps1<>(this.d, this, cls, this.e);
    }

    @NonNull
    public C6025ps1<Bitmap> f() {
        return c(Bitmap.class).a(o);
    }

    @NonNull
    public C6025ps1<Drawable> g() {
        return c(Drawable.class);
    }

    public final void l(InterfaceC5529nX1<?> interfaceC5529nX1) {
        if (interfaceC5529nX1 == null) {
            return;
        }
        boolean zR = r(interfaceC5529nX1);
        InterfaceC4762js1 interfaceC4762js1D = interfaceC5529nX1.d();
        if (zR) {
            return;
        }
        com.bumptech.glide.a aVar = this.d;
        synchronized (aVar.k) {
            try {
                Iterator it = aVar.k.iterator();
                while (it.hasNext()) {
                    if (((ComponentCallbacks2C1166Hs1) it.next()).r(interfaceC5529nX1)) {
                        return;
                    }
                }
                if (interfaceC4762js1D != null) {
                    interfaceC5529nX1.e(null);
                    interfaceC4762js1D.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @NonNull
    public C6025ps1<Drawable> m(Integer num) {
        return g().Q(num);
    }

    @NonNull
    public C6025ps1<Drawable> n(String str) {
        return g().R(str);
    }

    public final synchronized void o() {
        C2026Ss1 c2026Ss1 = this.h;
        c2026Ss1.c = true;
        for (InterfaceC4762js1 interfaceC4762js1 : C6177qc2.e(c2026Ss1.a)) {
            if (interfaceC4762js1.isRunning()) {
                interfaceC4762js1.b();
                c2026Ss1.b.add(interfaceC4762js1);
            }
        }
    }

    @Override // defpackage.DP0
    public final synchronized void onDestroy() {
        try {
            this.j.onDestroy();
            Iterator it = C6177qc2.e(this.j.d).iterator();
            while (it.hasNext()) {
                l((InterfaceC5529nX1) it.next());
            }
            this.j.d.clear();
            C2026Ss1 c2026Ss1 = this.h;
            Iterator it2 = C6177qc2.e(c2026Ss1.a).iterator();
            while (it2.hasNext()) {
                c2026Ss1.a((InterfaceC4762js1) it2.next());
            }
            c2026Ss1.b.clear();
            this.g.a(this);
            this.g.a(this.l);
            C6177qc2.f().removeCallbacks(this.k);
            com.bumptech.glide.a aVar = this.d;
            synchronized (aVar.k) {
                if (!aVar.k.contains(this)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                aVar.k.remove(this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.DP0
    public final synchronized void onStart() {
        p();
        this.j.onStart();
    }

    @Override // defpackage.DP0
    public final synchronized void onStop() {
        o();
        this.j.onStop();
    }

    public final synchronized void p() {
        C2026Ss1 c2026Ss1 = this.h;
        c2026Ss1.c = false;
        for (InterfaceC4762js1 interfaceC4762js1 : C6177qc2.e(c2026Ss1.a)) {
            if (!interfaceC4762js1.l() && !interfaceC4762js1.isRunning()) {
                interfaceC4762js1.k();
            }
        }
        c2026Ss1.b.clear();
    }

    public synchronized void q(@NonNull C1400Ks1 c1400Ks1) {
        this.n = c1400Ks1.clone().b();
    }

    public final synchronized boolean r(@NonNull InterfaceC5529nX1<?> interfaceC5529nX1) {
        InterfaceC4762js1 interfaceC4762js1D = interfaceC5529nX1.d();
        if (interfaceC4762js1D == null) {
            return true;
        }
        if (!this.h.a(interfaceC4762js1D)) {
            return false;
        }
        this.j.d.remove(interfaceC5529nX1);
        interfaceC5529nX1.e(null);
        return true;
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.h + ", treeNode=" + this.i + "}";
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }
}
