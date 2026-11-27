package defpackage;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: wP1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7395wP1 implements IK1 {

    /* JADX INFO: renamed from: wP1$a */
    @InterfaceC3368dU(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$1", f = "SharingStarted.kt", l = {174, 176, 178, 179, 181}, m = "invokeSuspend")
    public static final class a extends AW1 implements InterfaceC1060Gj0<InterfaceC6606sf0<? super GK1>, Integer, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ InterfaceC6606sf0 e;
        public /* synthetic */ int g;

        public a(JM<? super a> jm) {
            super(3, jm);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x006a A[PHI: r1
          0x006a: PHI (r1v3 sf0) = (r1v2 sf0), (r1v6 sf0) binds: [B:25:0x0067, B:13:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
        
            if (r1.a(r9, r8) == r0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
        
            if (r1.a(r9, r8) == r0) goto L32;
         */
        @Override // defpackage.AbstractC7487wq
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r9) {
            /*
                r8 = this;
                MN r0 = defpackage.MN.d
                int r1 = r8.d
                r2 = 5
                r3 = 4
                r4 = 3
                r5 = 2
                r6 = 1
                wP1 r7 = defpackage.C7395wP1.this
                if (r1 == 0) goto L36
                if (r1 == r6) goto L32
                if (r1 == r5) goto L2c
                if (r1 == r4) goto L26
                if (r1 == r3) goto L20
                if (r1 != r2) goto L18
                goto L32
            L18:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L20:
                sf0 r1 = r8.e
                defpackage.C1795Pt1.b(r9)
                goto L7d
            L26:
                sf0 r1 = r8.e
                defpackage.C1795Pt1.b(r9)
                goto L6a
            L2c:
                sf0 r1 = r8.e
                defpackage.C1795Pt1.b(r9)
                goto L5a
            L32:
                defpackage.C1795Pt1.b(r9)
                goto L8b
            L36:
                defpackage.C1795Pt1.b(r9)
                sf0 r1 = r8.e
                int r9 = r8.g
                if (r9 <= 0) goto L4a
                GK1 r9 = defpackage.GK1.d
                r8.d = r6
                java.lang.Object r9 = r1.a(r9, r8)
                if (r9 != r0) goto L8b
                goto L8a
            L4a:
                r7.getClass()
                r8.e = r1
                r8.d = r5
                r5 = 5000(0x1388, double:2.4703E-320)
                java.lang.Object r9 = defpackage.IW.b(r5, r8)
                if (r9 != r0) goto L5a
                goto L8a
            L5a:
                r7.getClass()
                GK1 r9 = defpackage.GK1.e
                r8.e = r1
                r8.d = r4
                java.lang.Object r9 = r1.a(r9, r8)
                if (r9 != r0) goto L6a
                goto L8a
            L6a:
                r7.getClass()
                r8.e = r1
                r8.d = r3
                r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                java.lang.Object r9 = defpackage.IW.b(r3, r8)
                if (r9 != r0) goto L7d
                goto L8a
            L7d:
                GK1 r9 = defpackage.GK1.g
                r3 = 0
                r8.e = r3
                r8.d = r2
                java.lang.Object r9 = r1.a(r9, r8)
                if (r9 != r0) goto L8b
            L8a:
                return r0
            L8b:
                kotlin.Unit r9 = kotlin.Unit.a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C7395wP1.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // defpackage.InterfaceC1060Gj0
        public final Object k(InterfaceC6606sf0<? super GK1> interfaceC6606sf0, Integer num, JM<? super Unit> jm) {
            int iIntValue = num.intValue();
            a aVar = C7395wP1.this.new a(jm);
            aVar.e = interfaceC6606sf0;
            aVar.g = iIntValue;
            return aVar.invokeSuspend(Unit.a);
        }
    }

    /* JADX INFO: renamed from: wP1$b */
    @InterfaceC3368dU(c = "kotlinx.coroutines.flow.StartedWhileSubscribed$command$2", f = "SharingStarted.kt", l = {}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<GK1, JM<? super Boolean>, Object> {
        public /* synthetic */ Object d;

        public b() {
            throw null;
        }

        @Override // defpackage.AbstractC7487wq
        @NotNull
        public final JM<Unit> create(@Nullable Object obj, @NotNull JM<?> jm) {
            b bVar = new b(2, jm);
            bVar.d = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GK1 gk1, JM<? super Boolean> jm) {
            return ((b) create(gk1, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            return Boolean.valueOf(((GK1) this.d) != GK1.d);
        }
    }

    @Override // defpackage.IK1
    @NotNull
    public final InterfaceC6396rf0<GK1> a(@NotNull FP1<Integer> fp1) {
        a aVar = new a(null);
        int i = C2220Vf0.a;
        return C4466ii.m(new C1596Nf0(new C2543Yz(aVar, fp1, e.d, -2, EnumC1796Pu.d), new b(2, null)));
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C7395wP1)) {
            return false;
        }
        ((C7395wP1) obj).getClass();
        return true;
    }

    @IgnoreJRERequirement
    public final int hashCode() {
        return Long.hashCode(Long.MAX_VALUE) + (Long.hashCode(5000L) * 31);
    }

    @NotNull
    public final String toString() {
        CQ0 cq0 = new CQ0(2);
        cq0.add("stopTimeout=5000ms");
        return C1039Gc0.e(new StringBuilder("SharingStarted.WhileSubscribed("), CollectionsKt.J(VE.a(cq0), null, null, null, null, 63), ')');
    }
}
