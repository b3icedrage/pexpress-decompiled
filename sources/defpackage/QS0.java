package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class QS0 implements InterfaceC6237qt0 {
    public String d;
    public String e;
    public HS0 g;
    public KS0 h;
    public transient C5714oP0 i;
    public String j;
    public transient String k;
    public transient Object[] l;
    public StackTraceElement[] m;
    public Map<String, String> n;
    public long o;

    @Override // defpackage.InterfaceC6237qt0
    public final StackTraceElement[] a() {
        StackTraceElement[] stackTraceElementArr;
        if (this.m == null) {
            Throwable th = new Throwable();
            HS0 hs0 = this.g;
            int i = hs0.u;
            ArrayList arrayList = hs0.v;
            String str = C2459Xx.a;
            StackTraceElement[] stackTrace = th.getStackTrace();
            int i2 = -1;
            for (int i3 = 0; i3 < stackTrace.length; i3++) {
                String className = stackTrace[i3].getClassName();
                if (!className.equals("BS0") && !className.equals("org.apache.log4j.Category") && !className.startsWith("org.slf4j.Logger")) {
                    if (arrayList != null) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (className.startsWith((String) it.next())) {
                                    i2 = i3 + 1;
                                }
                            }
                        }
                    }
                    if (i2 != -1) {
                        break;
                    }
                } else {
                    i2 = i3 + 1;
                }
            }
            if (i2 == -1) {
                stackTraceElementArr = C2459Xx.b;
            } else {
                int length = stackTrace.length - i2;
                if (i >= length) {
                    i = length;
                }
                StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i];
                for (int i4 = 0; i4 < i; i4++) {
                    stackTraceElementArr2[i4] = stackTrace[i2 + i4];
                }
                stackTraceElementArr = stackTraceElementArr2;
            }
            this.m = stackTraceElementArr;
        }
        return this.m;
    }

    @Override // defpackage.InterfaceC6237qt0
    public final long b() {
        return this.o;
    }

    @Override // defpackage.InterfaceC6237qt0
    public final String c() {
        return this.e;
    }

    @Override // defpackage.InterfaceC6237qt0
    public final String d() {
        String str = this.k;
        if (str != null) {
            return str;
        }
        Object[] objArr = this.l;
        String str2 = this.j;
        if (objArr != null) {
            this.k = (String) C3043bv.b(str2, objArr).a;
        } else {
            this.k = str2;
        }
        return this.k;
    }

    @Override // defpackage.InterfaceC6237qt0
    public final Object[] e() {
        return this.l;
    }

    @Override // defpackage.InterfaceC6237qt0
    public final KS0 f() {
        return this.h;
    }

    @Override // defpackage.InterfaceC6237qt0
    public final UW0 g() {
        return null;
    }

    @Override // defpackage.InterfaceC6237qt0
    public final C5714oP0 getLevel() {
        return this.i;
    }

    @Override // defpackage.InterfaceC6237qt0
    public final String getMessage() {
        return this.j;
    }

    @Override // defpackage.InterfaceC6237qt0
    public final InterfaceC3882fv0 h() {
        return null;
    }

    @Override // defpackage.InterfaceC6237qt0
    public final boolean i() {
        return this.m != null;
    }

    @Override // defpackage.InterfaceC6237qt0
    public final void j() {
        d();
        l();
        k();
    }

    @Override // defpackage.InterfaceC6237qt0
    public final Map<String, String> k() {
        if (this.n == null) {
            InterfaceC2953bV0 interfaceC2953bV0 = C2729aV0.a;
            if (interfaceC2953bV0 instanceof C7403wS0) {
                C7403wS0 c7403wS0 = (C7403wS0) interfaceC2953bV0;
                c7403wS0.e.set(2);
                this.n = c7403wS0.d.get();
            } else {
                this.n = interfaceC2953bV0.c();
            }
        }
        if (this.n == null) {
            this.n = Collections.EMPTY_MAP;
        }
        return this.n;
    }

    @Override // defpackage.InterfaceC6237qt0
    public final String l() {
        if (this.d == null) {
            this.d = Thread.currentThread().getName();
        }
        return this.d;
    }

    public final String toString() {
        return "[" + this.i + "] " + d();
    }
}
