package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: qN1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.registration.screens.social.SocialLoginWithWebView", f = "SocialLoginWithWebView.kt", l = {97}, m = "createWebViewFor")
public final class C6129qN1 extends LM {
    public AbstractC5709oN1 d;
    public EnumC5076lN1 e;
    public /* synthetic */ Object g;
    public final /* synthetic */ AbstractC5709oN1 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6129qN1(AbstractC5709oN1 abstractC5709oN1, LM lm) {
        super(lm);
        this.h = abstractC5709oN1;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.D(null, this);
    }
}
