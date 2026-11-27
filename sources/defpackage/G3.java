package defpackage;

import android.os.Build;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.account.screens.maininfo.AccountMainInfoPartBase;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.account.screens.maininfo.AccountMainInfoPartBase$initFlowCollectors$lambda$6$$inlined$launchAndCollectIn$default$2", f = "AccountMainInfoPartBase.kt", l = {48}, m = "invokeSuspend")
public final class G3 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ InterfaceC5910pK1 g;
    public final /* synthetic */ AccountMainInfoPartBase h;

    @InterfaceC3368dU(c = "com.base.feature.account.screens.maininfo.AccountMainInfoPartBase$initFlowCollectors$lambda$6$$inlined$launchAndCollectIn$default$2$1", f = "AccountMainInfoPartBase.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ InterfaceC5910pK1 g;
        public final /* synthetic */ AccountMainInfoPartBase h;

        /* JADX INFO: renamed from: G3$a$a, reason: collision with other inner class name */
        public static final class C0035a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ AccountMainInfoPartBase e;

            public C0035a(KN kn, AccountMainInfoPartBase accountMainInfoPartBase) {
                this.e = accountMainInfoPartBase;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                Long l = (Long) obj;
                AccountMainInfoPartBase accountMainInfoPartBase = this.e;
                accountMainInfoPartBase.getClass();
                String string = l != null ? l.toString() : null;
                if (string == null) {
                    string = "";
                }
                accountMainInfoPartBase.m.a(string);
                if (Build.VERSION.SDK_INT < 33) {
                    String string2 = accountMainInfoPartBase.getString(R.string.id_copy_text, String.valueOf(l));
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    C8056za.s(accountMainInfoPartBase, string2, accountMainInfoPartBase.requireActivity().findViewById(R.id.bottomNavigation), 44);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC5910pK1 interfaceC5910pK1, JM jm, AccountMainInfoPartBase accountMainInfoPartBase) {
            super(2, jm);
            this.g = interfaceC5910pK1;
            this.h = accountMainInfoPartBase;
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
                C0035a c0035a = new C0035a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0035a, this) == mn) {
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
    public G3(FP0 fp0, InterfaceC5910pK1 interfaceC5910pK1, JM jm, AccountMainInfoPartBase accountMainInfoPartBase) {
        super(2, jm);
        this.e = fp0;
        this.g = interfaceC5910pK1;
        this.h = accountMainInfoPartBase;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new G3(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((G3) create(kn, jm)).invokeSuspend(Unit.a);
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
