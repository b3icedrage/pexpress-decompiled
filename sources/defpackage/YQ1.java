package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.stories.providers.StoriesProviderBase$startCounter$1", f = "StoriesProviderBase.kt", l = {217, 218}, m = "invokeSuspend")
public final class YQ1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public long d;
    public int e;
    public final /* synthetic */ XQ1 g;

    @InterfaceC3368dU(c = "com.base.feature.stories.providers.StoriesProviderBase$startCounter$1$1", f = "StoriesProviderBase.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<Boolean, JM<? super Boolean>, Object> {
        public /* synthetic */ boolean d;

        public a() {
            throw null;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            a aVar = new a(2, jm);
            aVar.d = ((Boolean) obj).booleanValue();
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, JM<? super Boolean> jm) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((a) create(bool2, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            return Boolean.valueOf(!this.d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YQ1(XQ1 xq1, JM<? super YQ1> jm) {
        super(2, jm);
        this.g = xq1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new YQ1(this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((YQ1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036 A[PHI: r7
      0x0036: PHI (r7v2 long) = (r7v0 long), (r7v1 long), (r7v5 long) binds: [B:10:0x0024, B:17:0x006d, B:6:0x0010] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:16:0x005e A[PHI: r7
      0x005e: PHI (r7v1 long) = (r7v3 long), (r7v4 long) binds: [B:14:0x005b, B:9:0x001e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x006d -> B:11:0x0036). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.AbstractC7487wq
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            MN r0 = defpackage.MN.d
            int r1 = r13.e
            r2 = 0
            r3 = 2
            r4 = 1
            r5 = 0
            XQ1 r6 = r13.g
            if (r1 == 0) goto L24
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L16
            long r7 = r13.d
            defpackage.C1795Pt1.b(r14)
            goto L36
        L16:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1e:
            long r7 = r13.d
            defpackage.C1795Pt1.b(r14)
            goto L5e
        L24:
            defpackage.C1795Pt1.b(r14)
            GP1 r14 = r6.j
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r2)
            r14.getClass()
            r14.m(r5, r1)
            r7 = 5000(0x1388, double:2.4703E-320)
        L36:
            r9 = 0
            int r14 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r14 <= 0) goto L70
            r9 = 10
            long r7 = r7 - r9
            GP1 r14 = r6.j
            float r1 = (float) r4
            float r11 = (float) r7
            r12 = 1167867904(0x459c4000, float:5000.0)
            float r11 = r11 / r12
            float r1 = r1 - r11
            java.lang.Float r11 = new java.lang.Float
            r11.<init>(r1)
            r14.getClass()
            r14.m(r5, r11)
            r13.d = r7
            r13.e = r4
            java.lang.Object r14 = defpackage.IW.b(r9, r13)
            if (r14 != r0) goto L5e
            goto L6f
        L5e:
            GP1 r14 = r6.l
            YQ1$a r1 = new YQ1$a
            r1.<init>(r3, r5)
            r13.d = r7
            r13.e = r3
            java.lang.Object r14 = defpackage.C4466ii.p(r14, r1, r13)
            if (r14 != r0) goto L36
        L6f:
            return r0
        L70:
            GP1 r14 = r6.j
            java.lang.Float r0 = new java.lang.Float
            r0.<init>(r2)
            r14.getClass()
            r14.m(r5, r0)
            r6.j()
            kotlin.Unit r14 = kotlin.Unit.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.YQ1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
