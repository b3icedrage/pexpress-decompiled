package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.CheckForUpdatesUseCaseBase", f = "CheckForUpdatesUseCaseBase.kt", l = {52, 52}, m = "checkForVersion")
public final class C7561xB extends LM {
    public C7981zB d;
    public InterfaceC1923Rk0 e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C7981zB h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7561xB(C7981zB c7981zB, LM lm) {
        super(lm);
        this.h = c7981zB;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.b(this);
    }
}
