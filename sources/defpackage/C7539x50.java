package defpackage;

import android.graphics.drawable.Drawable;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.api.library.registration.screens.emailandpassword.EmailAndPasswordFieldsFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: x50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.library.registration.screens.emailandpassword.EmailAndPasswordFieldsFragment$initFlowCollectors$lambda$5$$inlined$launchAndCollectIn$default$3", f = "EmailAndPasswordFieldsFragment.kt", l = {48}, m = "invokeSuspend")
public final class C7539x50 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ AbstractC7959z50.b g;
    public final /* synthetic */ EmailAndPasswordFieldsFragment h;

    /* JADX INFO: renamed from: x50$a */
    @InterfaceC3368dU(c = "com.api.library.registration.screens.emailandpassword.EmailAndPasswordFieldsFragment$initFlowCollectors$lambda$5$$inlined$launchAndCollectIn$default$3$1", f = "EmailAndPasswordFieldsFragment.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ AbstractC7959z50.b g;
        public final /* synthetic */ EmailAndPasswordFieldsFragment h;

        /* JADX INFO: renamed from: x50$a$a, reason: collision with other inner class name */
        public static final class C0532a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ EmailAndPasswordFieldsFragment e;

            public C0532a(KN kn, EmailAndPasswordFieldsFragment emailAndPasswordFieldsFragment) {
                this.e = emailAndPasswordFieldsFragment;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                EmailAndPasswordFieldsFragment emailAndPasswordFieldsFragment = this.e;
                InterfaceC6698t50 k = emailAndPasswordFieldsFragment.getK();
                if (!zBooleanValue) {
                    k.D().setEndIconMode(0);
                } else if (k.D().getEndIconMode() != 1) {
                    k.D().setEndIconMode(1);
                }
                k.D().setEndIconDrawable((Drawable) emailAndPasswordFieldsFragment.m.getValue());
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC7959z50.b bVar, JM jm, EmailAndPasswordFieldsFragment emailAndPasswordFieldsFragment) {
            super(2, jm);
            this.g = bVar;
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
                C0532a c0532a = new C0532a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0532a, this) == mn) {
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
    public C7539x50(FP0 fp0, AbstractC7959z50.b bVar, JM jm, EmailAndPasswordFieldsFragment emailAndPasswordFieldsFragment) {
        super(2, jm);
        this.e = fp0;
        this.g = bVar;
        this.h = emailAndPasswordFieldsFragment;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C7539x50(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C7539x50) create(kn, jm)).invokeSuspend(Unit.a);
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
