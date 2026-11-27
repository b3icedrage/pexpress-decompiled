package defpackage;

/* JADX INFO: renamed from: Jm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.registration.screens.authorization.AuthorizationViewModelBase$onInit$2$2", f = "AuthorizationViewModelBase.kt", l = {137}, m = "emit")
public final class C1302Jm extends LM {
    public C1146Hm.b.a d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C1146Hm.b.a<Object> g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1302Jm(C1146Hm.b.a<Object> aVar, JM<? super C1302Jm> jm) {
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
