package defpackage;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: bB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.support.chat.ChatInitializerBase", f = "ChatInitializerBase.kt", l = {139, 140}, m = "sendCustomData")
public final class C2892bB extends LM {
    public List d;
    public /* synthetic */ Object e;
    public final /* synthetic */ XA g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2892bB(XA xa, JM<? super C2892bB> jm) {
        super(jm);
        this.g = xa;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return XA.e(this.g, null, this);
    }
}
