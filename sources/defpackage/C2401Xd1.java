package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Xd1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.platform.callbacks.PlatformCallbacksBase", f = "PlatformCallbacksBase.kt", l = {36, 46, 53}, m = "onDepositClick")
public final class C2401Xd1 extends LM {
    public C2479Yd1 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C2479Yd1 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2401Xd1(C2479Yd1 c2479Yd1, LM lm) {
        super(lm);
        this.g = c2479Yd1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(this);
    }
}
