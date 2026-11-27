package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: lD0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5045lD0 extends AbstractC8082zg1<Boolean> {

    @NotNull
    public final C6120qK1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC5045lD0(@NotNull InterfaceC1442Lg1 preferencesRepository) {
        super(preferencesRepository);
        Intrinsics.checkNotNullParameter(preferencesRepository, "preferencesRepository");
        this.d = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009f, code lost:
    
        if (r7.a(r8, r0) == r1) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object o(defpackage.AbstractC5045lD0 r7, kotlin.jvm.functions.Function1 r8, defpackage.LM r9) {
        /*
            boolean r0 = r9 instanceof defpackage.C4835kD0
            if (r0 == 0) goto L13
            r0 = r9
            kD0 r0 = (defpackage.C4835kD0) r0
            int r1 = r0.i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.i = r1
            goto L18
        L13:
            kD0 r0 = new kD0
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.g
            MN r1 = defpackage.MN.d
            int r2 = r0.i
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L51
            if (r2 == r6) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            defpackage.C1795Pt1.b(r9)
            goto La2
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L39:
            java.lang.Object r7 = r0.d
            defpackage.C1795Pt1.b(r9)
            goto L8e
        L3f:
            java.lang.Object r7 = r0.d
            lD0 r7 = (defpackage.AbstractC5045lD0) r7
            defpackage.C1795Pt1.b(r9)
            goto L7b
        L47:
            kotlin.jvm.functions.Function1 r8 = r0.e
            java.lang.Object r7 = r0.d
            lD0 r7 = (defpackage.AbstractC5045lD0) r7
            defpackage.C1795Pt1.b(r9)
            goto L65
        L51:
            defpackage.C1795Pt1.b(r9)
            rf0 r9 = r7.l()
            r0.d = r7
            r0.e = r8
            r0.i = r6
            java.lang.Object r9 = defpackage.C4466ii.o(r9, r0)
            if (r9 != r1) goto L65
            goto La1
        L65:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            r2 = 0
            if (r9 != 0) goto L91
            r0.d = r7
            r0.e = r2
            r0.i = r5
            java.lang.Object r9 = super.m(r8, r0)
            if (r9 != r1) goto L7b
            goto La1
        L7b:
            r8 = r9
            jl2 r8 = (defpackage.InterfaceC4740jl2) r8
            qK1 r7 = r7.d
            kotlin.Unit r8 = kotlin.Unit.a
            r0.d = r9
            r0.i = r4
            java.lang.Object r7 = r7.a(r8, r0)
            if (r7 != r1) goto L8d
            goto La1
        L8d:
            r7 = r9
        L8e:
            jl2 r7 = (defpackage.InterfaceC4740jl2) r7
            return r7
        L91:
            qK1 r7 = r7.d
            kotlin.Unit r8 = kotlin.Unit.a
            r0.d = r2
            r0.e = r2
            r0.i = r3
            java.lang.Object r7 = r7.a(r8, r0)
            if (r7 != r1) goto La2
        La1:
            return r1
        La2:
            jl2$a r7 = new jl2$a
            java.lang.String r8 = "We write the new is_show value only when it was false"
            r7.<init>(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC5045lD0.o(lD0, kotlin.jvm.functions.Function1, LM):java.lang.Object");
    }

    @Override // defpackage.AbstractC8082zg1
    @Nullable
    public final Object m(@NotNull Function1<? super JM<? super Boolean>, ? extends Object> function1, @NotNull JM<? super InterfaceC4740jl2> jm) {
        return o(this, function1, (LM) jm);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object n(@NotNull LM lm) {
        C4625jD0 c4625jD0;
        AbstractC5045lD0 abstractC5045lD0;
        if (lm instanceof C4625jD0) {
            c4625jD0 = (C4625jD0) lm;
            int i = c4625jD0.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                c4625jD0.h = i - Integer.MIN_VALUE;
            } else {
                c4625jD0 = new C4625jD0(this, lm);
            }
        } else {
            c4625jD0 = new C4625jD0(this, lm);
        }
        Object obj = c4625jD0.e;
        MN mn = MN.d;
        int i2 = c4625jD0.h;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            C6120qK1 c6120qK1 = this.d;
            c4625jD0.d = this;
            c4625jD0.h = 1;
            if (C4466ii.o(c6120qK1, c4625jD0) == mn) {
                return mn;
            }
            abstractC5045lD0 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC5045lD0 = c4625jD0.d;
            C1795Pt1.b(obj);
        }
        return abstractC5045lD0.l();
    }
}
