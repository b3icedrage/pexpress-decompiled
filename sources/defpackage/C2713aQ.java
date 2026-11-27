package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: aQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.updaters.CryptoDemoTradesUpdater", f = "CryptoDemoTradesUpdater.kt", l = {78}, m = "enableCrypto")
public final class C2713aQ extends LM {
    public C3775fQ d;
    public long e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C3775fQ h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2713aQ(C3775fQ c3775fQ, JM<? super C2713aQ> jm) {
        super(jm);
        this.h = c3775fQ;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return C3775fQ.d(this.h, this);
    }
}
