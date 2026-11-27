package io.sentry.android.sqlite;

import defpackage.InterfaceC3166cW1;
import defpackage.InterfaceC3376dW1;
import defpackage.KW1;
import defpackage.ML0;
import defpackage.XO0;
import java.io.IOException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements InterfaceC3376dW1 {

    @NotNull
    public final InterfaceC3376dW1 d;

    @NotNull
    public final io.sentry.android.sqlite.a e;

    @NotNull
    public final KW1 g = XO0.b(new b());

    @NotNull
    public final KW1 h = XO0.b(new a());

    public static final class a extends ML0 implements Function0<c> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final c invoke() {
            d dVar = d.this;
            return new c(dVar.d.t0(), dVar.e);
        }
    }

    public static final class b extends ML0 implements Function0<c> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final c invoke() {
            d dVar = d.this;
            return new c(dVar.d.A0(), dVar.e);
        }
    }

    public d(InterfaceC3376dW1 interfaceC3376dW1) {
        this.d = interfaceC3376dW1;
        this.e = new io.sentry.android.sqlite.a(interfaceC3376dW1.getDatabaseName());
    }

    @NotNull
    public static final d c(@NotNull InterfaceC3376dW1 delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        if (!(delegate instanceof d)) {
            delegate = new d(delegate);
        }
        return (d) delegate;
    }

    @Override // defpackage.InterfaceC3376dW1
    @NotNull
    public final InterfaceC3166cW1 A0() {
        return (InterfaceC3166cW1) this.g.getValue();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.d.close();
    }

    @Override // defpackage.InterfaceC3376dW1
    @Nullable
    public final String getDatabaseName() {
        return this.d.getDatabaseName();
    }

    @Override // defpackage.InterfaceC3376dW1
    public final void setWriteAheadLoggingEnabled(boolean z) {
        this.d.setWriteAheadLoggingEnabled(z);
    }

    @Override // defpackage.InterfaceC3376dW1
    @NotNull
    public final InterfaceC3166cW1 t0() {
        return (InterfaceC3166cW1) this.h.getValue();
    }
}
