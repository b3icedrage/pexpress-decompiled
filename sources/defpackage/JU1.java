package defpackage;

import java.lang.reflect.Method;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: loaded from: classes3.dex */
public final class JU1 implements FS0 {
    public final String d;
    public volatile FS0 e;
    public Boolean g;
    public Method h;
    public R80 i;
    public final LinkedBlockingQueue j;
    public final boolean k;

    public JU1(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z) {
        this.d = str;
        this.j = linkedBlockingQueue;
        this.k = z;
    }

    @Override // defpackage.FS0
    public final void a() {
        b().a();
    }

    public final FS0 b() {
        if (this.e != null) {
            return this.e;
        }
        if (this.k) {
            return C5428n21.d;
        }
        if (this.i == null) {
            R80 r80 = new R80();
            r80.e = this;
            r80.d = this.d;
            r80.g = this.j;
            this.i = r80;
        }
        return this.i;
    }

    @Override // defpackage.FS0
    public final void c(String str) {
        b().c(str);
    }

    public final boolean d() {
        Boolean bool = this.g;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.h = this.e.getClass().getMethod("log", PS0.class);
            this.g = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.g = Boolean.FALSE;
        }
        return this.g.booleanValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && JU1.class == obj.getClass() && this.d.equals(((JU1) obj).d);
    }

    @Override // defpackage.FS0
    public final String getName() {
        return this.d;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
