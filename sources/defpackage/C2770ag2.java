package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ag2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.WebSocketBestSelectorBase", f = "WebSocketBestSelectorBase.kt", l = {51, UserVerificationMethods.USER_VERIFY_EYEPRINT}, m = "getTheFastestConnectionToWebSocket$suspendImpl")
public final class C2770ag2 extends LM {
    public Zf2 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Zf2 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2770ag2(Zf2 zf2, LM lm) {
        super(lm);
        this.g = zf2;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return Zf2.e(this.g, this);
    }
}
