package defpackage;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: dt1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3457dt1<T> {
    public final int a;

    @Nullable
    public final Long b;

    @Nullable
    public final T c;

    @Nullable
    public final Throwable d;

    public C3457dt1() {
        this(0, null, null, null, 31);
    }

    public C3457dt1(int i, Long l, Object obj, Throwable th, int i2) {
        i = (i2 & 1) != 0 ? 0 : i;
        l = (i2 & 2) != 0 ? null : l;
        obj = (i2 & 4) != 0 ? (T) null : obj;
        th = (i2 & 16) != 0 ? null : th;
        this.a = i;
        this.b = l;
        this.c = (T) obj;
        this.d = th;
    }
}
