package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Gb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.amplitude.android.migration.AndroidStorageMigration", f = "AndroidStorageMigration.kt", l = {15, 16}, m = "execute")
public final class C1035Gb extends LM {
    public C1347Kb d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C1347Kb g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1035Gb(C1347Kb c1347Kb, LM lm) {
        super(lm);
        this.g = c1347Kb;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(this);
    }
}
