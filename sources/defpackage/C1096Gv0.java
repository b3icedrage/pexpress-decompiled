package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Gv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.amplitude.core.platform.intercept.IdentifyInterceptor", f = "IdentifyInterceptor.kt", l = {88}, m = "transferInterceptedIdentify")
public final class C1096Gv0 extends LM {
    public C1174Hv0 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C1174Hv0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1096Gv0(C1174Hv0 c1174Hv0, LM lm) {
        super(lm);
        this.g = c1174Hv0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.c(this);
    }
}
