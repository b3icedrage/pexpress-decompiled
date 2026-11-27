package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: qX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6157qX<T> extends AbstractC6892u10<T> {
    public final T b;

    public C6157qX(T t) {
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
        return (obj instanceof C6157qX) && Intrinsics.a(this.b, ((C6157qX) obj).b);
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
        return "DemoAccountFieldValue(value=" + this.b + ")";
    }
}
