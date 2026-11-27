package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: He0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.app.navigation.screen_starters.FirstScreenStarterImpl", f = "FirstScreenStarterImpl.kt", l = {62}, m = "initFirstScreen")
public final class C1123He0 extends LM {
    public C1045Ge0 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C1045Ge0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1123He0(C1045Ge0 c1045Ge0, LM lm) {
        super(lm);
        this.g = c1045Ge0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        int i = C1045Ge0.e;
        return this.g.c(null, this);
    }
}
