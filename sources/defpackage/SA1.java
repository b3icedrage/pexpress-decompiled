package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class SA1 implements InterfaceC3795fW1, InterfaceC3585eW1 {

    @NotNull
    public static final TreeMap<Integer, SA1> m = new TreeMap<>();
    public final int d;

    @Nullable
    public volatile String e;

    @NotNull
    public final long[] g;

    @NotNull
    public final double[] h;

    @NotNull
    public final String[] i;

    @NotNull
    public final byte[][] j;

    @NotNull
    public final int[] k;
    public int l;

    public SA1(int i) {
        this.d = i;
        int i2 = i + 1;
        this.k = new int[i2];
        this.g = new long[i2];
        this.h = new double[i2];
        this.i = new String[i2];
        this.j = new byte[i2][];
    }

    @NotNull
    public static final SA1 g(int i, @NotNull String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        TreeMap<Integer, SA1> treeMap = m;
        synchronized (treeMap) {
            Map.Entry<Integer, SA1> entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i));
            if (entryCeilingEntry == null) {
                Unit unit = Unit.a;
                SA1 sa1 = new SA1(i);
                Intrinsics.checkNotNullParameter(query, "query");
                sa1.e = query;
                sa1.l = i;
                return sa1;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            SA1 sqliteQuery = entryCeilingEntry.getValue();
            sqliteQuery.getClass();
            Intrinsics.checkNotNullParameter(query, "query");
            sqliteQuery.e = query;
            sqliteQuery.l = i;
            Intrinsics.checkNotNullExpressionValue(sqliteQuery, "sqliteQuery");
            return sqliteQuery;
        }
    }

    @Override // defpackage.InterfaceC3585eW1
    public final void F(int i, @NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.k[i] = 4;
        this.i[i] = value;
    }

    @Override // defpackage.InterfaceC3585eW1
    public final void P0(int i) {
        this.k[i] = 1;
    }

    @Override // defpackage.InterfaceC3585eW1
    public final void T(int i, double d) {
        this.k[i] = 3;
        this.h[i] = d;
    }

    @Override // defpackage.InterfaceC3795fW1
    @NotNull
    public final String c() {
        String str = this.e;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // defpackage.InterfaceC3795fW1
    public final void f(@NotNull InterfaceC3585eW1 statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        int i = this.l;
        if (1 > i) {
            return;
        }
        int i2 = 1;
        while (true) {
            int i3 = this.k[i2];
            if (i3 == 1) {
                statement.P0(i2);
            } else if (i3 == 2) {
                statement.n0(i2, this.g[i2]);
            } else if (i3 == 3) {
                statement.T(i2, this.h[i2]);
            } else if (i3 == 4) {
                String str = this.i[i2];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.F(i2, str);
            } else if (i3 == 5) {
                byte[] bArr = this.j[i2];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.v0(i2, bArr);
            }
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // defpackage.InterfaceC3585eW1
    public final void n0(int i, long j) {
        this.k[i] = 2;
        this.g[i] = j;
    }

    public final void release() {
        TreeMap<Integer, SA1> treeMap = m;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.d), this);
            if (treeMap.size() > 15) {
                int size = treeMap.size() - 10;
                Iterator<Integer> it = treeMap.descendingKeySet().iterator();
                Intrinsics.checkNotNullExpressionValue(it, "queryPool.descendingKeySet().iterator()");
                while (true) {
                    int i = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i;
                }
            }
            Unit unit = Unit.a;
        }
    }

    @Override // defpackage.InterfaceC3585eW1
    public final void v0(int i, @NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.k[i] = 5;
        this.j[i] = value;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
