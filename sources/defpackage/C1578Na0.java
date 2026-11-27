package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: Na0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1578Na0 {
    public static final /* synthetic */ int b = 0;
    public final Map<a, AbstractC0673Bk0.e<?, ?>> a;

    /* JADX INFO: renamed from: Na0$a */
    public static final class a {
        public final HZ0 a;
        public final int b;

        public a(int i, HZ0 hz0) {
            this.a = hz0;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.a) * 65535) + this.b;
        }
    }

    static {
        new C1578Na0(0);
    }

    public C1578Na0() {
        this.a = new HashMap();
    }

    public final void a(AbstractC0673Bk0.e<?, ?> eVar) {
        this.a.put(new a(eVar.d.d, eVar.a), eVar);
    }

    public C1578Na0(int i) {
        this.a = Collections.EMPTY_MAP;
    }
}
