package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Dv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.amplitude.core.platform.intercept.IdentifyInterceptor", f = "IdentifyInterceptor.kt", l = {48, 55, 61, 66, 77}, m = "intercept")
public final class C0862Dv0 extends LM {
    public Object d;
    public C0612Aq e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C1174Hv0 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0862Dv0(C1174Hv0 c1174Hv0, LM lm) {
        super(lm);
        this.h = c1174Hv0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(null, this);
    }
}
