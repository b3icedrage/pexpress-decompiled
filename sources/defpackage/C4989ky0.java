package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ky0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.indicatormanualconfig.IndicatorManualConfigProvider", f = "IndicatorManualConfigProvider.kt", l = {35, 36}, m = "resetParams")
public final class C4989ky0 extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ C5412my0 e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4989ky0(C5412my0 c5412my0, LM lm) {
        super(lm);
        this.e = c5412my0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return this.e.a(this);
    }
}
