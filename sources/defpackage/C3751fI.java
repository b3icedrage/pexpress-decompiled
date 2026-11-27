package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: fI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.core.ConfigBuilderImpl", f = "ConfigBuilderImpl.kt", l = {46, 48}, m = "build")
public final class C3751fI extends LM {
    public Object d;
    public String e;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public boolean p;
    public boolean q;
    public boolean r;
    public /* synthetic */ Object s;
    public final /* synthetic */ C3961gI t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3751fI(C3961gI c3961gI, LM lm) {
        super(lm);
        this.t = c3961gI;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.a(this);
    }
}
