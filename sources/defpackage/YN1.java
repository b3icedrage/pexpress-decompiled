package defpackage;

import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.data.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class YN1 implements InterfaceC6981uS, InterfaceC6981uS.a {
    public final C6567sU<?> d;
    public final RunnableC6777tU e;
    public volatile int g;
    public volatile C5512nS h;
    public volatile Object i;
    public volatile I01.a<?> j;
    public volatile C5722oS k;

    public YN1(C6567sU c6567sU, RunnableC6777tU runnableC6777tU) {
        this.d = c6567sU;
        this.e = runnableC6777tU;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    @Override // defpackage.InterfaceC6981uS
    public final boolean a() {
        boolean z;
        if (this.i == null) {
            if (this.h != null) {
            }
            this.h = null;
            this.j = null;
            z = false;
            while (!z) {
                ArrayList arrayListB = this.d.b();
                int i = this.g;
                this.g = i + 1;
                this.j = (I01.a) arrayListB.get(i);
                if (this.j == null) {
                }
            }
            return z;
        }
        Object obj = this.i;
        this.i = null;
        try {
            if (c(obj)) {
                if (this.h != null || !this.h.a()) {
                    this.h = null;
                    this.j = null;
                    z = false;
                    while (!z && this.g < this.d.b().size()) {
                        ArrayList arrayListB2 = this.d.b();
                        int i2 = this.g;
                        this.g = i2 + 1;
                        this.j = (I01.a) arrayListB2.get(i2);
                        if (this.j == null && (this.d.p.c(this.j.c.e()) || this.d.c(this.j.c.a()) != null)) {
                            this.j.c.c(this.d.o, new XN1(this, this.j));
                            z = true;
                        }
                    }
                    return z;
                }
            }
        } catch (IOException unused) {
            Log.isLoggable("SourceGenerator", 3);
        }
        return true;
    }

    @Override // defpackage.InterfaceC6981uS.a
    public final void b(InterfaceC3129cK0 interfaceC3129cK0, Object obj, InterfaceC6771tS<?> interfaceC6771tS, CS cs, InterfaceC3129cK0 interfaceC3129cK1) {
        this.e.b(interfaceC3129cK0, obj, interfaceC6771tS, this.j.c.e(), interfaceC3129cK0);
    }

    public final boolean c(Object obj) throws Throwable {
        Throwable th;
        int i = C6562sS0.a;
        SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        try {
            a aVarG = this.d.c.a().g(obj);
            Object objA = aVarG.a();
            E60<X> e60D = this.d.d(objA);
            U31 u31 = new U31(e60D, objA, this.d.i);
            InterfaceC3129cK0 interfaceC3129cK0 = this.j.a;
            C6567sU<?> c6567sU = this.d;
            C5722oS c5722oS = new C5722oS(interfaceC3129cK0, c6567sU.n);
            Z10 z10A = c6567sU.h.a();
            z10A.b(c5722oS, u31);
            if (Log.isLoggable("SourceGenerator", 2)) {
                c5722oS.toString();
                obj.toString();
                e60D.toString();
                SystemClock.elapsedRealtimeNanos();
            }
            if (z10A.a(c5722oS) != null) {
                this.k = c5722oS;
                this.h = new C5512nS(Collections.singletonList(this.j.a), this.d, this);
                this.j.c.b();
                return true;
            }
            if (Log.isLoggable("SourceGenerator", 3)) {
                Objects.toString(this.k);
                obj.toString();
            }
            try {
                this.e.b(this.j.a, aVarG.a(), this.j.c, this.j.c.e(), this.j.a);
                return false;
            } catch (Throwable th2) {
                th = th2;
                z = true;
                if (z) {
                    throw th;
                }
                this.j.c.b();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // defpackage.InterfaceC6981uS
    public final void cancel() {
        I01.a<?> aVar = this.j;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    @Override // defpackage.InterfaceC6981uS.a
    public final void e(InterfaceC3129cK0 interfaceC3129cK0, Exception exc, InterfaceC6771tS<?> interfaceC6771tS, CS cs) {
        this.e.e(interfaceC3129cK0, exc, interfaceC6771tS, this.j.c.e());
    }
}
