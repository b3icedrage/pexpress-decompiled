package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: rd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.app.app.App", f = "App.kt", l = {303, 304}, m = "awaitAppsFlyerCustomerUserId")
public final class C6387rd extends LM {
    public ApplicationC0963Fd d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ApplicationC0963Fd g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6387rd(ApplicationC0963Fd applicationC0963Fd, LM lm) {
        super(lm);
        this.g = applicationC0963Fd;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return ApplicationC0963Fd.e(this.g, this);
    }
}
