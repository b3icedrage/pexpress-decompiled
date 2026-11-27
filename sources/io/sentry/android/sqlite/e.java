package io.sentry.android.sqlite;

import defpackage.InterfaceC4005gW1;
import defpackage.ML0;
import java.io.IOException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements InterfaceC4005gW1 {

    @NotNull
    public final InterfaceC4005gW1 d;

    @NotNull
    public final io.sentry.android.sqlite.a e;

    @NotNull
    public final String g;

    public static final class a extends ML0 implements Function0<Long> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Long invoke() {
            return Long.valueOf(e.this.d.p1());
        }
    }

    public static final class b extends ML0 implements Function0<Integer> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(e.this.d.M());
        }
    }

    public e(@NotNull InterfaceC4005gW1 delegate, @NotNull io.sentry.android.sqlite.a sqLiteSpanManager, @NotNull String sql) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(sqLiteSpanManager, "sqLiteSpanManager");
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.d = delegate;
        this.e = sqLiteSpanManager;
        this.g = sql;
    }

    @Override // defpackage.InterfaceC3585eW1
    public final void F(int i, @NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.d.F(i, value);
    }

    @Override // defpackage.InterfaceC4005gW1
    public final int M() {
        return ((Number) this.e.a(this.g, new b())).intValue();
    }

    @Override // defpackage.InterfaceC3585eW1
    public final void P0(int i) {
        this.d.P0(i);
    }

    @Override // defpackage.InterfaceC3585eW1
    public final void T(int i, double d) {
        this.d.T(i, d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.d.close();
    }

    @Override // defpackage.InterfaceC3585eW1
    public final void n0(int i, long j) {
        this.d.n0(i, j);
    }

    @Override // defpackage.InterfaceC4005gW1
    public final long p1() {
        return ((Number) this.e.a(this.g, new a())).longValue();
    }

    @Override // defpackage.InterfaceC3585eW1
    public final void v0(int i, @NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.d.v0(i, value);
    }
}
