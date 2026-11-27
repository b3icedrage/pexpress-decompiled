package defpackage;

import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class FL0 implements InterfaceC6606sf0<Object> {
    public int d;
    public final /* synthetic */ InterfaceC1958Rw e;
    public final /* synthetic */ C6736tG0 g;
    public final /* synthetic */ IL0 h;
    public final /* synthetic */ RJ0 i;
    public final /* synthetic */ Charset j;

    @InterfaceC3368dU(c = "io.ktor.serialization.kotlinx.json.KotlinxSerializationJsonExtensions$serialize$$inlined$collectIndexed$1", f = "KotlinxSerializationJsonExtensions.kt", l = {124, 127}, m = "emit")
    public static final class a extends LM {
        public /* synthetic */ Object d;
        public int e;
        public FL0 h;
        public Object i;

        public a(JM jm) {
            super(jm);
        }

        @Override // defpackage.AbstractC7487wq
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.e |= Integer.MIN_VALUE;
            return FL0.this.a(null, this);
        }
    }

    public FL0(InterfaceC1958Rw interfaceC1958Rw, C6736tG0 c6736tG0, IL0 il0, RJ0 rj0, Charset charset) {
        this.e = interfaceC1958Rw;
        this.g = c6736tG0;
        this.h = il0;
        this.i = rj0;
        this.j = charset;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0077  */
    /* JADX WARN: Code duplicated, block: B:28:0x007c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009a, code lost:
    
        if (defpackage.C4994l.k(r6.e, r7, r0) == r1) goto L31;
     */
    @Override // defpackage.InterfaceC6606sf0
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r6, @org.jetbrains.annotations.NotNull defpackage.JM<? super kotlin.Unit> r7) throws java.nio.charset.CharacterCodingException {
        /*
            r5 = this;
            boolean r0 = r7 instanceof FL0.a
            if (r0 == 0) goto L13
            r0 = r7
            FL0$a r0 = (FL0.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            FL0$a r0 = new FL0$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.d
            MN r1 = defpackage.MN.d
            int r2 = r0.e
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L3d
            if (r2 == r3) goto L35
            if (r2 != r4) goto L2d
            FL0 r6 = r0.h
            defpackage.C1795Pt1.b(r7)
            goto L9d
        L2d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L35:
            java.lang.Object r6 = r0.i
            FL0 r2 = r0.h
            defpackage.C1795Pt1.b(r7)
            goto L5e
        L3d:
            defpackage.C1795Pt1.b(r7)
            int r7 = r5.d
            int r2 = r7 + 1
            r5.d = r2
            if (r7 < 0) goto La5
            if (r7 <= 0) goto L61
            tG0 r7 = r5.g
            byte[] r7 = r7.c
            r0.h = r5
            r0.i = r6
            r0.e = r3
            Rw r2 = r5.e
            java.lang.Object r7 = defpackage.C4994l.k(r2, r7, r0)
            if (r7 != r1) goto L5d
            goto L9c
        L5d:
            r2 = r5
        L5e:
            r7 = r6
            r6 = r2
            goto L63
        L61:
            r7 = r6
            r6 = r5
        L63:
            IL0 r2 = r6.h
            mG0 r2 = r2.a
            RJ0 r3 = r6.i
            java.lang.String r7 = r2.b(r3, r7)
            java.nio.charset.Charset r2 = kotlin.text.Charsets.UTF_8
            java.nio.charset.Charset r3 = r6.j
            boolean r2 = kotlin.jvm.internal.Intrinsics.a(r3, r2)
            if (r2 == 0) goto L7c
            byte[] r7 = kotlin.text.d.g(r7)
            goto L8d
        L7c:
            java.nio.charset.CharsetEncoder r2 = r3.newEncoder()
            java.lang.String r3 = "charset.newEncoder()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            int r3 = r7.length()
            byte[] r7 = defpackage.C6927uA.c(r2, r7, r3)
        L8d:
            r0.h = r6
            r2 = 0
            r0.i = r2
            r0.e = r4
            Rw r2 = r6.e
            java.lang.Object r7 = defpackage.C4994l.k(r2, r7, r0)
            if (r7 != r1) goto L9d
        L9c:
            return r1
        L9d:
            Rw r6 = r6.e
            r6.flush()
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        La5:
            java.lang.ArithmeticException r6 = new java.lang.ArithmeticException
            java.lang.String r7 = "Index overflow has happened"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.FL0.a(java.lang.Object, JM):java.lang.Object");
    }
}
