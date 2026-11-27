package defpackage;

import android.content.pm.PackageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.app.navigation.screen_starters.ConfigurableWebViewScreenStarterImpl", f = "ConfigurableWebViewScreenStarterImpl.kt", l = {43}, m = "checkOptionsInstalled$suspendImpl")
public final class EI extends LM {
    public PackageManager d;
    public /* synthetic */ Object e;
    public final /* synthetic */ JI g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EI(JI ji, LM lm) {
        super(lm);
        this.g = ji;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return JI.f(this.g, this);
    }
}
