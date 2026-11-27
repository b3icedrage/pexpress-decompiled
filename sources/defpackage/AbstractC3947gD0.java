package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: gD0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3947gD0 extends AbstractC8082zg1<Boolean> {

    @NotNull
    public final C4795k21 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC3947gD0(@NotNull InterfaceC1442Lg1 preferencesRepository) {
        super(preferencesRepository);
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.d = new C4795k21(true);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        if (r8 == r1) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object o(defpackage.AbstractC3947gD0 r6, kotlin.jvm.functions.Function1 r7, defpackage.LM r8) {
        /*
            boolean r0 = r8 instanceof defpackage.C3737fD0
            if (r0 == 0) goto L13
            r0 = r8
            fD0 r0 = (defpackage.C3737fD0) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            fD0 r0 = new fD0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.g
            MN r1 = defpackage.MN.d
            int r2 = r0.i
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            gD0 r6 = r0.d
            defpackage.C1795Pt1.b(r8)
            goto L66
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            kotlin.jvm.functions.Function1 r7 = r0.e
            gD0 r6 = r0.d
            defpackage.C1795Pt1.b(r8)
            goto L51
        L3d:
            defpackage.C1795Pt1.b(r8)
            rf0 r8 = r6.l()
            r0.d = r6
            r0.e = r7
            r0.i = r5
            java.lang.Object r8 = defpackage.C4466ii.o(r8, r0)
            if (r8 != r1) goto L51
            goto L65
        L51:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L69
            r0.d = r6
            r0.e = r3
            r0.i = r4
            java.lang.Object r8 = super.m(r7, r0)
            if (r8 != r1) goto L66
        L65:
            return r1
        L66:
            jl2 r8 = (defpackage.InterfaceC4740jl2) r8
            goto L7b
        L69:
            jl2$a r8 = new jl2$a
            r7 = r6
            hD0 r7 = (defpackage.C4157hD0) r7
            java.lang.String r7 = r7.e
            java.lang.String r0 = "We write the new "
            java.lang.String r1 = " value only when it was false"
            java.lang.String r7 = defpackage.C1039Gc0.d(r0, r7, r1)
            r8.<init>(r7)
        L7b:
            k21 r6 = r6.d
            Ot1$a r7 = defpackage.C1717Ot1.e     // Catch: java.lang.Throwable -> L85
            r6.b(r3)     // Catch: java.lang.Throwable -> L85
            kotlin.Unit r6 = kotlin.Unit.a     // Catch: java.lang.Throwable -> L85
            return r8
        L85:
            r6 = move-exception
            Ot1$a r7 = defpackage.C1717Ot1.e
            defpackage.C1795Pt1.a(r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC3947gD0.o(gD0, kotlin.jvm.functions.Function1, LM):java.lang.Object");
    }

    @Override // defpackage.AbstractC8082zg1
    @Nullable
    public final Object m(@NotNull Function1<? super JM<? super Boolean>, ? extends Object> function1, @NotNull JM<? super InterfaceC4740jl2> jm) {
        return o(this, function1, (LM) jm);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0075 A[Catch: all -> 0x002f, TryCatch #1 {all -> 0x002f, blocks: (B:13:0x002b, B:28:0x0071, B:30:0x0075, B:32:0x007b), top: B:42:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:31:0x007a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object n(@NotNull LM lm) throws Throwable {
        C3108cD0 c3108cD0;
        C4795k21 c4795k21;
        AbstractC3947gD0 abstractC3947gD0;
        InterfaceC4117h21 interfaceC4117h21;
        Throwable th;
        Boolean bool;
        boolean zBooleanValue;
        if (lm instanceof C3108cD0) {
            c3108cD0 = (C3108cD0) lm;
            int i = c3108cD0.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3108cD0.i = i - Integer.MIN_VALUE;
            } else {
                c3108cD0 = new C3108cD0(this, lm);
            }
        } else {
            c3108cD0 = new C3108cD0(this, lm);
        }
        Object obj = c3108cD0.g;
        MN mn = MN.d;
        int i2 = c3108cD0.i;
        try {
            if (i2 == 0) {
                C1795Pt1.b(obj);
                c3108cD0.d = this;
                c4795k21 = this.d;
                c3108cD0.e = c4795k21;
                c3108cD0.i = 1;
                if (c4795k21.a(c3108cD0) != mn) {
                    abstractC3947gD0 = this;
                }
                return mn;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC4117h21 = (InterfaceC4117h21) c3108cD0.d;
                try {
                    C1795Pt1.b(obj);
                    bool = (Boolean) obj;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
                    interfaceC4117h21.b(null);
                    return boolValueOf;
                } catch (Throwable th2) {
                    th = th2;
                    interfaceC4117h21.b(null);
                    throw th;
                }
            }
            C4795k21 c4795k22 = c3108cD0.e;
            abstractC3947gD0 = (AbstractC3947gD0) c3108cD0.d;
            C1795Pt1.b(obj);
            c4795k21 = c4795k22;
            C3527eD0 c3527eD0 = new C3527eD0(abstractC3947gD0.l(), 0);
            c3108cD0.d = c4795k21;
            c3108cD0.e = null;
            c3108cD0.i = 2;
            Object objQ = C4466ii.q(c3527eD0, c3108cD0);
            if (objQ != mn) {
                interfaceC4117h21 = c4795k21;
                obj = objQ;
                bool = (Boolean) obj;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                Boolean boolValueOf2 = Boolean.valueOf(zBooleanValue);
                interfaceC4117h21.b(null);
                return boolValueOf2;
            }
            return mn;
        } catch (Throwable th3) {
            interfaceC4117h21 = c4795k21;
            th = th3;
            interfaceC4117h21.b(null);
            throw th;
        }
    }
}
