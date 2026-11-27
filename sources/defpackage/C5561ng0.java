package defpackage;

import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ng0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5561ng0 implements InterfaceC6396rf0<Object> {
    public final /* synthetic */ InterfaceC6396rf0[] d;
    public final /* synthetic */ AW1 e;

    /* JADX INFO: renamed from: ng0$a */
    @InterfaceC3368dU(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", f = "Zip.kt", l = {329, 258}, m = "invokeSuspend")
    public static final class a extends AW1 implements InterfaceC1060Gj0<InterfaceC6606sf0<Object>, Object[], JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ InterfaceC6606sf0 e;
        public /* synthetic */ Object[] g;
        public final /* synthetic */ AW1 h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(JM jm, InterfaceC1138Hj0 interfaceC1138Hj0) {
            super(3, jm);
            this.h = (AW1) interfaceC1138Hj0;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        
            if (r1.a(r7, r6) == r0) goto L15;
         */
        /* JADX WARN: Type inference failed for: r3v1, types: [AW1, Hj0] */
        @Override // defpackage.AbstractC7487wq
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
            /*
                r6 = this;
                MN r0 = defpackage.MN.d
                int r1 = r6.d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                defpackage.C1795Pt1.b(r7)
                goto L45
            L10:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L18:
                sf0 r1 = r6.e
                defpackage.C1795Pt1.b(r7)
                goto L39
            L1e:
                defpackage.C1795Pt1.b(r7)
                sf0 r1 = r6.e
                java.lang.Object[] r7 = r6.g
                r4 = 0
                r4 = r7[r4]
                r5 = r7[r3]
                r7 = r7[r2]
                r6.e = r1
                r6.d = r3
                AW1 r3 = r6.h
                java.lang.Object r7 = r3.l(r4, r5, r7, r6)
                if (r7 != r0) goto L39
                goto L44
            L39:
                r3 = 0
                r6.e = r3
                r6.d = r2
                java.lang.Object r7 = r1.a(r7, r6)
                if (r7 != r0) goto L45
            L44:
                return r0
            L45:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C5561ng0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [AW1, Hj0] */
        @Override // defpackage.InterfaceC1060Gj0
        public final Object k(InterfaceC6606sf0<Object> interfaceC6606sf0, Object[] objArr, JM<? super Unit> jm) {
            a aVar = new a(jm, this.h);
            aVar.e = interfaceC6606sf0;
            aVar.g = objArr;
            return aVar.invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5561ng0(InterfaceC6396rf0[] interfaceC6396rf0Arr, InterfaceC1138Hj0 interfaceC1138Hj0) {
        this.d = interfaceC6396rf0Arr;
        this.e = (AW1) interfaceC1138Hj0;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [AW1, Hj0] */
    @Override // defpackage.InterfaceC6396rf0
    @Nullable
    public final Object c(@NotNull InterfaceC6606sf0<? super Object> interfaceC6606sf0, @NotNull JM jm) {
        Object objA = C4372iF.a(jm, interfaceC6606sf0, new a(null, this.e), C7240vg0.d, this.d);
        return objA == MN.d ? objA : Unit.a;
    }
}
