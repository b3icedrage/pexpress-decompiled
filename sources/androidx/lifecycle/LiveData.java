package androidx.lifecycle;

import android.os.Looper;
import androidx.annotation.NonNull;
import defpackage.C1039Gc0;
import defpackage.C3841fj;
import defpackage.C3945gC1;
import defpackage.C4681jW;
import defpackage.FP0;
import defpackage.InterfaceC4819k81;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class LiveData<T> {
    public static final Object k = new Object();
    public final Object a;
    public final C3945gC1<InterfaceC4819k81<? super T>, LiveData<T>.c> b;
    public int c;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final a j;

    public class LifecycleBoundObserver extends LiveData<T>.c implements k {

        @NonNull
        public final FP0 i;

        public LifecycleBoundObserver(FP0 fp0, InterfaceC4819k81<? super T> interfaceC4819k81) {
            super(interfaceC4819k81);
            this.i = fp0;
        }

        @Override // androidx.lifecycle.k
        public final void b(@NonNull FP0 fp0, @NonNull g.a aVar) {
            FP0 fp1 = this.i;
            g.b bVarB = fp1.getLifecycle().b();
            if (bVarB == g.b.d) {
                LiveData.this.j(this.d);
                return;
            }
            g.b bVar = null;
            while (bVar != bVarB) {
                a(e());
                bVar = bVarB;
                bVarB = fp1.getLifecycle().b();
            }
        }

        @Override // androidx.lifecycle.LiveData.c
        public final void c() {
            this.i.getLifecycle().c(this);
        }

        @Override // androidx.lifecycle.LiveData.c
        public final boolean d(FP0 fp0) {
            return this.i == fp0;
        }

        @Override // androidx.lifecycle.LiveData.c
        public final boolean e() {
            return this.i.getLifecycle().b().b(g.b.h);
        }
    }

    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public final void run() {
            Object obj;
            synchronized (LiveData.this.a) {
                obj = LiveData.this.f;
                LiveData.this.f = LiveData.k;
            }
            LiveData.this.k(obj);
        }
    }

    public class b extends LiveData<T>.c {
        @Override // androidx.lifecycle.LiveData.c
        public final boolean e() {
            return true;
        }
    }

    public abstract class c {
        public final InterfaceC4819k81<? super T> d;
        public boolean e;
        public int g = -1;

        public c(InterfaceC4819k81<? super T> interfaceC4819k81) {
            this.d = interfaceC4819k81;
        }

        public final void a(boolean z) {
            if (z == this.e) {
                return;
            }
            this.e = z;
            int i = z ? 1 : -1;
            LiveData liveData = LiveData.this;
            int i2 = liveData.c;
            liveData.c = i + i2;
            if (!liveData.d) {
                liveData.d = true;
                while (true) {
                    try {
                        int i3 = liveData.c;
                        if (i2 == i3) {
                            break;
                        }
                        boolean z2 = i2 == 0 && i3 > 0;
                        boolean z3 = i2 > 0 && i3 == 0;
                        if (z2) {
                            liveData.g();
                        } else if (z3) {
                            liveData.h();
                        }
                        i2 = i3;
                    } catch (Throwable th) {
                        liveData.d = false;
                        throw th;
                    }
                }
                liveData.d = false;
            }
            if (this.e) {
                liveData.c(this);
            }
        }

        public void c() {
        }

        public boolean d(FP0 fp0) {
            return false;
        }

        public abstract boolean e();
    }

    public LiveData(T t) {
        this.a = new Object();
        this.b = new C3945gC1<>();
        this.c = 0;
        this.f = k;
        this.j = new a();
        this.e = t;
        this.g = 0;
    }

    public static void a(String str) {
        if (!C3841fj.w().x()) {
            throw new IllegalStateException(C1039Gc0.d("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(LiveData<T>.c cVar) {
        if (cVar.e) {
            if (!cVar.e()) {
                cVar.a(false);
                return;
            }
            int i = cVar.g;
            int i2 = this.g;
            if (i >= i2) {
                return;
            }
            cVar.g = i2;
            cVar.d.d((Object) this.e);
        }
    }

    public final void c(LiveData<T>.c cVar) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            this.i = false;
            if (cVar != null) {
                b(cVar);
                cVar = null;
            } else {
                C3945gC1<InterfaceC4819k81<? super T>, LiveData<T>.c> c3945gC1 = this.b;
                c3945gC1.getClass();
                C3945gC1.d dVar = new C3945gC1.d();
                c3945gC1.g.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((c) ((Map.Entry) dVar.next()).getValue());
                    if (this.i) {
                        break;
                    }
                }
            }
        } while (this.i);
        this.h = false;
    }

    public T d() {
        T t = (T) this.e;
        if (t != k) {
            return t;
        }
        return null;
    }

    public final void e(@NonNull FP0 fp0, @NonNull InterfaceC4819k81<? super T> interfaceC4819k81) {
        a("observe");
        if (fp0.getLifecycle().b() == g.b.d) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(fp0, interfaceC4819k81);
        LiveData<T>.c cVarB = this.b.b(interfaceC4819k81, lifecycleBoundObserver);
        if (cVarB != null && !cVarB.d(fp0)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVarB != null) {
            return;
        }
        fp0.getLifecycle().a(lifecycleBoundObserver);
    }

    public final void f(@NonNull InterfaceC4819k81<? super T> interfaceC4819k81) {
        a("observeForever");
        b bVar = new b(interfaceC4819k81);
        LiveData<T>.c cVarB = this.b.b(interfaceC4819k81, bVar);
        if (cVarB instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (cVarB != null) {
            return;
        }
        bVar.a(true);
    }

    public void g() {
    }

    public void h() {
    }

    public void i(T t) {
        boolean z;
        synchronized (this.a) {
            z = this.f == k;
            this.f = t;
        }
        if (z) {
            C3841fj c3841fjW = C3841fj.w();
            a aVar = this.j;
            C4681jW c4681jW = c3841fjW.e;
            if (c4681jW.g == null) {
                synchronized (c4681jW.e) {
                    try {
                        if (c4681jW.g == null) {
                            c4681jW.g = C4681jW.w(Looper.getMainLooper());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            c4681jW.g.post(aVar);
        }
    }

    public void j(@NonNull InterfaceC4819k81<? super T> interfaceC4819k81) {
        a("removeObserver");
        LiveData<T>.c cVarC = this.b.c(interfaceC4819k81);
        if (cVarC == null) {
            return;
        }
        cVarC.c();
        cVarC.a(false);
    }

    public void k(T t) {
        a("setValue");
        this.g++;
        this.e = t;
        c(null);
    }

    public LiveData() {
        this.a = new Object();
        this.b = new C3945gC1<>();
        this.c = 0;
        Object obj = k;
        this.f = obj;
        this.j = new a();
        this.e = obj;
        this.g = -1;
    }
}
