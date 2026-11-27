package defpackage;

import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.api.resources.IndicatorRadioGroup;
import com.impl.feature.registration.screens.authorization.AuthorizationFragmentImpl;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: nm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.registration.screens.authorization.AuthorizationFragmentBase$initFlowCollectors$lambda$19$$inlined$launchAndCollectIn$default$5", f = "AuthorizationFragmentBase.kt", l = {48}, m = "invokeSuspend")
public final class C5584nm extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ FP1 g;
    public final /* synthetic */ AuthorizationFragmentImpl h;

    /* JADX INFO: renamed from: nm$a */
    @InterfaceC3368dU(c = "com.base.feature.registration.screens.authorization.AuthorizationFragmentBase$initFlowCollectors$lambda$19$$inlined$launchAndCollectIn$default$5$1", f = "AuthorizationFragmentBase.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ FP1 g;
        public final /* synthetic */ AuthorizationFragmentImpl h;

        /* JADX INFO: renamed from: nm$a$a, reason: collision with other inner class name */
        public static final class C0450a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ AuthorizationFragmentImpl e;

            public C0450a(KN kn, AuthorizationFragmentImpl authorizationFragmentImpl) {
                this.e = authorizationFragmentImpl;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                List<C2098Tq1> list = (List) obj;
                AuthorizationFragmentImpl authorizationFragmentImpl = this.e;
                IndicatorRadioGroup indicatorRadioGroupA = authorizationFragmentImpl.n.A();
                if (indicatorRadioGroupA != null) {
                    Object obj2 = authorizationFragmentImpl.i;
                    Intrinsics.checkNotNull(obj2);
                    authorizationFragmentImpl.s.a(indicatorRadioGroupA, list, new C4273hm(1, obj2, InterfaceC1472Lq1.class, "onCurrencyChecked", "onCurrencyChecked(Lcom/api/library/registration/model/RegistrationCurrency;)V", 0, 0));
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FP1 fp1, JM jm, AuthorizationFragmentImpl authorizationFragmentImpl) {
            super(2, jm);
            this.g = fp1;
            this.h = authorizationFragmentImpl;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            a aVar = new a(this.g, jm, this.h);
            aVar.e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C0450a c0450a = new C0450a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0450a, this) == mn) {
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
    public C5584nm(FP0 fp0, FP1 fp1, JM jm, AuthorizationFragmentImpl authorizationFragmentImpl) {
        super(2, jm);
        this.e = fp0;
        this.g = fp1;
        this.h = authorizationFragmentImpl;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C5584nm(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C5584nm) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            a aVar = new a(this.g, null, this.h);
            this.d = 1;
            if (RepeatOnLifecycleKt.a(this.e, g.b.h, aVar, this) == mn) {
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
