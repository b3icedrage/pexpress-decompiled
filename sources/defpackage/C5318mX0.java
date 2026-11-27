package defpackage;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: mX0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5318mX0 {
    public final C3797fX0 a;
    public final C4047gi b;
    public final C5292mO1 c;
    public final Map<Class<? extends AbstractC6909u51>, InterfaceC4895kX0<? extends AbstractC6909u51>> d;

    /* JADX INFO: renamed from: mX0$a */
    public static class a {
        public final HashMap a = new HashMap();

        @NonNull
        public final a a(@NonNull Class cls, InterfaceC4895kX0 interfaceC4895kX0) {
            this.a.put(cls, interfaceC4895kX0);
            return this;
        }
    }

    public C5318mX0(@NonNull C3797fX0 c3797fX0, @NonNull C4047gi c4047gi, @NonNull C5292mO1 c5292mO1, @NonNull Map map, @NonNull C3686f c3686f) {
        this.a = c3797fX0;
        this.b = c4047gi;
        this.c = c5292mO1;
        this.d = map;
    }

    public final void a(@NonNull AbstractC6909u51 abstractC6909u51) {
        if (abstractC6909u51.e != null) {
            b();
            this.c.a('\n');
        }
    }

    public final void b() {
        C5292mO1 c5292mO1 = this.c;
        StringBuilder sb = c5292mO1.d;
        if (sb.length() <= 0 || '\n' == sb.charAt(sb.length() - 1)) {
            return;
        }
        c5292mO1.a('\n');
    }

    public final int c() {
        return this.c.d.length();
    }

    public final <N extends AbstractC6909u51> void d(@NonNull N n, int i) {
        Class<?> cls = n.getClass();
        C3797fX0 c3797fX0 = this.a;
        InterfaceC3771fO1 interfaceC3771fO1 = c3797fX0.e.a.get(cls);
        if (interfaceC3771fO1 != null) {
            Object objA = interfaceC3771fO1.a(c3797fX0, this.b);
            C5292mO1 c5292mO1 = this.c;
            StringBuilder sb = c5292mO1.d;
            int length = sb.length();
            int length2 = sb.length();
            if (length <= i || i < 0 || length > length2) {
                return;
            }
            C5292mO1.c(c5292mO1, objA, i, length);
        }
    }

    public final void e(@NonNull AbstractC6909u51 abstractC6909u51) {
        InterfaceC4895kX0<? extends AbstractC6909u51> interfaceC4895kX0 = this.d.get(abstractC6909u51.getClass());
        if (interfaceC4895kX0 != null) {
            interfaceC4895kX0.a(this, abstractC6909u51);
        } else {
            f(abstractC6909u51);
        }
    }

    public final void f(@NonNull AbstractC6909u51 abstractC6909u51) {
        AbstractC6909u51 abstractC6909u52 = abstractC6909u51.b;
        while (abstractC6909u52 != null) {
            AbstractC6909u51 abstractC6909u53 = abstractC6909u52.e;
            abstractC6909u52.a(this);
            abstractC6909u52 = abstractC6909u53;
        }
    }
}
