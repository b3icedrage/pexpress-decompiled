package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: sd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.app.app.App$awaitAppsFlyerCustomerUserId$3", f = "App.kt", l = {305}, m = "invokeSuspend")
public final class C6597sd extends AW1 implements Function2<KN, JM<? super String>, Object> {
    public int d;
    public final /* synthetic */ ApplicationC0963Fd e;

    /* JADX INFO: renamed from: sd$a */
    @InterfaceC3368dU(c = "com.base.app.app.App$awaitAppsFlyerCustomerUserId$3$1", f = "App.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<C6945uG, JM<? super Boolean>, Object> {
        public /* synthetic */ Object d;

        public a() {
            throw null;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            a aVar = new a(2, jm);
            aVar.d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(C6945uG c6945uG, JM<? super Boolean> jm) {
            return ((a) create(c6945uG, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            return Boolean.valueOf(((C6945uG) this.d) != null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6597sd(ApplicationC0963Fd applicationC0963Fd, JM<? super C6597sd> jm) {
        super(2, jm);
        this.e = applicationC0963Fd;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C6597sd(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super String> jm) {
        return ((C6597sd) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            C4923kf c4923kfG = this.e.g();
            a aVar = new a(2, null);
            this.d = 1;
            obj = C4466ii.p(c4923kfG.k, aVar, this);
            if (obj == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        C6945uG c6945uG = (C6945uG) obj;
        if (c6945uG != null) {
            return new Long(c6945uG.a).toString();
        }
        return null;
    }
}
