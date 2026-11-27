package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Tn1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2089Tn1<T> extends AbstractC6892u10<T> {
    public final T b;

    public C2089Tn1(T t) {
        super(t);
        this.b = t;
    }

    @Override // defpackage.AbstractC6892u10
    public final T a() {
        return this.b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2089Tn1) && Intrinsics.a(this.b, ((C2089Tn1) obj).b);
    }

    public final int hashCode() {
        T t = this.b;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    @NotNull
    public final String toString() {
        return "RealAccountFieldValue(value=" + this.b + ")";
    }
}
