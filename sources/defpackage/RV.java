package defpackage;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class RV extends C5469nD1 {

    @NotNull
    public static final RV h;

    static {
        int i = BX1.c;
        int i2 = BX1.d;
        long j = BX1.e;
        String str = BX1.a;
        RV rv = new RV();
        rv.g = new JN(str, i, i2, j);
        h = rv;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // defpackage.DN
    @NotNull
    public final String toString() {
        return "Dispatchers.Default";
    }
}
