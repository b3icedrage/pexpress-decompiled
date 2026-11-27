package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.support.chat.ChatInitializerBase", f = "ChatInitializerBase.kt", l = {102, 105, 117}, m = "sendContactInfo")
public final class YA extends LM {
    public Object d;
    public Object e;
    public long g;
    public /* synthetic */ Object h;
    public final /* synthetic */ XA i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YA(XA xa, JM<? super YA> jm) {
        super(jm);
        this.i = xa;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return XA.d(this.i, null, this);
    }
}
