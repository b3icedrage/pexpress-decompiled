package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: gb2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.impl.core.backend.data_sources.UserDataSourceImpl", f = "UserDataSourceImpl.kt", l = {129}, m = "subscribeForBalancesChanges")
public final class C4022gb2 extends LM {
    public C2750ab2 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C2750ab2 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4022gb2(C2750ab2 c2750ab2, LM lm) {
        super(lm);
        this.g = c2750ab2;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.j(this);
    }
}
