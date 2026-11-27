package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.core.deeplinks.DeeplinkManager$setCanStartDeeplinkExecution$2", f = "DeeplinkManager.kt", l = {90}, m = "invokeSuspend")
public final class KU extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ LU e;

    @InterfaceC3368dU(c = "com.api.core.deeplinks.DeeplinkManager$setCanStartDeeplinkExecution$2$1", f = "DeeplinkManager.kt", l = {92}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<Boolean, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ LU e;

        /* JADX INFO: renamed from: KU$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.api.core.deeplinks.DeeplinkManager$setCanStartDeeplinkExecution$2$1$1", f = "DeeplinkManager.kt", l = {}, m = "invokeSuspend")
        public static final class C0075a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public final /* synthetic */ LU d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0075a(LU lu, JM<? super C0075a> jm) {
                super(2, jm);
                this.d = lu;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                return new C0075a(this.d, jm);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(KN kn, JM<? super Unit> jm) {
                return ((C0075a) create(kn, jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                MN mn = MN.d;
                C1795Pt1.b(obj);
                GP1 gp1 = this.d.c;
                Boolean bool = Boolean.FALSE;
                gp1.getClass();
                gp1.m(null, bool);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LU lu, JM<? super a> jm) {
            super(2, jm);
            this.e = lu;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new a(this.e, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, JM<? super Unit> jm) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((a) create(bool2, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                RV rv = C6266r20.a;
                AbstractC8109zn0 abstractC8109zn0 = QV0.a;
                C0075a c0075a = new C0075a(this.e, null);
                this.d = 1;
                if (C5189lv.p(abstractC8109zn0, c0075a, this) == mn) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KU(LU lu, JM<? super KU> jm) {
        super(2, jm);
        this.e = lu;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new KU(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((KU) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        LU lu = this.e;
        if (i == 0) {
            C1795Pt1.b(obj);
            GP1 gp1 = lu.c;
            Boolean bool = Boolean.TRUE;
            gp1.getClass();
            gp1.m(null, bool);
            this.d = 1;
            Object objA = lu.a(this);
            if (objA != mn) {
                objA = Unit.a;
            }
            if (objA == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        C6355rT0 c6355rT0 = lu.a;
        a onLogout = new a(lu, null);
        c6355rT0.getClass();
        Intrinsics.checkNotNullParameter(onLogout, "onLogout");
        c6355rT0.i.add(onLogout);
        return Unit.a;
    }
}
