package defpackage;

import android.view.ViewGroup;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.account.screens.common.AccountCommonFragmentBase;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.account.screens.common.AccountCommonFragmentBase$initFlowCollectors$$inlined$launchAndCollectIn$default$1", f = "AccountCommonFragmentBase.kt", l = {48}, m = "invokeSuspend")
public final class X2 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ InterfaceC6396rf0 g;
    public final /* synthetic */ AccountCommonFragmentBase h;

    @InterfaceC3368dU(c = "com.base.feature.account.screens.common.AccountCommonFragmentBase$initFlowCollectors$$inlined$launchAndCollectIn$default$1$1", f = "AccountCommonFragmentBase.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ InterfaceC6396rf0 g;
        public final /* synthetic */ AccountCommonFragmentBase h;

        /* JADX INFO: renamed from: X2$a$a, reason: collision with other inner class name */
        public static final class C0184a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ AccountCommonFragmentBase e;

            public C0184a(KN kn, AccountCommonFragmentBase accountCommonFragmentBase) {
                this.e = accountCommonFragmentBase;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                ((Boolean) obj).getClass();
                Iterator it = AccountCommonFragmentBase.n((C2637a3) this.e.k()).entrySet().iterator();
                while (it.hasNext()) {
                    ViewGroup viewGroup = (ViewGroup) ((Map.Entry) it.next()).getKey();
                    Intrinsics.checkNotNullParameter(viewGroup, "<this>");
                    viewGroup.animate().alpha(1.0f).start();
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC6396rf0 interfaceC6396rf0, JM jm, AccountCommonFragmentBase accountCommonFragmentBase) {
            super(2, jm);
            this.g = interfaceC6396rf0;
            this.h = accountCommonFragmentBase;
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
                C0184a c0184a = new C0184a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0184a, this) == mn) {
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
    public X2(FP0 fp0, InterfaceC6396rf0 interfaceC6396rf0, JM jm, AccountCommonFragmentBase accountCommonFragmentBase) {
        super(2, jm);
        this.e = fp0;
        this.g = interfaceC6396rf0;
        this.h = accountCommonFragmentBase;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new X2(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((X2) create(kn, jm)).invokeSuspend(Unit.a);
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
