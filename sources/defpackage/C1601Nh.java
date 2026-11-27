package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Nh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.repositories.AppRepositoryBase", f = "AppRepositoryBase.kt", l = {31}, m = "getCommonConfig$suspendImpl")
public final class C1601Nh extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ AbstractC1991Sh e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1601Nh(AbstractC1991Sh abstractC1991Sh, LM lm) {
        super(lm);
        this.e = abstractC1991Sh;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return AbstractC1991Sh.q(this.e, null, this);
    }
}
