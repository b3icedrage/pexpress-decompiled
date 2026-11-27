package defpackage;

import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: fj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3842fj0 implements InterfaceC3585eW1 {

    @NotNull
    public final SQLiteProgram d;

    public C3842fj0(@NotNull SQLiteProgram delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.d = delegate;
    }

    @Override // defpackage.InterfaceC3585eW1
    public final void F(int i, @NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.d.bindString(i, value);
    }

    @Override // defpackage.InterfaceC3585eW1
    public final void P0(int i) {
        this.d.bindNull(i);
    }

    @Override // defpackage.InterfaceC3585eW1
    public final void T(int i, double d) {
        this.d.bindDouble(i, d);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.close();
    }

    @Override // defpackage.InterfaceC3585eW1
    public final void n0(int i, long j) {
        this.d.bindLong(i, j);
    }

    @Override // defpackage.InterfaceC3585eW1
    public final void v0(int i, @NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.d.bindBlob(i, value);
    }
}
