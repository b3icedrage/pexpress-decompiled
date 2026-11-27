package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ju1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robotdialogs.review_app_dialog.providers.ReviewDialogOpeningStateProviderBase", f = "ReviewDialogOpeningStateProviderBase.kt", l = {55}, m = "isDelayed")
public final class C4768ju1 extends LM {
    public /* synthetic */ Object d;
    public final /* synthetic */ C6241qu1 e;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4768ju1(C6241qu1 c6241qu1, LM lm) {
        super(lm);
        this.e = c6241qu1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.d = obj;
        this.g |= Integer.MIN_VALUE;
        return this.e.g(this);
    }
}
