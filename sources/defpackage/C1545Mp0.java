package defpackage;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Mp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "io.ktor.client.plugins.HttpCallValidator", f = "HttpCallValidator.kt", l = {51}, m = "validateResponse")
public final class C1545Mp0 extends LM {
    public AbstractC5391mr0 d;
    public Iterator e;
    public /* synthetic */ Object g;
    public final /* synthetic */ C1390Kp0 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1545Mp0(C1390Kp0 c1390Kp0, LM lm) {
        super(lm);
        this.h = c1390Kp0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return C1390Kp0.b(this.h, null, this);
    }
}
