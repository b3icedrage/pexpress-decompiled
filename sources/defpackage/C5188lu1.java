package defpackage;

import com.appsflyer.share.attribution.RequestError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: lu1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robotdialogs.review_app_dialog.providers.ReviewDialogOpeningStateProviderBase", f = "ReviewDialogOpeningStateProviderBase.kt", l = {26, 34, RequestError.NO_DEV_KEY, 51}, m = "moveToNextState")
public final class C5188lu1 extends LM {
    public C6241qu1 d;
    public Boolean e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C6241qu1 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5188lu1(C6241qu1 c6241qu1, LM lm) {
        super(lm);
        this.h = c6241qu1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.b(null, this);
    }
}
