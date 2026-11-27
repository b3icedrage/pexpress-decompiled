package defpackage;

import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.base.feature.registration.screens.selecthaveaccount.SelectHaveAccountFragmentBase;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.registration.screens.selecthaveaccount.SelectHaveAccountFragmentBase$initAnim$1$1", f = "SelectHaveAccountFragmentBase.kt", l = {56}, m = "invokeSuspend")
public final class PE1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ SelectHaveAccountFragmentBase e;
    public final /* synthetic */ QE1 g;

    @InterfaceC3368dU(c = "com.base.feature.registration.screens.selecthaveaccount.SelectHaveAccountFragmentBase$initAnim$1$1$1", f = "SelectHaveAccountFragmentBase.kt", l = {66, 67}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ QE1 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(QE1 qe1, JM<? super a> jm) {
            super(2, jm);
            this.e = qe1;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new a(this.e, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
        
            if (defpackage.C7644xc.k(r6, r7) == r0) goto L15;
         */
        @Override // defpackage.AbstractC7487wq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                MN r0 = defpackage.MN.d
                int r1 = r7.d
                QE1 r2 = r7.e
                r3 = 2
                r4 = 1
                java.lang.String r5 = "selectHaveAccountOuterImage"
                android.widget.ImageView r6 = r2.g
                if (r1 == 0) goto L22
                if (r1 == r4) goto L1e
                if (r1 != r3) goto L16
                defpackage.C1795Pt1.b(r8)
                goto L55
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                defpackage.C1795Pt1.b(r8)
                goto L49
            L22:
                defpackage.C1795Pt1.b(r8)
                android.widget.ImageView r8 = r2.e
                java.lang.String r1 = "selectHaveAccountInnerImage"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r1)
                uh1 r1 = defpackage.EnumC7035uh1.d
                r2 = 2131230988(0x7f08010c, float:1.8078044E38)
                defpackage.C3435dm0.e(r8, r2, r1)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
                r8 = 2131230987(0x7f08010b, float:1.8078042E38)
                defpackage.C3435dm0.e(r6, r8, r1)
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
                r7.d = r4
                java.lang.Object r8 = defpackage.C7644xc.k(r6, r7)
                if (r8 != r0) goto L49
                goto L54
            L49:
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
                r7.d = r3
                java.lang.Object r8 = defpackage.C7644xc.k(r6, r7)
                if (r8 != r0) goto L55
            L54:
                return r0
            L55:
                kotlin.Unit r8 = kotlin.Unit.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: PE1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PE1(SelectHaveAccountFragmentBase selectHaveAccountFragmentBase, QE1 qe1, JM<? super PE1> jm) {
        super(2, jm);
        this.e = selectHaveAccountFragmentBase;
        this.g = qe1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new PE1(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((PE1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            g.b bVar = g.b.g;
            a aVar = new a(this.g, null);
            this.d = 1;
            if (RepeatOnLifecycleKt.a(this.e, bVar, aVar, this) == mn) {
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
