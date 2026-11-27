package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: hr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.amplitude.android.migration.RemnantDataMigration", f = "RemnantDataMigration.kt", l = {31, 34, 35, 37, 38, 39}, m = "execute")
public final class C4291hr1 extends LM {
    public C6232qr1 d;
    public int e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C6232qr1 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4291hr1(C6232qr1 c6232qr1, LM lm) {
        super(lm);
        this.h = c6232qr1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.b(this);
    }
}
