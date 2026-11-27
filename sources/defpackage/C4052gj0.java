package defpackage;

import android.database.sqlite.SQLiteStatement;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: gj0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4052gj0 extends C3842fj0 implements InterfaceC4005gW1 {

    @NotNull
    public final SQLiteStatement e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4052gj0(@NotNull SQLiteStatement delegate) {
        super(delegate);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.e = delegate;
    }

    @Override // defpackage.InterfaceC4005gW1
    public final int M() {
        return this.e.executeUpdateDelete();
    }

    @Override // defpackage.InterfaceC4005gW1
    public final long p1() {
        return this.e.executeInsert();
    }
}
