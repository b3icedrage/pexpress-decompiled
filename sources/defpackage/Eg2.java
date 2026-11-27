package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.WebSocketRequestExecutorBase$closeConnection$2", f = "WebSocketRequestExecutorBase.kt", l = {329}, m = "invokeSuspend")
public final class Eg2 extends AW1 implements Function2<KN, JM<? super EnumC3495e41>, Object> {
    public int d;
    public final /* synthetic */ Fg2<Object> e;

    @InterfaceC3368dU(c = "com.base.core.backend.WebSocketRequestExecutorBase$closeConnection$2$1", f = "WebSocketRequestExecutorBase.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<EnumC3495e41, JM<? super Boolean>, Object> {
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
        public final Object invoke(EnumC3495e41 enumC3495e41, JM<? super Boolean> jm) {
            return ((a) create(enumC3495e41, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            EnumC3495e41 enumC3495e41 = (EnumC3495e41) this.d;
            return Boolean.valueOf(enumC3495e41 == EnumC3495e41.j || enumC3495e41 == EnumC3495e41.h || enumC3495e41 == EnumC3495e41.g || enumC3495e41 == EnumC3495e41.i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Eg2(Fg2<Object> fg2, JM<? super Eg2> jm) {
        super(2, jm);
        this.e = fg2;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new Eg2(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super EnumC3495e41> jm) {
        return ((Eg2) create(kn, jm)).invokeSuspend(Unit.a);
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
        C1699On1 c1699On1 = this.e.j().f;
        a aVar = new a(2, null);
        this.d = 1;
        Object objP = C4466ii.p(c1699On1, aVar, this);
        return objP == mn ? mn : objP;
    }
}
