package defpackage;

import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.api.feature.platform.screens.common.CommonNavigateToVerificationFragmentApi;
import com.onesignal.core.activities.PermissionsActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;

/* JADX INFO: renamed from: eG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.platform.screens.common.CommonNavigateToVerificationFragmentApi$initFlowCollectors$$inlined$launchAndCollectIn$default$1", f = "CommonNavigateToVerificationFragmentApi.kt", l = {48}, m = "invokeSuspend")
public final class C3535eG extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ FP0 e;
    public final /* synthetic */ C1621Nn1 g;
    public final /* synthetic */ CommonNavigateToVerificationFragmentApi h;

    /* JADX INFO: renamed from: eG$a */
    @InterfaceC3368dU(c = "com.api.feature.platform.screens.common.CommonNavigateToVerificationFragmentApi$initFlowCollectors$$inlined$launchAndCollectIn$default$1$1", f = "CommonNavigateToVerificationFragmentApi.kt", l = {49}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;
        public final /* synthetic */ C1621Nn1 g;
        public final /* synthetic */ CommonNavigateToVerificationFragmentApi h;

        /* JADX INFO: renamed from: eG$a$a, reason: collision with other inner class name */
        public static final class C0344a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ KN d;
            public final /* synthetic */ CommonNavigateToVerificationFragmentApi e;

            /* JADX INFO: renamed from: eG$a$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.api.feature.platform.screens.common.CommonNavigateToVerificationFragmentApi$initFlowCollectors$$inlined$launchAndCollectIn$default$1$1$1", f = "CommonNavigateToVerificationFragmentApi.kt", l = {54}, m = "emit")
            public static final class C0345a extends LM {
                public /* synthetic */ Object d;
                public int e;
                public C0344a h;

                public C0345a(JM jm) {
                    super(jm);
                }

                @Override // defpackage.AbstractC7487wq
                public final Object invokeSuspend(Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return C0344a.this.a(null, this);
                }
            }

            public C0344a(KN kn, CommonNavigateToVerificationFragmentApi commonNavigateToVerificationFragmentApi) {
                this.e = commonNavigateToVerificationFragmentApi;
                this.d = kn;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                C0345a c0345a;
                C0344a<T> c0344a;
                if (jm instanceof C0345a) {
                    c0345a = (C0345a) jm;
                    int i = c0345a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0345a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0345a = new C0345a(jm);
                    }
                } else {
                    c0345a = new C0345a(jm);
                }
                Object obj2 = c0345a.d;
                MN mn = MN.d;
                int i2 = c0345a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    Object obj3 = this.e.i;
                    Intrinsics.checkNotNull(obj3);
                    ((AbstractC4260hi2) obj3).l();
                    b.a aVar = b.e;
                    long jG = c.g(PermissionsActivity.DELAY_TIME_CALLBACK_CALL, R40.MILLISECONDS);
                    c0345a.h = this;
                    c0345a.e = 1;
                    if (IW.c(jG, c0345a) == mn) {
                        return mn;
                    }
                    c0344a = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0344a = c0345a.h;
                    C1795Pt1.b(obj2);
                }
                Object obj4 = c0344a.e.i;
                Intrinsics.checkNotNull(obj4);
                Intrinsics.c(obj4, "null cannot be cast to non-null type com.api.feature.platform.screens.common.CommonNavigateToVerificationViewModelApi");
                ((AbstractC3745fG) obj4).n.a();
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C1621Nn1 c1621Nn1, JM jm, CommonNavigateToVerificationFragmentApi commonNavigateToVerificationFragmentApi) {
            super(2, jm);
            this.g = c1621Nn1;
            this.h = commonNavigateToVerificationFragmentApi;
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
                C0344a c0344a = new C0344a((KN) this.e, this.h);
                this.d = 1;
                if (this.g.d.c(c0344a, this) == mn) {
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
    public C3535eG(FP0 fp0, C1621Nn1 c1621Nn1, JM jm, CommonNavigateToVerificationFragmentApi commonNavigateToVerificationFragmentApi) {
        super(2, jm);
        this.e = fp0;
        this.g = c1621Nn1;
        this.h = commonNavigateToVerificationFragmentApi;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C3535eG(this.e, this.g, jm, this.h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C3535eG) create(kn, jm)).invokeSuspend(Unit.a);
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
