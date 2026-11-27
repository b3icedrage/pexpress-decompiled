package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: mp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.pexpress.events.impl.BackendApiImpl", f = "BackendApiImpl.kt", l = {30}, m = "sendData-gIAlu-s")
public final class C5384mp extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ C5804op e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5384mp(C5804op c5804op, LM lm) {
        super(lm);
        this.e = c5804op;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        Object objA = this.e.a(null, this);
        return objA == MN.d ? objA : new C1717Ot1(objA);
    }
}
