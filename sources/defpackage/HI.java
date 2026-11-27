package defpackage;

import com.google.android.gms.common.api.CommonStatusCodes;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.app.navigation.screen_starters.ConfigurableWebViewScreenStarterImpl", f = "ConfigurableWebViewScreenStarterImpl.kt", l = {CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE, CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE, 22}, m = "openApp$suspendImpl")
public final class HI extends LM {
    public JI d;
    public /* synthetic */ Object e;
    public final /* synthetic */ JI g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HI(JI ji, LM lm) {
        super(lm);
        this.g = ji;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return JI.i(this.g, this);
    }
}
