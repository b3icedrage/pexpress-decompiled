package defpackage;

import javax.annotation.Nullable;

/* JADX INFO: renamed from: Et1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0935Et1<T> {
    public final C0857Dt1 a;

    @Nullable
    public final T b;

    @Nullable
    public final C1169Ht1 c;

    /* JADX WARN: Multi-variable type inference failed */
    public C0935Et1(C0857Dt1 c0857Dt1, @Nullable Object obj, @Nullable C1169Ht1 c1169Ht1) {
        this.a = c0857Dt1;
        this.b = obj;
        this.c = c1169Ht1;
    }

    public static <T> C0935Et1<T> a(@Nullable T t, C0857Dt1 c0857Dt1) {
        if (c0857Dt1.g()) {
            return new C0935Et1<>(c0857Dt1, t, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public final String toString() {
        return this.a.toString();
    }
}
