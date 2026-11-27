package defpackage;

import com.api.feature.bottomsheetdialog.utils.SimpleBottomSheetWithDataFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: bM1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.bottomsheetdialog.utils.SimpleBottomSheetWithDataFragment$collectData$1", f = "SimpleBottomSheetWithDataFragment.kt", l = {67}, m = "invokeSuspend")
public final class C2927bM1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ SimpleBottomSheetWithDataFragment<InterfaceC7441wd2, Object> e;

    /* JADX INFO: renamed from: bM1$a */
    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ SimpleBottomSheetWithDataFragment<InterfaceC7441wd2, T> d;

        public a(SimpleBottomSheetWithDataFragment<InterfaceC7441wd2, T> simpleBottomSheetWithDataFragment) {
            this.d = simpleBottomSheetWithDataFragment;
        }

        @Override // defpackage.InterfaceC6606sf0
        public final Object a(T t, JM<? super Unit> jm) {
            if (t != null) {
                this.d.i(t);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2927bM1(SimpleBottomSheetWithDataFragment<InterfaceC7441wd2, Object> simpleBottomSheetWithDataFragment, JM<? super C2927bM1> jm) {
        super(2, jm);
        this.e = simpleBottomSheetWithDataFragment;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C2927bM1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        ((C2927bM1) create(kn, jm)).invokeSuspend(Unit.a);
        return MN.d;
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            SimpleBottomSheetWithDataFragment<InterfaceC7441wd2, Object> simpleBottomSheetWithDataFragment = this.e;
            C1699On1 c1699On1 = simpleBottomSheetWithDataFragment.g.b;
            a aVar = new a(simpleBottomSheetWithDataFragment);
            this.d = 1;
            if (c1699On1.d.c(aVar, this) == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        throw new C3342dL0();
    }
}
