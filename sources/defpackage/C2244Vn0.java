package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Vn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2244Vn0 {

    @NotNull
    public final String a;

    @NotNull
    public final List<C2326Wn0> b;
    public final double c;

    public C2244Vn0(@NotNull String value, @NotNull List<C2326Wn0> params) {
        Double d;
        Object next;
        String str;
        Double d2;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(params, "params");
        this.a = value;
        this.b = params;
        Iterator<T> it = params.iterator();
        do {
            d = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.a(((C2326Wn0) next).a, "q"));
        C2326Wn0 c2326Wn0 = (C2326Wn0) next;
        double dDoubleValue = 1.0d;
        if (c2326Wn0 != null && (str = c2326Wn0.b) != null && (d2 = IS1.d(str)) != null) {
            double dDoubleValue2 = d2.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                d = d2;
            }
            if (d != null) {
                dDoubleValue = d.doubleValue();
            }
        }
        this.c = dDoubleValue;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2244Vn0)) {
            return false;
        }
        C2244Vn0 c2244Vn0 = (C2244Vn0) obj;
        return Intrinsics.a(this.a, c2244Vn0.a) && Intrinsics.a(this.b, c2244Vn0.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "HeaderValue(value=" + this.a + ", params=" + this.b + ')';
    }
}
