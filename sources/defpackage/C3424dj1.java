package defpackage;

import com.base.feature.robot.robotdialogs.bottomsheet_dialogs.screens.ProfitLimitWithActivationBottomSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: dj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.robot.robotdialogs.bottomsheet_dialogs.screens.ProfitLimitWithActivationBottomSheet$bindViews$1$3", f = "ProfitLimitWithActivationBottomSheet.kt", l = {52, 54, 55, 57}, m = "invokeSuspend")
public final class C3424dj1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C1762Pi1 e;
    public final /* synthetic */ ProfitLimitWithActivationBottomSheet g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3424dj1(C1762Pi1 c1762Pi1, ProfitLimitWithActivationBottomSheet profitLimitWithActivationBottomSheet, JM<? super C3424dj1> jm) {
        super(2, jm);
        this.e = c1762Pi1;
        this.g = profitLimitWithActivationBottomSheet;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C3424dj1(this.e, this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C3424dj1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005b  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x006a, code lost:
    
        if (defpackage.C6263r11.a(r2, r10) == r0) goto L25;
     */
    @Override // defpackage.AbstractC7487wq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            MN r0 = defpackage.MN.d
            int r1 = r10.d
            Pi1 r2 = r10.e
            java.lang.String r3 = "profitLimitWithActivationDialogMotionLayout"
            r4 = 4
            r5 = 3
            r6 = 2
            androidx.constraintlayout.motion.widget.MotionLayout r2 = r2.j
            r7 = 1
            if (r1 == 0) goto L30
            if (r1 == r7) goto L2c
            if (r1 == r6) goto L28
            if (r1 == r5) goto L24
            if (r1 != r4) goto L1c
            defpackage.C1795Pt1.b(r11)
            goto L6d
        L1c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L24:
            defpackage.C1795Pt1.b(r11)
            goto L5b
        L28:
            defpackage.C1795Pt1.b(r11)
            goto L50
        L2c:
            defpackage.C1795Pt1.b(r11)
            goto L3e
        L30:
            defpackage.C1795Pt1.b(r11)
            long r8 = com.base.feature.robot.robotdialogs.bottomsheet_dialogs.screens.ProfitLimitWithActivationBottomSheet.k
            r10.d = r7
            java.lang.Object r11 = defpackage.IW.c(r8, r10)
            if (r11 != r0) goto L3e
            goto L6c
        L3e:
            r11 = 2131362991(0x7f0a04af, float:1.8345778E38)
            r2.setTransition(r11)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r10.d = r6
            java.lang.Object r11 = defpackage.C6263r11.a(r2, r10)
            if (r11 != r0) goto L50
            goto L6c
        L50:
            long r8 = com.base.feature.robot.robotdialogs.bottomsheet_dialogs.screens.ProfitLimitWithActivationBottomSheet.l
            r10.d = r5
            java.lang.Object r11 = defpackage.IW.c(r8, r10)
            if (r11 != r0) goto L5b
            goto L6c
        L5b:
            r11 = 2131362992(0x7f0a04b0, float:1.834578E38)
            r2.setTransition(r11)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r10.d = r4
            java.lang.Object r11 = defpackage.C6263r11.a(r2, r10)
            if (r11 != r0) goto L6d
        L6c:
            return r0
        L6d:
            com.base.feature.robot.robotdialogs.bottomsheet_dialogs.screens.ProfitLimitWithActivationBottomSheet r11 = r10.g
            r11.setCancelable(r7)
            android.app.Dialog r11 = r11.getDialog()
            if (r11 == 0) goto L7b
            r11.setCanceledOnTouchOutside(r7)
        L7b:
            kotlin.Unit r11 = kotlin.Unit.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3424dj1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
