package defpackage;

import java.nio.charset.Charset;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: uL0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6961uL0 implements InterfaceC6396rf0<Object> {
    public final /* synthetic */ C0580Af0 d;
    public final /* synthetic */ Charset e;
    public final /* synthetic */ A62 g;
    public final /* synthetic */ InterfaceC0942Ew h;

    /* JADX INFO: renamed from: uL0$a */
    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ InterfaceC6606sf0 d;
        public final /* synthetic */ Charset e;
        public final /* synthetic */ A62 g;
        public final /* synthetic */ InterfaceC0942Ew h;

        /* JADX INFO: renamed from: uL0$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "io.ktor.serialization.kotlinx.KotlinxSerializationConverter$deserialize$$inlined$map$1$2", f = "KotlinxSerializationConverter.kt", l = {224, 223}, m = "emit")
        public static final class C0502a extends LM {
            public /* synthetic */ Object d;
            public int e;
            public InterfaceC6606sf0 g;

            public C0502a(JM jm) {
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

        public a(InterfaceC6606sf0 interfaceC6606sf0, Charset charset, A62 a62, InterfaceC0942Ew interfaceC0942Ew) {
            this.d = interfaceC6606sf0;
            this.e = charset;
            this.g = a62;
            this.h = interfaceC0942Ew;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
        
            if (r8.a(r9, r0) == r1) goto L22;
         */
        @Override // defpackage.InterfaceC6606sf0
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object a(java.lang.Object r8, @org.jetbrains.annotations.NotNull defpackage.JM r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof defpackage.C6961uL0.a.C0502a
                if (r0 == 0) goto L13
                r0 = r9
                uL0$a$a r0 = (defpackage.C6961uL0.a.C0502a) r0
                int r1 = r0.e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.e = r1
                goto L18
            L13:
                uL0$a$a r0 = new uL0$a$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.d
                MN r1 = defpackage.MN.d
                int r2 = r0.e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L32
                if (r2 != r3) goto L2a
                defpackage.C1795Pt1.b(r9)
                goto L5f
            L2a:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L32:
                sf0 r8 = r0.g
                defpackage.C1795Pt1.b(r9)
                goto L53
            L38:
                defpackage.C1795Pt1.b(r9)
                BL0 r8 = (defpackage.BL0) r8
                sf0 r9 = r7.d
                r0.g = r9
                r0.e = r4
                A62 r2 = r7.g
                Ew r4 = r7.h
                java.nio.charset.Charset r5 = r7.e
                java.lang.Object r8 = r8.a(r5, r2, r4, r0)
                if (r8 != r1) goto L50
                goto L5e
            L50:
                r6 = r9
                r9 = r8
                r8 = r6
            L53:
                r2 = 0
                r0.g = r2
                r0.e = r3
                java.lang.Object r8 = r8.a(r9, r0)
                if (r8 != r1) goto L5f
            L5e:
                return r1
            L5f:
                kotlin.Unit r8 = kotlin.Unit.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.C6961uL0.a.a(java.lang.Object, JM):java.lang.Object");
        }
    }

    public C6961uL0(C0580Af0 c0580Af0, Charset charset, A62 a62, InterfaceC0942Ew interfaceC0942Ew) {
        this.d = c0580Af0;
        this.e = charset;
        this.g = a62;
        this.h = interfaceC0942Ew;
    }

    @Override // defpackage.InterfaceC6396rf0
    @Nullable
    public final Object c(@NotNull InterfaceC6606sf0<? super Object> interfaceC6606sf0, @NotNull JM jm) {
        Object objC = this.d.c(new a(interfaceC6606sf0, this.e, this.g, this.h), jm);
        return objC == MN.d ? objC : Unit.a;
    }
}
