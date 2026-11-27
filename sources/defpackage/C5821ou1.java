package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ou1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robotdialogs.review_app_dialog.providers.ReviewDialogOpeningStateProviderBase", f = "ReviewDialogOpeningStateProviderBase.kt", l = {58, 58}, m = "shouldBeOpened")
public final class C5821ou1 extends LM {
    public C6241qu1 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C6241qu1 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5821ou1(C6241qu1 c6241qu1, LM lm) {
        super(lm);
        this.g = c6241qu1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(this);
    }
}
