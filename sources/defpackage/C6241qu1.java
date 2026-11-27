package defpackage;

import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: qu1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6241qu1 extends AbstractC4300hu1 implements InterfaceC4548iu1 {

    @NotNull
    public final InterfaceC1442Lg1 c;

    @NotNull
    public final C5260mE d;

    @NotNull
    public final AbstractC0662Bg1.a<Integer> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6241qu1(@NotNull InterfaceC1442Lg1 preferencesRepository, @NotNull C5260mE closeDateProvider) {
        super(preferencesRepository);
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        Intrinsics.checkNotNullParameter(closeDateProvider, "closeDateProvider");
        this.c = preferencesRepository;
        this.d = closeDateProvider;
        this.e = C1052Gg1.b("review_dialog_opening_state");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (r7 == r1) goto L24;
     */
    @Override // defpackage.InterfaceC4548iu1
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@org.jetbrains.annotations.NotNull defpackage.LM r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.C5821ou1
            if (r0 == 0) goto L13
            r0 = r7
            ou1 r0 = (defpackage.C5821ou1) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            ou1 r0 = new ou1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.e
            MN r1 = defpackage.MN.d
            int r2 = r0.h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.C1795Pt1.b(r7)
            goto L67
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            qu1 r2 = r0.d
            defpackage.C1795Pt1.b(r7)
            goto L4f
        L38:
            defpackage.C1795Pt1.b(r7)
            KW1 r7 = r6.b
            java.lang.Object r7 = r7.getValue()
            rf0 r7 = (defpackage.InterfaceC6396rf0) r7
            r0.d = r6
            r0.h = r4
            java.lang.Object r7 = defpackage.C4466ii.o(r7, r0)
            if (r7 != r1) goto L4e
            goto L66
        L4e:
            r2 = r6
        L4f:
            p10 r5 = defpackage.EnumC5843p10.OPENING
            if (r7 == r5) goto L6d
            KW1 r7 = r2.b
            java.lang.Object r7 = r7.getValue()
            rf0 r7 = (defpackage.InterfaceC6396rf0) r7
            r2 = 0
            r0.d = r2
            r0.h = r3
            java.lang.Object r7 = defpackage.C4466ii.o(r7, r0)
            if (r7 != r1) goto L67
        L66:
            return r1
        L67:
            p10 r0 = defpackage.EnumC5843p10.OPENING_DELAYED
            if (r7 != r0) goto L6c
            goto L6d
        L6c:
            r4 = 0
        L6d:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6241qu1.a(LM):java.lang.Object");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 2561. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    @Override // defpackage.InterfaceC4548iu1
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object b(@org.jetbrains.annotations.Nullable java.lang.Boolean r9, @org.jetbrains.annotations.NotNull defpackage.LM r10) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6241qu1.b(java.lang.Boolean, LM):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC4548iu1
    @Nullable
    public final Object g(@NotNull LM lm) {
        C4768ju1 c4768ju1;
        if (lm instanceof C4768ju1) {
            c4768ju1 = (C4768ju1) lm;
            int i = c4768ju1.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4768ju1.g = i - Integer.MIN_VALUE;
            } else {
                c4768ju1 = new C4768ju1(this, lm);
            }
        } else {
            c4768ju1 = new C4768ju1(this, lm);
        }
        Object objO = c4768ju1.d;
        MN mn = MN.d;
        int i2 = c4768ju1.g;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            InterfaceC6396rf0 interfaceC6396rf0 = (InterfaceC6396rf0) this.b.getValue();
            c4768ju1.g = 1;
            objO = C4466ii.o(interfaceC6396rf0, c4768ju1);
            if (objO == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objO);
        }
        return Boolean.valueOf(objO == EnumC5843p10.DELAYED);
    }

    @Override // defpackage.InterfaceC7031ug1
    @NotNull
    public final AbstractC0662Bg1.a<Integer> getKey() {
        return this.e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(LM lm) {
        C4978ku1 c4978ku1;
        if (lm instanceof C4978ku1) {
            c4978ku1 = (C4978ku1) lm;
            int i = c4978ku1.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4978ku1.g = i - Integer.MIN_VALUE;
            } else {
                c4978ku1 = new C4978ku1(this, lm);
            }
        } else {
            c4978ku1 = new C4978ku1(this, lm);
        }
        Object objO = c4978ku1.d;
        MN mn = MN.d;
        int i2 = c4978ku1.g;
        if (i2 == 0) {
            C1795Pt1.b(objO);
            InterfaceC6396rf0<Long> interfaceC6396rf0K = this.d.k();
            c4978ku1.g = 1;
            objO = C4466ii.o(interfaceC6396rf0K, c4978ku1);
            if (objO == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objO);
        }
        Long l = (Long) objO;
        if (l == null) {
            return Boolean.FALSE;
        }
        long jLongValue = l.longValue();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jLongValue);
        calendar.add(5, 3);
        return Boolean.valueOf(new Date(System.currentTimeMillis()).compareTo(calendar.getTime()) >= 0);
    }
}
