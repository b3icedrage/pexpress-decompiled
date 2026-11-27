package defpackage;

import com.impl.feature.platform.screens.platform.PlatformFragmentImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: qe1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.impl.feature.platform.screens.platform.PlatformFragmentImpl", f = "PlatformFragmentImpl.kt", l = {239}, m = "isChartScriptReady")
public final class C6184qe1 extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ PlatformFragmentImpl e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6184qe1(PlatformFragmentImpl platformFragmentImpl, LM lm) {
        super(lm);
        this.e = platformFragmentImpl;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        int i = PlatformFragmentImpl.H;
        return this.e.C(this);
    }
}
