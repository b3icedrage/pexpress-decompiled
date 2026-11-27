package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ca, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.amplitude.android.Amplitude", f = "Amplitude.kt", l = {51}, m = "buildInternal$suspendImpl")
public final class C3176ca extends LM {
    public C4693ja d;
    public C1563Mv0 e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C4693ja h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3176ca(C4693ja c4693ja, LM lm) {
        super(lm);
        this.h = c4693ja;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return C4693ja.n(this.h, null, this);
    }
}
