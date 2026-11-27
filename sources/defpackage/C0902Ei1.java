package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: Ei1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.profileandsettings.profile.screens.ProfileViewModelBase$onVerificationClick$1", f = "ProfileViewModelBase.kt", l = {127, 133}, m = "invokeSuspend")
public final class C0902Ei1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ AbstractC8090zi1 e;

    /* JADX INFO: renamed from: Ei1$a */
    @InterfaceC3368dU(c = "com.base.feature.profileandsettings.profile.screens.ProfileViewModelBase$onVerificationClick$1$1", f = "ProfileViewModelBase.kt", l = {130}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ AbstractC8090zi1 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC8090zi1 abstractC8090zi1, JM<? super a> jm) {
            super(2, jm);
            this.e = abstractC8090zi1;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new a(this.e, jm);
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
                C6120qK1 c6120qK1 = this.e.d.t;
                Unit unit = Unit.a;
                this.d = 1;
                if (c6120qK1.a(unit, this) == mn) {
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
    public C0902Ei1(AbstractC8090zi1 abstractC8090zi1, JM<? super C0902Ei1> jm) {
        super(2, jm);
        this.e = abstractC8090zi1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C0902Ei1(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C0902Ei1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r4.e.a(r5) == r0) goto L22;
     */
    @Override // defpackage.AbstractC7487wq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            MN r0 = defpackage.MN.d
            int r1 = r5.d
            r2 = 2
            r3 = 1
            zi1 r4 = r5.e
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            defpackage.C1795Pt1.b(r6)
            goto L60
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            defpackage.C1795Pt1.b(r6)
            goto L2c
        L1e:
            defpackage.C1795Pt1.b(r6)
            zi1$i r6 = r4.u
            r5.d = r3
            java.lang.Object r6 = defpackage.C4466ii.o(r6, r5)
            if (r6 != r0) goto L2c
            goto L5f
        L2c:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L60
            kf r6 = r4.d
            GP1 r6 = r6.r
            java.lang.Object r6 = r6.getValue()
            e41 r6 = (defpackage.EnumC3495e41) r6
            if (r6 == 0) goto L55
            boolean r6 = defpackage.C7652xe.g(r6)
            if (r6 != r3) goto L55
            KN r6 = defpackage.C8056za.j(r4)
            Ei1$a r0 = new Ei1$a
            r1 = 0
            r0.<init>(r4, r1)
            r2 = 3
            defpackage.C5189lv.k(r6, r1, r0, r2)
            goto L60
        L55:
            r5.d = r2
            Ih1 r6 = r4.e
            java.lang.Object r6 = r6.a(r5)
            if (r6 != r0) goto L60
        L5f:
            return r0
        L60:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0902Ei1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
