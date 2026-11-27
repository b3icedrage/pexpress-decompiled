package defpackage;

import android.widget.TextView;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.api.library.registration.screens.emailandpassword.EmailAndPasswordFieldsFragment;
import com.pexpress.tool.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: w50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.library.registration.screens.emailandpassword.EmailAndPasswordFieldsFragment$initFlowCollectors$lambda$5$$inlined$launchAndCollectIn$default$2", f = "EmailAndPasswordFieldsFragment.kt", l = {48}, m = "invokeSuspend")
public final class C7328w50 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ FP1 g;
    public final /* synthetic */ EmailAndPasswordFieldsFragment h;

    /* JADX INFO: renamed from: w50$a */
    @InterfaceC3368dU(c = "com.api.library.registration.screens.emailandpassword.EmailAndPasswordFieldsFragment$initFlowCollectors$lambda$5$$inlined$launchAndCollectIn$default$2$1", f = "EmailAndPasswordFieldsFragment.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ FP1 g;
        public final /* synthetic */ EmailAndPasswordFieldsFragment h;

        /* JADX INFO: renamed from: w50$a$a, reason: collision with other inner class name */
        public static final class C0524a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ EmailAndPasswordFieldsFragment e;

            public C0524a(KN kn, EmailAndPasswordFieldsFragment emailAndPasswordFieldsFragment) {
                this.e = emailAndPasswordFieldsFragment;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                String string;
                AbstractC0961Fc0 abstractC0961Fc0 = (AbstractC0961Fc0) obj;
                boolean zA = Intrinsics.a(abstractC0961Fc0, Jc2.a);
                EmailAndPasswordFieldsFragment emailAndPasswordFieldsFragment = this.e;
                if (zA) {
                    InterfaceC6698t50 k = emailAndPasswordFieldsFragment.getK();
                    emailAndPasswordFieldsFragment.l(k.d0(), k.D());
                } else {
                    Intrinsics.c(abstractC0961Fc0, "null cannot be cast to non-null type com.api.library.registration.model.NotValidFieldState");
                    InterfaceC6698t50 k2 = emailAndPasswordFieldsFragment.getK();
                    TextView textViewW = k2.w();
                    int iOrdinal = ((L51) abstractC0961Fc0).a.ordinal();
                    if (iOrdinal == 4) {
                        string = emailAndPasswordFieldsFragment.getString(R.string.use_latin);
                    } else if (iOrdinal != 5) {
                        emailAndPasswordFieldsFragment.l.getClass();
                        string = emailAndPasswordFieldsFragment.getString(R.string.password_rules_rule_1, String.valueOf(6));
                    } else {
                        string = emailAndPasswordFieldsFragment.getString(R.string.add_number);
                    }
                    textViewW.setText(string);
                    emailAndPasswordFieldsFragment.t(k2.d0(), k2.D());
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FP1 fp1, JM jm, EmailAndPasswordFieldsFragment emailAndPasswordFieldsFragment) {
            super(2, jm);
            this.g = fp1;
            this.h = emailAndPasswordFieldsFragment;
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
                C0524a c0524a = new C0524a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0524a, this) == mn) {
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
    public C7328w50(FP0 fp0, FP1 fp1, JM jm, EmailAndPasswordFieldsFragment emailAndPasswordFieldsFragment) {
        super(2, jm);
        this.e = fp0;
        this.g = fp1;
        this.h = emailAndPasswordFieldsFragment;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C7328w50(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C7328w50) create(kn, jm)).invokeSuspend(Unit.a);
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
