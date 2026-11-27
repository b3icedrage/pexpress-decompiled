package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.launchapp.usecases.LaunchJobTracker", f = "LaunchJobTracker.kt", l = {35}, m = "track")
public final class WN0<T> extends LM {
    public UN0 d;
    public UN0.a e;
    public InterfaceC5790ol g;
    public /* synthetic */ Object h;
    public final /* synthetic */ UN0 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WN0(UN0 un0, LM lm) {
        super(lm);
        this.i = un0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.a(null, null, this);
    }
}
