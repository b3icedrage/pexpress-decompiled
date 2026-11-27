package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: h10, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robotdialogs.providers.DialogProviderBase", f = "DialogProviderBase.kt", l = {28}, m = "collect")
public final class C4112h10 extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ C4322i10 e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4112h10(C4322i10 c4322i10, LM lm) {
        super(lm);
        this.e = c4322i10;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        this.e.a(null, this);
        return MN.d;
    }
}
