package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: y0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.api.feature.trading.direction.base_calculators.AbstractLocalDirectionCalculator$waitIndicatorWithPrevious$$inlined$transform$1", f = "AbstractLocalDirectionCalculator.kt", l = {36}, m = "invokeSuspend")
public final class C7728y0 extends AW1 implements Function2<InterfaceC6606sf0<? super H32.a>, JM<? super Unit>, Object> {
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ InterfaceC6396rf0 g;
    public final /* synthetic */ AbstractC6048q0 h;
    public final /* synthetic */ I10 i;
    public final /* synthetic */ InterfaceC7722xy0 j;
    public final /* synthetic */ E10.c k;
    public final /* synthetic */ Function1 l;
    public final /* synthetic */ C3027bp1 m;
    public final /* synthetic */ InterfaceC1138Hj0 n;

    /* JADX INFO: renamed from: y0$a */
    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ InterfaceC6606sf0<H32.a> d;
        public final /* synthetic */ AbstractC6048q0 e;
        public final /* synthetic */ I10 g;
        public final /* synthetic */ InterfaceC7722xy0 h;
        public final /* synthetic */ E10.c i;
        public final /* synthetic */ Function1 j;
        public final /* synthetic */ C3027bp1 k;
        public final /* synthetic */ InterfaceC1138Hj0 l;

        /* JADX INFO: renamed from: y0$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.api.feature.trading.direction.base_calculators.AbstractLocalDirectionCalculator$waitIndicatorWithPrevious$$inlined$transform$1$1", f = "AbstractLocalDirectionCalculator.kt", l = {220, 229}, m = "emit")
        public static final class C0540a extends LM {
            public /* synthetic */ Object d;
            public int e;
            public a h;
            public InterfaceC6606sf0 i;

            public C0540a(JM jm) {
                super(jm);
            }

            @Override // defpackage.AbstractC7487wq
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.d = obj;
                this.e |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        public a(InterfaceC6606sf0 interfaceC6606sf0, AbstractC6048q0 abstractC6048q0, I10 i10, InterfaceC7722xy0 interfaceC7722xy0, E10.c cVar, Function1 function1, C3027bp1 c3027bp1, InterfaceC1138Hj0 interfaceC1138Hj0) {
            this.e = abstractC6048q0;
            this.g = i10;
            this.h = interfaceC7722xy0;
            this.i = cVar;
            this.j = function1;
            this.k = c3027bp1;
            this.l = interfaceC1138Hj0;
            this.d = interfaceC6606sf0;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0014  */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
        
            if (r1.l.l(r9, r3, r10, r6) == r0) goto L34;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.InterfaceC6606sf0
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(T r9, @org.jetbrains.annotations.NotNull defpackage.JM<? super kotlin.Unit> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof defpackage.C7728y0.a.C0540a
                if (r0 == 0) goto L14
                r0 = r10
                y0$a$a r0 = (defpackage.C7728y0.a.C0540a) r0
                int r1 = r0.e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L14
                int r1 = r1 - r2
                r0.e = r1
            L12:
                r6 = r0
                goto L1a
            L14:
                y0$a$a r0 = new y0$a$a
                r0.<init>(r10)
                goto L12
            L1a:
                java.lang.Object r10 = r6.d
                MN r0 = defpackage.MN.d
                int r1 = r6.e
                r7 = 2
                r2 = 1
                if (r1 == 0) goto L3c
                if (r1 == r2) goto L34
                if (r1 != r7) goto L2c
                defpackage.C1795Pt1.b(r10)
                goto L88
            L2c:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L34:
                sf0 r9 = r6.i
                y0$a r1 = r6.h
                defpackage.C1795Pt1.b(r10)     // Catch: java.lang.Exception -> L62
                goto L5d
            L3c:
                defpackage.C1795Pt1.b(r10)
                sf0<H32$a> r10 = r8.d
                java.util.List r9 = (java.util.List) r9
                q0 r1 = r8.e     // Catch: java.lang.Exception -> L60
                I10 r3 = r8.g     // Catch: java.lang.Exception -> L60
                xy0 r4 = r8.h     // Catch: java.lang.Exception -> L60
                E10$c r5 = r8.i     // Catch: java.lang.Exception -> L60
                r6.h = r8     // Catch: java.lang.Exception -> L60
                r6.i = r10     // Catch: java.lang.Exception -> L60
                r6.e = r2     // Catch: java.lang.Exception -> L60
                r2 = r9
                java.lang.Object r9 = r1.m(r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L60
                if (r9 != r0) goto L59
                goto L87
            L59:
                r1 = r10
                r10 = r9
                r9 = r1
                r1 = r8
            L5d:
                Tt1 r10 = (defpackage.EnumC2107Tt1) r10     // Catch: java.lang.Exception -> L62
                goto L64
            L60:
                r1 = r8
                r9 = r10
            L62:
                Tt1 r10 = defpackage.EnumC2107Tt1.g
            L64:
                Tt1 r2 = defpackage.EnumC2107Tt1.d
                if (r10 != r2) goto L88
                kotlin.jvm.functions.Function1 r10 = r1.j
                E10$c r2 = r1.i
                java.lang.Object r10 = r10.invoke(r2)
                bp1 r2 = r1.k
                T r3 = r2.d
                r2.d = r10
                if (r3 == 0) goto L88
                r2 = 0
                r6.h = r2
                r6.i = r2
                r6.e = r7
                Hj0 r1 = r1.l
                java.lang.Object r9 = r1.l(r9, r3, r10, r6)
                if (r9 != r0) goto L88
            L87:
                return r0
            L88:
                kotlin.Unit r9 = kotlin.Unit.a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C7728y0.a.a(java.lang.Object, JM):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7728y0(InterfaceC6396rf0 interfaceC6396rf0, JM jm, AbstractC6048q0 abstractC6048q0, I10 i10, InterfaceC7722xy0 interfaceC7722xy0, E10.c cVar, Function1 function1, C3027bp1 c3027bp1, InterfaceC1138Hj0 interfaceC1138Hj0) {
        super(2, jm);
        this.g = interfaceC6396rf0;
        this.h = abstractC6048q0;
        this.i = i10;
        this.j = interfaceC7722xy0;
        this.k = cVar;
        this.l = function1;
        this.m = c3027bp1;
        this.n = interfaceC1138Hj0;
    }

    @Override // defpackage.AbstractC7487wq
    @NotNull
    public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
        C7728y0 c7728y0 = new C7728y0(this.g, jm, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
        c7728y0.e = obj;
        return c7728y0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC6606sf0<? super H32.a> interfaceC6606sf0, JM<? super Unit> jm) {
        return ((C7728y0) create(interfaceC6606sf0, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            a aVar = new a((InterfaceC6606sf0) this.e, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
            this.d = 1;
            if (this.g.c(aVar, this) == mn) {
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
