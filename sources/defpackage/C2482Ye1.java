package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Ye1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.platform.screens.platform_webview.PlatformViewModelBase$startListenForShowBet$1", f = "PlatformViewModelBase.kt", l = {131}, m = "invokeSuspend")
public final class C2482Ye1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ AbstractC2140Ue1 e;

    /* JADX INFO: renamed from: Ye1$a */
    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ AbstractC2140Ue1 d;

        public a(AbstractC2140Ue1 abstractC2140Ue1) {
            this.d = abstractC2140Ue1;
        }

        @Override // defpackage.InterfaceC6606sf0
        public final Object a(Object obj, JM jm) throws Throwable {
            Object objA = this.d.u.a(((C4612j90.a) obj).a, jm);
            return objA == MN.d ? objA : Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2482Ye1(AbstractC2140Ue1 abstractC2140Ue1, JM<? super C2482Ye1> jm) {
        super(2, jm);
        this.e = abstractC2140Ue1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C2482Ye1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C2482Ye1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            AbstractC2140Ue1 abstractC2140Ue1 = this.e;
            C1699On1 c1699On1 = abstractC2140Ue1.n.d;
            a aVar = new a(abstractC2140Ue1);
            this.d = 1;
            Object objC = c1699On1.d.c(new C4040gg0(aVar), this);
            if (objC != mn) {
                objC = Unit.a;
            }
            if (objC == mn) {
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
