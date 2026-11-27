package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: St, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.navigation.BottomNavigationListenerImpl", f = "BottomNavigationListenerImpl.kt", l = {54, 54}, m = "hidePlatformIfRequired")
public final class C2027St extends LM {
    public C1949Rt d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C1949Rt g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2027St(C1949Rt c1949Rt, LM lm) {
        super(lm);
        this.g = c1949Rt;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(this);
    }
}
