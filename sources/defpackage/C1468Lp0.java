package defpackage;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Lp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.client.plugins.HttpCallValidator", f = "HttpCallValidator.kt", l = {58, 59}, m = "processException")
public final class C1468Lp0 extends LM {
    public Throwable d;
    public InterfaceC2595Zq0 e;
    public Iterator g;
    public /* synthetic */ Object h;
    public final /* synthetic */ C1390Kp0 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1468Lp0(C1390Kp0 c1390Kp0, LM lm) {
        super(lm);
        this.i = c1390Kp0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return C1390Kp0.a(this.i, null, null, this);
    }
}
