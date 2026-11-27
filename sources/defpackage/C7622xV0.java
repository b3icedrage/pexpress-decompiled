package defpackage;

import android.view.View;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/* JADX INFO: renamed from: xV0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.app.activities.main.MainActivity$setupLayoutDirection$1", f = "MainActivity.kt", l = {226, 227}, m = "invokeSuspend")
public final class C7622xV0 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ ActivityC6781tV0 e;

    /* JADX INFO: renamed from: xV0$a */
    @InterfaceC3368dU(c = "com.base.app.activities.main.MainActivity$setupLayoutDirection$1$1", f = "MainActivity.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public final /* synthetic */ ActivityC6781tV0 d;
        public final /* synthetic */ Locale e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JM jm, ActivityC6781tV0 activityC6781tV0, Locale locale) {
            super(2, jm);
            this.d = activityC6781tV0;
            this.e = locale;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new a(jm, this.d, this.e);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            View decorView = this.d.getWindow().getDecorView();
            Locale locale = this.e;
            Intrinsics.checkNotNull(locale);
            Intrinsics.checkNotNullParameter(locale, "<this>");
            decorView.setLayoutDirection((C5027l8.l(locale) == b.RIGHT_TO_LEFT || C5027l8.l(locale) == b.RIGHT_TO_LEFT_ARABIC) ? 1 : 0);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7622xV0(ActivityC6781tV0 activityC6781tV0, JM<? super C7622xV0> jm) {
        super(2, jm);
        this.e = activityC6781tV0;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C7622xV0(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C7622xV0) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        if (defpackage.C5189lv.p(r1, r5, r6) == r0) goto L17;
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
            r2 = 0
            tV0 r3 = r6.e
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L1f
            if (r1 == r5) goto L1b
            if (r1 != r4) goto L13
            defpackage.C1795Pt1.b(r7)
            goto L4b
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            defpackage.C1795Pt1.b(r7)
            goto L33
        L1f:
            defpackage.C1795Pt1.b(r7)
            aM0 r7 = r3.D
            if (r7 == 0) goto L4e
            rf0 r7 = r7.l()
            r6.d = r5
            java.lang.Object r7 = defpackage.C4466ii.o(r7, r6)
            if (r7 != r0) goto L33
            goto L4a
        L33:
            java.lang.String r7 = (java.lang.String) r7
            java.util.Locale r7 = java.util.Locale.forLanguageTag(r7)
            RV r1 = defpackage.C6266r20.a
            zn0 r1 = defpackage.QV0.a
            xV0$a r5 = new xV0$a
            r5.<init>(r2, r3, r7)
            r6.d = r4
            java.lang.Object r7 = defpackage.C5189lv.p(r1, r5, r6)
            if (r7 != r0) goto L4b
        L4a:
            return r0
        L4b:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        L4e:
            java.lang.String r7 = "languageUseCaseApi"
            kotlin.jvm.internal.Intrinsics.l(r7)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7622xV0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
