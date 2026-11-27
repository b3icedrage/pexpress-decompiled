package io.sentry.android.sqlite;

import android.database.Cursor;
import defpackage.InterfaceC3166cW1;
import defpackage.InterfaceC3795fW1;
import defpackage.InterfaceC4005gW1;
import defpackage.ML0;
import java.io.IOException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements InterfaceC3166cW1 {

    @NotNull
    public final InterfaceC3166cW1 d;

    @NotNull
    public final io.sentry.android.sqlite.a e;

    public static final class a extends ML0 implements Function0<Unit> {
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.e = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            c.this.d.E(this.e);
            return Unit.a;
        }
    }

    public static final class b extends ML0 implements Function0<Cursor> {
        public final /* synthetic */ InterfaceC3795fW1 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC3795fW1 interfaceC3795fW1) {
            super(0);
            this.e = interfaceC3795fW1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Cursor invoke() {
            return c.this.d.y(this.e);
        }
    }

    public c(@NotNull InterfaceC3166cW1 delegate, @NotNull io.sentry.android.sqlite.a sqLiteSpanManager) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(sqLiteSpanManager, "sqLiteSpanManager");
        this.d = delegate;
        this.e = sqLiteSpanManager;
    }

    @Override // defpackage.InterfaceC3166cW1
    public final void E(@NotNull String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.e.a(sql, new a(sql));
    }

    @Override // defpackage.InterfaceC3166cW1
    public final void F0() {
        this.d.F0();
    }

    @Override // defpackage.InterfaceC3166cW1
    @NotNull
    public final InterfaceC4005gW1 N(@NotNull String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        return new e(this.d.N(sql), this.e, sql);
    }

    @Override // defpackage.InterfaceC3166cW1
    public final boolean T0() {
        return this.d.T0();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.d.close();
    }

    @Override // defpackage.InterfaceC3166cW1
    public final boolean e1() {
        return this.d.e1();
    }

    @Override // defpackage.InterfaceC3166cW1
    public final void p0() {
        this.d.p0();
    }

    @Override // defpackage.InterfaceC3166cW1
    public final void r0() {
        this.d.r0();
    }

    @Override // defpackage.InterfaceC3166cW1
    public final void x() {
        this.d.x();
    }

    @Override // defpackage.InterfaceC3166cW1
    @NotNull
    public final Cursor y(@NotNull InterfaceC3795fW1 query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return (Cursor) this.e.a(query.c(), new b(query));
    }
}
