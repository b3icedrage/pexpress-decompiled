package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: sf2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.providers.WSClientProviderBase$client$2", f = "WSClientProviderBase.kt", l = {67}, m = "invokeSuspend")
public final class C6608sf2 extends AW1 implements Function2<KN, JM<? super C3109cD1>, Object> {
    public int d;
    public final /* synthetic */ C7238vf2 e;

    /* JADX INFO: renamed from: sf2$a */
    @InterfaceC3368dU(c = "com.base.core.backend.providers.WSClientProviderBase$client$2$1", f = "WSClientProviderBase.kt", l = {67}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super C3109cD1>, Object> {
        public int d;
        public final /* synthetic */ C7238vf2 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C7238vf2 c7238vf2, JM<? super a> jm) {
            super(2, jm);
            this.e = c7238vf2;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new a(this.e, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super C3109cD1> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) throws Throwable {
            MN mn = MN.d;
            int i = this.d;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
                return obj;
            }
            C1795Pt1.b(obj);
            DG dg = this.e.f;
            this.d = 1;
            Object objZ = dg.z(this);
            return objZ == mn ? mn : objZ;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6608sf2(C7238vf2 c7238vf2, JM<? super C6608sf2> jm) {
        super(2, jm);
        this.e = c7238vf2;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C6608sf2(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super C3109cD1> jm) {
        return ((C6608sf2) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
            return obj;
        }
        C1795Pt1.b(obj);
        a aVar = new a(this.e, null);
        this.d = 1;
        Object objC = OZ1.c(10000L, aVar, this);
        return objC == mn ? mn : objC;
    }
}
