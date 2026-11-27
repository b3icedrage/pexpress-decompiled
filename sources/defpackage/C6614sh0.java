package defpackage;

import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.registration.screens.forgetpassword.ForgetPasswordFragment;
import com.google.android.material.button.MaterialButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: sh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.registration.screens.forgetpassword.ForgetPasswordFragment$initFlowCollectors$$inlined$launchAndCollectIn$default$1", f = "ForgetPasswordFragment.kt", l = {48}, m = "invokeSuspend")
public final class C6614sh0 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ InterfaceC6396rf0 g;
    public final /* synthetic */ ForgetPasswordFragment h;

    /* JADX INFO: renamed from: sh0$a */
    @InterfaceC3368dU(c = "com.base.feature.registration.screens.forgetpassword.ForgetPasswordFragment$initFlowCollectors$$inlined$launchAndCollectIn$default$1$1", f = "ForgetPasswordFragment.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ InterfaceC6396rf0 g;
        public final /* synthetic */ ForgetPasswordFragment h;

        /* JADX INFO: renamed from: sh0$a$a, reason: collision with other inner class name */
        public static final class C0487a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ ForgetPasswordFragment e;

            public C0487a(KN kn, ForgetPasswordFragment forgetPasswordFragment) {
                this.e = forgetPasswordFragment;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                MaterialButton materialButtonB = this.e.k.B();
                materialButtonB.setEnabled(!zBooleanValue);
                Intrinsics.checkNotNullParameter(materialButtonB, "<this>");
                materialButtonB.setAlpha(!zBooleanValue ? 1.0f : 0.5f);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC6396rf0 interfaceC6396rf0, JM jm, ForgetPasswordFragment forgetPasswordFragment) {
            super(2, jm);
            this.g = interfaceC6396rf0;
            this.h = forgetPasswordFragment;
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
                C0487a c0487a = new C0487a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0487a, this) == mn) {
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
    public C6614sh0(FP0 fp0, InterfaceC6396rf0 interfaceC6396rf0, JM jm, ForgetPasswordFragment forgetPasswordFragment) {
        super(2, jm);
        this.e = fp0;
        this.g = interfaceC6396rf0;
        this.h = forgetPasswordFragment;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C6614sh0(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C6614sh0) create(kn, jm)).invokeSuspend(Unit.a);
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
