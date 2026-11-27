package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ib, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.amplitude.android.migration.AndroidStorageMigration", f = "AndroidStorageMigration.kt", l = {68, 74}, m = "moveSimpleValue")
public final class C1191Ib extends LM {
    public C1347Kb d;
    public LQ1.a e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C1347Kb h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1191Ib(C1347Kb c1347Kb, LM lm) {
        super(lm);
        this.h = c1347Kb;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.c(null, this);
    }
}
