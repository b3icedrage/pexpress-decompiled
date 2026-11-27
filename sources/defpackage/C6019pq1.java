package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: pq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.library.registration.services.RegisterDialogsManagerBase$sendOtherErrorAlert$2$1", f = "RegisterDialogsManagerBase.kt", l = {66}, m = "invokeSuspend")
public final class C6019pq1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ InterfaceC6396rf0<Boolean> e;

    /* JADX INFO: renamed from: pq1$a */
    @InterfaceC3368dU(c = "com.base.library.registration.services.RegisterDialogsManagerBase$sendOtherErrorAlert$2$1$1", f = "RegisterDialogsManagerBase.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<Boolean, JM<? super Boolean>, Object> {
        public /* synthetic */ boolean d;

        public a() {
            throw null;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            a aVar = new a(2, jm);
            aVar.d = ((Boolean) obj).booleanValue();
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, JM<? super Boolean> jm) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((a) create(bool2, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            return Boolean.valueOf(!this.d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6019pq1(InterfaceC6396rf0<Boolean> interfaceC6396rf0, JM<? super C6019pq1> jm) {
        super(2, jm);
        this.e = interfaceC6396rf0;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C6019pq1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C6019pq1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            a aVar = new a(2, null);
            this.d = 1;
            if (C4466ii.p(this.e, aVar, this) == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        return Unit.a;
    }
}
