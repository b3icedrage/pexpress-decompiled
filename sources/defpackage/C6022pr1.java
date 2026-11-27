package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: pr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.amplitude.android.migration.RemnantDataMigration", f = "RemnantDataMigration.kt", l = {77, 82, 87}, m = "moveSessionData")
public final class C6022pr1 extends LM {
    public C6232qr1 d;
    public Long e;
    public Long g;
    public Long h;
    public Long i;
    public /* synthetic */ Object j;
    public final /* synthetic */ C6232qr1 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6022pr1(C6232qr1 c6232qr1, LM lm) {
        super(lm);
        this.k = c6232qr1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.g(this);
    }
}
