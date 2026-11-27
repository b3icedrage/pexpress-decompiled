package defpackage;

import com.impl.feature.platform.screens.platform.PlatformFragmentImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: te1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.impl.feature.platform.screens.platform.PlatformFragmentImpl", f = "PlatformFragmentImpl.kt", l = {230, 231}, m = "updateBalanceType")
public final class C6813te1 extends LM {
    public PlatformFragmentImpl d;
    public EnumC4164hF1 e;
    public /* synthetic */ Object g;
    public final /* synthetic */ PlatformFragmentImpl h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6813te1(PlatformFragmentImpl platformFragmentImpl, LM lm) {
        super(lm);
        this.h = platformFragmentImpl;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        int i = PlatformFragmentImpl.H;
        return this.h.D(this);
    }
}
