package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: vm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.app.analytics.GoogleAnalyticManager", f = "GoogleAnalyticManager.kt", l = {51, 52}, m = "sendEvent")
public final class C7264vm0 extends LM {
    public C7054um0 d;
    public String e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C7054um0 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7264vm0(C7054um0 c7054um0, LM lm) {
        super(lm);
        this.h = c7054um0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(null, null, this);
    }
}
