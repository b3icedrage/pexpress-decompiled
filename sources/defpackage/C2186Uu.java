package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Uu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "kotlinx.coroutines.channels.BufferedChannel", f = "BufferedChannel.kt", l = {762}, m = "receiveCatching-JP2dKIU$suspendImpl")
public final class C2186Uu<E> extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ C2030Su<E> e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2186Uu(C2030Su c2030Su, LM lm) {
        super(lm);
        this.e = c2030Su;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        Object objF = C2030Su.F(this.e, this);
        return objF == MN.d ? objF : new C3308dA(objF);
    }
}
