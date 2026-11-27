package defpackage;

import android.content.Context;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: so, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6640so extends SP {
    public final Context a;
    public final InterfaceC3529eE b;
    public final InterfaceC3529eE c;
    public final String d;

    public C6640so(Context context, InterfaceC3529eE interfaceC3529eE, InterfaceC3529eE interfaceC3529eE2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.a = context;
        if (interfaceC3529eE == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.b = interfaceC3529eE;
        if (interfaceC3529eE2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.c = interfaceC3529eE2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.d = str;
    }

    @Override // defpackage.SP
    public final Context a() {
        return this.a;
    }

    @Override // defpackage.SP
    @NonNull
    public final String b() {
        return this.d;
    }

    @Override // defpackage.SP
    public final InterfaceC3529eE c() {
        return this.c;
    }

    @Override // defpackage.SP
    public final InterfaceC3529eE d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SP)) {
            return false;
        }
        SP sp = (SP) obj;
        return this.a.equals(sp.a()) && this.b.equals(sp.d()) && this.c.equals(sp.c()) && this.d.equals(sp.b());
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return C5807oq.b(sb, this.d, "}");
    }
}
