package defpackage;

import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class ON0 extends C7576xG {

    @NotNull
    public final IM0 d;

    @NotNull
    public final C3348dN0 e;

    @NotNull
    public final C3977gN0 f;

    @NotNull
    public final VK1 g;

    @NotNull
    public final C2879b71 h;

    @NotNull
    public final K61 i;

    @NotNull
    public final C1621Nn1 j;

    @NotNull
    public final C1621Nn1 k;

    @NotNull
    public final C1621Nn1 l;

    @NotNull
    public final C6120qK1 m;

    @NotNull
    public final C1621Nn1 n;

    @NotNull
    public final C6120qK1 o;

    @InterfaceC3368dU(c = "com.base.feature.launchapp.screens.launchapp.LaunchAppViewModelBase$onInit$1", f = "LaunchAppViewModelBase.kt", l = {RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH, 66, 67}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return ON0.this.new a(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
        
            if (defpackage.C3977gN0.q(r7, r1, r6) == r0) goto L20;
         */
        @Override // defpackage.AbstractC7487wq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                MN r0 = defpackage.MN.d
                int r1 = r6.d
                r2 = 3
                r3 = 2
                r4 = 1
                ON0 r5 = defpackage.ON0.this
                if (r1 == 0) goto L25
                if (r1 == r4) goto L21
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                defpackage.C1795Pt1.b(r7)
                goto L5e
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                defpackage.C1795Pt1.b(r7)
                goto L4c
            L21:
                defpackage.C1795Pt1.b(r7)
                goto L3a
            L25:
                defpackage.C1795Pt1.b(r7)
                IM0 r7 = r5.d
                KN r1 = defpackage.C8056za.j(r5)
                r6.d = r4
                r7.getClass()
                java.lang.Object r7 = defpackage.IM0.b(r7, r1, r6)
                if (r7 != r0) goto L3a
                goto L5d
            L3a:
                dN0 r7 = r5.e
                KN r1 = defpackage.C8056za.j(r5)
                r6.d = r3
                r7.getClass()
                java.lang.Object r7 = defpackage.C3348dN0.d(r7, r1, r6)
                if (r7 != r0) goto L4c
                goto L5d
            L4c:
                gN0 r7 = r5.f
                KN r1 = defpackage.C8056za.j(r5)
                r6.d = r2
                r7.getClass()
                java.lang.Object r7 = defpackage.C3977gN0.q(r7, r1, r6)
                if (r7 != r0) goto L5e
            L5d:
                return r0
            L5e:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ON0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public ON0(@NotNull IM0 launchAppFirstStepUseCaseBase, @NotNull C3348dN0 launchAppSecondStepUseCaseBase, @NotNull C3977gN0 launchAppThirdStepUseCaseBase, @NotNull VK1 showAlertDialogUseCase, @NotNull C2879b71 notificationsPermissionUseCase, @NotNull K61 notificationPermissionAnalyticsUseCase) {
        Intrinsics.checkNotNullParameter(launchAppFirstStepUseCaseBase, "launchAppFirstStepUseCaseBase");
        Intrinsics.checkNotNullParameter(launchAppSecondStepUseCaseBase, "launchAppSecondStepUseCaseBase");
        Intrinsics.checkNotNullParameter(launchAppThirdStepUseCaseBase, "launchAppThirdStepUseCaseBase");
        Intrinsics.checkNotNullParameter(showAlertDialogUseCase, "showAlertDialogUseCase");
        Intrinsics.checkNotNullParameter(notificationsPermissionUseCase, "notificationsPermissionUseCase");
        Intrinsics.checkNotNullParameter(notificationPermissionAnalyticsUseCase, "notificationPermissionAnalyticsUseCase");
        this.d = launchAppFirstStepUseCaseBase;
        this.e = launchAppSecondStepUseCaseBase;
        this.f = launchAppThirdStepUseCaseBase;
        this.g = showAlertDialogUseCase;
        this.h = notificationsPermissionUseCase;
        this.i = notificationPermissionAnalyticsUseCase;
        this.j = l(C4466ii.x(launchAppFirstStepUseCaseBase.e, launchAppSecondStepUseCaseBase.e));
        this.k = l(C4466ii.x(launchAppSecondStepUseCaseBase.f, launchAppFirstStepUseCaseBase.f));
        this.l = l(C4466ii.x(launchAppFirstStepUseCaseBase.g, launchAppSecondStepUseCaseBase.g, launchAppThirdStepUseCaseBase.s));
        C6120qK1 c6120qK1G = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.m = c6120qK1G;
        this.n = C4466ii.e(c6120qK1G);
        this.o = launchAppThirdStepUseCaseBase.t;
    }

    @Override // defpackage.C7576xG
    public final void j() {
        C5189lv.k(C8056za.j(this), C6266r20.a, new a(null), 2);
    }

    public final C1621Nn1 l(C3098cA c3098cA) {
        return C4466ii.D(c3098cA, C8056za.j(this), new C7395wP1());
    }
}
