package defpackage;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.app.navigation.screen_starters.ConfigurableWebViewScreenStarterImpl", f = "ConfigurableWebViewScreenStarterImpl.kt", l = {28}, m = "openUrl")
public final class II extends LM {
    public Context d;
    public /* synthetic */ Object e;
    public final /* synthetic */ JI g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public II(JI ji, LM lm) {
        super(lm);
        this.g = ji;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.j(this);
    }
}
