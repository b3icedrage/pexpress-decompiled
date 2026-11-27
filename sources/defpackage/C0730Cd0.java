package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Cd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.analytics.utils.FirebaseAnalyticsManagerBase", f = "FirebaseAnalyticsManagerBase.kt", l = {20}, m = "getFirebaseAppInstanceId")
public final class C0730Cd0 extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ C0808Dd0 e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0730Cd0(C0808Dd0 c0808Dd0, LM lm) {
        super(lm);
        this.e = c0808Dd0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return this.e.a(null, this);
    }
}
