package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: vO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.providers.CouponProviderBase", f = "CouponProviderBase.kt", l = {95, 96, 97, 100}, m = "validateCoupon")
public final class C7179vO extends LM {
    public C5077lO d;
    public String e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C5077lO h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7179vO(C5077lO c5077lO, LM lm) {
        super(lm);
        this.h = c5077lO;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return C5077lO.d(this.h, null, false, 0L, this);
    }
}
