package defpackage;

import android.webkit.WebView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Qi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.impl.feature.platform.usecases.ApplyDepositScriptUseCaseImpl", f = "ApplyDepositScriptUseCaseImpl.kt", l = {29, 30, 31, 34}, m = "applyPageScript")
public final class C1838Qi extends LM {
    public C1994Si d;
    public WebView e;
    public int g;
    public /* synthetic */ Object h;
    public final /* synthetic */ C1994Si i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1838Qi(C1994Si c1994Si, LM lm) {
        super(lm);
        this.i = c1994Si;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.b(null, this);
    }
}
