package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class A7 implements InterfaceC6353rS1 {

    @NotNull
    public final ZT1 a;

    @NotNull
    public final EnumC2694aJ1 b;

    @NotNull
    public final C3735fC1 c;

    @InterfaceC3368dU(c = "com.base.feature.support.chat.data.AdIdSessionValue$valueFlow$1", f = "AdIdSessionValue.kt", l = {15, 15}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<InterfaceC6606sf0<? super String>, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            a aVar = A7.this.new a(jm);
            aVar.e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC6606sf0<? super String> interfaceC6606sf0, JM<? super Unit> jm) {
            return ((a) create(interfaceC6606sf0, jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            if (r1.a(r5, r4) == r0) goto L15;
         */
        @Override // defpackage.AbstractC7487wq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                MN r0 = defpackage.MN.d
                int r1 = r4.d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                defpackage.C1795Pt1.b(r5)
                goto L43
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L18:
                java.lang.Object r1 = r4.e
                sf0 r1 = (defpackage.InterfaceC6606sf0) r1
                defpackage.C1795Pt1.b(r5)
                goto L37
            L20:
                defpackage.C1795Pt1.b(r5)
                java.lang.Object r5 = r4.e
                r1 = r5
                sf0 r1 = (defpackage.InterfaceC6606sf0) r1
                A7 r5 = defpackage.A7.this
                ZT1 r5 = r5.a
                r4.e = r1
                r4.d = r3
                java.lang.Object r5 = r5.a(r4)
                if (r5 != r0) goto L37
                goto L42
            L37:
                r3 = 0
                r4.e = r3
                r4.d = r2
                java.lang.Object r5 = r1.a(r5, r4)
                if (r5 != r0) goto L43
            L42:
                return r0
            L43:
                kotlin.Unit r5 = kotlin.Unit.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: A7.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public A7(@NotNull ZT1 subIdProvider) {
        Intrinsics.checkNotNullParameter(subIdProvider, "subIdProvider");
        this.a = subIdProvider;
        this.b = EnumC2694aJ1.AD_ID_KEY;
        this.c = new C3735fC1(new a(null));
    }

    @Override // defpackage.ZI1
    @Nullable
    public final Object a(@NotNull TA ta, @NotNull XA.d dVar) {
        return InterfaceC6353rS1.a.a(this, ta, dVar);
    }

    @Override // defpackage.ZI1
    @NotNull
    public final InterfaceC6396rf0<String> b() {
        return this.c;
    }

    @Override // defpackage.ZI1
    @NotNull
    public final EnumC2694aJ1 getKey() {
        return this.b;
    }
}
