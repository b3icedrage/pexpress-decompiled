package defpackage;

import java.nio.charset.Charset;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xL0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7592xL0 implements InterfaceC6396rf0<AbstractC1112Ha1> {
    public final /* synthetic */ C0580Af0 d;
    public final /* synthetic */ C4651jM e;
    public final /* synthetic */ Charset g;
    public final /* synthetic */ A62 h;
    public final /* synthetic */ Object i;

    /* JADX INFO: renamed from: xL0$a */
    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ InterfaceC6606sf0 d;
        public final /* synthetic */ C4651jM e;
        public final /* synthetic */ Charset g;
        public final /* synthetic */ A62 h;
        public final /* synthetic */ Object i;

        /* JADX INFO: renamed from: xL0$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter$serializeNullable$$inlined$map$1$2", f = "KotlinxSerializationConverter.kt", l = {224, 223}, m = "emit")
        public static final class C0533a extends LM {
            public /* synthetic */ Object d;
            public int e;
            public InterfaceC6606sf0 g;

            public C0533a(JM jm) {
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

        public a(InterfaceC6606sf0 interfaceC6606sf0, C4651jM c4651jM, Charset charset, A62 a62, Object obj) {
            this.d = interfaceC6606sf0;
            this.e = c4651jM;
            this.g = charset;
            this.h = a62;
            this.i = obj;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005e, code lost:
        
            if (r9.a(r10, r0) == r1) goto L22;
         */
        @Override // defpackage.InterfaceC6606sf0
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(java.lang.Object r9, @org.jetbrains.annotations.NotNull defpackage.JM r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof defpackage.C7592xL0.a.C0533a
                if (r0 == 0) goto L13
                r0 = r10
                xL0$a$a r0 = (defpackage.C7592xL0.a.C0533a) r0
                int r1 = r0.e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.e = r1
                goto L18
            L13:
                xL0$a$a r0 = new xL0$a$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.d
                MN r1 = defpackage.MN.d
                int r2 = r0.e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L32
                if (r2 != r3) goto L2a
                defpackage.C1795Pt1.b(r10)
                goto L61
            L2a:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L32:
                sf0 r9 = r0.g
                defpackage.C1795Pt1.b(r10)
                goto L55
            L38:
                defpackage.C1795Pt1.b(r10)
                BL0 r9 = (defpackage.BL0) r9
                sf0 r10 = r8.d
                r0.g = r10
                r0.e = r4
                A62 r2 = r8.h
                java.lang.Object r4 = r8.i
                jM r5 = r8.e
                java.nio.charset.Charset r6 = r8.g
                hA r9 = r9.b(r5, r6, r2, r4)
                if (r9 != r1) goto L52
                goto L60
            L52:
                r7 = r10
                r10 = r9
                r9 = r7
            L55:
                r2 = 0
                r0.g = r2
                r0.e = r3
                java.lang.Object r9 = r9.a(r10, r0)
                if (r9 != r1) goto L61
            L60:
                return r1
            L61:
                kotlin.Unit r9 = kotlin.Unit.a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C7592xL0.a.a(java.lang.Object, JM):java.lang.Object");
        }
    }

    public C7592xL0(C0580Af0 c0580Af0, C4651jM c4651jM, Charset charset, A62 a62, Object obj) {
        this.d = c0580Af0;
        this.e = c4651jM;
        this.g = charset;
        this.h = a62;
        this.i = obj;
    }

    @Override // defpackage.InterfaceC6396rf0
    @Nullable
    public final Object c(@NotNull InterfaceC6606sf0<? super AbstractC1112Ha1> interfaceC6606sf0, @NotNull JM jm) {
        Object objC = this.d.c(new a(interfaceC6606sf0, this.e, this.g, this.h, this.i), jm);
        return objC == MN.d ? objC : Unit.a;
    }
}
