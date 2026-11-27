package defpackage;

import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.registration.screens.duoauth.DuoAuthFragmentBase;
import com.google.android.material.button.MaterialButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: u40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.registration.screens.duoauth.DuoAuthFragmentBase$initFlowCollectors$lambda$9$$inlined$launchAndCollectIn$default$2", f = "DuoAuthFragmentBase.kt", l = {48}, m = "invokeSuspend")
public final class C6904u40 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ K40.a g;
    public final /* synthetic */ DuoAuthFragmentBase h;

    /* JADX INFO: renamed from: u40$a */
    @InterfaceC3368dU(c = "com.base.feature.registration.screens.duoauth.DuoAuthFragmentBase$initFlowCollectors$lambda$9$$inlined$launchAndCollectIn$default$2$1", f = "DuoAuthFragmentBase.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ K40.a g;
        public final /* synthetic */ DuoAuthFragmentBase h;

        /* JADX INFO: renamed from: u40$a$a, reason: collision with other inner class name */
        public static final class C0501a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ DuoAuthFragmentBase e;

            public C0501a(KN kn, DuoAuthFragmentBase duoAuthFragmentBase) {
                this.e = duoAuthFragmentBase;
                this.d = kn;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                MaterialButton materialButtonO = this.e.j.O();
                boolean z = !zBooleanValue;
                Intrinsics.checkNotNullParameter(materialButtonO, "<this>");
                Intrinsics.checkNotNullParameter(materialButtonO, "<this>");
                materialButtonO.setAlpha(!zBooleanValue ? 1.0f : 0.5f);
                materialButtonO.setEnabled(z);
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(K40.a aVar, JM jm, DuoAuthFragmentBase duoAuthFragmentBase) {
            super(2, jm);
            this.g = aVar;
            this.h = duoAuthFragmentBase;
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
                C0501a c0501a = new C0501a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.c(c0501a, this) == mn) {
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
    public C6904u40(FP0 fp0, K40.a aVar, JM jm, DuoAuthFragmentBase duoAuthFragmentBase) {
        super(2, jm);
        this.e = fp0;
        this.g = aVar;
        this.h = duoAuthFragmentBase;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C6904u40(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C6904u40) create(kn, jm)).invokeSuspend(Unit.a);
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
