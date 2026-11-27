package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class JC0 implements IC0 {

    @NotNull
    public final AbstractC7004uZ1 a;

    @NotNull
    public final a b;

    public static final class a implements InterfaceC6396rf0<C2153Uj> {
        public final /* synthetic */ C1621Nn1 d;
        public final /* synthetic */ JC0 e;

        /* JADX INFO: renamed from: JC0$a$a, reason: collision with other inner class name */
        public static final class C0059a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;
            public final /* synthetic */ JC0 e;

            /* JADX INFO: renamed from: JC0$a$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.robot.robot.investment.providers.InvestmentAssetProviderBase$special$$inlined$map$1$2", f = "InvestmentAssetProviderBase.kt", l = {220, 219}, m = "emit")
            public static final class C0060a extends LM {
                public /* synthetic */ Object d;
                public int e;
                public InterfaceC6606sf0 g;
                public C3279d22 i;

                public C0060a(JM jm) {
                    super(jm);
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return C0059a.this.a(null, this);
                }
            }

            public C0059a(InterfaceC6606sf0 interfaceC6606sf0, JC0 jc0) {
                this.d = interfaceC6606sf0;
                this.e = jc0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
            
                if (r2.a(r6, r0) == r1) goto L27;
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
                    boolean r0 = r9 instanceof JC0.a.C0059a.C0060a
                    if (r0 == 0) goto L13
                    r0 = r9
                    JC0$a$a$a r0 = (JC0.a.C0059a.C0060a) r0
                    int r1 = r0.e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.e = r1
                    goto L18
                L13:
                    JC0$a$a$a r0 = new JC0$a$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.d
                    MN r1 = defpackage.MN.d
                    int r2 = r0.e
                    r3 = 1
                    r4 = 2
                    if (r2 == 0) goto L3a
                    if (r2 == r3) goto L32
                    if (r2 != r4) goto L2a
                    defpackage.C1795Pt1.b(r9)
                    goto L7c
                L2a:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L32:
                    d22 r8 = r0.i
                    sf0 r2 = r0.g
                    defpackage.C1795Pt1.b(r9)
                    goto L52
                L3a:
                    defpackage.C1795Pt1.b(r9)
                    d22 r8 = (defpackage.C3279d22) r8
                    JC0 r9 = r7.e
                    uZ1 r9 = r9.a
                    sf0 r2 = r7.d
                    r0.g = r2
                    r0.i = r8
                    r0.e = r3
                    java.lang.Object r9 = r9.a(r0)
                    if (r9 != r1) goto L52
                    goto L7b
                L52:
                    Or r9 = (defpackage.C1709Or) r9
                    boolean r9 = r9.c
                    if (r9 == 0) goto L5d
                    java.lang.String r9 = r8.b()
                    goto L61
                L5d:
                    java.lang.String r9 = r8.c()
                L61:
                    if (r9 != 0) goto L65
                    java.lang.String r9 = "0%"
                L65:
                    java.lang.String r5 = r8.h
                    Uj r6 = new Uj
                    java.lang.String r8 = r8.c
                    r6.<init>(r3, r5, r8, r9)
                    r8 = 0
                    r0.g = r8
                    r0.i = r8
                    r0.e = r4
                    java.lang.Object r8 = r2.a(r6, r0)
                    if (r8 != r1) goto L7c
                L7b:
                    return r1
                L7c:
                    kotlin.Unit r8 = kotlin.Unit.a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: JC0.a.C0059a.a(java.lang.Object, JM):java.lang.Object");
            }
        }

        public a(C1621Nn1 c1621Nn1, JC0 jc0) {
            this.d = c1621Nn1;
            this.e = jc0;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super C2153Uj> interfaceC6606sf0, @NotNull JM jm) {
            Object objC = this.d.d.c(new C0059a(interfaceC6606sf0, this.e), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    public JC0(@NotNull C4617jA1 robotTrading, @NotNull AbstractC7004uZ1 timeSelectionsProvider) {
        Intrinsics.checkNotNullParameter(robotTrading, "robotTrading");
        Intrinsics.checkNotNullParameter(timeSelectionsProvider, "timeSelectionsProvider");
        this.a = timeSelectionsProvider;
        this.b = new a(robotTrading.U, this);
    }

    @Override // defpackage.IC0
    @NotNull
    public final a a() {
        return this.b;
    }
}
