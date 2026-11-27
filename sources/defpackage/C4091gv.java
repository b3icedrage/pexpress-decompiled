package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: gv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC3368dU(c = "com.pexpress.events.impl.BuilderInfoImpl", f = "BuilderInfoImpl.kt", l = {83, 85, 88, 89}, m = "buildIdentityInfo")
public final class C4091gv extends LM {
    public Object d;
    public String e;
    public String g;
    public String h;
    public String i;
    public String j;
    public /* synthetic */ Object k;
    public final /* synthetic */ C4979kv l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4091gv(C4979kv c4979kv, LM lm) {
        super(lm);
        this.l = c4979kv;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.c(this);
    }
}
