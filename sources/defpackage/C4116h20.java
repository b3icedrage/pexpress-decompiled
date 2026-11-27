package defpackage;

import android.util.Log;
import io.sentry.android.core.b0;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: renamed from: h20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4116h20 implements Z10 {
    public final File b;
    public C3067c20 e;
    public final C2858b20 d = new C2858b20();
    public final long c = 262144000;
    public final C4155hC1 a = new C4155hC1();

    @Deprecated
    public C4116h20(File file) {
        this.b = file;
    }

    @Override // defpackage.Z10
    public final File a(InterfaceC3129cK0 interfaceC3129cK0) {
        String strA = this.a.a(interfaceC3129cK0);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Objects.toString(interfaceC3129cK0);
        }
        try {
            C3067c20.e eVarP = c().p(strA);
            if (eVarP != null) {
                return eVarP.a[0];
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            b0.f("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    @Override // defpackage.Z10
    public final void b(InterfaceC3129cK0 interfaceC3129cK0, U31 u31) {
        C2858b20.a aVar;
        String strA = this.a.a(interfaceC3129cK0);
        C2858b20 c2858b20 = this.d;
        synchronized (c2858b20) {
            aVar = (C2858b20.a) c2858b20.a.get(strA);
            if (aVar == null) {
                C2858b20.b bVar = c2858b20.b;
                synchronized (bVar.a) {
                    aVar = (C2858b20.a) bVar.a.poll();
                }
                if (aVar == null) {
                    aVar = new C2858b20.a();
                }
                c2858b20.a.put(strA, aVar);
            }
            aVar.b++;
        }
        aVar.a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Objects.toString(interfaceC3129cK0);
            }
            try {
                C3067c20 c3067c20C = c();
                if (c3067c20C.p(strA) != null) {
                    this.d.a(strA);
                    return;
                }
                C3067c20.c cVarK = c3067c20C.k(strA);
                if (cVarK == null) {
                    throw new IllegalStateException("Had two simultaneous puts for: ".concat(strA));
                }
                try {
                    if (((E60) u31.d).f(u31.e, cVarK.b(), (C4227ha1) u31.g)) {
                        C3067c20.c(C3067c20.this, cVarK, true);
                        cVarK.c = true;
                    }
                    if (!cVarK.c) {
                        try {
                            cVarK.a();
                        } catch (IOException unused) {
                        }
                    }
                    this.d.a(strA);
                } catch (Throwable th) {
                    if (!cVarK.c) {
                        try {
                            cVarK.a();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    b0.f("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            }
        } catch (Throwable th2) {
            this.d.a(strA);
            throw th2;
        }
    }

    public final synchronized C3067c20 c() {
        try {
            if (this.e == null) {
                this.e = C3067c20.t(this.b, this.c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.e;
    }
}
