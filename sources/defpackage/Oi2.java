package defpackage;

import com.appsflyer.share.attribution.RequestError;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robotdialogs.review_app_dialog.providers.WinCounterForAppReviewProviderBase", f = "WinCounterForAppReviewProviderBase.kt", l = {35, RequestError.NO_DEV_KEY, 46}, m = "tryIncrease")
public final class Oi2 extends LM {
    public Li2 d;
    public Li2 e;
    public boolean g;
    public /* synthetic */ Object h;
    public final /* synthetic */ Li2 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Oi2(Li2 li2, LM lm) {
        super(lm);
        this.i = li2;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.h(false, this);
    }
}
