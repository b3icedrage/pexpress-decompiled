package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: pN1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.feature.registration.screens.social.SocialLoginWithWebView$clickInWebView$1", f = "SocialLoginWithWebView.kt", l = {241, 242, 243, 246}, m = "invokeSuspend")
public final class C5919pN1 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public String d;
    public int e;
    public final /* synthetic */ AbstractC5709oN1 g;
    public final /* synthetic */ EnumC5076lN1 h;

    /* JADX INFO: renamed from: pN1$a */
    @InterfaceC3368dU(c = "com.base.feature.registration.screens.social.SocialLoginWithWebView$clickInWebView$1$1", f = "SocialLoginWithWebView.kt", l = {}, m = "invokeSuspend")
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
            return Boolean.valueOf(this.d);
        }
    }

    /* JADX INFO: renamed from: pN1$b */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC5076lN1.values().length];
            try {
                EnumC5076lN1 enumC5076lN1 = EnumC5076lN1.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5919pN1(AbstractC5709oN1 abstractC5709oN1, EnumC5076lN1 enumC5076lN1, JM<? super C5919pN1> jm) {
        super(2, jm);
        this.g = abstractC5709oN1;
        this.h = enumC5076lN1;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C5919pN1(this.g, this.h, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C5919pN1) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x007c A[PHI: r1
      0x007c: PHI (r1v7 java.lang.String) = (r1v6 java.lang.String), (r1v9 java.lang.String) binds: [B:25:0x0079, B:11:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x0080  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
    
        if (r2.C() == r0) goto L32;
     */
    @Override // defpackage.AbstractC7487wq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            MN r0 = defpackage.MN.d
            int r1 = r11.e
            oN1 r2 = r11.g
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            qi2 r8 = r2.a
            if (r1 == 0) goto L34
            if (r1 == r7) goto L30
            if (r1 == r6) goto L2a
            if (r1 == r5) goto L24
            if (r1 != r4) goto L1c
            defpackage.C1795Pt1.b(r12)
            goto L8e
        L1c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L24:
            java.lang.String r1 = r11.d
            defpackage.C1795Pt1.b(r12)
            goto L7c
        L2a:
            java.lang.String r1 = r11.d
            defpackage.C1795Pt1.b(r12)
            goto L6a
        L30:
            defpackage.C1795Pt1.b(r12)
            goto L49
        L34:
            defpackage.C1795Pt1.b(r12)
            r12 = r2
            vN1 r12 = (defpackage.C7178vN1) r12
            Pa2 r12 = r12.j
            java.lang.String r12 = r12.g()
            r11.e = r7
            java.lang.Object r12 = r8.a(r12, r11)
            if (r12 != r0) goto L49
            goto L8d
        L49:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r1 = r2.n()
            r11.d = r12
            r11.e = r6
            r8.getClass()
            vV r9 = defpackage.C6266r20.c
            pi2 r10 = new pi2
            r10.<init>(r8, r1, r3)
            java.lang.Object r1 = defpackage.C5189lv.p(r9, r10, r11)
            if (r1 != r0) goto L64
            goto L66
        L64:
            kotlin.Unit r1 = kotlin.Unit.a
        L66:
            if (r1 != r0) goto L69
            goto L8d
        L69:
            r1 = r12
        L6a:
            pN1$a r12 = new pN1$a
            r12.<init>(r6, r3)
            r11.d = r1
            r11.e = r5
            GP1 r5 = r2.f
            java.lang.Object r12 = defpackage.C4466ii.p(r5, r12, r11)
            if (r12 != r0) goto L7c
            goto L8d
        L7c:
            android.webkit.WebView r12 = r2.d
            if (r12 == 0) goto L83
            defpackage.LE.k(r12, r1)
        L83:
            r11.d = r3
            r11.e = r4
            kotlin.Unit r12 = r2.C()
            if (r12 != r0) goto L8e
        L8d:
            return r0
        L8e:
            int[] r12 = defpackage.C5919pN1.b.a
            lN1 r0 = r11.h
            int r0 = r0.ordinal()
            r12 = r12[r0]
            if (r12 != r7) goto La6
            android.webkit.WebView r12 = r2.d
            if (r12 == 0) goto La3
            java.lang.String r0 = r2.i
            defpackage.LE.k(r12, r0)
        La3:
            kotlin.Unit r12 = kotlin.Unit.a
            return r12
        La6:
            s51 r12 = new s51
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5919pN1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
