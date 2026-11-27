package defpackage;

import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.impl.feature.registration.screens.authorization.AuthorizationFragmentImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: im, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.registration.screens.authorization.AuthorizationFragmentBase$initFlowCollectors$lambda$19$$inlined$launchAndCollectIn$1", f = "AuthorizationFragmentBase.kt", l = {48}, m = "invokeSuspend")
public final class C4482im extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ FP1 g;
    public final /* synthetic */ AuthorizationFragmentImpl h;

    /* JADX INFO: renamed from: im$a */
    @InterfaceC3368dU(c = "com.base.feature.registration.screens.authorization.AuthorizationFragmentBase$initFlowCollectors$lambda$19$$inlined$launchAndCollectIn$1$1", f = "AuthorizationFragmentBase.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ FP1 g;
        public final /* synthetic */ AuthorizationFragmentImpl h;

        /* JADX INFO: renamed from: im$a$a, reason: collision with other inner class name */
        public static final class C0379a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ AuthorizationFragmentImpl e;

            public C0379a(KN kn, AuthorizationFragmentImpl authorizationFragmentImpl) {
                this.e = authorizationFragmentImpl;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                int iOrdinal = ((N42) obj).ordinal();
                AuthorizationFragmentImpl authorizationFragmentImpl = this.e;
                if (iOrdinal != 0 && iOrdinal != 1) {
                    InterfaceC1455Ll interfaceC1455Ll = authorizationFragmentImpl.n;
                    if (iOrdinal == 2) {
                        ViewGroup viewGroupG = interfaceC1455Ll.g();
                        Intrinsics.c(viewGroupG, "null cannot be cast to non-null type androidx.constraintlayout.motion.widget.MotionLayout");
                        ((MotionLayout) viewGroupG).F();
                    } else {
                        if (iOrdinal != 3) {
                            throw new C6489s51();
                        }
                        ViewGroup viewGroupG2 = interfaceC1455Ll.g();
                        Intrinsics.c(viewGroupG2, "null cannot be cast to non-null type androidx.constraintlayout.motion.widget.MotionLayout");
                        ((MotionLayout) viewGroupG2).G();
                    }
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
                C0379a c0379a = new C0379a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0379a, this) == mn) {
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
    public C4482im(FP0 fp0, FP1 fp1, JM jm, AuthorizationFragmentImpl authorizationFragmentImpl) {
        super(2, jm);
        this.e = fp0;
        this.g = fp1;
        this.h = authorizationFragmentImpl;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C4482im(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C4482im) create(kn, jm)).invokeSuspend(Unit.a);
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
