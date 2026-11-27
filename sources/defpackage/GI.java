package defpackage;

import android.content.pm.PackageManager;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.app.navigation.screen_starters.ConfigurableWebViewScreenStarterImpl", f = "ConfigurableWebViewScreenStarterImpl.kt", l = {33}, m = "launchAppSuccess")
public final class GI extends LM {
    public JI d;
    public PackageManager e;
    public /* synthetic */ Object g;
    public final /* synthetic */ JI h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GI(JI ji, LM lm) {
        super(lm);
        this.h = ji;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.h(this);
    }
}
