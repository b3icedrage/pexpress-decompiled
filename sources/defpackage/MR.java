package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.webpage.webchromeclient.CustomWebChromeClient", f = "CustomWebChromeClient.kt", l = {130, 131}, m = "readyToStartScript$suspendImpl")
public final class MR extends LM {
    public KR d;
    public /* synthetic */ Object e;
    public final /* synthetic */ KR g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MR(KR kr, LM lm) {
        super(lm);
        this.g = kr;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return KR.d(this.g, null, this);
    }
}
