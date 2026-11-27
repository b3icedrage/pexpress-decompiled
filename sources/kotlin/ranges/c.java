package kotlin.ranges;

import defpackage.C1952Ru;
import defpackage.DB0;
import defpackage.InterfaceC6745tJ0;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public class c implements Iterable<Integer>, InterfaceC6745tJ0 {

    @NotNull
    public static final a h = new a(null);
    public final int d;
    public final int e;
    public final int g;

    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public c(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.d = i;
        this.e = C1952Ru.k(i, i2, i3);
        this.g = i3;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (isEmpty() && ((c) obj).isEmpty()) {
            return true;
        }
        c cVar = (c) obj;
        return this.d == cVar.d && this.e == cVar.e && this.g == cVar.g;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.d * 31) + this.e) * 31) + this.g;
    }

    public boolean isEmpty() {
        int i = this.g;
        int i2 = this.e;
        int i3 = this.d;
        if (i > 0) {
            return i3 > i2;
        }
        return i3 < i2;
    }

    @Override // java.lang.Iterable
    public final Iterator<Integer> iterator() {
        return new DB0(this.d, this.e, this.g);
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        int i = this.e;
        int i2 = this.d;
        int i3 = this.g;
        if (i3 > 0) {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i3);
        } else {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i3);
        }
        return sb.toString();
    }
}
