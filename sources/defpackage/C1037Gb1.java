package defpackage;

import androidx.annotation.NonNull;
import java.util.Objects;

/* JADX INFO: renamed from: Gb1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1037Gb1<F, S> {
    public final F a;
    public final S b;

    public C1037Gb1(F f, S s) {
        this.a = f;
        this.b = s;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1037Gb1)) {
            return false;
        }
        C1037Gb1 c1037Gb1 = (C1037Gb1) obj;
        return Objects.equals(c1037Gb1.a, this.a) && Objects.equals(c1037Gb1.b, this.b);
    }

    public final int hashCode() {
        F f = this.a;
        int iHashCode = f == null ? 0 : f.hashCode();
        S s = this.b;
        return iHashCode ^ (s != null ? s.hashCode() : 0);
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("Pair{");
        sb.append(this.a);
        sb.append(" ");
        return K1.a(sb, this.b, "}");
    }
}
