package defpackage;

import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.account.screens.common.AccountCommonFragmentBase;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.account.screens.common.AccountCommonFragmentBase$initFlowCollectors$$inlined$launchAndCollectIn$1", f = "AccountCommonFragmentBase.kt", l = {48}, m = "invokeSuspend")
public final class W2 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ InterfaceC5910pK1 g;
    public final /* synthetic */ AccountCommonFragmentBase h;

    @InterfaceC3368dU(c = "com.base.feature.account.screens.common.AccountCommonFragmentBase$initFlowCollectors$$inlined$launchAndCollectIn$1$1", f = "AccountCommonFragmentBase.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ InterfaceC5910pK1 g;
        public final /* synthetic */ AccountCommonFragmentBase h;

        /* JADX INFO: renamed from: W2$a$a, reason: collision with other inner class name */
        public static final class C0167a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ AccountCommonFragmentBase e;

            public C0167a(KN kn, AccountCommonFragmentBase accountCommonFragmentBase) {
                this.e = accountCommonFragmentBase;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                AccountCommonFragmentBase accountCommonFragmentBase = this.e;
                String string = accountCommonFragmentBase.getString(R.string.changes_saved_snackbar);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                C8056za.s(accountCommonFragmentBase, string, null, 60);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC5910pK1 interfaceC5910pK1, JM jm, AccountCommonFragmentBase accountCommonFragmentBase) {
            super(2, jm);
            this.g = interfaceC5910pK1;
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
                C0167a c0167a = new C0167a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0167a, this) == mn) {
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
    public W2(FP0 fp0, InterfaceC5910pK1 interfaceC5910pK1, JM jm, AccountCommonFragmentBase accountCommonFragmentBase) {
        super(2, jm);
        this.e = fp0;
        this.g = interfaceC5910pK1;
        this.h = accountCommonFragmentBase;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new W2(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((W2) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            a aVar = new a(this.g, null, this.h);
            this.d = 1;
            if (RepeatOnLifecycleKt.a(this.e, g.b.g, aVar, this) == mn) {
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
