package defpackage;

import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: jv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.pexpress.events.impl.BuilderInfoImpl", f = "BuilderInfoImpl.kt", l = {57, 58}, m = "withInfo")
public final class C4769jv extends LM {
    public C4979kv d;
    public Map e;
    public String g;
    public String h;
    public String i;
    public /* synthetic */ Object j;
    public final /* synthetic */ C4979kv k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4769jv(C4979kv c4979kv, LM lm) {
        super(lm);
        this.k = c4979kv;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
