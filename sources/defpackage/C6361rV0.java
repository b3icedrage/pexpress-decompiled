package defpackage;

/* JADX INFO: renamed from: rV0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.app.activities.main.MainActivity$initLogoutListener$2$1", f = "MainActivity.kt", l = {581}, m = "emit")
public final class C6361rV0 extends LM {
    public C6571sV0.a d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C6571sV0.a<Object> g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6361rV0(C6571sV0.a<Object> aVar, JM<? super C6361rV0> jm) {
        super(jm);
        this.g = aVar;
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.b(this);
    }
}
