package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.app.navigation.screen_starters.ConfigurableWebViewScreenStarterImpl", f = "ConfigurableWebViewScreenStarterImpl.kt", l = {49}, m = "getOptionsPackage")
public final class FI extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ JI e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FI(JI ji, LM lm) {
        super(lm);
        this.e = ji;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return this.e.g(this);
    }
}
