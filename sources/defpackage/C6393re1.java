package defpackage;

import com.impl.feature.platform.screens.platform.PlatformFragmentImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: re1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.impl.feature.platform.screens.platform.PlatformFragmentImpl", f = "PlatformFragmentImpl.kt", l = {284, 163, 165, 166, 171, 174, 179}, m = "showOnSelectedAccount")
public final class C6393re1 extends LM {
    public PlatformFragmentImpl d;
    public C6542sL1 e;
    public InterfaceC4117h21 g;
    public boolean h;
    public /* synthetic */ Object i;
    public final /* synthetic */ PlatformFragmentImpl j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6393re1(PlatformFragmentImpl platformFragmentImpl, LM lm) {
        super(lm);
        this.j = platformFragmentImpl;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return PlatformFragmentImpl.B(this.j, null, false, this);
    }
}
