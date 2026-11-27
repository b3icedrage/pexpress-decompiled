package defpackage;

import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.NotificationPermissionAnalyticsApi33UseCaseBase", f = "NotificationPermissionAnalyticsApi33UseCaseBase.kt", l = {RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH, 78}, m = "sendAnalyticsEvents")
public final class I61 extends LM {
    public H61 d;
    public boolean e;
    public /* synthetic */ Object g;
    public final /* synthetic */ H61 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I61(H61 h61, LM lm) {
        super(lm);
        this.h = h61;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return H61.g(this.h, false, this);
    }
}
