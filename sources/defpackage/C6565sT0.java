package defpackage;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: sT0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.core.LogoutManager", f = "LogoutManager.kt", l = {84}, m = "stopAll")
public final class C6565sT0 extends LM {
    public C6355rT0 d;
    public Iterator e;
    public boolean g;
    public /* synthetic */ Object h;
    public final /* synthetic */ C6355rT0 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6565sT0(C6355rT0 c6355rT0, LM lm) {
        super(lm);
        this.i = c6355rT0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return this.i.b(false, this);
    }
}
